package objects;

import io.fries.koans.Koan;

import java.util.concurrent.atomic.AtomicInteger;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;

@SuppressWarnings("all")
class GenericsKoans {

    @Koan
    void sometimes_you_may_create_duplicate_behaviors() {
        class IntegerList {

            private final Integer[] values;

            IntegerList(final Integer... values) {
                this.values = values;
            }

            Integer get(final int index) {
                return values[index];
            }
        }

        class DoubleList {

            private final Double[] values;

            DoubleList(final Double... values) {
                this.values = values;
            }

            Double get(final int index) {
                return values[index];
            }
        }

        IntegerList integers = new IntegerList(3, 5, 7);
        int firstInt = integers.get(0);
        assertThat(firstInt).isEqualTo(__);

        DoubleList doubles = new DoubleList(3.3, 5.5, 7.7);
        double thirdDouble = doubles.get(3);
        assertThat(thirdDouble).isEqualTo(__);
    }

    @Koan
    void and_you_may_think_that_polymorphism_can_help_you_solve_your_duplication_problem() {
        // `Integer` and `Double` both extend the `Number` class...
        class NumberList {

            private final Number[] values;

            NumberList(final Number... values) {
                this.values = values;
            }

            Number get(final int index) {
                return values[index];
            }
        }

        NumberList integers = new NumberList(3, 5, 7);
        int firstInt = (int) integers.get(0); // Try to remove the cast to int. Does it compile? Why?
        assertThat(firstInt).isEqualTo(__);

        NumberList doubles = new NumberList(3.3, 5.5, 7.7);
        double thirdDouble = (double) doubles.get(3); // Try to remove the cast to double. Does it compile? Why?
        assertThat(thirdDouble).isEqualTo(__);
    }

    @Koan
    void but_polymorphism_cannot_be_used_to_constrain_return_type() {
        class NumberList {

            private final Number[] values;

            NumberList(final Number... values) {
                this.values = values;
            }

            Number get(final int index) {
                return values[index];
            }
        }

        NumberList integers = new NumberList(1, 2, 3, 4, 5, 6., 7, 8, 9);
        assertThat(integers.get(5) instanceof Integer).isEqualTo(__);
    }

    @Koan
    void generic_types_can_be_used_to_completely_generify_a_behavior() {
        class GenericList<T> {

            private final T[] values;

            GenericList(final T... values) {
                this.values = values;
            }

            T get(final int index) {
                return values[index];
            }
        }

        GenericList<Integer> integers = new GenericList<Integer>(3, 5, 7);
        int firstInteger = integers.get(0); // You do not need to force cast the return type of the `get` method anymore!
        assertThat(firstInteger).isEqualTo(__);

        // When the generic type can be inferred by the compiler,
        GenericList<Double> doubles = new GenericList<>(3.3, 5.5, 7.7);
        double secondDouble = doubles.get(1); // ^-- This ("<>") is called the "Diamond Operator": it infers the generic type when possible.
        assertThat(secondDouble).isEqualTo(__);

        // You are not constraint to only use classes extending `Number` in this example.
        GenericList<String> strings = new GenericList<>("First", "Second", "Third");
        String thirdString = strings.get(2);
        assertThat(thirdString).isEqualTo(__);

        // When the Diamond Operator cannot infer the type, it uses `Object` as a default type.
        GenericList<Object> objects = new GenericList<>();

        // Without the generic type parameter, all generic types are considered as `Object`.
        GenericList integersOrObjects = new GenericList<>(3, 5, 7);
        Object isThisAnInt = integersOrObjects.get(1); // Try to change this variable type to `Integer`. Does it compile? Why?
        assertThat(isThisAnInt instanceof Integer).isEqualTo(__);

        // GenericList<int> otherIntegers = new GenericList<>(3, 5, 7); // Try to uncomment this line. Does it compile? Why?
    }

    @Koan
    void a_generic_type_can_be_constrained_by_its_parent_using_an_upper_bound() {
        // Our Bounded Generic `T` must extend `Number`. This is called an "Upper Bound".
        class NumberList<T extends Number> {

            private final T[] values;

            NumberList(final T... values) {
                this.values = values;
            }

            T get(final int index) {
                return values[index];
            }
        }

        // `Integer` extends `Number`.
        NumberList<Integer> integers = new NumberList<>(3, 5, 7);
        int thirdInteger = integers.get(2);
        assertThat(thirdInteger).isEqualTo(__);

        // `AtomicInteger` extends `Number`.
        NumberList<AtomicInteger> atomicIntegers = new NumberList<>(new AtomicInteger(1));
        AtomicInteger firstAtomicInteger = atomicIntegers.get(0);
        assertThat(firstAtomicInteger.get()).isEqualTo(__);

        // NumberList<String> strings = new NumberList<>("First", "Second", "Third"); // Try to uncomment this line. Does it compile? Why?
    }

    @Koan
    void a_generic_type_can_have_multiple_bounds() {
        class NumberList<T extends Number & Comparable> {

            private final T[] values;

            NumberList(final T... values) {
                this.values = values;
            }

            T get(final int index) {
                return values[index];
            }
        }

        // `Integer` extends `Number` and implements `Comparable`.
        NumberList<Integer> integers = new NumberList<>(3, 5, 7);
        int secondInteger = integers.get(1);
        assertThat(secondInteger).isEqualTo(__);

        // NumberList<AtomicInteger> atomicIntegers = new NumberList<>(new AtomicInteger(1)); // Try to uncomment this line. Does it compile? Why?
    }

    private <T extends Number> T getGenericValue(final T value) {
        return value;
    }

    @Koan
    void a_method_can_take_a_generic_type_as_parameter() {
        assertThat(getGenericValue(1) instanceof Integer).isEqualTo(__);
        assertThat(getGenericValue(1.) instanceof Double).isEqualTo(__);
        // assertThat(getGenericValue("Generic parameter") instanceof String).isEqualTo(__); // Try to uncomment this line. Does it compile? Why?
    }

    @Koan
    void the_wildcard_parameter_can_be_used_to_further_constrain_a_generic_type_while_ignoring_the_concrete_type() {
        class NumberList<T extends Number> {

            private final T[] values;

            NumberList(final T... values) {
                this.values = values;
            }

            T get(final int index) {
                return values[index];
            }
        }

        NumberList<? extends Comparable> comparableNumbers = new NumberList<>(3, 5.f, 7.);
        Number comparableNumber = comparableNumbers.get(0);

        assertThat(comparableNumber instanceof Number).isEqualTo(__);
        assertThat(comparableNumber instanceof Comparable).isEqualTo(__);
        assertThat(comparableNumber instanceof Integer).isEqualTo(__);
    }

    @Koan
    void a_class_or_method_can_use_as_much_generic_types_as_needed() {
        class Pair<T, U> {

            final T left;
            final U right;

            Pair(final T left, final U right) {
                this.left = left;
                this.right = right;
            }
        }

        Pair<Integer, String> pair = new Pair<>(1, "Two");

        assertThat(pair.left).isEqualTo(__);
        assertThat(pair.right).isEqualTo(__);
    }
}
