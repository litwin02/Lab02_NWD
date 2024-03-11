package com.litwin.lab02_nwd;

public class NWD {
    public int calculateNWD(int a, int b)
    {
        int pom;

        while(b!=0)
        {
            pom = b;
            b = a%b;
            a = pom;
        }
        return a;
    }
}
