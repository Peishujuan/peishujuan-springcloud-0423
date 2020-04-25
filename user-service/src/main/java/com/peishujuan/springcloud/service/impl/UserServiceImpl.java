package com.peishujuan.springcloud.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peishujuan.springcloud.entity.User;
import com.peishujuan.springcloud.entity.UserVo;
import com.peishujuan.springcloud.mapper.UserMapper;
import com.peishujuan.springcloud.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public IPage selectPageVo(Page page, UserVo vo) {
        return userMapper.selectPageVo(page,vo);
    }
}
