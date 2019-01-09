package com.hpe.kevin.template.extend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) throws IOException {
		System.out.println("------H1型号悍马------");
		System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要   1-需要");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		// H1型号的悍马
		HummerH1Model h1 = new HummerH1Model();
		if (type.equals("0")) {
			h1.setAlarm(false);
		}
		h1.run();
		System.out.println("------H2型号悍马------");
		// H2型号的悍马
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}

}
