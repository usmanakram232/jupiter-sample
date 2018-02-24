package com.wolfie.example;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Foo {
    abstract public String bar();

    abstract public int numberOfBars();

    static public Foo create(String bar, int numberOfBars) {
        return new AutoValue_Foo(bar, numberOfBars);
    }

}