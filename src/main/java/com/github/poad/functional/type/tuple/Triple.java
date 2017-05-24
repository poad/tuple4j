/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.poad.functional.type.tuple;

/**
 * The {@link Triple} class provides the tuple for three values.
 */
public class Triple<L, M, R> extends Pair<L, M> {

    public final R _3;

    protected Triple(L _1, M _2, R _3) {
        super(_1, _2);
        this._3 = _3;
    }

    /**
     * Generates a tuple for three values.
     */
    public static <L, M, R> Triple<L, M, R> of(L _1, M _2, R _3) {
        return new Triple<>(_1, _2, _3);
    }

    @Override
    public String toString() {
        return "(" +
                _1 +
                ", " + _2 +
                ", " + _3 +
                ')';
    }
}
