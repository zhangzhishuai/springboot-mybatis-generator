package com.jiuyue.springbootmybatisgenerator.manager.impl;

import com.jiuyue.springbootmybatisgenerator.common.query.PageResult;
import com.jiuyue.springbootmybatisgenerator.dal.model.PushChannelDO;
import com.jiuyue.springbootmybatisgenerator.dal.query.PushChannelQuery;
import com.jiuyue.springbootmybatisgenerator.dal.mapper.ext.PushChannelExtMapper;
import com.jiuyue.springbootmybatisgenerator.manager.PushChannelManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for PushChannel.
 */

@Component
public class PushChannelManagerImpl implements PushChannelManager{

    
    @Autowired
    protected PushChannelExtMapper pushChannelExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(PushChannelQuery query){
        return pushChannelExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(PushChannelQuery query){
        return pushChannelExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(PushChannelDO record){
        return pushChannelExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(PushChannelDO record){
        return pushChannelExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<PushChannelDO> selectByQuery(PushChannelQuery query){
        return pushChannelExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<PushChannelDO> selectByQueryWithPage(PushChannelQuery query) {
        PageResult<PushChannelDO> result = new PageResult<PushChannelDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public PushChannelDO selectByPrimaryKey(Long id){
        return pushChannelExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( PushChannelDO record,  PushChannelQuery query){
        return pushChannelExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( PushChannelDO record,  PushChannelQuery query){

        return pushChannelExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(PushChannelDO record){
        return pushChannelExtMapper.updateByPrimaryKeySelective(record);
    }
}