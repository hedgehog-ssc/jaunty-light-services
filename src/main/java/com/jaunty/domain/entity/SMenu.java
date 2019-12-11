package com.jaunty.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SMenu {
    private Long id;

    private Long parentId;

    private String menuType;

    private String menuName;

    private String menuIcon;

    private Byte seq;

    private String permissions;

    private String remark;

    private Boolean dflag;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

}