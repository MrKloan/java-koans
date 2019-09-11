package basics;

import io.fries.koans.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;

public class KoansConditionals {

    @Koan
    void basicIf() {
        int x = 1;
        if (true) {
            x++;
        }
        assertThat(x).isEqualTo(__);
    }

    @Koan
    void basicIfElse() {
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
    void basicIfElseIfElse() {
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
    void nestedIfsWithoutCurlysAreReallyMisleading() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        // Curly braces after an "if" or "else" are not required...
        if (secretBoolean)
            x++;
        if (otherBooleanCondition)
            x = 10;
        else
            x--;
        // ...but they are recommended.
        assertThat(x).isEqualTo(__);
    }

    @Koan
    void ifAsIntended() {
        int x = 1;
        boolean secretBoolean = false;
        boolean otherBooleanCondition = true;
        // Adding curly braces avoids the "dangling else" problem seen
        // above.
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
    void basicSwitchStatement() {
        int i = 1;
        String result = "Basic ";
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
    void switchStatementFallThrough() {
        int i = 1;
        String result = "Basic ";
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
    void switchStatementCrazyFallThrough() {
        int i = 5;
        String result = "Basic ";
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
    void switchStatementConstants() {
        int i = 5;
        // What happens if you remove the 'final' modifier?
        // What does this mean for case values?
        final int caseOne = 1;
        String result = "Basic ";
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
    void switchStatementSwitchValues() {
        // Try different (primitive) types for 'c'
        // Which types do compile?
        // Does boxing work?
        char c = 'a';
        String result = "Basic ";
        switch (c) {
            case 'a':
                result += "One";
                break;
            default:
                result += "Nothing";
        }
        assertThat(result).isEqualTo(__);
    }

    @Koan
    void shortCircuit() {
        Counter trueCount = new Counter(true);
        Counter falseCount = new Counter(false);
        String x = "Hai";
        if (trueCount.count() || falseCount.count()) {
            x = "kthxbai";
        }
        assertThat(x).isEqualTo(__);
        assertThat(trueCount.count).isEqualTo(__);
        assertThat(falseCount.count).isEqualTo(__);
    }

    @Koan
    void bitwise() {
        Counter trueCount = new Counter(true);
        Counter falseCount = new Counter(false);
        String x = "Hai";
        if (trueCount.count() | falseCount.count()) {
            x = "kthxbai";
        }
        assertThat(x).isEqualTo(__);
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
}
