
package com.redis.om.spring.tuple;

import com.redis.om.spring.tuple.getter.TupleGetter;
import com.redis.om.spring.tuple.getter.TupleGetter0;
import com.redis.om.spring.tuple.getter.TupleGetter1;
import com.redis.om.spring.tuple.getter.TupleGetter10;
import com.redis.om.spring.tuple.getter.TupleGetter11;
import com.redis.om.spring.tuple.getter.TupleGetter12;
import com.redis.om.spring.tuple.getter.TupleGetter13;
import com.redis.om.spring.tuple.getter.TupleGetter14;
import com.redis.om.spring.tuple.getter.TupleGetter15;
import com.redis.om.spring.tuple.getter.TupleGetter16;
import com.redis.om.spring.tuple.getter.TupleGetter17;
import com.redis.om.spring.tuple.getter.TupleGetter18;
import com.redis.om.spring.tuple.getter.TupleGetter2;
import com.redis.om.spring.tuple.getter.TupleGetter3;
import com.redis.om.spring.tuple.getter.TupleGetter4;
import com.redis.om.spring.tuple.getter.TupleGetter5;
import com.redis.om.spring.tuple.getter.TupleGetter6;
import com.redis.om.spring.tuple.getter.TupleGetter7;
import com.redis.om.spring.tuple.getter.TupleGetter8;
import com.redis.om.spring.tuple.getter.TupleGetter9;

/**
 * This interface defines a generic {@link Tuple} of degree 19 that can hold
 * non-null values. A Tuple is type safe, immutable and thread safe. For tuples
 * that can hold null elements see {@link OptionalTuple}. For mutable tuples see
 * {@link MutableTuple}
 *
 * This {@link Tuple} has a degree of 19
 * <p>
 *
 *
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * @param <T11> type of element 11
 * @param <T12> type of element 12
 * @param <T13> type of element 13
 * @param <T14> type of element 14
 * @param <T15> type of element 15
 * @param <T16> type of element 16
 * @param <T17> type of element 17
 * @param <T18> type of element 18
 *
 * @see Tuple
 * @see OptionalTuple
 * @see MutableTuple
 */
