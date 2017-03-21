package com.controller.name;

public class A {

	public static void main(String[] args) {
//		4200X+3000Y+4800Z+740P+830Q=10340000
		
		for (int x = 0; x < 674; x++) {
			for (int y = 0; y < 309; y++) {
				for (int z = 0; z < 2155; z++) {
					if (4200*x + 3000*y + 4800*z > 10340000) {
						continue;
					}
					for (int p = 0; p < 13973; p++) {
						if (4200*x + 3000*y + 4800*z + 740*p > 10340000) {
							continue;
						}
						for (int q = 0; q < 12458; q++) {
							int result = 4200*x + 3000*y + 4800*z + 740*p + 830*q;
							if (result == 10340000) {
								System.out.println("x="+x +" y=" +y + " z="+z+" p="+p+" q="+q);
							}
						}
					}
				}
			}
		}
		System.out.println("end...");
		
	}
}
