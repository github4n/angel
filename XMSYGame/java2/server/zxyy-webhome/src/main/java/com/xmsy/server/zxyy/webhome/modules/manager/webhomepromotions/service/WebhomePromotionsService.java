package com.xmsy.server.zxyy.webhome.modules.manager.webhomepromotions.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.xmsy.common.define.page.PageParam;
import com.xmsy.server.zxyy.webhome.modules.manager.webhomepromotions.entity.WebhomePromotionsEntity;
import com.xmsy.server.zxyy.webhome.modules.manager.webhomepromotions.entity.WebhomePromotionsListEntity;


/**
 * 官网优惠活动
 *
 * @author aleng
 * @email xxxxx
 * @date 2019-01-28 16:22:11
 */
public interface WebhomePromotionsService extends IService<WebhomePromotionsEntity> {

	/**
	 * 获取知道类型活动列表，不返回活动具体内容信息
	 * @param typeId
	 * @param pageParam
	 * @return
	 */
	Page<WebhomePromotionsListEntity> getPromotions(Long typeId,PageParam pageParam);

	/**
	 * 获取知道类型活动列表，返回活动具体内容信息
	 * @param typeId
	 * @param pageParam
	 * @return
	 */
	Page<WebhomePromotionsListEntity> getPromotionsList(Long typeId,PageParam pageParam);

}
