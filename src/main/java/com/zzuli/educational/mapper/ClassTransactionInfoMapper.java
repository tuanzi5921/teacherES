package com.zzuli.educational.mapper;

import java.util.List;

import com.zzuli.po.ClassTransactionInfo;

public interface ClassTransactionInfoMapper {
    int deleteByPrimaryKey(Integer classTransactionId);

    int insert(ClassTransactionInfo record);

    int insertSelective(ClassTransactionInfo record);

    ClassTransactionInfo selectByPrimaryKey(Integer classTransactionId);

    int updateByPrimaryKeySelective(ClassTransactionInfo record);

    int updateByPrimaryKey(ClassTransactionInfo record);
    
    public List<ClassTransactionInfo> getTransactionList(ClassTransactionInfo info);
}