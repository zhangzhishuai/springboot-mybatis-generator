package com.jiuyue.springbootmybatisgenerator.dal.mapper;

import com.jiuyue.springbootmybatisgenerator.dal.model.PushChannelDO;
import com.jiuyue.springbootmybatisgenerator.dal.query.PushChannelQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for PushChannel.
 */
 @Mapper
 @Repository
public interface PushChannelMapper {
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
    int insertSelective(PushChannelDO record);

    /**
     * select by query condition.
     */
    List<PushChannelDO> selectByQuery(PushChannelQuery query);

    /**
     * select by primary key.
     */
    PushChannelDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") PushChannelDO record, @Param("query") PushChannelQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") PushChannelDO record, @Param("query") PushChannelQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(PushChannelDO record);
}