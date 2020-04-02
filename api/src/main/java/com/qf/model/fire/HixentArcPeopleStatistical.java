package com.qf.model.fire;



import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * author zhangjun
 * 人流统计
 */
@Data
public class HixentArcPeopleStatistical implements Serializable {

	private int unid;//主键

	private String projectId;//所属项目id

	private String deviceId;//设备id

	private String uname;//姓名

	private String usex;//性捏

	private String type;//投放的垃圾类型：1为厨余垃圾，2为可回收垃圾，3为其他垃圾，4为有害垃圾

	private String uage;//年龄

	private String siteName;//连表查询的设备所属项目名称

	private Date createTime;//创建时间

	private Date updateTime;//更新时间




}
