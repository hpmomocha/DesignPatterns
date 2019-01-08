package com.hpe.kevin.factory.extend.multifactory;

import com.hpe.kevin.factory.Human;

public class NvWa {

	public static void main(String[] args) {
		// 女娲第一次造人，火候不足，于是白人产生了
		System.out.println("--造出的第一批人是白色人种--");
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		// 女娲第二次造人，火候过足，于是黑人产生了
		System.out.println("--造出的第二批人是黑色人种--");
		Human blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		// 女娲第三次造人，火候刚好，于是黄种人产生了
		System.out.println("--造出的第三批人是黄色人种--");
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}