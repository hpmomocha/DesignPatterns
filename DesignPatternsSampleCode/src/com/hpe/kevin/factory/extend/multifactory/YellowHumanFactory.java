package com.hpe.kevin.factory.extend.multifactory;

import com.hpe.kevin.factory.Human;
import com.hpe.kevin.factory.YellowHuman;

/**
 * 多工厂模式
 * @author junzhang
 *
 */
public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}