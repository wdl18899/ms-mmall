/**
The MIT License (MIT) * Copyright (c) 2016 铭飞科技(mingsoft.net)

 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.mingsoft.freight.biz.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingsoft.base.biz.impl.BaseBizImpl;
import com.mingsoft.base.dao.IBaseDao;
import com.mingsoft.freight.biz.IAreaDetailBiz;
import com.mingsoft.freight.dao.IAreaDetailDao;
import com.mingsoft.freight.entity.AreaDetailEntity;
import com.mingsoft.freight.entity.AreaEntity;

/**
 * 运费模块区域运费设置业务层实现类
 * @author 上官德辉
 *
 */
@Service("freightAreaDetailBizImpl")
public class AreaDetailBizImpl extends BaseBizImpl implements IAreaDetailBiz{

	/**
	 * 用户持久化层
	 */
	@Autowired
	private IAreaDetailDao freightAreaDetailDao; 
	
	/**
	 * 获取freightDao
	 */
	@Override
	protected IBaseDao getDao() {
		return freightAreaDetailDao;
	}
	/**
	 * 获取所有的区域信息
	 */
	@Override
	public List<AreaDetailEntity> queryAllFad(int faId,int modelId) {
		return freightAreaDetailDao.queryAllFad(faId,modelId);
	}
	/**
	 * 获取单个区域信息
	 */
	@Override
	public AreaDetailEntity getByFaEntity(AreaDetailEntity faEntity) {
		return freightAreaDetailDao.getByFaEntity(faEntity);
	}
	/**
	 * 添加区域信息
	 */
	@Override
	public void saveByFaEntity(AreaDetailEntity faEntity) {
		freightAreaDetailDao.saveByFaEntity(faEntity);
	}
	/**
	 * 修改区域信息
	 * @param faEntity
	 * @return
	 */
	public void updateByFaEntity(AreaDetailEntity faEntity) {
		freightAreaDetailDao.updateByFaEntity(faEntity);
	}
}