package com.jiuyue.springbootmybatisgenerator.dal.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class PushChannelDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     * push_channel.channel_id
     */
    private Long channelId;

    /**
     * 包名
     * push_channel.package_name
     */
    private String packageName;

    /**
     * app_id
     * push_channel.app_id
     */
    private String appId;

    /**
     * app_key
     * push_channel.app_key
     */
    private String appKey;

    /**
     * app_secret
     * push_channel.app_secret
     */
    private String appSecret;

    /**
     * 渠道类型
     * push_channel.channel_type
     */
    private String channelType;

    /**
     * 状态
     * push_channel.status
     */
    private Integer status;

    /**
     * 创建时间
     * push_channel.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     * push_channel.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 应用名称
     * push_channel.apply_name
     */
    private String applyName;

    /**
     * 机器类型（2 ：ios  1 ： android）
     * push_channel.machine_type
     */
    private Integer machineType;

}