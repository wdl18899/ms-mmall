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

package com.mingsoft.freight.biz;

import java.util.List;

import com.mingsoft.base.biz.IBaseBiz;
import com.mingsoft.freight.entity.AreaDetailEntity;

/**
 * 运费模块的区域运费设置业务层
 * @author 上官德辉
 *
 */
public interface IAreaDetailBiz extends IBaseBiz {
	/**
	 * 查询所有的区域信息
	 * @param modelId 
	 * @param faId 
	 * @return
	 */
	public List<AreaDetailEntity> queryAllFad(int faId, int modelId);
	/**
	 * 查询单个区域信息
	 * @return
	 */
	public AreaDetailEntity getByFaEntity(AreaDetailEntity faEntity);
	/**
	 * 添加区域信息
	 * @param faEntity
	 * @return
	 */
	public void saveByFaEntity(AreaDetailEntity faEntity);
	/**
	 * 修改区域信息
	 * @param faEntity
	 * @return
	 */
	public void updateByFaEntity(AreaDetailEntity faEntity);
}