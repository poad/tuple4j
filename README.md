Tuple for Java
==========

[![Build Status](https://travis-ci.org/poad/tuple4j.svg?branch=master)](https://travis-ci.org/poad/tuple4j)

The tuple4j provides the tuple for Java.

## What is Tuple?
[Wikipedia](https://en.wikipedia.org/wiki/Tuple)

## Usage
### When group of two values.
```$java
Pair<Intger, Intger> pair = Pair.of(10, 20);

Systemm.out.println(pair._1);   // 10
Systemm.out.println(pair._2);   // 20

Pair<String, List<Long>> pair2 = Pair.of("hoge", Arrays.asList(20L, 30L));

org.junit.Assert.Assert.assetEquals(pair2._1, "hoge"); // passed
org.junit.Assert.Assert.assetEquals(pair2._2, Arrays.asList(20L, 30L)); // passed
```

### When group of three values.
```$java
Triple<Intger, Intger, String> triple = Triple.of(10, 20, "a");

Systemm.out.println(triple._1);   // 10
Systemm.out.println(triple._2);   // 20
Systemm.out.println(triple._3);   // "a"
```

## Why do you not encapsulate a properties?
There are the following reasons for it.
- make it as immutable object
- refer to [Tuple of Scala](https://github.com/poad/tuple4j/blob/master/src/test/scala/com/github/poad/functional/type/tuple/exammple/TupleExample.scala)