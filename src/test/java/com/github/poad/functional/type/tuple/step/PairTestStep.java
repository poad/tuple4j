package com.github.poad.functional.type.tuple.step;

import com.github.poad.functional.type.tuple.Pair;
import com.tngtech.jgiven.Stage;

import static org.assertj.core.api.Assertions.*;


public class PairTestStep extends Stage<PairTestStep> {
    private Pair<?, ?> pair;
    public PairTestStep generateInstanceWith(Object _1, Object _2) {
        pair = Pair.of(_1, _2);
        return self();
    }

    public PairTestStep pairWith(Object o, Object o1) {
        assertThat(pair._1).isEqualTo(o);
        assertThat(pair._2).isEqualTo(o1);
        return self();
    }

    public PairTestStep toString(String expect) {
        assertThat(pair.toString()).isEqualTo(expect);
        return self();
    }
}
