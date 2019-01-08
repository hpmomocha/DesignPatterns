package com.hpe.kevin.abstractfactory;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// 生产出黄种人女性
		return new FemaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// 生产出白种人女性
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		// 生产出黑人女性
		return new FemaleBlackHuman();
	}

}
