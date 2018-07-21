package com.jiuyue.springbootmybatisgenerator.mybatisgen.enums;

/**
 * Created by hetao on 2017/12/22.
 * 列类型
 */
public enum ColumnTypeEnum {
    //普通列
    normal,
    //主键
    primary,
    // 创建日期
    gmtCreate,
    // 最后修改时间
    gmtModified,
    // 乐观锁版本
    lockVersion,
    //状态
    status,
    // 逻辑删除
    isDeleted,
    ;


    private ColumnTypeEnum() {

    }
}
