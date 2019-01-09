package com.hpe.kevin.builder;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	// A类型的奔驰车，先start，然后stop，其他什么引擎，喇叭一概没有
	public BenzModel getABenzModel() {
		// 清理场景
		this.sequence.clear();
		// ABenzModel的执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	// B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
	public BenzModel getBBenzModel() {
		// 清理场景
		this.sequence.clear();
		// BBenzModel的执行顺序
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	// C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
	public BMWModel getCBMWModel() {
		// 清理场景
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	
	// D型号的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止
	public BMWModel getDBMWModel() {
		// 清理场景
		this.sequence.clear();
		this.sequence.add("start");
		
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	
	/*
	 * 这里还可以用很多方法，你可以先停止，然后再启动，或者一直停着不动，静态嘛 
	 */
}
