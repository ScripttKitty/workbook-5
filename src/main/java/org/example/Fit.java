package org.example;

public enum Fit {
    MENS(1),
    WOMENS(2),
    YOUTH(3);

    private int num;
    Fit(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }
}
