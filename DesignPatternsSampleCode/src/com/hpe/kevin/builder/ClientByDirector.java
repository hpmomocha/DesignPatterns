package com.hpe.kevin.builder;


public class ClientByDirector {

	public static void main(String[] args) {
		Director director = new Director();
		
		// 1万辆A类型的奔驰车
		for (int i= 0; i< 10000; i++) {
			director.getABenzModel().run();
		}
		
		// 2万辆B类型的奔驰车
		for (int i = 0; i < 20000; i++) {
			director.getBBenzModel().run();
		}
		
		// 10万辆C类型的宝马车
		for (int i = 0; i < 100000; i++) {
			director.getCBMWModel().run();
		}
	}

}
