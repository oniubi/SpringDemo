package com.zeluli.bean_init_destroy;

public class BeanWayService {
	
	public BeanWayService() {
		System.out.println("BeanWayService构造器");
	}
	
	public void init() {
		System.out.println("在BeanWayService构造器执行完后调用");
	}
	
	public void destroy() {
		System.out.println("BeanWayService销毁之前调用");
	}
	

}
