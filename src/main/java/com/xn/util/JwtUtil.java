package com.xn.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class JwtUtil {
	public static String encrypt(String key,String data) throws IllegalArgumentException, UnsupportedEncodingException{
		Algorithm algorithm = Algorithm.HMAC256("29b96bf9-5f95-11e7-8068-000c298b0e32");
		String token1=JWT.create().withClaim("companyId", "zc_1000").withClaim("userName", "admin").withClaim("custmerId", "zc_1000_ISME9754_T2D_admin")
				.sign(algorithm);
		
	    return token1;
	}
	public static boolean authenticate(String key,String data){
		try {
		    Algorithm algorithm = Algorithm.HMAC256(key);
		    JWTVerifier verifier = JWT.require(algorithm)
		        .build(); //Reusable verifier instance
		    DecodedJWT jwt = verifier.verify(data);
		} catch (UnsupportedEncodingException exception){
			return false;
		} catch (JWTVerificationException exception){
			return false;
		}
		return true;
	}
	public static Map<String, Claim> decode(String data){
		return JWT.decode(data).getClaims();
	}
	/**
	 * 下载知识库问答对,加密算法
	 * @param key
	 * @param companyId
	 * @return
	 * @throws IllegalArgumentException
	 * @throws UnsupportedEncodingException
	 */
	public static String encryptCompany(String key, String companyId) throws IllegalArgumentException, UnsupportedEncodingException{
		Algorithm algorithm = Algorithm.HMAC256(key);
		String token=JWT.create().withClaim("companyId", companyId)
				.sign(algorithm);
	    return token;
	}
	public static void main(String[] args) throws IllegalArgumentException, UnsupportedEncodingException{
////		String str="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb21wYW55SWQiOiJrZl8zMzEwIiwidXNlck5hbWUiOiLlsI_mmI4iLCJjdXN0bWVySWQiOiJzd2Vpa2Zfd2U5MDAifQ.P2Wu0QZwiPR9v5Kk5jvuzNXhLp2_nSgJ-RAXjyv5ktk";
////		System.out.println(authenticate("c6caae9b-8d30-4d73-8d60-c43ad6e85574",str));
//
		System.out.println(encrypt("",""));
////		String str="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb21wYW55SWQiOiJrZl8zMDA0IiwidXNlck5hbWUiOiJhZG1pbiIsImN1c3RtZXJJZCI6InN3ZWlrZl93ZTkwMCJ9.nI9nQd-XGHFAM-_B83xA47c0bqvrUDG_5pHj9a39tGs";
////		@SuppressWarnings("unused")
//		Map<String, Claim> decode = decode("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb21wYW55SWQiOiJrZl8xMDAyIiwiY3VzdG1lcklkIjoia2ZfMTAwMl9mNzhiZDdjOS0yOGRjLTRlNDctOTAyZi1jMDFlYWZkNzNjMWYifQ.q999ANG3Xdj0gvMVd452jXld8XwMyIGu2jt2sIUZthY");
//		  for (String key : decode.keySet()) {
//			   System.out.println("key= "+ key + " and value= " + ((Claim)decode.get(key)).asString());
//			  }
		
	}
}
