package com.kktua.gof;

import com.kktua.gof.facade.Facade;
import com.kktua.gof.singleton.SingletonEager;
import com.kktua.gof.singleton.SingletonLazy;
import com.kktua.gof.singleton.SingletonLazyHolder;
import com.kktua.gof.strategy.*;

public class Main {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressovo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressovo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facede = new Facade();
        facede.migrarCliente("Eduardo", "88888888");

    }
}

