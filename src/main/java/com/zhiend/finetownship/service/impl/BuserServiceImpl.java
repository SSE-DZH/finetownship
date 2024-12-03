package com.zhiend.finetownship.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zhiend.finetownship.constant.MessageConstant;
import com.zhiend.finetownship.dto.BuserRegisterDto;
import com.zhiend.finetownship.dto.BuserUpdateDto;
import com.zhiend.finetownship.entity.Buser;
import com.zhiend.finetownship.exception.GloabalException;
import com.zhiend.finetownship.mapper.BuserMapper;
import com.zhiend.finetownship.service.IBuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiend.finetownship.vo.BuserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Service
public class BuserServiceImpl extends ServiceImpl<BuserMapper, Buser> implements IBuserService {
    @Resource
    private BuserMapper buserMapper;

    @Override
    public void register(BuserRegisterDto registerDto) {
        // 检验用户的证件号是否已经注册,不是主键
        QueryWrapper<Buser> queryWrapper = Wrappers.query();
        queryWrapper.eq("idno", registerDto.getIdno());
        Buser buser1 = buserMapper.selectOne(queryWrapper);
        if (buser1 != null) {
            throw new GloabalException(MessageConstant.ACCOUNT_EXISTS);
        }
        Buser buser = new Buser();
        BeanUtil.copyProperties(registerDto, buser);
        buserMapper.insert(buser);
    }

    @Override
    public BuserVo view(Integer id) {
        // 检查id对应的用户是否存在
        if (buserMapper.selectById(id) == null) {
            throw new GloabalException(MessageConstant.ACCOUNT_NOT_FOUND);
        }
        Buser buser = buserMapper.selectById(id);
        return BeanUtil.copyProperties(buser, BuserVo.class);
    }

    @Override
    public void updateUser(BuserUpdateDto updateDto) {
        // 检查id对应的用户是否存在
        if (buserMapper.selectById(updateDto.getId()) == null) {
            throw new GloabalException(MessageConstant.ACCOUNT_NOT_FOUND);
        }
        Buser buser = buserMapper.selectById(updateDto.getId());
        BeanUtil.copyProperties(updateDto, buser);
        buserMapper.updateById(buser);
    }
}
