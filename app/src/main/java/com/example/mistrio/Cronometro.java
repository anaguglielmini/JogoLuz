package com.example.mistrio;

public class Cronometro {
    private long start;


    public void Start(long milis) {
        this.start = milis;
    }

    public long Stop(){
        return System.currentTimeMillis() - start;
    }
}

