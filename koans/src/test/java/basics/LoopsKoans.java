package basics;


import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;


public class LoopsKoans {

    @Koan
    void basicForLoop1() {
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += i + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void basicForLoop2() {
        String s = "";
        for (int i = -5; i < 1; i++) {
            s += i + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void basicForLoop3() {
        String s = "";
        for (int i = 5; i > 0; i--) {
            s += i + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void basicForLoop4() {
        String s = "";
        for (int i = 0; i < 11; i += 2) {
            s += i + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void basicForLoop5() {
        String s = "";
        for (int i = 1; i <= 16; i *= 2) {
            s += i + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void basicForLoopWithTwoVariables1() {
        String s = "";
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
            s += i + " " + j + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void nestedLoops() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += "(" + i + ", " + j + ") ";
            }
            s += " - ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void extendedForLoop() {
        int[] is = {1, 2, 3, 4};
        String s = "";
        for (int j : is) {
            s += j + " ";
        }
        assertThat(s).isEqualTo(__);
    }

    @Koan
    void whileLoop() {
        int result = 0;
        while (result < 3) {
            result++;
        }
        assertThat(result).isEqualTo(__);
    }

    @Koan
    void doLoop() {
        int result = 0;
        do {
            result++;
        } while (false);
        assertThat(result).isEqualTo(__);
    }

    @Koan
    void extendedForLoopBreak() {
        String[] sa = {"Dog", "Cat", "Tiger"};
        int count = 0;
        for (String current : sa) {
            if ("Cat".equals(current)) {
                break;
            }
            count++;
        }
        assertThat(count).isEqualTo(__);
    }

    @Koan
    void extendedForLoopContinue() {
        String[] sa = {"Dog", "Cat", "Tiger"};
        int count = 0;
        for (String current : sa) {
            if ("Dog".equals(current)) {
                continue;
            } else {
                count++;
            }
        }
        assertThat(count).isEqualTo(__);
    }

    @Koan
    void forLoopContinueLabel() {
        int count = 0;
        outerLabel:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                count++;
                if (count > 2) {
                    continue outerLabel;
                }
            }
            count += 10;
        }
        // What does continue with a label mean?
        // What gets executed? Where does the program flow continue?
        assertThat(count).isEqualTo(__);
    }

    @Koan
    void forLoopBreakLabel() {
        int count = 0;
        outerLabel:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                if (count > 2) {
                    break outerLabel;
                }
            }
            count += 10;
        }
        // What does break with a label mean?
        // What gets executed? Where does the program flow continue?
        assertThat(count).isEqualTo(__);
    }
}
