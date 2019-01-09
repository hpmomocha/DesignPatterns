package com.hpe.kevin.template.extend;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;
	
	@Override
	protected void start() {
		// 汽车发动
		System.out.println("悍马H1发动...");
	}

	@Override
	protected void stop() {
		// 停车
		System.out.println("悍马H1停车...");
	}

	@Override
	protected void alarm() {
		// H1型号的悍马车鸣笛
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	protected void engineBoom() {
		// 引擎轰鸣声
		System.out.println("悍马H1引擎声音是这样的...");
	}

	// 要不要响喇叭，是由客户来决定的
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}
