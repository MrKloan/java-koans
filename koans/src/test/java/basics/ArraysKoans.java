package basics;

import io.fries.koans.Koan;

import java.util.Arrays;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;

@SuppressWarnings("all")
class ArraysKoans {

    @Koan
    void arrays_do_not_consider_elements_when_evaluating_equality() {
        assertThat(new int[]{1}.equals(new int[]{1})).isEqualTo(__);
    }

    @Koan
    void thus_a_clone_of_an_array_is_not_equal_to_its_original() {
        int[] original = new int[]{1};

        assertThat(original.equals(original.clone())).isEqualTo(__);
    }

    @Koan
    void arrays_hash_code_does_not_consider_elements() {
        int[] firstArray = new int[]{0};
        int[] secondArray = new int[]{0};

        assertThat(Integer.valueOf(firstArray.hashCode()).equals(secondArray.hashCode())).isEqualTo(__);
    }

    @Koan
    void arrays_helper_class_equals_method_considers_elements_when_determining_equality() {
        int[] firstArray = new int[]{0};
        int[] secondArray = new int[]{0};

        assertThat(Arrays.equals(firstArray, secondArray)).isEqualTo(__);
    }

    @Koan
    void arrays_helper_class_hash_code_method_considers_elements_when_determining_hashcode() {
        int[] firstArray = new int[]{0};
        int[] secondArray = new int[]{0};

        assertThat(Integer.valueOf(Arrays.hashCode(firstArray)).equals(Arrays.hashCode(secondArray))).isEqualTo(__);
    }

    @Koan
    void arrays_are_indexed_at_0() {
        int[] integers = new int[]{1, 2};

        assertThat(integers[0]).isEqualTo(__);
        assertThat(integers[1]).isEqualTo(__);
    }

    @Koan
    void arrays_can_throw_an_out_of_bound_exception() {
        final int[] array = new int[]{1};

        assertThat(array[1]).isEqualTo(__);
    }

    @Koan
    void arrays_are_mutable() {
        final boolean[] oneBoolean = new boolean[]{false};
        oneBoolean[0] = true;

        assertThat(oneBoolean[0]).isEqualTo(__);
    }

    @Koan
    void array_length_can_be_checked() {
        assertThat(new int[1].length).isEqualTo(__);
    }

    @Koan
    void use_the_arrays_to_string_helper_method_to_print_the_content_of_an_array() {
        final int[] oddNumbers = {1, 3, 5, 7, 9};

        assertThat(Arrays.toString(oddNumbers)).isEqualTo(__);
    }
}
