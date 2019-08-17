package com.github.poad.functional.type.tuple;

import com.tngtech.jgiven.junit.ScenarioTest;
import com.github.poad.functional.type.tuple.step.TripleTestStep;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class TripleTest  extends ScenarioTest<TripleTestStep, TripleTestStep, TripleTestStep> {

    @Test
    public void integer_normal() {
        given().generateInstanceWith(1, 2, 3);
        then().tripleWith(1, 2, 3)
                .and()
                .toString("(1, 2, 3)");
    }

    @Test
    public void object_normal() {
        final List<Integer> list = Collections.singletonList(123);
        given().generateInstanceWith("abc", list, 123);
        then().tripleWith("abc", list, 123)
                .and()
                .toString("(abc, " + list.toString() + ", 123)");
    }

    @Test
    public void object_with_null_normal() {
        given().generateInstanceWith("abc", null, null);
        then().tripleWith("abc", null, null)
                .and()
                .toString("(abc, null, null)");
    }
}
