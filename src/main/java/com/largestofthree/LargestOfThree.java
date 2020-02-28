package com.largestofthree;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum");

        LargestOfThree largestOfThree=new LargestOfThree();
        //Integer Objects
        Integer num1=0;
        Integer num2 =0;
        Integer num3=0;
        //Float Objects
        Float n1= 0.0f;
        Float n2= 0.0f;
        Float n3= 0.0f;

        largestOfThree.getFloatMaximum(n1,n2,n3);
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

    public float getFloatMaximum(Float n1,Float n2,Float n3) {
        Float max=n1;
        if(n2.compareTo(max)>0)
        {
            max=n2;
        }
        if (n3.compareTo(max)>0)
        {
            max=n3;
        }
        return max;
    }
}
