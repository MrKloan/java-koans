package basics;

import io.fries.koans.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;

class VarArgsKoans {

    @Koan
    void varArgsCanBeTreatedAsArrays() {
        assertThat(new ExampleClass().canBeTreatedAsArray(1, 2, 3)).isEqualTo(__);
    }

    @Koan
    void youCanPassInAsManyArgumentsAsYouLike() {
        assertThat(new ExampleClass().getLength(1, 2, 3)).isEqualTo(__);
        assertThat(new ExampleClass().getLength(1, 2, 3, 4, 5, 6, 7, 8)).isEqualTo(__);
    }

    @Koan
    void youCanPassInZeroArgumentsIfYouLike() {
        assertThat(new ExampleClass().getLength()).isEqualTo(__);
    }

    @Koan
    void youCanHaveOtherTypesInTheMethodSignature() {
        assertThat(new ExampleClass().verboseLength("This is how many items were passed in: ", 1, 2, 3, 4)).isEqualTo(__);
    }

    static class ExampleClass {
        public boolean canBeTreatedAsArray(Integer... arguments) {
            return arguments instanceof Integer[];
        }

        public int getLength(Integer... arguments) {
            return arguments.length;
        }

        public String verboseLength(String prefix, Object... arguments) {
            return prefix + arguments.length;
        }

        // *******
        // The following methods won't compile because Java only permits varargs as last argument
        // *******
        // public String invalidMethodDeclaration(String... arguments, String... otherArguments) { return ""; }
        // public String otherInvalidMethodDeclaration(String... arguments, String otherArgument) { return ""; }
    }
}
