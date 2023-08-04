package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy;

public class Context {
	
	private Strategy strategy;
	
	public void setCompressionStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	public void generateFile(String file) {
		strategy.compressFile(file);
	}

}
