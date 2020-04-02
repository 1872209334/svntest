package com.qf.model.fire;



import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * author zhangjun
 */
@Data
public class HixentArcSiteDetailDao implements Serializable {

	private String siteCode;//站点id

	private String siteName;//站点名字

	private Integer deviceSum;//站点设备总数

	private String phoneNumber;//预留电话

	private Integer kitchenGarbage;//厨余垃圾数量

	private Integer recyclableGarbage;//可回收垃圾数量

	private Integer otherGarbage;//其他垃圾数量

	private Integer harmfulGarbage;//有害垃圾数量






}
