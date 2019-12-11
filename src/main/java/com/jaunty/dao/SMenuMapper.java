package com.jaunty.dao;

import com.jaunty.domain.entity.SMenu;

public interface SMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SMenu record);

    int insertSelective(SMenu record);

    SMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SMenu record);

    int updateByPrimaryKey(SMenu record);
}