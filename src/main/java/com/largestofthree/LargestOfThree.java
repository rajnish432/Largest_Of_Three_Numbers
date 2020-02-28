package com.largestofthree;

public class LargestOfThree<E extends Comparable<E>>
{
    E v3;
    E v1;
    E v2;

    public LargestOfThree( E v1, E v2, E v3) {
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    public E getMaximum()
    {
        return  getMaximum(v1, v2, v3);
    }

    public <E extends Comparable<E>> E getMaximum(E v1, E v2, E v3) {
        E max=v1;
        if(v2.compareTo(max)>0)
        {
            max=v2;
        }
        if(v3.compareTo(max)>0)
        {
            max=v3;
        }
        return max;
    }

}
