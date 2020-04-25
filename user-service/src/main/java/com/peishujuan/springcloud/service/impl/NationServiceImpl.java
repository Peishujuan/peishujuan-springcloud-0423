package com.peishujuan.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peishujuan.springcloud.entity.Nation;
import com.peishujuan.springcloud.entity.NationVo;
import com.peishujuan.springcloud.mapper.NationMapper;
import com.peishujuan.springcloud.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author peishujuan
 * @since 2020-04-25
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

    @Autowired
    private NationMapper nationMapper;

    @Override
    public List<NationVo> findAll() {
        return nationMapper.findAll();
    }
}
