package com.tedu.mle.common.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class JsonUtil {

public static <T> List<T> readListValue(String json, Class<T> tClazz){
		return JSON.parseArray(json, tClazz);
	}


}
