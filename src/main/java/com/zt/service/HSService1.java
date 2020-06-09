package com.zt.service;

import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.zt.bean.Dog;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HSService1 {
	Logger Logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	Dog dog;
	
	@Autowired
	ApplicationContext ioc;
	@Test
	public void print() {
		boolean has = ioc.containsBean("addCat");
		Logger.info(has?"1":"0");
		Logger.info(dog.toString());
		Logger.trace("这是trace");
		Logger.info("这是info");
		Logger.debug("这是debug");
		Logger.warn("这是warn");
		Logger.error("这是error");
		
	}
}
