package com.hpe.kevin.abstractfactory;

public class AbstractYellowHuman implements Human {

	@Override
	public void talk() {
		System.out.println("黄色人种会说话，一般说的都是双字节。");
	}

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黄色的！");
	}

	@Override
	public void getSex() {
		// 在子类中实现
	}

}
