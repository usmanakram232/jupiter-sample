package com.wolfie.example;


import org.junit.jupiter.api.*;

import java.util.Objects;

import static org.assertj.core.api.Assertions.*;

public class FooTest {
    Foo foo;

    @BeforeEach
    void init () {
        foo = Foo.create ("Bar", 300);
    }

    @DisplayName ("Testing auto value immutable Foo object")
    @Tag ("bar")
    @Test
    void testBar () {
        // require non null foo
        Objects.requireNonNull (foo);

        assertThat (foo.bar ()).endsWith ("ar");
    }

    @DisplayName ("Testing number of bars")
    @Tag ("number-bars")
    @Test
    void testNumberOfBars () {
        // require non null foo
        Objects.requireNonNull (foo);

        assertThat (foo.numberOfBars ()).isBetween (100, 500);
    }
}
