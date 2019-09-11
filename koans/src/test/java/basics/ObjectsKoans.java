package basics;

import com.sandwich.koan.Koan;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;

public class ObjectsKoans {

    @Koan
    void newObjectInstancesCanBeCreatedDirectly() {
        assertThat(new Object() instanceof Object).isEqualTo(__);
    }

    @Koan
    void allClassesInheritFromObject() {
        class Foo {
        }

        Class<?>[] ancestors = getAncestors(new Foo());
        assertThat(ancestors[0]).isEqualTo(__);
        assertThat(ancestors[1]).isEqualTo(__);
    }

    @Koan
    void objectToString() {
        Object object = new Object();
        // TODO: Why is it best practice to ALWAYS override toString?
        String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
        assertThat(expectedToString).isEqualTo(__); // hint: object.toString()
    }

    @Koan
    void toStringConcatenates() {
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
    void toStringIsTestedForNullWhenInvokedImplicitly() {
        String string = "string";
        assertThat(string + null).isEqualTo(__);
    }

    private Class<?>[] getAncestors(Object object) {
        List<Class<?>> ancestors = new ArrayList<Class<?>>();
        Class<?> clazz = object.getClass();
        while (clazz != null) {
            ancestors.add(clazz);
            clazz = clazz.getSuperclass();
        }
        return ancestors.toArray(new Class[]{});
    }

}
