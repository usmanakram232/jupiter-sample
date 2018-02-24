package com.wolfie.example;

import io.vavr.CheckedFunction1;
import io.vavr.test.Arbitrary;
import io.vavr.test.CheckResult;
import io.vavr.test.Property;
import org.junit.jupiter.api.Test;

public class MaxFooTest {
    @Test
    void testMax(){
        //given
        Arbitrary<Integer> numBars = Arbitrary
                .integer()
                .filter(i -> i > 900)
                .filter (i -> i < 1100);

        //when
        CheckedFunction1<Integer, Boolean> mustEquals = i -> (new MaxFoo (Foo.create ("bar", i))).isMaxFoo ();

        //then
        CheckResult result = Property
                .def("Every second element must equal to DividedByTwoWithoutRemainder")
                .forAll(numBars)
                .suchThat(mustEquals)
                .check(10_000, 100);

        result.assertIsSatisfied();
    }
}
