package com.litwin.lab02_nwd;

public class NWW {
    public int calculateNWW(int a, int b)
    {
        NWD nwd = new NWD();
        return a * (b / nwd.calculateNWD(a, b));
    }
}
