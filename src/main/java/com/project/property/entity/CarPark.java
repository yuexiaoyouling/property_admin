package com.project.property.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @Author Mr.Wang
 * @Date 2020/10/26
 * @Commit 停车场表
 * @Description 下一位读我代码的人,有任何疑问请联系我,QQ：1459221616
 */
@Data
public class CarPark implements Serializable {
    /**
    * 自增ID
    */
    private Integer id;

    /**
    * 业主名（如果售出则不可为空）
    */
    private String ownerName;

    /**
    * 业主联系电话
    */
    private String phone;

    /**
    * 车位状态（0未售出，1已售出）
    */
    private String parkState;

    /**
    * 车位类型
    */
    private String carParkType;

    private static final long serialVersionUID = 1L;
}