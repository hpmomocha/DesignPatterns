package com.hpe.kevin.template.extend;

public class HummerH2Model extends HummerModel {

	@Override
	protected void start() {
		// 汽车发动
		System.out.println("悍马H2发动...");
	}

	@Override
	protected void stop() {
		// 停车
		System.out.println("悍马H2停车...");
	}

	@Override
	protected void alarm() {
		// H2型号的悍马车鸣笛
		System.out.println("悍马H2鸣笛...");
	}

	@Override
	protected void engineBoom() {
		// 引擎轰鸣声
		System.out.println("悍马H2引擎声音是这样的...");
	}

	@Override
	protected boolean isAlarm() {
		return false;
	}
}
