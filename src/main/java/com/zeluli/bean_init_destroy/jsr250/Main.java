package com.zeluli.bean_init_destroy.jsr250;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------------------------Bean Init and Destroy----------------------------
		AnnotationConfigApplicationContext preContext = new AnnotationConfigApplicationContext(PrePostConfig.class);
		JSR250WayService jsrService = preContext.getBean(JSR250WayService.class);
		preContext.close();
	}

}
