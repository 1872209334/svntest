package com.qf.service.fire.impl;

import com.qf.mapper.fire.HixentArcSiteDetailMapper;
import com.qf.mapper.fire.HixentArcSiteMapper;
import com.qf.model.fire.HixentArcSite;
import com.qf.service.fire.HixentArcSiteDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HixentArcSiteDetailServiceImpl implements HixentArcSiteDetailService {

    @Autowired
    private HixentArcSiteDetailMapper hixentArcSiteDetailMapper;

    @Override
    public String selectSiteName(String siteCode) {
        return hixentArcSiteDetailMapper.selectSiteName(siteCode);
    }

    @Override
    public Integer selectDeviceSum(String siteCode) {
        return hixentArcSiteDetailMapper.selectDeviceSum(siteCode);
    }

    @Override
    public String selectPhoneNumber(String siteCode) {
        return hixentArcSiteDetailMapper.selectPhoneNumber(siteCode);
    }

    @Override
    public Integer selectKindsOfGarbage(String siteCode, String type) {
        return hixentArcSiteDetailMapper.selectKindsOfGarbage(siteCode, type);
    }
}
