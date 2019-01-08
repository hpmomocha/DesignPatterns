package com.hpe.kevin.abstractfactory;

public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// 生产出黄种人男性
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// 生产出白种人男性
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		// 生产出黑人男性
		return new MaleBlackHuman();
	}

}
