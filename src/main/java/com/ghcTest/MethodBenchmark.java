package com.ghcTest;

public class MethodBenchmark extends Benchmark{
	void benchmark() {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length >0) {
		int count = Integer.parseInt(args[0]);
		long time = new MethodBenchmark().repeat(count);
		System.out.println(count + " methods in " + time + "milliseconds");
		System.out.println(args.length);
	}
	}
}
