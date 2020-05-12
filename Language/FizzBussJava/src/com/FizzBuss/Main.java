package com.FizzBuss;

public class Main {

    public static void main(String[] args) {

	for (int i = 0; i<=100; i++) {
	    if (i%3 == 0 && i%5 != 0)
	        System.out.println("Fizz");
	    else if (i%3 != 0 && i%5 == 0)
            System.out.println("Buss");
        else if (i%3 == 0 && i%5 == 0)
            System.out.println("FizzBuss");
        else System.out.println(i);
    }
    }
}
