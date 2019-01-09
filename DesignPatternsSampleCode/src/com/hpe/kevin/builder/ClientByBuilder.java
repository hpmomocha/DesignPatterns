package com.hpe.kevin.builder;

import java.util.ArrayList;

public class ClientByBuilder {

	public static void main(String[] args) {
		// 存放run的顺序
		ArrayList<String> sequence = new ArrayList<String>();
		// 客户要求run的时候先发动引擎
		sequence.add("engine boom");
		// 启动起来
		sequence.add("start");
		// 开了一段就停下来
		sequence.add("stop");
		
		// 要一个奔驰车
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		// 制造出一辆奔驰车
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		// 奔驰车跑一下看看
		benz.run();
		
		// 按照相同的顺序，我再要一个宝马
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		// 制造出一辆宝马车
		BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
		bmw.run();
	}

}
