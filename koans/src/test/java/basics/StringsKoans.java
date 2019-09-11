package basics;

import com.sandwich.koan.Koan;

import java.text.MessageFormat;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;
import static com.sandwich.util.Assert.fail;

public class StringsKoans {

    @Koan
    void implicitStrings() {
        assertThat("just a plain ole string".getClass()).isEqualTo(__);
    }

    @Koan
    void newString() {
        // very rarely if ever should Strings be created via new String() in
        // practice - generally it is redundant, and done repetitively can be slow
        String string = new String();
        String empty = "";
        assertThat(string.equals(empty)).isEqualTo(__);
    }

    @Koan
    void newStringIsRedundant() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertThat(stringInstance.equals(stringReference)).isEqualTo(__);
    }

    @Koan
    void newStringIsNotIdentical() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertThat(stringInstance == stringReference).isEqualTo(__);
    }

    @Koan
    void stringIsEmpty() {
        assertThat("".isEmpty()).isEqualTo(__);
        assertThat("one".isEmpty()).isEqualTo(__);
        assertThat(new String().isEmpty()).isEqualTo(__);
        assertThat(new String("").isEmpty()).isEqualTo(__);
        assertThat(new String("one").isEmpty()).isEqualTo(__);
    }

    @Koan
    void stringLength() {
        assertThat("".length()).isEqualTo(__);
        assertThat("one".length()).isEqualTo(__);
        assertThat("the number is one".length()).isEqualTo(__);
    }

    @Koan
    void stringTrim() {
        assertThat("".trim()).isEqualTo(__);
        assertThat("one".trim(), "one");
        assertThat(" one more time".trim()).isEqualTo(__);
        assertThat(" one more time         ".trim()).isEqualTo(__);
        assertThat(" and again\t".trim()).isEqualTo(__);
        assertThat("\t\t\twhat about now?\t".trim()).isEqualTo(__);
    }

    @Koan
    void stringConcatenation() {
        String one = "one";
        String space = " ";
        String two = "two";
        assertThat(one + space + two).isEqualTo(__);
        assertThat(space + one + two).isEqualTo(__);
        assertThat(two + space + one).isEqualTo(__);
    }

    @Koan
    void stringUpperCase() {
        String str = "I am a number one!";
        assertThat(str.toUpperCase()).isEqualTo(__);
    }

    @Koan
    void stringLowerCase() {
        String str = "I AM a number ONE!";
        assertThat(str.toLowerCase()).isEqualTo(__);
    }

    @Koan
    void stringCompare() {
        String str = "I AM a number ONE!";
        assertThat(str.compareTo("I AM a number ONE!") == 0).isEqualTo(__);
        assertThat(str.compareTo("I am a number one!") == 0).isEqualTo(__);
        assertThat(str.compareTo("I AM A NUMBER ONE!") == 0).isEqualTo(__);
    }

    @Koan
    void stringCompareIgnoreCase() {
        String str = "I AM a number ONE!";
        assertThat(str.compareToIgnoreCase("I AM a number ONE!") == 0).isEqualTo(__);
        assertThat(str.compareToIgnoreCase("I am a number one!") == 0).isEqualTo(__);
        assertThat(str.compareToIgnoreCase("I AM A NUMBER ONE!") == 0).isEqualTo(__);
    }

    @Koan
    void stringStartsWith() {
        assertThat("".startsWith("one")).isEqualTo(__);
        assertThat("one".startsWith("one")).isEqualTo(__);
        assertThat("one is the number".startsWith("one")).isEqualTo(__);
        assertThat("ONE is the number".startsWith("one")).isEqualTo(__);
    }

    @Koan
    void stringEndsWith() {
        assertThat("".endsWith("one")).isEqualTo(__);
        assertThat("one".endsWith("one")).isEqualTo(__);
        assertThat("the number is one".endsWith("one")).isEqualTo(__);
        assertThat("the number is two".endsWith("one")).isEqualTo(__);
        assertThat("the number is One".endsWith("one")).isEqualTo(__);
    }

    @Koan
    void stringSubstring() {
        String str = "I AM a number ONE!";
        assertThat(str.substring(0)).isEqualTo(__);
        assertThat(str.substring(1)).isEqualTo(__);
        assertThat(str.substring(5)).isEqualTo(__);
        assertThat(str.substring(14, 17)).isEqualTo(__);
        assertThat(str.substring(7, str.length())).isEqualTo(__);
    }

    @Koan
    void stringContains() {
        String str = "I AM a number ONE!";
        assertThat(str.contains("one")).isEqualTo(__);
        assertThat(str.contains("ONE")).isEqualTo(__);
    }

    @Koan
    void stringReplace() {
        String str = "I am a number ONE!";
        assertThat(str.replace("ONE", "TWO")).isEqualTo(__);
        assertThat(str.replace("I am", "She is"), __);
    }

    @Koan
    void stringBuilderCanActAsAMutableString() {
        assertThat(new StringBuilder("one").append(" ").append("two").toString()).isEqualTo(__);
    }

    @Koan
    void readableStringFormattingWithStringFormat() {
        assertThat(String.format("%s %s %s", "a", "b", "a")).isEqualTo(__);
    }

    @Koan
    void extraArgumentsToStringFormatGetIgnored() {
        assertThat(String.format("%s %s %s", "a", "b", "c", "d")).isEqualTo(__);
    }

    @Koan
    void insufficientArgumentsToStringFormatCausesAnError() {
        try {
            String.format("%s %s %s", "a", "b");
            fail("No Exception was thrown!");
        } catch (Exception e) {
            assertThat(e.getClass()).isEqualTo(__);
            assertThat(e.getMessage()).isEqualTo(__);
        }
    }

    @Koan
    void readableStringFormattingWithMessageFormat() {
        assertThat(MessageFormat.format("{0} {1} {0}", "a", "b")).isEqualTo(__);
    }

    @Koan
    void extraArgumentsToMessageFormatGetIgnored() {
        assertThat(MessageFormat.format("{0} {1} {0}", "a", "b", "c")).isEqualTo(__);
    }

    @Koan
    void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
        assertThat(MessageFormat.format("{0} {1} {0}", "a")).isEqualTo(__);
    }
}
