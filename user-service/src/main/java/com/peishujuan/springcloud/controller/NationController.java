package com.peishujuan.springcloud.controller;


import com.peishujuan.springcloud.entity.NationVo;
import com.peishujuan.springcloud.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-25
 */
@RestController
@RequestMapping("/nation")
public class NationController {

    @Autowired
    private INationService iNationService;

    @RequestMapping("findAll")
    public List<NationVo> list(){
        return iNationService.findAll();
    }
}

