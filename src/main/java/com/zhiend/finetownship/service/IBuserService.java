package com.zhiend.finetownship.service;

import com.zhiend.finetownship.dto.BuserRegisterDto;
import com.zhiend.finetownship.dto.BuserUpdateDto;
import com.zhiend.finetownship.entity.Buser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiend.finetownship.vo.BuserVo;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface IBuserService extends IService<Buser> {
    void register(BuserRegisterDto registerDto);

    BuserVo view(Integer id);

    void updateUser(BuserUpdateDto updateDto);
}
