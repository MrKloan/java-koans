package basics;

import io.fries.koans.Koan;

import java.text.MessageFormat;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SuppressWarnings("all")
class StringsKoans {

    @Koan
    void strings_are_implicit_objects() {
        assertThat("just a plain ole string".getClass()).isEqualTo(__);
    }

    @Koan
    void new_string_object() {
        String string = new String();
        String empty = "";

        assertThat(string.equals(empty)).isEqualTo(__);
    }

    @Koan
    void new_string_is_redundant_and_can_be_omitted() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);

        assertThat(stringInstance.equals(stringReference)).isEqualTo(__);
    }

    @Koan
    void but_new_string_is_not_identical() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);

        assertThat(stringInstance == stringReference).isEqualTo(__);
    }

    @Koan
    void string_is_empty() {
        assertThat("".isEmpty()).isEqualTo(__);
        assertThat("one".isEmpty()).isEqualTo(__);
        assertThat(new String().isEmpty()).isEqualTo(__);
        assertThat(new String("").isEmpty()).isEqualTo(__);
        assertThat(new String("one").isEmpty()).isEqualTo(__);
    }

    @Koan
    void string_length() {
        assertThat("".length()).isEqualTo(__);
        assertThat("one".length()).isEqualTo(__);
        assertThat("the number is one".length()).isEqualTo(__);
    }

    @Koan
    void string_trim() {
        assertThat("".trim()).isEqualTo(__);
        assertThat("one".trim()).isEqualTo("one");
        assertThat(" one more time".trim()).isEqualTo(__);
        assertThat(" one more time         ".trim()).isEqualTo(__);
        assertThat(" and again\t".trim()).isEqualTo(__);
        assertThat("\t\t\twhat about now?\t".trim()).isEqualTo(__);
    }

    @Koan
    void string_concatenation() {
        String one = "one";
        String space = " ";
        String two = "two";

        assertThat(one + space + two).isEqualTo(__);
        assertThat(space + one + two).isEqualTo(__);
        assertThat(two + space + one).isEqualTo(__);
    }

    @Koan
    void string_upper_case() {
        String str = "I am a number one!";

        assertThat(str.toUpperCase()).isEqualTo(__);
    }

    @Koan
    void string_lower_case() {
        String str = "I AM a number ONE!";

        assertThat(str.toLowerCase()).isEqualTo(__);
    }

    @Koan
    void string_compare() {
        String str = "I AM a number ONE!";

        assertThat(str.compareTo("I AM a number ONE!") == 0).isEqualTo(__);
        assertThat(str.compareTo("I am a number one!") == 0).isEqualTo(__);
        assertThat(str.compareTo("I AM A NUMBER ONE!") == 0).isEqualTo(__);
    }

    @Koan
    void string_compare_ignore_case() {
        String str = "I AM a number ONE!";

        assertThat(str.compareToIgnoreCase("I AM a number ONE!") == 0).isEqualTo(__);
        assertThat(str.compareToIgnoreCase("I am a number one!") == 0).isEqualTo(__);
        assertThat(str.compareToIgnoreCase("I AM A NUMBER ONE!") == 0).isEqualTo(__);
    }

    @Koan
    void string_starts_with() {
        assertThat("".startsWith("one")).isEqualTo(__);
        assertThat("one".startsWith("one")).isEqualTo(__);
        assertThat("one is the number".startsWith("one")).isEqualTo(__);
        assertThat("ONE is the number".startsWith("one")).isEqualTo(__);
    }

    @Koan
    void string_ends_with() {
        assertThat("".endsWith("one")).isEqualTo(__);
        assertThat("one".endsWith("one")).isEqualTo(__);
        assertThat("the number is one".endsWith("one")).isEqualTo(__);
        assertThat("the number is two".endsWith("one")).isEqualTo(__);
        assertThat("the number is One".endsWith("one")).isEqualTo(__);
    }

    @Koan
    void string_substring() {
        String str = "I AM a number ONE!";

        assertThat(str.substring(0)).isEqualTo(__);
        assertThat(str.substring(1)).isEqualTo(__);
        assertThat(str.substring(5)).isEqualTo(__);
        assertThat(str.substring(14, 17)).isEqualTo(__);
        assertThat(str.substring(7, str.length())).isEqualTo(__);
    }

    @Koan
    void string_contains() {
        String str = "I AM a number ONE!";

        assertThat(str.contains("one")).isEqualTo(__);
        assertThat(str.contains("ONE")).isEqualTo(__);
    }

    @Koan
    void string_replace() {
        String str = "I am a number ONE!";

        assertThat(str.replace("ONE", "TWO")).isEqualTo(__);
        assertThat(str.replace("I am", "She is")).isEqualTo(__);
    }

    @Koan
    void string_builder_can_act_as_a_mutable_string() {
        final StringBuilder stringBuilder = new StringBuilder("one")
                .append(" ")
                .append("two");

        assertThat(stringBuilder.toString()).isEqualTo(__);
    }

    @Koan
    void string_buffer_is_a_thread_safe_alternative_to_string_builder() {
        final StringBuffer stringBuffer = new StringBuffer("one")
                .append(" ")
                .append("two");

        assertThat(stringBuffer.toString()).isEqualTo(__);
    }

    @Koan
    void readable_string_formatting_with_string_format() {
        assertThat(String.format("%s %s %s", "a", "b", "a")).isEqualTo(__);
    }

    @Koan
    void extra_arguments_to_string_format_get_ignored() {
        assertThat(String.format("%s %s %s", "a", "b", "c", "d")).isEqualTo(__);
    }

    @Koan
    void insufficient_arguments_to_string_format_causes_an_error() {
        try {
            String.format("%s %s %s", "a", "b");
            fail("This failure event is never reached!");
        } catch (Exception e) {
            assertThat(e.getClass()).isEqualTo(__);
            assertThat(e.getMessage()).isEqualTo(__);
        }
    }

    @Koan
    void readable_string_formatting_with_message_format() {
        assertThat(MessageFormat.format("{0} {1} {0}", "a", "b")).isEqualTo(__);
    }

    @Koan
    void extra_arguments_to_message_format_get_ignored() {
        assertThat(MessageFormat.format("{0} {1} {0}", "a", "b", "c")).isEqualTo(__);
    }

    @Koan
    void insufficient_arguments_to_message_format_does_not_replace_the_token() {
        assertThat(MessageFormat.format("{0} {1} {0}", "a")).isEqualTo(__);
    }
}
