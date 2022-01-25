package com.kktua.gof.singleton;

/**
 * Singleton Eager
 *
 * @author Cacatua
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private  SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
