package com.edu.szu.csse.controller;

import com.edu.szu.csse.bean.Device;

import com.edu.szu.csse.bean.Page;
import com.edu.szu.csse.service.DeviceService;
import com.edu.szu.csse.utils.DefaultValue;
import com.edu.szu.csse.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * controller
 * @author tools.49db.cn
 * @version 1.0
 * @date 2020-06-13
 */
@Controller
@RequestMapping("device")//todo 使用前请设置路径
public class DeviceController {
	@Autowired
	private DeviceService deviceService;

	private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);
	/*
		分页查询Device
	*/

	@RequestMapping("getDevices")
	@ResponseBody
	public PageInfo getDevices(@RequestParam Map condition){
		int pageNum = 1;
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))){
			//如果不为空，改变页号; MapUtils工具类
			pageNum = Integer.parseInt(MapUtils.getString(condition, "pageNum"));
		}
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))){
			//如果不为空，改变每页的个数; MapUtils工具类
			pageSize = Integer.parseInt(MapUtils.getString(condition, "pageSize"));
		}
		// 开始分页
		PageHelper.startPage(pageNum,pageSize);
		List<Device> devices = new ArrayList<>();
		try {
			devices = deviceService.getDevices(condition);
		}catch (Exception  e){
			logger.error("查询设备列表出错！" ,e);
		}
		PageInfo<Device> pageInfo = new PageInfo<>(devices);
		return pageInfo;
	}
	

}
