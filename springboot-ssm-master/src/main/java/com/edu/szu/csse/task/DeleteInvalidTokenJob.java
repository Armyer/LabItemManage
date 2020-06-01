package com.edu.szu.csse.task;

import com.edu.szu.csse.service.user.TokenService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DeleteInvalidTokenJob {
	
	private TokenService tokenService;
	
	@Scheduled(fixedRate = 60000)
	public void cron() {
		tokenService.deleteInvalidToken();
	}
}