package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tshirt>tshirts = new ArrayList<>();

        tshirts.add(new Tshirt(Colors.BLACK, Sizes.LARGE, Fit.WOMENS));
        tshirts.add(new Tshirt(Colors.RED, Sizes.SMALL, Fit.YOUTH));
        tshirts.add(new Tshirt(Colors.YELLOW, Sizes.MEDIUM, Fit.MENS));
        tshirts.add(new Tshirt(Colors.GRAY, Sizes.X_LARGE, Fit.MENS));

        for(Tshirt t : tshirts){
            System.out.println(t.tshirtBuilder());
        }

        System.out.println(Fit.valueOf("MENS").getNum());

    }
}