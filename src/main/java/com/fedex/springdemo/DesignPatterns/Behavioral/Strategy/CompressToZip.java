package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy;

public class CompressToZip implements Strategy {

	@Override
	public void compressFile(String fileName) {
		System.out.println(fileName+ " has been succesfully compressed to Zip");
	}

}
