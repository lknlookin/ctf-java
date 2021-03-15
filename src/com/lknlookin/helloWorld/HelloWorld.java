package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		
		SamsungGalaxyNote8 ssNote8 = new SamsungGalaxyNote8();
		iPhoneX ipX = new iPhoneX();
		iPhone8 ip8 = new iPhone8();
		SamsungGalaxyS8 ssS8 = new SamsungGalaxyS8();
		
		ssNote8.model = "Samsung Galaxy Note 8";
		ssNote8.useGearVR();
		ssNote8.transformToPC();
		ssNote8.usePen();
		ssNote8.googlePlay();
		
		ipX.model = "iPhoneX";
		ipX.faceID();
		ipX.appStore();
		
		ip8.model = "iPhone8";
		ip8.touchID();
		ip8.appStore();
		
		ssS8.model = "Samsung Galaxy S8";
		ssS8.useGearVR();
		ssS8.transformToPC();
		ssS8.googlePlay();
		
	}
	
}
