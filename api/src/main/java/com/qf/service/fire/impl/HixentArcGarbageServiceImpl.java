package com.qf.service.fire.impl;

import com.alibaba.fastjson.JSONObject;
import com.qf.mapper.fire.HixentArcGarbageMapper;
import com.qf.model.fire.HixentArcGarbage;
import com.qf.model.fire.HixentArcPeopleStatistical;
import com.qf.service.fire.HixentArcGarbageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HixentArcGarbageServiceImpl implements HixentArcGarbageService {

    @Autowired
    private HixentArcGarbageMapper hixentArcGarbageMapper;

    @Override
    public List<HixentArcGarbage> selectGarbageByProjectId(String siteId, Integer pageSize, Integer currentPage) {
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        return hixentArcGarbageMapper.selectGarbageByProjectId(siteId,limits);
    }

    @Override
    public Integer countSelectGarbageByProjectId(String siteId) {
        return hixentArcGarbageMapper.countSelectGarbageByProjectId(siteId);
    }

    @Override
    public List<HixentArcGarbage> selectGarbageByProjectIdAndType(String deviceId, String type, Integer pageSize, Integer currentPage) {
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        return hixentArcGarbageMapper.selectGarbageByProjectIdAndType(deviceId,type,limits);
    }

    @Override
    public Integer countSelectGarbageByProjectIdAndType(String deviceId, String type) {
        return hixentArcGarbageMapper.countSelectGarbageByProjectIdAndType(deviceId,type);
    }

    @Override
    public List<HixentArcGarbage> selectGarbageFullHistory(String projectId,String deviceId, String type, Integer pageSize, Integer currentPage) {
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        return hixentArcGarbageMapper.selectGarbageFullHistory(projectId,deviceId,type,limits);
    }

    @Override
    public Integer countSelectGarbageFullHistory(String projectId,String deviceId, String type) {
        return hixentArcGarbageMapper.countSelectGarbageFullHistory(projectId,deviceId, type);
    }

    @Override
    public List<HixentArcPeopleStatistical> selectPeopleStatistical(String projectId,String deviceId, String type, Integer pageSize, Integer currentPage) {
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        return hixentArcGarbageMapper.selectPeopleStatistical(projectId,deviceId,type,limits);
    }

    @Override
    public Integer countSelectPeopleStatistical(String projectId,String deviceId, String type) {
        return hixentArcGarbageMapper.countSelectPeopleStatistical(projectId,deviceId, type);
    }

    @Override
    public JSONObject garbageFullHistoryExcel(String projectId, String deviceId, String type, Integer pageSize, Integer currentPage) {
        JSONObject outJson = new JSONObject();
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        List<HixentArcGarbage> garbageFullHistoryExcel = hixentArcGarbageMapper.selectGarbageFullHistory(projectId,deviceId,type,limits);
        outJson.put("garbageFullHistoryExcelCount", garbageFullHistoryExcel.size());
        outJson.put("garbageFullHistoryExcel", garbageFullHistoryExcel);
        return outJson;
    }

    @Override
    public JSONObject peopleStatisticalExcel(String projectId, String deviceId, String type, Integer pageSize, Integer currentPage) {
        JSONObject outJson = new JSONObject();
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        List<HixentArcPeopleStatistical> peopleStatisticalExcel = hixentArcGarbageMapper.selectPeopleStatistical(projectId,deviceId,type,limits);
        outJson.put("peopleStatisticalExcelCount", peopleStatisticalExcel.size());
        outJson.put("peopleStatisticalExcel", peopleStatisticalExcel);
        return outJson;
    }

    @Override
    public Integer deleteFullHistoryByUnid(Integer unid) {
        return hixentArcGarbageMapper.deleteFullHistoryByUnid(unid);
    }

    @Override
    public Integer deletePeopleStatisticalByUnid(Integer unid) {
        return hixentArcGarbageMapper.deletePeopleStatisticalByUnid(unid);
    }
}
