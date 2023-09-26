package com.project.property.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @Author Mr.Wang
 * @Date 2020/10/27
 * @Description 下一位读我代码的人,有任何疑问请联系我,QQ：1459221616
 */
/**
    * 菜单表
    */
@Data
public class Menu implements Serializable {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 父菜单ID
    */
    private Integer parentId;

    /**
    * 菜单名
    */
    private String menuName;

    /**
    * 跳转地址
    */
    private String url;

    /**
    * 图标名
    */
    private String iconName;

    private static final long serialVersionUID = 1L;
}