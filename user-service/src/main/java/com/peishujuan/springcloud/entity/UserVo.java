package com.peishujuan.springcloud.entity;

import lombok.Data;

@Data
public class UserVo extends User {
    private String provinceName;
    private String cityName;
    private String districtName;
}
