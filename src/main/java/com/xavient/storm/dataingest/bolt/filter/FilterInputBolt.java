package com.xavient.storm.dataingest.bolt.filter;

import java.util.List;
import java.util.Map;

import com.xavient.storm.dataingest.constants.Constants;
import com.xavient.storm.dataingest.exception.DataIngestException;
import com.xavient.storm.dataingest.util.MetadataParser;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;

public class FilterInputBolt extends BaseRichBolt {

	private OutputCollector _collector;

	private static final long serialVersionUID = -8298385255452574477L;

	@Override
	public void execute(Tuple tuple) {
		try {
			List<List<Object>> lists = MetadataParser.parse(tuple.getString(0));
			for (List<Object> values : lists) {
				this._collector.emit(values);
			}
			_collector.ack(tuple);
		} catch (DataIngestException e) {
			e.printStackTrace();
			_collector.ack(tuple);
		}
	}

	@Override
	public void prepare(@SuppressWarnings("rawtypes") Map map, TopologyContext topologyCtx, OutputCollector collector) {
		this._collector = collector;
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields(Constants.metadataJsonAttributes));
	}

}
