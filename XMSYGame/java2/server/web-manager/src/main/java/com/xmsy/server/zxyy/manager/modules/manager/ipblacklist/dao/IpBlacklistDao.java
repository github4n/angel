package com.xmsy.server.zxyy.manager.modules.manager.ipblacklist.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xmsy.server.zxyy.manager.modules.manager.ipblacklist.entity.IpBlacklistEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * ip黑名单
 * 
 * @author aleng
 * @email xxxxx
 * @date 2019-02-17 15:58:11
 */
@Mapper
public interface IpBlacklistDao extends BaseMapper<IpBlacklistEntity> {
	
}