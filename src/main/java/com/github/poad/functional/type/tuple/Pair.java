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
 * The {@link Pair} class provides the tuple for two values.
 */
public class Pair<L, R> {

    public final L _1;
    public final R _2;

    Pair(L _1, R _2) {
        this._1 = _1;
        this._2 = _2;
    }

    /**
     * Generates a tuple for two values.
     */
    public static <L, R> Pair<L, R> of(L _1, R _2) {
        return new Pair<>(_1, _2);
    }

    @Override
    public String toString() {
        return "(" +
                _1 +
                ", " + _2 +
                ')';
    }
}
