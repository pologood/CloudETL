/**
 * 云化数据集成系统 
 * iDatrix CloudETL
 */
package com.ys.idatrix.quality.dto.step;

import org.pentaho.di.core.util.Utils;

import com.ys.idatrix.quality.ext.CloudSession;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Step Config详细
 * @author JW
 * @since 05-12-2017
 *
 */
@ApiModel("转换步骤配置信息")
public class StepConfigsDto {
	
	@ApiModelProperty("拥有者")
	private String owner;
    private String transName;
    private String group;
    private String stepName;
    private StepConfigDto configs;

	 public String getOwner() {
		 if( Utils.isEmpty( owner )) {
			 owner = CloudSession.getResourceUser() ;
		 }
		 return owner;
	 }
	 public void setOwner(String owner) {
		 this.owner = owner;
	 }    
    
    public void setTransName(String transName) {
	    this.transName = transName;
	}
	public String getTransName() {
		if(Utils.isEmpty(group) && !Utils.isEmpty(transName) && transName.contains("/")) {
			group = transName.split("/", 2 )[0];
			transName = transName.split("/", 2 )[1];
		}
	    return transName;
	}
	
	/**
	 * @return the group
	 */
	public String getGroup() {
		if(Utils.isEmpty(group) && !Utils.isEmpty(transName) && transName.contains("/")) {
			group = transName.split("/", 2 )[0];
			transName = transName.split("/", 2 )[1];
		}
		return group;
	}
	/**
	 * @param  设置 group
	 */
	public void setGroup(String group) {
		this.group = group;
	}
	public void setStepName(String stepName) {
	    this.stepName = stepName;
	}
	public String getStepName() {
	    return stepName;
	}
	
	public void setConfigs(StepConfigDto configs) {
	    this.configs = configs;
	}
	public StepConfigDto getConfigs() {
	    return configs;
	}
	
	/* 
	 * 
	 */
	@Override
	public String toString() {
		return "StepConfigsDto [transName=" + transName + ", stepName=" + stepName + ", configs=" + configs + "]";
	}

}
