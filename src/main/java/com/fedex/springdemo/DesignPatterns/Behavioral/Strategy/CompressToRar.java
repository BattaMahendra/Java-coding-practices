package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy;

public class CompressToRar implements Strategy {

	@Override
	public void compressFile(String fileName) {
		System.out.println(fileName+ " has been succesfully compressed to Rar");
	}

}
