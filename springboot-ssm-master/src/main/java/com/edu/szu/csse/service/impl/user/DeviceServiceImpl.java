package com.edu.szu.csse.service.impl.user;



import com.edu.szu.csse.bean.Device;

import com.edu.szu.csse.bean.DeviceExample;
import com.edu.szu.csse.mapper.user.DeviceMapper;
import com.edu.szu.csse.service.DeviceService;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * service实现
 * @author tools.49db.cn
 * @version 1.0
 * @date 2020-06-13
 */
@Service
public class DeviceServiceImpl implements DeviceService {
	@Autowired
	private DeviceMapper deviceMapper;


	@Override
	public List<Device> getDevices(Map condition) {
		DeviceExample deviceExample = new DeviceExample();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "device_id"))){
			DeviceExample.Criteria createCriteria = deviceExample.createCriteria();
			createCriteria.andDeviceIdLike("%" + MapUtils.getString(condition, "deviceId") + "%");
		}
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		return list;
	}

	@Override
	public Device selectByPrimaryKey(Long key) throws Exception {
		return null;
	}

	@Override
	public boolean delByPrimaryKey(Long key) throws Exception {
		return false;
	}
}
