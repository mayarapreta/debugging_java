package br.com.dio.debbuging;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no motodo main.");
        a();
        System.out.println("Finalizou do programa no mótodo main.");

    }
     static  void a(){
        System.out.println("Entrou no mótodo a.");
        b();
        System.out.println("finalizou o mótodo a.");
        //Cavalconte, 10/8/21 3:19 pm first commit
    }
    static void b(){
        System.out.println("Entrou no mótodo b.");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o mótodo b.");
    }
    static  void  c(){
        System.out.println("Entrou no mótodo c.");
        Thread.dumpStack();
        System.out.println("Finlizou o mótodo c.");
    }
}