package com.kktua.gof.singleton;

/**
 * Singleton Lazy
 *
 * @author Cacatua
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private  SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
