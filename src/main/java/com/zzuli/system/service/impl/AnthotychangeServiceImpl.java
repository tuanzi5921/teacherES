package com.zzuli.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zzuli.po.RoleAnthorityInfo;
import com.zzuli.system.mapper.RoleAnthorityInfoMapper;
import com.zzuli.system.service.AnthotychangeService;

@Service
public class AnthotychangeServiceImpl implements AnthotychangeService {

	@Resource(name = "roleAnthorityInfoMapper")
	private RoleAnthorityInfoMapper roleAnthorityInfoMapper;

	@Override
	public void add(Integer roleId, Integer[] anthortyIds) throws Exception {

		roleAnthorityInfoMapper.deleteByRoleId(roleId);
		
		for (Integer anthortyId : anthortyIds) {
			RoleAnthorityInfo rai = new RoleAnthorityInfo();
			rai.setRoleId(roleId);
			rai.setAnthortyId(anthortyId);

			roleAnthorityInfoMapper.insertSelective(rai);
		}

	}

	@Override
	public List<RoleAnthorityInfo> getRoleAnthorityList(
			RoleAnthorityInfo roleAnthorityInfo) {
		
		return roleAnthorityInfoMapper.getRoleAnthorityInfoList(roleAnthorityInfo);
	}

}
