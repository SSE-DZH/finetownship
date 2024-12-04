package com.zhiend.finetownship.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhiend.finetownship.entity.TownSupport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiend.finetownship.query.Query;
import com.zhiend.finetownship.query.TownSupportQuery;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 好乡镇宣传助力信息表 Mapper 接口
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface TownSupportMapper extends BaseMapper<TownSupport> {

    IPage<TownSupport> queryPage(@Param("page") IPage<TownSupport> page, @Param("query") TownSupportQuery query);

    IPage<TownSupport> queryPageByName(@Param("suserName") String suserName, @Param("page") IPage<TownSupport> page, @Param("query") Query query);

    IPage<TownSupport> queryWaitHandle(@Param("puserName") String puserName, @Param("page") IPage<TownSupport> page, @Param("query") Query query);
}
