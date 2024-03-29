package com.example.demo.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.entity.User;

import java.util.Date;

import org.springframework.stereotype.Service;

/***
 * token 下发
* @Title: TokenService.java 
* @author MRC
* @date 2019年5月27日 下午5:40:25 
* @version V1.0
 */
@Service("TokenService")
public class TokenService {

	public String getToken(User user) {
		Date start = new Date();
		long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
		Date end = new Date(currentTime);
		String token = "";
		
		token = JWT.create().withAudience(user.getId()).withIssuedAt(start).withExpiresAt(end)
				.sign(Algorithm.HMAC256(user.getPassword()));
		return token;
	}
}
