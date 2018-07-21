package com.jiuyue.springbootmybatisgenerator.mybatisgen.enums;

/**
 * Created by hetao on 2017/12/22.
 * 列类型
 */
public enum ColumnTypeEnum {
    normal, //普通列
    primary, //主键
    gmtCreate,// 创建日期
    gmtModified, // 最后修改时间
    lockVersion, // 乐观锁版本
    status, //状态
    isDeleted,// 逻辑删除
    ;


    private ColumnTypeEnum() {

    }
}
