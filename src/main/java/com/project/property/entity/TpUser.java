package com.project.property.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @Author Mr.Wang
 * @Date 2020/12/10
 * @Description 下一位读我代码的人,有任何疑问请联系我,QQ：1459221616
 */
@Data
public class TpUser {
    /**
    * 自动编号
    */
    private Integer id;

    private String username;

    private String password;

    private String gender;

    private String email;

    private BigDecimal price;

    private String details;

    private Short uid;

    /**
    * 状态
    */
    private Byte status;

    private String list;

    private Date deleteTime;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}