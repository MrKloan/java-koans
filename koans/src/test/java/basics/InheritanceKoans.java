package basics;

import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;

@SuppressWarnings("all")
class InheritanceKoans {

    abstract class Animal {
        abstract public String makeSomeNoise();
    }

    class Cow extends Animal {

        @Override
        public String makeSomeNoise() {
            return "Moo!";
        }
    }

    class Dog extends Animal {

        @Override
        public String makeSomeNoise() {
            return "Woof!";
        }

        public boolean canFetch() {
            return true;
        }
    }

    class Puppy extends Dog {

        @Override
        public String makeSomeNoise() {
            return "Squeak!";
        }

        public boolean canFetch() {
            return false;
        }
    }

    abstract class Farm {
        abstract public Animal findAnimal();
    }

    class CowFarm extends Farm {

        public Animal findAnimal() {
            return new Cow();
        }
    }

    @Koan
    void method_overloading() {
        Cow bob = new Cow();
        Dog max = new Dog();
        Puppy barney = new Puppy();

        assertThat(bob.makeSomeNoise()).isEqualTo(__);
        assertThat(max.makeSomeNoise()).isEqualTo(__);
        assertThat(barney.makeSomeNoise()).isEqualTo(__);

        assertThat(max.canFetch()).isEqualTo(__);
        assertThat(barney.canFetch()).isEqualTo(__);
        // assertThat(bob.canFetch()).isEqualTo(__);    // Is it possible? Why?
    }

    @Koan
    void method_overloading_using_polymorphism() {
        Animal bob = new Cow();
        Animal max = new Dog();
        Animal barney = new Puppy();

        assertThat(bob.makeSomeNoise()).isEqualTo(__);
        assertThat(max.makeSomeNoise()).isEqualTo(__);
        assertThat(barney.makeSomeNoise()).isEqualTo(__);

        // assertThat(max.canFetch()).isEqualTo(__);    // Is it possible? Why?
        // assertThat(barney.canFetch()).isEqualTo(__); // Is it possible? Why?
        // assertThat(bob.canFetch()).isEqualTo(__);    // Is it possible? Why?
    }

    @Koan
    void inheritance_hierarchy() {
        Animal someAnimal = new Cow();
        Animal bob = new Cow();

        assertThat(someAnimal.makeSomeNoise().equals(bob.makeSomeNoise())).isEqualTo(__);
        assertThat(bob instanceof Animal).isEqualTo(__);
        assertThat(bob instanceof Cow).isEqualTo(__);
        assertThat(bob instanceof Puppy).isEqualTo(__);
    }

    @Koan
    void deeper_inheritance_hierarchy() {
        Dog max = new Dog();
        Puppy barney = new Puppy();

        assertThat(max instanceof Puppy).isEqualTo(__);
        assertThat(max instanceof Dog).isEqualTo(__);
        assertThat(barney instanceof Puppy).isEqualTo(__);
        assertThat(barney instanceof Dog).isEqualTo(__);
    }

    @Koan
    void overridden_methods_may_return_subtype() {
        Cow cow = (Cow) new CowFarm().findAnimal(); // What do you need to change in order to get rid of this type cast?
        assertThat(cow instanceof Cow).isEqualTo(__);
    }
}
