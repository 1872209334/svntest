package com.qf.service.fire;

import com.alibaba.fastjson.JSONObject;
import com.qf.model.fire.HixentArcZipperInfo;

import java.util.List;

public interface HixentArcZipperInfoService {

    List<HixentArcZipperInfo> selectAllZipperInfo(String deviceId, Integer pageSize, Integer currentPage);

    Integer countZipperInfoByDeviceId(String deviceId);

    List<HixentArcZipperInfo> selectAlarmLog(String projectId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    List<HixentArcZipperInfo> selectAlarmLogBySiteId(int siteId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    Integer countZipperAlarmLog(String deviceId, String isAlarm);

    List<HixentArcZipperInfo> selectFaultLog(String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    List<HixentArcZipperInfo> selectFaultLogBySiteId(int siteId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    Integer countZipperFaultLog(String deviceId, String isAlarm);

    List<HixentArcZipperInfo> selectOffLineLog(String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    List<HixentArcZipperInfo> selectOffLineLogBySiteId(int siteId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    Integer countZipperOffLineLog(String deviceId, String isAlarm);

    JSONObject alarmLogExcel(int projectId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    JSONObject faultLogExcel(int siteId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    JSONObject offLineLogExcel(int siteId, String deviceId, String isAlarm, Integer pageSize, Integer currentPage);

    int deleteAlramLog(int unid);
}
