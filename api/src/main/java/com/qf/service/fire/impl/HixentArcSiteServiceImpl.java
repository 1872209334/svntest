package com.qf.service.fire.impl;

import com.qf.mapper.fire.HixentArcSiteMapper;
import com.qf.model.fire.HixentArcSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HixentArcSiteServiceImpl implements HixentArcSiteService {

    @Autowired
    private HixentArcSiteMapper hixentArcSiteMapper;

    @Override
    public Integer insertNewProject(HixentArcSite params) {
        return hixentArcSiteMapper.insertNewProject(params);
    }

    @Override
    public Integer insertNewDevice(String siteCode, String deviceType,String equipCode) {
        String id = siteCode+equipCode;
        return hixentArcSiteMapper.insertNewDevice(id,siteCode,deviceType);
    }

    @Override
    public Integer insertNewProjectSecond(HixentArcSite params) {
        return hixentArcSiteMapper.insertNewProjectSecond(params);
    }

    @Override
    public Integer insertNewDevice(String id, String siteCode, String deviceCode, String phoneNumber, String devicePlace, String niName) {//, Date publishDate
        return hixentArcSiteMapper.insertNewDeviceController(id, siteCode, deviceCode, phoneNumber, devicePlace, niName);
    }

    @Override
    public Integer existsDevice(String siteCode) {
        return hixentArcSiteMapper.existsDevice(siteCode);
    }

    @Override
    public Integer insertNewWireless(String siteCode) {
        return hixentArcSiteMapper.insertNewWireless(siteCode+"123456",siteCode);
    }
}
