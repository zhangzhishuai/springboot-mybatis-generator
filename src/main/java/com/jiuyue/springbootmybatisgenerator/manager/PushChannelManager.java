package com.jiuyue.springbootmybatisgenerator.manager;

import com.jiuyue.springbootmybatisgenerator.common.query.PageResult;
import com.jiuyue.springbootmybatisgenerator.dal.model.PushChannelDO;
import com.jiuyue.springbootmybatisgenerator.dal.query.PushChannelQuery;

import java.util.List;


/**
 * Manager for PushChannel.
 */
public interface PushChannelManager {
    /**
     * query count by query condition.
     */
    int countByQuery(PushChannelQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(PushChannelQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(PushChannelDO record);

    /**
     * insert selective.
     */
    long insertSelective(PushChannelDO record);

    /**
     * select by query condition.
     */
    List<PushChannelDO> selectByQuery(PushChannelQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<PushChannelDO> selectByQueryWithPage(PushChannelQuery query);

    /**
     * select by primary key.
     */
    PushChannelDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( PushChannelDO record,  PushChannelQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(PushChannelDO record, PushChannelQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(PushChannelDO record);
}