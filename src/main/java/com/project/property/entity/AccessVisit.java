package com.project.property.entity;

import lombok.Data;

/**
    * 出入登记表
    */
@Data
public class AccessVisit {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 用户姓名
    */
    private String userName;

    /**
    * 用户手机号
    */
    private String phone;

    /**
    * 登记时间
    */
    private String createDate;

    /**
    * 登记类型 0入 1出
    */
    private String type;

    /**
    * 事由
    */
    private String desc;

    /**
     * 登记的用户 ID
     */
    private Integer userId;
}