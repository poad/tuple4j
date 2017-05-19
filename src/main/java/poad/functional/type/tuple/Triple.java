package poad.functional.type.tuple;

public class Triple<L, M, R> extends Pair<L, M> {

    public final R _3;

    protected Triple(L _1, M _2, R _3) {
        super(_1, _2);
        this._3 = _3;
    }

    public static <L, M, R> Triple<L, M, R> of(L _1, M _2, R _3) {
        return new Triple<>(_1, _2, _3);
    }
    
}
