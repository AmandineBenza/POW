package com.dzoum.pow.utils;

public class Utils {
	
	private Utils() {
		
	}

	public static <T> void println(T object) {
		System.out.println(object);
	}
	
	public static String texturePath(String fileName) {
		return "src/main/resources/textures/" + fileName;
	}
	
	
}
