package com.qf.service.fire.impl;

import com.qf.model.fire.HixentArcSite;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface HixentArcSiteService {

    Integer insertNewProject(HixentArcSite params);

    Integer insertNewDevice(String siteCode,String deviceType, String equipCode);

    //新建项目更改
    Integer insertNewProjectSecond(HixentArcSite params);

    //新增中控
    Integer insertNewDevice(String id, String siteCode, String deviceCode, String phoneNumber,
                            String devicePlace, String niName);//, Date publishDate

    //查询是否存在中控
    Integer existsDevice(String siteCode);

    //设置中控存在无线设备
    Integer insertNewWireless( String siteCode);

}
