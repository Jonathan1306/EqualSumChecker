package com.company;

public class Main {

    public static void main(String[] args) {
		System.out.println(hasEqualSum(15,0,15));
		System.out.println(hasEqualSum(-15,0,15));
		System.out.println(hasEqualSum(-15,30,15));
		System.out.println(hasEqualSum(0,15,15));
		System.out.println(hasEqualSum(30,-15,15));

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){

        if((num1 + num2) == num3){ 
            return true;
        }
        return false;
    };
}
