package com.github.poad.functional.type.tuple;

import com.github.poad.functional.type.tuple.step.PairTestStep;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.List;

@RunWith(Enclosed.class)
public class PairTest {

    public static class IntegerTest  extends ScenarioTest<PairTestStep, PairTestStep, PairTestStep> {
        @Test
        public void normal() {
            given().generateInstanceWith(1, 2);
            then().pairWith(1, 2);
        }
    }

    public static class ObjectTest  extends ScenarioTest<PairTestStep, PairTestStep, PairTestStep> {
        @Test
        public void normal() {
            final List<Integer> list = Collections.singletonList(123);
            given().generateInstanceWith("abc", list);
            then().pairWith("abc", list);
        }
    }

    public static class ObjectWithNullTest  extends ScenarioTest<PairTestStep, PairTestStep, PairTestStep> {
        @Test
        public void normal() {
            given().generateInstanceWith("abc", null);
            then().pairWith("abc", null);
        }
    }
}
