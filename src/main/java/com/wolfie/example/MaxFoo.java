package com.wolfie.example;


public class MaxFoo {
    private Foo foo;

    MaxFoo(Foo foo){
        if(foo.numberOfBars () >= 1000){
            throw new RuntimeException ("Too big.");
        }
        this.foo = foo;
    }

    boolean isMaxFoo(){
        return (foo.numberOfBars () > 400 && foo.numberOfBars () < 1000);
    }
}
