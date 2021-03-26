package com.company;
import java.math.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main3 {
    public static void main(String[] args) {

        int i,tab1[]={10,11,12,20,21,22,30,31,32,62,63,64};
        for(i=0;i<12;i++){
       System.out.println("Le temps d'execution de "+tab1[i]+" est "+ (pow(((1+sqrt(5))/2),tab1[i]))/1000 );
        }
    }

}
