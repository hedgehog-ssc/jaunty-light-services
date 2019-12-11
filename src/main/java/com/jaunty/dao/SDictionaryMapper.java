package com.jaunty.dao;

import com.jaunty.domain.entity.SDictionary;

public interface SDictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SDictionary record);

    int insertSelective(SDictionary record);

    SDictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SDictionary record);

    int updateByPrimaryKey(SDictionary record);
}