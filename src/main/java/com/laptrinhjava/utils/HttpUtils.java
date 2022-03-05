package com.laptrinhjava.utils;

import java.io.BufferedReader;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtils {
	
	private String value;
	
	public HttpUtils(String value) {
		this.value = value;
	}
	
	public <T> T toModel(Class<T> tClass) {
		try {
			return new ObjectMapper().readValue(value, tClass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null; 
		
	}
	
	public static HttpUtils of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		String liner;
		try {
			while((liner = reader.readLine()) != null) {
				sb.append(liner);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return new HttpUtils(sb.toString());
	}
}
