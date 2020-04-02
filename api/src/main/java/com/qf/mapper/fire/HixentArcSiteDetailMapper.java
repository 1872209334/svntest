package com.qf.mapper.fire;


import com.qf.model.fire.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * author zhangjun
 */
@Repository
public interface HixentArcSiteDetailMapper {

	//查询站点名字
	String selectSiteName(@Param("siteCode") String siteCode);

	//查询设备总数
	Integer selectDeviceSum(@Param("siteCode") String siteCode);

	//查询预留电话
	String selectPhoneNumber(@Param("siteCode") String siteCode);

	//查询各种类型垃圾总数
	Integer selectKindsOfGarbage(@Param("siteCode") String siteCode, @Param("type") String type);






	//================================================================================


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



}