package com.qf.service.admin;


import com.alibaba.fastjson.JSONObject;
import com.qf.mapper.admin.HixentCleanUserMapper;
import com.qf.mapper.fire.HixentArcEfmDeviceMapper;
import com.qf.mapper.fire.HixentArcEquipmentInfoMapper;
import com.qf.model.admin.*;
import com.qf.model.fire.HixentArcAppMapSite;
import com.qf.model.fire.HixentArcEfmDevice;
import com.qf.util.DateUtil;
import com.qf.util.ToolUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * web管理后台管理员相关服务
 * author   zhangjun
 */

public interface HixentCleanUserService {

    Integer addCleanUser(HixentCleanUser params);

    Integer deleteCleanUser(int unid);

    Integer updateCleanUser(HixentCleanUser params);

    HixentCleanUser selectCleanUser(int unid);

    List<HixentCleanUser> selectAllCleanUser(Integer pageSize,Integer currentPage);

    Integer countAllCleanUser();

}