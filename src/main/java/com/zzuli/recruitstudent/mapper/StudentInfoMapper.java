package com.zzuli.recruitstudent.mapper;

import java.util.List;

import com.zzuli.po.StudentInfo;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
    
    public List<StudentInfo> getStudentList(StudentInfo record);
}