public interface Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>
    extends Tuple {

  /**
   * Returns the 0th element from this tuple.
   *
   * @return the 0th element from this tuple.
   */
  T0 get0();

  /**
   * Returns the 1st element from this tuple.
   *
   * @return the 1st element from this tuple.
   */
  T1 get1();

  /**
   * Returns the 2nd element from this tuple.
   *
   * @return the 2nd element from this tuple.
   */
  T2 get2();

  /**
   * Returns the 3rd element from this tuple.
   *
   * @return the 3rd element from this tuple.
   */
  T3 get3();

  /**
   * Returns the 4th element from this tuple.
   *
   * @return the 4th element from this tuple.
   */
  T4 get4();

  /**
   * Returns the 5th element from this tuple.
   *
   * @return the 5th element from this tuple.
   */
  T5 get5();

  /**
   * Returns the 6th element from this tuple.
   *
   * @return the 6th element from this tuple.
   */
  T6 get6();

  /**
   * Returns the 7th element from this tuple.
   *
   * @return the 7th element from this tuple.
   */
  T7 get7();

  /**
   * Returns the 8th element from this tuple.
   *
   * @return the 8th element from this tuple.
   */
  T8 get8();

  /**
   * Returns the 9th element from this tuple.
   *
   * @return the 9th element from this tuple.
   */
  T9 get9();

  /**
   * Returns the 10th element from this tuple.
   *
   * @return the 10th element from this tuple.
   */
  T10 get10();

  /**
   * Returns the 11st element from this tuple.
   *
   * @return the 11st element from this tuple.
   */
  T11 get11();

  /**
   * Returns the 12nd element from this tuple.
   *
   * @return the 12nd element from this tuple.
   */
  T12 get12();

  /**
   * Returns the 13rd element from this tuple.
   *
   * @return the 13rd element from this tuple.
   */
  T13 get13();

  /**
   * Returns the 14th element from this tuple.
   *
   * @return the 14th element from this tuple.
   */
  T14 get14();

  /**
   * Returns the 15th element from this tuple.
   *
   * @return the 15th element from this tuple.
   */
  T15 get15();

  /**
   * Returns the 16th element from this tuple.
   *
   * @return the 16th element from this tuple.
   */
  T16 get16();

  /**
   * Returns the 17th element from this tuple.
   *
   * @return the 17th element from this tuple.
   */
  T17 get17();

  /**
   * Returns the 18th element from this tuple.
   *
   * @return the 18th element from this tuple.
   */
  T18 get18();

  @Override
  default int size() {
    return 19;
  }

  default Object get(int index) {
    switch (index) {
      case 0:
        return get0();
      case 1:
        return get1();
      case 2:
        return get2();
      case 3:
        return get3();
      case 4:
        return get4();
      case 5:
        return get5();
      case 6:
        return get6();
      case 7:
        return get7();
      case 8:
        return get8();
      case 9:
        return get9();
      case 10:
        return get10();
      case 11:
        return get11();
      case 12:
        return get12();
      case 13:
        return get13();
      case 14:
        return get14();
      case 15:
        return get15();
      case 16:
        return get16();
      case 17:
        return get17();
      case 18:
        return get18();
      default:
        throw new IndexOutOfBoundsException(
            String.format("Index %d is outside bounds of tuple of degree %s", index, size()));
    }
  }

  /**
   * Returns a {@link TupleGetter getter} for the 0th element in the {@code
   * Tuple}.
   *
   * @return the element at the 0th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter0<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T0> getter0() {
    return Novemdecuple::get0;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 1st element in the {@code
   * Tuple}.
   *
   * @return the element at the 1st position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter1<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T1> getter1() {
    return Novemdecuple::get1;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
   * Tuple}.
   *
   * @return the element at the 2nd position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter2<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T2> getter2() {
    return Novemdecuple::get2;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
   * Tuple}.
   *
   * @return the element at the 3rd position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter3<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T3> getter3() {
    return Novemdecuple::get3;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 4th element in the {@code
   * Tuple}.
   *
   * @return the element at the 4th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter4<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T4> getter4() {
    return Novemdecuple::get4;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 5th element in the {@code
   * Tuple}.
   *
   * @return the element at the 5th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter5<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T5> getter5() {
    return Novemdecuple::get5;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 6th element in the {@code
   * Tuple}.
   *
   * @return the element at the 6th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter6<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T6> getter6() {
    return Novemdecuple::get6;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 7th element in the {@code
   * Tuple}.
   *
   * @return the element at the 7th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter7<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T7> getter7() {
    return Novemdecuple::get7;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 8th element in the {@code
   * Tuple}.
   *
   * @return the element at the 8th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter8<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T8> getter8() {
    return Novemdecuple::get8;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 9th element in the {@code
   * Tuple}.
   *
   * @return the element at the 9th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter9<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T9> getter9() {
    return Novemdecuple::get9;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 10th element in the {@code
   * Tuple}.
   *
   * @return the element at the 10th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter10<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T10> getter10() {
    return Novemdecuple::get10;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 11st element in the {@code
   * Tuple}.
   *
   * @return the element at the 11st position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter11<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T11> getter11() {
    return Novemdecuple::get11;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 12nd element in the {@code
   * Tuple}.
   *
   * @return the element at the 12nd position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter12<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T12> getter12() {
    return Novemdecuple::get12;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 13rd element in the {@code
   * Tuple}.
   *
   * @return the element at the 13rd position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter13<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T13> getter13() {
    return Novemdecuple::get13;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 14th element in the {@code
   * Tuple}.
   *
   * @return the element at the 14th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter14<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T14> getter14() {
    return Novemdecuple::get14;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 15th element in the {@code
   * Tuple}.
   *
   * @return the element at the 15th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter15<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T15> getter15() {
    return Novemdecuple::get15;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 16th element in the {@code
   * Tuple}.
   *
   * @return the element at the 16th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter16<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T16> getter16() {
    return Novemdecuple::get16;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 17th element in the {@code
   * Tuple}.
   *
   * @return the element at the 17th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter17<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T17> getter17() {
    return Novemdecuple::get17;
  }

  /**
   * Returns a {@link TupleGetter getter} for the 18th element in the {@code
   * Tuple}.
   *
   * @return the element at the 18th position
   * @param <T0>  the 0th element type
   * @param <T1>  the 1st element type
   * @param <T2>  the 2nd element type
   * @param <T3>  the 3rd element type
   * @param <T4>  the 4th element type
   * @param <T5>  the 5th element type
   * @param <T6>  the 6th element type
   * @param <T7>  the 7th element type
   * @param <T8>  the 8th element type
   * @param <T9>  the 9th element type
   * @param <T10> the 10th element type
   * @param <T11> the 11st element type
   * @param <T12> the 12nd element type
   * @param <T13> the 13rd element type
   * @param <T14> the 14th element type
   * @param <T15> the 15th element type
   * @param <T16> the 16th element type
   * @param <T17> the 17th element type
   * @param <T18> the 18th element type
   */
  static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> TupleGetter18<Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, T18> getter18() {
    return Novemdecuple::get18;
  }
}