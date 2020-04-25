package com.peishujuan.springcloud.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peishujuan.springcloud.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.peishujuan.springcloud.entity.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-24
 */
public interface IUserService extends IService<User> {
    IPage selectPageVo(Page page, UserVo vo);
}
