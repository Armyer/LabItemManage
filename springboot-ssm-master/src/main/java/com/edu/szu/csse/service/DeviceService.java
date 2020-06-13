package com.edu.szu.csse.service;


import com.edu.szu.csse.bean.Device;
import com.edu.szu.csse.bean.Teacher;

import java.util.List;
import java.util.Map;


/**
 * service接口
 * 默认提供的查询/更新/删除方法均针对主键，请根据业务需求自行添加相关方法，条件筛选使用Example，参考select方法（利用DAOMapper.***ByExample）
 * @author tools.49db.cn
 * @version 1.0
 * @date 2020-06-13
 */
public interface DeviceService {


	List<Device> getDevices(Map condition);

	/**
	 * 根据主键查询
	 * @return
	 * @throws Exception
	 */
	Device selectByPrimaryKey(Long key) throws Exception;
	
	

	/**
	 * 删除记录-根据主键
	 * @param key
	 * @return
	 * @throws Exception
	 */
	boolean delByPrimaryKey(Long key) throws Exception;
	

}
