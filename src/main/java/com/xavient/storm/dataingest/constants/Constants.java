package com.xavient.storm.dataingest.constants;

public class Constants {

	public static final String KAFKA_SPOUT_ID = "kafka-spout";
	public static final String FILTER_BOLT_ID = "filter-bolt";
	public static final String HDFS_BOLT_ID = "hdfs-bolt";
	public static final String HBASE_BOLT_ID = "hbase-bolt";

	public static final String CONFIG = "config";
	public static final String REWIND = "rewind";
	public static final String KAFKA_TOPIC = "kafka.topic";
	public static final String ZK_HOST = "zookeeper.host";
	public static final String ZK_PORT = "zookeeper.port";
	public static final String FILE_SIZE_ROTATION = "rotation.policy.file.size";
	public static final String HDFS_OUTPUT_PATH = "hdfs.output.path";
	public static final String HDFS_OUTPUT_DELIMITER = "hdfs.output.delimiter";
	public static final String CLUSTER_FS_URL = "cluster.fs.url";
	public static final String HBASE_COL_DELIMITER = "hbase.col.delimiter";
	public static final String HBASE_COL_FAM_DELIMITER = "hbase.col.families.delimiter";
	public static final String HBASE_CONFIG_FILE = "hbase.config.file";
	public static final String HBASE_TABLENAME = "hbase.tablename";
	public static final String HBASE_ROW_KEY_CHECK = "hbase.row.key.check";
	public static final String HBASE_COL_FAMILIES = "hbase.col.families";
	public static final String HBASE_COL_NAMES = "hbase.col.names";
	public static final String DELIMITER_PREFIX = "\\";
	
  public static final String[] metadataJsonAttributes = { "id", "author", "title", "genre", "price", "publish_date", "description" };
  public static final String[] metadataXMLAttributes = { "id", "author", "title", "genre", "price", "publish_date", "description" };

}
