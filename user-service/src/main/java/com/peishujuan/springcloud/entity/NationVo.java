package com.peishujuan.springcloud.entity;

import lombok.Data;

import java.util.List;

@Data
public class NationVo {
    //省市区都是这个id
    private Integer id;
    //省市区 名称
    private String name;
    //省对应市 市对应区 的集合
    private List<NationVo> list;
}
