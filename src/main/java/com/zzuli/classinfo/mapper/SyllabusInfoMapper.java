package com.zzuli.classinfo.mapper;

import java.util.List;

import com.zzuli.po.SyllabusInfo;

public interface SyllabusInfoMapper {
    int deleteByPrimaryKey(Integer syllabusId);

    int insert(SyllabusInfo record);

    int insertSelective(SyllabusInfo record);

    SyllabusInfo selectByPrimaryKey(Integer syllabusId);

    int updateByPrimaryKeySelective(SyllabusInfo record);

    int updateByPrimaryKey(SyllabusInfo record);
    
    public List<SyllabusInfo> getSyllabusList(SyllabusInfo record);
}