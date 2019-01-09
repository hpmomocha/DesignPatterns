package com.hpe.kevin.template;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		// 汽车发动
		System.out.println("悍马H2发动...");
	}

	@Override
	public void stop() {
		// 停车
		System.out.println("悍马H2停车...");
	}

	@Override
	public void alarm() {
		// H2型号的悍马车鸣笛
		System.out.println("悍马H2鸣笛...");
	}

	@Override
	public void engineBoom() {
		// 引擎轰鸣声
		System.out.println("悍马H2引擎声音是这样的...");
	}

}
