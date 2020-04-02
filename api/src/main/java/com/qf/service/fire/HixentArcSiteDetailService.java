package com.qf.service.fire;

import com.alibaba.fastjson.JSONObject;
import com.qf.model.fire.HixentArcGarbage;
import com.qf.model.fire.HixentArcPeopleStatistical;

import java.util.List;

public interface HixentArcSiteDetailService {

    //查询站点名字
    String selectSiteName(String siteCode);

    //查询设备总数
    Integer selectDeviceSum(String siteCode);

    //查询预留电话
    String selectPhoneNumber(String siteCode);

    //查询各种类型垃圾总数
    Integer selectKindsOfGarbage(String siteCode, String type);


}
