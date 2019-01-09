package com.hpe.kevin.builder;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		BenzModel benz = new BenzModel();
		// 存放run的顺序
		ArrayList<String> sequence = new ArrayList<String>();
		// 客户要求run的时候先发动引擎
		sequence.add("engine boom");
		// 启动起来
		sequence.add("start");
		// 开了一段就停下来
		sequence.add("stop");
		benz.setSequence(sequence);
		benz.run();
	}

}
