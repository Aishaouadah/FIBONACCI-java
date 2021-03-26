package com.company;
import java.util.Scanner;

public class Main {
    private static int fib(int n){
        if(n==0 || n==1) return 1;
        else return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        Long c1,c2;
        Integer n=0,resultat;
        Scanner scanner = new Scanner(System.in);
	System.out.println("Donner un nombre n:");
	n = scanner.nextInt();
	//calcule de temps d'excution
    c1 =  System.currentTimeMillis();
	resultat = fib(n);
	c2 =  System.currentTimeMillis();
        System.out.println("La valeur de la suite de Fibonacci pour n = "+ n+ " est = "+ resultat);
        System.out.println("Le temps d'execution est "+ (c2-c1));
    }

}
