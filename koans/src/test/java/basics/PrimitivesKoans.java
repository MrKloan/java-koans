package basics;

import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;
import static io.fries.koans.basics.Primitives.getType;

class PrimitivesKoans {

    @Koan
    void whole_numbers_are_of_type_int() {
        assertThat(getType(1)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_int_have_an_object_type_integer() {
        Object number = 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void integers_have_a_fairly_large_range() {
        assertThat(Integer.MIN_VALUE).isEqualTo(__);
        assertThat(Integer.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void integer_size_in_bits() {
        assertThat(Integer.SIZE).isEqualTo(__);
    }

    @Koan
    void whole_numbers_can_also_be_of_type_long() {
        assertThat(getType(1L)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_long_have_an_object_type_long() {
        Object number = 1L;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void longs_have_a_larger_range_than_ints() {
        assertThat(Long.MIN_VALUE).isEqualTo(__);
        assertThat(Long.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void long_size_in_bits() {
        assertThat(Long.SIZE).isEqualTo(__);
    }

    @Koan
    void whole_numbers_can_also_be_of_type_short() {
        assertThat(getType((short) 1)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_short_have_an_object_type_short() {
        Object number = (short) 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void shorts_have_a_smaller_range_than_ints() {
        assertThat(Short.MIN_VALUE).isEqualTo(__);
        assertThat(Short.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void short_size_in_bits() {
        assertThat(Short.SIZE).isEqualTo(__);
    }

    @Koan
    void whole_numbers_can_also_be_of_type_byte() {
        assertThat(getType((byte) 1)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_byte_have_an_object_type_byte() {
        Object number = (byte) 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void bytes_have_a_smaller_range_than_shorts() {
        assertThat(Byte.MIN_VALUE).isEqualTo(__);
        assertThat(Byte.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void byte_size_in_bits() {
        assertThat(Byte.SIZE).isEqualTo(__);
    }

    @Koan
    void whole_numbers_can_also_be_of_type_char() {
        assertThat(getType((char) 1)).isEqualTo(__);
    }

    @Koan
    void single_characters_are_of_type_char() {
        assertThat(getType('a')).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_char_have_an_object_type_character() {
        Object number = (char) 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void chars_can_only_be_positive() {
        assertThat((int) Character.MIN_VALUE).isEqualTo(__);
        assertThat((int) Character.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void char_size_in_bits() {
        assertThat(Character.SIZE).isEqualTo(__);
    }

    @Koan
    void decimal_numbers_are_of_type_double() {
        assertThat(getType(1.0)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_double_can_be_declared_without_the_decimal_point() {
        assertThat(getType(1d)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_double_can_be_declared_with_exponents() {
        assertThat(getType(1e3)).isEqualTo(__);
        assertThat(1.0e3).isEqualTo(__);
        assertThat(1E3).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_double_have_an_object_type_double() {
        Object number = 1.0;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void doubles_have_a_large_range() {
        assertThat(Double.MIN_VALUE).isEqualTo(__);
        assertThat(Double.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void double_size_in_bits() {
        assertThat(Double.SIZE).isEqualTo(__);
    }

    @Koan
    void decimal_numbers_can_also_be_of_type_float() {
        assertThat(getType(1f)).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_float_can_be_declared_with_exponents() {
        assertThat(getType(1e3f)).isEqualTo(__);
        assertThat(1.0e3f).isEqualTo(__);
        assertThat(1E3f).isEqualTo(__);
    }

    @Koan
    void primitives_of_type_float_have_an_object_type_float() {
        Object number = 1f;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void floats_have_a_smaller_range_than_doubles() {
        assertThat(Float.MIN_VALUE).isEqualTo(__);
        assertThat(Float.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void float_size() {
        assertThat(Float.SIZE).isEqualTo(__);
    }
}
