package com.qf.model.admin;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * author zhangjun
 */

@Data
public class HixentCleanUser implements Serializable {

    private int unid;

    private String uname;

    private String uage;

    private String usex;

    private String uphone;

    private String umessage;

    private String bid;

    private String site_name;

    private String provinceId;

    private String areaId;

    private Date create_time;

    private Date update_time;
}
