package com.peishujuan.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peishujuan.springcloud.entity.Nation;
import com.peishujuan.springcloud.entity.NationVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-25
 */
public interface INationService extends IService<Nation> {
    List<NationVo> findAll();
}
