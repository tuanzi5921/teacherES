package com.zzuli.student.service;

import java.util.List;

import com.zzuli.po.EvaluationInfo;

/**
 * 学员评价的业务逻辑接口
 * @author mazg
 * 2019年10月30日
 *
 */
public interface EvaluationInfoService {

	/**
	 * 添加评价信息
	 * @param info
	 * @return
	 */
	public boolean add(EvaluationInfo info);
	
	/**
	 * 修改评价信息
	 * @param info
	 * @return
	 */
	public boolean update(EvaluationInfo info);
	
	/**
	 * 删除评价信息
	 * @param info
	 * @return
	 */
	public boolean delete(Integer evaluationId);
	
	/**
	 * 根据编号查询评价信息
	 * @param evaluationId
	 * @return
	 */
	public EvaluationInfo getEvaluationInfo(Integer evaluationId);
	
	/**
	 * 根据条件查询评价信息
	 * @param info
	 * @return
	 */
	public List<EvaluationInfo> getList(EvaluationInfo info);
}
