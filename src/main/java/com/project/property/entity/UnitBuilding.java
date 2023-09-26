package com.project.property.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @Author Mr.Wang
 * @Date 2020/10/26
 * @Commit 楼宇信息表
 * @Description 下一位读我代码的人,有任何疑问请联系我,QQ：1459221616
 */
@Data
public class UnitBuilding implements Serializable {
    /**
    * 主键ID
    */
    private Integer id;

    /**
    * 楼宇号
    */
    private Integer buildingNum;

    /**
    * 单元数量
    */
    private Integer unitCount;

    /**
    * 楼层
    */
    private Integer floorCount;

    private static final long serialVersionUID = 1L;
}