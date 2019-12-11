package com.jaunty.dao;

import com.jaunty.domain.entity.SRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SRole record);

    int insertSelective(SRole record);

    SRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SRole record);

    int updateByPrimaryKey(SRole record);
}