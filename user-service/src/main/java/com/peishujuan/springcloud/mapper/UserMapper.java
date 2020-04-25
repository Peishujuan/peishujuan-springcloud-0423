package com.peishujuan.springcloud.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peishujuan.springcloud.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peishujuan.springcloud.entity.UserVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-24
 */
public interface UserMapper extends BaseMapper<User> {

    IPage selectPageVo(Page page, UserVo vo);
}
