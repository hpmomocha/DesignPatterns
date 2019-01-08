package com.hpe.kevin.abstractfactory;

/**
 * 产品等级扩展（横向扩展）
 * @author junzhang
 *
 */
public class IntersexFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// 生产出双性黄种人
		return new IntersexYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// 生产出双性白种人
		return new IntersexWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		// 生产出双性黑人
		return new IntersexBlackHuman();
	}

}
