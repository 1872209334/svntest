package com.qf.mapper.fire;


import com.qf.model.fire.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * author zhangjun
 */
@Repository
public interface HixentArcGarbageMapper {

	//依据站点id查询垃圾箱实时情况
	List<HixentArcGarbage> selectGarbageByProjectId(@Param("siteId") String siteId, @Param("limits") String limits);

	Integer countSelectGarbageByProjectId(@Param("siteId") String siteId);

	//依据垃圾类型查询历史数据
	List<HixentArcGarbage> selectGarbageByProjectIdAndType(@Param("deviceId") String deviceId, @Param("type") String type, @Param("limits") String limits);

	Integer countSelectGarbageByProjectIdAndType(@Param("deviceId") String deviceId, @Param("type") String type);

	//终端上传数据
	Integer insertMqttGarbage(HixentArcGarbage params);

	//终端更新数据
	Integer updateMqttGarbage(HixentArcGarbage params);

	//查询数据是否已经存在
	List<HixentArcGarbage> selectGarbageIsAlive(HixentArcGarbage params);

	//如果上一条方法是不存在，则执行添加
	Integer insertMqttGarbageNotForHistory(HixentArcGarbage params);

	//添加满载记录显示在统计管理中
	Integer insertMqttGarbageFullHistory(HixentArcGarbage params);

	//查询满载记录显示在统计管理中
	List<HixentArcGarbage> selectGarbageFullHistory(@Param("projectId") String projectId, @Param("deviceId") String deviceId, @Param("type") String type, @Param("limits") String limits);

	//依据站点id和垃圾类型查询历史满载记录条数
	Integer countSelectGarbageFullHistory(@Param("projectId") String projectId, @Param("deviceId") String deviceId, @Param("type") String type);

	//查询人流统计显示在统计管理中
	List<HixentArcPeopleStatistical> selectPeopleStatistical(@Param("projectId") String projectId, @Param("deviceId") String deviceId, @Param("type") String type, @Param("limits") String limits);

	//依据站点id和垃圾类型查询人流统计记录条数
	Integer countSelectPeopleStatistical(@Param("projectId") String projectId, @Param("deviceId") String deviceId, @Param("type") String type);

	//插入Mqtt收到的人流统计数据
	Integer insertMqttPeopleStatistical(HixentArcPeopleStatistical pamas);

	//删除 统计管理/满载历史 中的记录
	Integer deleteFullHistoryByUnid(@Param("unid") Integer unid);

	//删除 统计管理/满载历史 中的记录
	Integer deletePeopleStatisticalByUnid(@Param("unid") Integer unid);




}