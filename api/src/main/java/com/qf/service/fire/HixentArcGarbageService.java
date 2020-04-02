package com.qf.service.fire;

import com.alibaba.fastjson.JSONObject;
import com.qf.mapper.fire.HixentArcGarbageMapper;
import com.qf.model.fire.HixentArcGarbage;
import com.qf.model.fire.HixentArcPeopleStatistical;
import com.qf.model.fire.HixentArcZipperInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HixentArcGarbageService {

    //依据站点id查询垃圾箱实时情况
    List<HixentArcGarbage> selectGarbageByProjectId(String siteId, Integer pageSize, Integer currentPage);

    Integer countSelectGarbageByProjectId(String siteId);

    List<HixentArcGarbage> selectGarbageByProjectIdAndType(String deviceId, String type, Integer pageSize, Integer currentPage);

    Integer countSelectGarbageByProjectIdAndType(String deviceId, String type);

    //查询满载记录显示在报警管理中
    List<HixentArcGarbage> selectGarbageFullHistory(String projectId,String deviceId, String type, Integer pageSize, Integer currentPage);

    //依据站点id和垃圾类型查询历史满载记录条数
    Integer countSelectGarbageFullHistory(String projectId,String deviceId, String type);

    //查询人流统计显示在统计管理中
    List<HixentArcPeopleStatistical> selectPeopleStatistical(String projectId, String deviceId, String type, Integer pageSize, Integer currentPage);

    //依据站点id和垃圾类型查询人流统计记录条数
    Integer countSelectPeopleStatistical(String projectId, String deviceId, String type);

    //数据导出（统计管理/满载历史）
    JSONObject garbageFullHistoryExcel(String projectId, String deviceId, String type, Integer pageSize, Integer currentPage);

    //数据导出（统计管理/人流统计）
    JSONObject peopleStatisticalExcel(String projectId, String deviceId, String type, Integer pageSize, Integer currentPage);

    //删除 统计管理/满载历史 中的记录
    Integer deleteFullHistoryByUnid(Integer unid);

    //删除 统计管理/满载历史 中的记录
    Integer deletePeopleStatisticalByUnid(Integer unid);


}
