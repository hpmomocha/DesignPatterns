package com.hpe.kevin.factory.extend;

import com.hpe.kevin.factory.BlackHuman;
import com.hpe.kevin.factory.Human;
import com.hpe.kevin.factory.WhiteHuman;
import com.hpe.kevin.factory.YellowHuman;

public class NvWa {

	public static void main(String[] args) {
		// 女娲第一次造人，火候不足，于是白人产生了
		System.out.println("--造出的第一批人是白色人种--");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		// 女娲第二次造人，火候过足，于是黑人产生了
		System.out.println("--造出的第二批人是黑色人种--");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		// 女娲第三次造人，火候刚好，于是黄种人产生了
		System.out.println("--造出的第三批人是黄色人种--");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}