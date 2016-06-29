package com.xavient.storm.dataingest.spout.kafka;

import com.xavient.storm.dataingest.constants.Constants;
import com.xavient.storm.dataingest.vo.AppArgs;

import storm.kafka.KafkaSpout;

public class KafkaSpoutFactory {

	public static KafkaSpout getKafkaSpout(AppArgs appArgs) {
    return KafkaInputSpout.getKafkaSpout(appArgs.getProperty(Constants.KAFKA_TOPIC),
        appArgs.getProperty(Constants.ZK_HOST), appArgs.getProperty(Constants.ZK_PORT, "2181"),
        appArgs.isRewind());
  }
}
