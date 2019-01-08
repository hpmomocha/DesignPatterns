package com.hpe.kevin.factory.extend.multifactory;

import com.hpe.kevin.factory.BlackHuman;
import com.hpe.kevin.factory.Human;

/**
 * 多工厂模式
 * @author junzhang
 *
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}