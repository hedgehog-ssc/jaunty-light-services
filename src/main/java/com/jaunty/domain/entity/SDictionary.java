package com.jaunty.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SDictionary {
    private Long id;

    private Long parentId;

    private String dicCode;

    private String dicValue;

    private Byte seq;

    private Boolean dflag;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

}