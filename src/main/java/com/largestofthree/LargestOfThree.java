package com.largestofthree;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum");

        LargestOfThree largestOfThree=new LargestOfThree();
        //Integer Objects
        Integer num1=0;
        Integer num2 =0;
        Integer num3=0;
        largestOfThree.getMaximum(num1,num2,num3);
    }

    public int getMaximum(Integer num1, Integer num2, Integer num3) {
        Integer max=num1;
        if(num2.compareTo(max)>0)
        {
            max=num2;
        }
        if(num3.compareTo(max)>0)
        {
            max=num3;
        }
        return max;
    }
}
