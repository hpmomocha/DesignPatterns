package com.hpe.kevin.abstractfactory;

public class NvWa {

	public static void main(String[] args) {
		// 第一条生产线，男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		// 第二条生产线，女性生产线
		HumanFactory femaleHumanFactory = new FemaleFactory();
		// 第三条生产线，双性人生产线
		// 产品等级扩展（横向扩展）
		HumanFactory intersexHumanFactory = new IntersexFactory();
		
		// 生产线建立完毕，开始生产人了:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		// 产品等级扩展（横向扩展）
		Human intersexYellowHuman = intersexHumanFactory.createYellowHuman();
		System.out.println("---生产一个黄色女性---");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		System.out.println("---生产一个黄色男性---");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		// 产品等级扩展（横向扩展）
		System.out.println("---生产一个双性黄种人---");
		intersexYellowHuman.getColor();
		intersexYellowHuman.talk();
		intersexYellowHuman.getSex();

		Human maleBlackHuman = maleHumanFactory.createBlackHuman();
		Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
		// 产品等级扩展（横向扩展）
		Human intersexHuman = intersexHumanFactory.createBlackHuman();
		System.out.println("---生产一个黑色女性---");
		femaleBlackHuman.getColor();
		femaleBlackHuman.talk();
		femaleBlackHuman.getSex();
		System.out.println("---生产一个黑色男性---");
		maleBlackHuman.getColor();
		maleBlackHuman.talk();
		maleBlackHuman.getSex();
		// 产品等级扩展（横向扩展）
		System.out.println("---生产一个双性黑人---");
		intersexHuman.getColor();
		intersexHuman.talk();
		intersexHuman.getSex();
		
		Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
		Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
		// 产品等级扩展（横向扩展）
		Human intersexWhiteHuman = intersexHumanFactory.createWhiteHuman();
		System.out.println("---生产一个白色女性---");
		femaleWhiteHuman.getColor();
		femaleWhiteHuman.talk();
		femaleWhiteHuman.getSex();
		System.out.println("---生产一个白色男性---");
		maleWhiteHuman.getColor();
		maleWhiteHuman.talk();
		maleWhiteHuman.getSex();
		// 产品等级扩展（横向扩展）
		System.out.println("---生产一个双性白种人---");
		intersexWhiteHuman.getColor();
		intersexWhiteHuman.talk();
		intersexWhiteHuman.getSex();
	}

}
