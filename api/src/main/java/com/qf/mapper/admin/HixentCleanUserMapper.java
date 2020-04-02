package com.qf.mapper.admin;


import com.qf.model.admin.*;
import com.qf.util.CustomerMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * author zhangjun
 */
@Service
public interface HixentCleanUserMapper extends CustomerMapper<HixentUser> {

	Integer addCleanUser(HixentCleanUser params);

	Integer deleteCleanUser(@Param("unid")int unid);

	Integer updateCleanUser(HixentCleanUser params);

	HixentCleanUser selectCleanUser(@Param("unid")int unid);

	List<HixentCleanUser> selectAllCleanUser(@Param("limits")String limits);

	//查询保洁人员总数量
	Integer countAllCleanUser();



}

