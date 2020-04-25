package com.peishujuan.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peishujuan.springcloud.entity.Nation;
import com.peishujuan.springcloud.entity.NationVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-25
 */
public interface NationMapper extends BaseMapper<Nation> {

    //查询省市县所有数据
    List<NationVo> findAll();
}
