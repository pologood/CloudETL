/**
 * 云化数据集成系统 
 * iDatrix CloudETL
 */
package com.ys.idatrix.quality.repository.xml.metastore.meta;

/**
 * DTO for ZooKeeper information in Hadoop cluster.
 * @author JW
 * @since 2017年6月16日
 *
 */
public class HadoopZooKeeperMeta {

	private String hostname;
	private String port;

	public void setHostname(String hostname){
		this.hostname = hostname;
	}
	public String getHostname(){
		return this.hostname;
	}
	
	public void setPort(String port){
		this.port = port;
	}
	public String getPort(){
		return this.port;
	}
	
	/* 
	 * Build text.
	 */
	@Override
	public String toString() {
		return "HadoopZooKeeperMeta [hostname=" + hostname + ", port=" + port + "]";
	}
	
}
