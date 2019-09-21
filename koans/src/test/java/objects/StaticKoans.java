package objects;

import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;
import static objects.StaticKoans.StaticInner.y;

@SuppressWarnings("all")
class StaticKoans {

    static int x = 3;

    @Koan
    void a_static_variable_is_tied_to_a_class_and_not_its_instances() {
        assertThat(StaticKoans.x).isEqualTo(__);

        StaticKoans.x = 5;
        assertThat(new StaticKoans().x).isEqualTo(__);

        new StaticKoans().x = 7;
        assertThat(StaticKoans.x).isEqualTo(__);
    }

    static class StaticInner {
        static int y = 1;
    }

    @Koan
    void an_inner_class_can_be_declared_static() {
        assertThat(StaticKoans.StaticInner.y).isEqualTo(__);
    }

    @Koan
    void a_static_import_can_be_used_to_shorten_the_access_to_the_static_member_of_another_class() {
        // Check the 'import static' part of this file!
        assertThat(y).isEqualTo(__);
    }

    @Koan
    void a_static_member_can_be_referenced_directly_by_its_parent() {
        assertThat(x).isEqualTo(__);
    }

    @Koan
    void a_method_cannot_declare_static_variables() {
        /* static */
        int z = 1; // Try to uncomment the 'static' keyword. Does it compile? Why?
        assertThat(z).isEqualTo(__);
    }
}
