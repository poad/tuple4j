package poad.functional.type.tuple.step;

import com.tngtech.jgiven.Stage;
import poad.functional.type.tuple.Pair;
import poad.functional.type.tuple.Triple;

import static org.assertj.core.api.Assertions.assertThat;


public class TripleTestStep extends Stage<TripleTestStep> {
    private Triple<?, ?, ?> triple;
    public TripleTestStep generateInstanceWith(Object _1, Object _2, Object _3) {
        triple = Triple.of(_1, _2, _3);
        return self();
    }

    public TripleTestStep tripleWith(Object o, Object o1, Object o2) {
        assertThat(triple._1).isEqualTo(o);
        assertThat(triple._2).isEqualTo(o1);
        assertThat(triple._3).isEqualTo(o2);
        return self();
    }
}
