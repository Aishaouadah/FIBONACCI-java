package com.company;
public class Main2 {
    //fonction fib
    private static long fib(Long n){
        if(n==0 || n==1) return 1;
        else return (fib(n-1)+fib(n-2));
    } // fonction appel fib avec un tableau
    private static Long[] fib_tableau(long[] tab1){
        Long c1,c2,tab2[] = new Long[9], resultat;
        int i;
            for(i=0;i<9;i++){
                    c1 =  System.currentTimeMillis();
                    resultat = fib(tab1[i]);
                    c2 =  System.currentTimeMillis();
                    tab2[i]=(c2-c1); }
        return tab2;
        }// le Main
        public static void main(String[] args) {
            //int tab1[]={10,11,12,20,21,22,30,31,32,60,61,62};
            long[] tab1 ={10,11,12,20,21,22,30,31,32};
            Long tab2[];
            tab2 = fib_tableau(tab1);
            int i;
            for (i=0;i<9;i++) {
                System.out.println(tab2[i]); } }
}
