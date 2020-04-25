package com.peishujuan.springcloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peishujuan.springcloud.entity.User;
import com.peishujuan.springcloud.entity.UserVo;
import com.peishujuan.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("findAll")
    public IPage list(Page page, UserVo vo){
        return iUserService.selectPageVo(page,vo);
    }

    @RequestMapping("insert")
    public boolean insert(User user){
        return iUserService.save(user);

    }

    @RequestMapping("update")
    public boolean update(User user, int id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id",user.getId());
       return iUserService.saveOrUpdate(user);
    }

    @RequestMapping("delete")
    public int delete(int[] ids){
        for (int i=0; i<ids.length;i++){
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("id",ids[i]);
            iUserService.removeById(ids[i]);
        }
        return 1;
    }
}

