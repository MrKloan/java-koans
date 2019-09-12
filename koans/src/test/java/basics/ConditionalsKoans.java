package basics;

import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;

@SuppressWarnings("all")
class ConditionalsKoans {

    @Koan
    void basic_if() {
        int x = 1;

        if (true) {
            x++;
        }

        assertThat(x).isEqualTo(__);
    }

    @Koan
    void basic_if_else() {
        int x = 1;
        boolean secretBoolean = false;

        if (secretBoolean) {
            x++;
        } else {
            x--;
        }

        assertThat(x).isEqualTo(__);
    }

    @Koan
    void basic_if_else_if_else() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;

        if (secretBoolean) {
            x++;
        } else if (otherBooleanCondition) {
            x = 10;
        } else {
            x--;
        }

        assertThat(x).isEqualTo(__);
    }

    @Koan
    void curly_braces_are_not_required_when_the_block_contains_a_single_instruction_but_can_be_misleading() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;

        if (secretBoolean)
            x++;
        if (otherBooleanCondition)
            x = 10;
        else
            x--;

        assertThat(x).isEqualTo(__);
    }

    @Koan
    void nested_conditions() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;

        if (secretBoolean) {
            x++;
            if (otherBooleanCondition) {
                x = 10;
            }
        } else {
            x--;
        }

        assertThat(x).isEqualTo(__);
    }

    @Koan
    void basic_switch_statement() {
        int i = 1;
        String result = "";
        
        switch (i) {
            case 1:
                result += "One";
                break;
            case 2:
                result += "Two";
                break;
            default:
                result += "Nothing";
        }

        assertThat(result).isEqualTo(__);
    }

    @Koan
    void switch_statement_fall_through() {
        int i = 1;
        String result = "";

        switch (i) {
            case 1:
                result += "One";
            case 2:
                result += "Two";
            default:
                result += "Nothing";
        }

        assertThat(result).isEqualTo(__);
    }

    @Koan
    void switch_statement_with_an_unusual_case_ordering() {
        int i = 5;
        String result = "";

        switch (i) {
            case 1:
                result += "One";
            default:
                result += "Nothing";
            case 2:
                result += "Two";
        }

        assertThat(result).isEqualTo(__);
    }

    @Koan
    void switch_statement_constants() {
        int i = 5;
        final int caseOne = 1;
        String result = "";

        switch (i) {
            case caseOne:
                result += "One";
                break;
            default:
                result += "Nothing";
        }

        assertThat(result).isEqualTo(__);
    }

    @Koan
    void switch_statement_can_handle_multiple_types() {
        int c = 97;
        String result = "";

        switch (c) {
            case 'a':
                result += "The letter 'a'";
                break;
            default:
                result += "Nothing";
        }

        assertThat(result).isEqualTo(__);
    }

    @Koan
    void conditional_or() {
        Counter trueCount = new Counter(true);
        Counter falseCount = new Counter(false);

        String result = "No";
        if (trueCount.count() || falseCount.count()) {
            result = "Yes";
        }

        assertThat(result).isEqualTo(__);
        assertThat(trueCount.count).isEqualTo(__);
        assertThat(falseCount.count).isEqualTo(__);
    }

    @Koan
    void bitwise_or() {
        Counter trueCount = new Counter(true);
        Counter falseCount = new Counter(false);

        String result = "No";
        if (trueCount.count() | falseCount.count()) {
            result = "Yes";
        }

        assertThat(result).isEqualTo(__);
        assertThat(trueCount.count).isEqualTo(__);
        assertThat(falseCount.count).isEqualTo(__);
    }

    class Counter {

        boolean returnValue;
        int count = 0;

        Counter(boolean returnValue) {
            this.returnValue = returnValue;
        }

        boolean count() {
            count++;
            return returnValue;
        }
    }

    // TODO: add more conditionals
}
