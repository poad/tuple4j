package com.github.poad.functional.type.tuple;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import com.github.poad.functional.type.tuple.step.TripleTestStep;

import java.util.Collections;
import java.util.List;

@RunWith(Enclosed.class)
public class TripleTest {

    public static class IntegerTest  extends ScenarioTest<TripleTestStep, TripleTestStep, TripleTestStep> {
        @Test
        public void normal() {
            given().generateInstanceWith(1, 2, 3);
            then().tripleWith(1, 2, 3);
        }
    }

    public static class ObjectTest  extends ScenarioTest<TripleTestStep, TripleTestStep, TripleTestStep> {
        @Test
        public void normal() {
            final List<Integer> list = Collections.singletonList(123);
            given().generateInstanceWith("abc", list, 123);
            then().tripleWith("abc", list, 123);
        }
    }

    public static class ObjectWithNullTest  extends ScenarioTest<TripleTestStep, TripleTestStep, TripleTestStep> {
        @Test
        public void normal() {
            given().generateInstanceWith("abc", null, null);
            then().tripleWith("abc", null, null);
        }
    }
}
