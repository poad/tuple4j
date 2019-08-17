package com.github.poad.functional.type.tuple;

import com.github.poad.functional.type.tuple.step.PairTestStep;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.List;

public class PairTest extends ScenarioTest<PairTestStep, PairTestStep, PairTestStep> {

    @Test
    public void inteegr_normal() {
        given().generateInstanceWith(1, 2);
        then().pairWith(1, 2)
                .and()
                .toString("(1, 2)");
    }

    @Test
    public void object_normal() {
        final List<Integer> list = Collections.singletonList(123);
        given().generateInstanceWith("abc", list);
        then().pairWith("abc", list)
                .and()
                .toString("(abc, " + list.toString() + ")");
    }

    @Test
    public void object_with_null_normal() {
        given().generateInstanceWith("abc", null);
        then().pairWith("abc", null)
                .and()
                .toString("(abc, null)");
    }
}
