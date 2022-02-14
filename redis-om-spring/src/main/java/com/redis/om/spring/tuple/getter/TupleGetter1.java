
package com.redis.om.spring.tuple.getter;

/**
 * Specialization of {@link TupleGetter} that always returns the 1st element.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleGetterPattern
 *
 * @param <T>  the type of the tuple to get a value from
 * @param <T1> the type of the element to return
 *

 *
 */
@FunctionalInterface
public interface TupleGetter1<T, T1> extends TupleGetter<T, T1> {

    @Override
    default int index() {
        return 1;
    }
}