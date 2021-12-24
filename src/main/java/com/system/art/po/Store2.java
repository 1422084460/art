package com.system.art.po;

public class Store2 extends InheritableThreadLocal<Thread>{

    private static Store2 store2;

    private Store2(){}

    public static Store2 getInstance(){
        if (store2==null){
            store2 = new Store2();
        }
        return store2;
    }
}
