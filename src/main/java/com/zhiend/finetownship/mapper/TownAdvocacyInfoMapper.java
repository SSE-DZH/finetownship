package com.zhiend.finetownship.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhiend.finetownship.entity.TownAdvocacyInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiend.finetownship.query.Query;
import com.zhiend.finetownship.query.TownAdvocacyInfoQuery;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 好乡镇宣传信息表 Mapper 接口
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface TownAdvocacyInfoMapper extends BaseMapper<TownAdvocacyInfo> {

    IPage<TownAdvocacyInfo> queryPage(@Param("page") IPage<TownAdvocacyInfo> page, @Param("query") TownAdvocacyInfoQuery query);

    IPage<TownAdvocacyInfo> queryPageByName(@Param("puserName") String puserName, @Param("page") IPage<TownAdvocacyInfo> page, @Param("query") Query query);
}
