package com.hpe.kevin.abstractfactory;

/**
 * 产品等级扩展（横向扩展）
 * @author junzhang
 *
 */
public class IntersexYellowHuman extends AbstractYellowHuman {
	@Override
	public void getSex() {
		System.out.println("双性黄种人");

	}
}
