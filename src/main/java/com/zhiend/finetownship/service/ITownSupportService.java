package com.zhiend.finetownship.service;

import com.zhiend.finetownship.dto.TownSupportDto;
import com.zhiend.finetownship.entity.TownSupport;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.Query;
import com.zhiend.finetownship.query.TownSupportQuery;

import java.io.IOException;

/**
 * <p>
 * 好乡镇宣传助力信息表 服务类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface ITownSupportService extends IService<TownSupport> {

    void add(TownSupportDto townSupportDto) throws IOException;

    void update(TownSupportDto townSupportDto) throws IOException;

    PageResult<TownSupport> queryPage(TownSupportQuery query);

    void delete(Integer sid) throws IOException ;

    PageResult<TownSupport> queryPageByName(String suserName, Query query);

    void accept(Integer sid, String remark);

    void refuse(Integer sid);

    PageResult<TownSupport> queryWaitHandle(String puserName, Query query);
}
