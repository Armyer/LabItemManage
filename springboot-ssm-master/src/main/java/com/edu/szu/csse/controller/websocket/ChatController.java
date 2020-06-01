package com.edu.szu.csse.controller.websocket;

import com.edu.szu.csse.websocket.ChatServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/chat")
@Controller
public class ChatController {

	/**
	 * 跳转到聊天页面
	 * 
	 * @return
	 */
	@RequestMapping("/chatRoom")
	public String chatRoom() {
		return "websocket/chatRoom";
	}

	/**
	 * http请求发送消息
	 * 
	 * @param msg
	 * @return
	 */
	@RequestMapping("/sendMsg")
	public @ResponseBody String sendMsg(String msg) {
		ChatServer.broadcast(msg);
		return "success";
	}

}
