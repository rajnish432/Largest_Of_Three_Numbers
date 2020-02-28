package com.largestofthree;

public class LargestOfThree {

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
