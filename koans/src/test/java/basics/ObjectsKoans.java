package basics;

import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;
import static java.lang.Integer.toHexString;
import static java.text.MessageFormat.format;

class ObjectsKoans {

    @Koan
    void new_object_instances_can_be_created_directly() {
        assertThat(new Object() instanceof Object).isEqualTo(__);
    }

    @Koan
    void all_classes_inherit_from_object() {
        class Foo {
        }

        assertThat(new Foo() instanceof Foo).isEqualTo(__);
        assertThat(new Foo() instanceof Object).isEqualTo(__);
    }

    @Koan
    void object_to_string() {
        Object object = new Object();
        String strangeString = format("{0}@{1}", Object.class.getName(), toHexString(object.hashCode()));

        assertThat(strangeString).isEqualTo(__);
    }

    @Koan
    void to_string_is_implicitly_called_for_string_concatenation() {
        final String string = "ha";

        Object object = new Object() {
            @Override
            public String toString() {
                return string;
            }
        };

        assertThat(string + object).isEqualTo(__);
    }

    @Koan
    void to_string_can_be_used_with_null_references_when_invoked_implicitly() {
        String string = "string";

        assertThat(string + null).isEqualTo(__);
    }
}
