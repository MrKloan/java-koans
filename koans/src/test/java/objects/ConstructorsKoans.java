package objects;


import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;

@SuppressWarnings("all")
class ConstructorsKoans {

    class A {

        String someString = "a";

        A() {
            someString += "x";
        }
    }

    class B extends A {

        B() {
            someString += "g";
        }
    }

    @Koan
    void implicit_constructor_call() {
        assertThat(new B().someString).isEqualTo(__);
    }

    class OtherA {

        String someString = "a";

        OtherA() {
            someString += "x";
        }

        OtherA(String s) {
            someString += s;
        }
    }

    class OtherB extends OtherA {

        OtherB() {
            super("Boo");
            someString += "g";
        }
    }

    @Koan
    void explicit_constructor_call() {
        assertThat(new OtherB().someString).isEqualTo(__);
    }
}
