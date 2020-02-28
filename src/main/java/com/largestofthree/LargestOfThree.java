package com.largestofthree;

public class LargestOfThree {

    public Integer getMaximum(Integer num1, Integer num2, Integer num3) {
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

    public Float getFloatMaximum(Float n1,Float n2,Float n3) {
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

    public String getStringMaximum(String a,String b,String c) {
        String max=a;
        if (b.compareTo(max)>0)
        {
            max=b;
        }
        if (c.compareTo(max)>0)
        {
            max=c;
        }
        return max;
    }
}
