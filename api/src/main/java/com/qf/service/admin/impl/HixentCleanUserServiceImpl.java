package com.qf.service.admin.impl;

import com.qf.mapper.admin.HixentCleanUserMapper;
import com.qf.model.admin.HixentCleanUser;
import com.qf.service.admin.HixentCleanUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HixentCleanUserServiceImpl implements HixentCleanUserService {

    @Autowired
    private HixentCleanUserMapper hixentCleanUserMapper;

    public Integer addCleanUser(HixentCleanUser params){
        return hixentCleanUserMapper.addCleanUser(params);
    }

    @Override
    public Integer deleteCleanUser(int unid) {
        return hixentCleanUserMapper.deleteCleanUser(unid);
    }

    @Override
    public Integer updateCleanUser(HixentCleanUser params) {
        Date df = new Date();
        params.setUpdate_time(df);
        return hixentCleanUserMapper.updateCleanUser(params);
    }


    @Override
    public HixentCleanUser selectCleanUser(int unid) {
        return hixentCleanUserMapper.selectCleanUser(unid);
    }

    @Override
    public List<HixentCleanUser> selectAllCleanUser(Integer pageSize, Integer currentPage) {
        String limits = ""+Integer.toString((currentPage-1)*pageSize)+","+Integer.toString(pageSize)+"";
        return hixentCleanUserMapper.selectAllCleanUser(limits);
    }

    @Override
    public Integer countAllCleanUser() {
        return hixentCleanUserMapper.countAllCleanUser();
    }
}
