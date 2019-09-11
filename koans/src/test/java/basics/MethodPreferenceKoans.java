package basics;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;

public class MethodPreferenceKoans {

    @Koan
    void methodPreferenceInt() {
        assertThat(new A().doStuff(1)).isEqualTo(__);
    }

    @Koan
    void methodPreferenceInteger() {
        assertThat(new A().doStuff(Integer.valueOf(1))).isEqualTo(__);
    }

    @Koan
    void methodPreferenceLong() {
        long l = 1;
        assertThat(new A().doStuff(l)).isEqualTo(__);
    }

    @Koan
    void methodPreferenceBoxedLong() {
        Long l = Long.valueOf(1);
        assertThat(new A().doStuff(l)).isEqualTo(__);
    }

    @Koan
    void methodPreferenceDouble() {
        Double l = Double.valueOf(1);
        assertThat(new A().doStuff(l)).isEqualTo(__);
    }

    @Koan
    void methodPreferenceMore() {
        // What happens if you change 'Integer' to 'Double'
        // Does this explain 'methodPreferenceDouble'?
        // Think about why this happens?
        assertThat(new A().doStuff(1, Integer.valueOf(2))).isEqualTo(__);
    }

    class A {
        public String doStuff(int i) {
            return "int";
        }

        public String doStuff(Integer i) {
            return "Integer";
        }

        public String doStuff(Object i) {
            return "Object";
        }

        public String doStuff(int... i) {
            return "int vararg";
        }
    }
}
