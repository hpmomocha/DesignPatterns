package com.hpe.kevin.builder;

import java.util.ArrayList;

public abstract class CarModel {
	private ArrayList<String> sequence = new ArrayList<String>();

	// 模型启动开始跑了
	public abstract void start();
	
	// 能发动，还要能停下来，那才是真本事
	public abstract void stop();
	
	// 喇叭会出声音，是滴滴叫，还是呱呱叫
	public abstract void alarm();
	
	// 引擎会轰隆隆地响，不响那是假的
	public abstract void engineBoom();
	
	// 那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
	public final void run() {
		for (int i= 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if ("start".equalsIgnoreCase(actionName)) {
				// 发动汽车
				this.start();
			} else if ("engine boom".equalsIgnoreCase(actionName)) {
				// 引擎开始轰鸣
				this.engineBoom();
			} else if ("alarm".equalsIgnoreCase(actionName)) {
				// 喇叭开始叫了
				this.alarm();
			} else if ("stop".equalsIgnoreCase(actionName)) {
				// 停止汽车
				this.stop();
			}
		}
	}
	
	public final void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}
