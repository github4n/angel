package com.xmsy.server.zxyy.webhome.modules.manager.sysregisternecessary.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xmsy.server.zxyy.webhome.modules.manager.sysregisternecessary.entity.SysRegisterNecessaryEntity;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 注册必填控制表
 * 
 * @author aleng
 * @email xxxxx
 * @date 2018-12-28 10:51:51
 */
@Mapper
public interface SysRegisterNecessaryDao extends BaseMapper<SysRegisterNecessaryEntity> {
  List<String> getRemark();
}