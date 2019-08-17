package com.github.poad.functional.type.tuple;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class QuadrupleTest extends ScenarioTest<QuadrupleTestStep, QuadrupleTestStep, QuadrupleTestStep>{

    @Test
    public void integer_normal() {
        given().generateInstanceWith(1, 2, 3, 4);
        then().quadrupleWith(1, 2, 3, 4);
    }

    @Test
    public void object_normal() {
        final List<Integer> list = Collections.singletonList(123);
        given().generateInstanceWith("abc", list, 123, 456);
        then().quadrupleWith("abc", list, 123, 456);
    }

    @Test
    public void object_with_null_normal() {
        given().generateInstanceWith("abc", null, null, null);
        then().quadrupleWith("abc", null, null, null);
    }
}

class QuadrupleTestStep extends Stage<QuadrupleTestStep> {
    private static class Quadruple<L, ML, MR, R> extends Triple<L, ML, MR> {
        public final R _4;

        private Quadruple(L _1, ML _2, MR _3, R _4) {
            super(_1, _2, _3);
            this._4 = _4;
        }

        public static <L, ML, MR, R> Quadruple of(L _1, ML _2, MR _3, R _4) {
            return new Quadruple(_1, _2, _3, _4);
        }

    }

    private Quadruple<?, ?, ?, ?> quadruple;

    public QuadrupleTestStep generateInstanceWith(Object i, Object i1, Object i2, Object i3) {
        quadruple = Quadruple.of(i, i1, i2, i3);
        return self();
    }

    public QuadrupleTestStep quadrupleWith(Object o, Object o1, Object o2, Object o3) {
        assertThat(quadruple._1).isEqualTo(o);
        assertThat(quadruple._2).isEqualTo(o1);
        assertThat(quadruple._3).isEqualTo(o2);
        assertThat(quadruple._4).isEqualTo(o3);
        return self();
    }
}
