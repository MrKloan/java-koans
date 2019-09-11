package basics;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;

public class InheritanceKoans {

    @Koan
    void methodOverloading() {
        Cow bob = new Cow();
        Dog max = new Dog();
        Puppy barney = new Puppy();
        assertThat(bob.makeSomeNoise()).isEqualTo(__);
        assertThat(max.makeSomeNoise()).isEqualTo(__);
        assertThat(barney.makeSomeNoise()).isEqualTo(__);

        assertThat(max.canFetch()).isEqualTo(__);
        assertThat(barney.canFetch()).isEqualTo(__);
        // but can Bob the Cow fetch?
    }

    @Koan
    void methodOverloadingUsingPolymorphism() {
        Animal bob = new Cow();
        Animal max = new Dog();
        Animal barney = new Puppy();
        assertThat(bob.makeSomeNoise()).isEqualTo(__);
        assertThat(max.makeSomeNoise()).isEqualTo(__);
        assertThat(barney.makeSomeNoise()).isEqualTo(__);
        // but can max or barney (here as an Animal) fetch?
        // try to write it down here
    }

    @Koan
    void inheritanceHierarchy() {
        Animal someAnimal = new Cow();
        Animal bob = new Cow();
        assertThat(someAnimal.makeSomeNoise().equals(bob.makeSomeNoise())).isEqualTo(__);
        // cow is a Cow, but it can also be an animal
        assertThat(bob instanceof Animal).isEqualTo(__);
        assertThat(bob instanceof Cow).isEqualTo(__);
        // but is it a Puppy?
        assertThat(bob instanceof Puppy).isEqualTo(__);
    }

    @Koan
    void deeperInheritanceHierarchy() {
        Dog max = new Dog();
        Puppy barney = new Puppy();
        assertThat(max instanceof Puppy).isEqualTo(__);
        assertThat(max instanceof Dog).isEqualTo(__);
        assertThat(barney instanceof Puppy).isEqualTo(__);
        assertThat(barney instanceof Dog).isEqualTo(__);
    }

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

    // TODO overriding
//
//    abstract class ParentTwo {
//        abstract public Collection<?> doStuff();
//    }
//
//    class ChildTwo extends ParentTwo {
//        public Collection<?> doStuff() {
//            return Collections.emptyList();
//        }
//
//        ;
//    }
//
//    @Koan
//    void overriddenMethodsMayReturnSubtype() {
//        // What do you need to change in order to get rid of the type cast?
//        // Why does this work?
//        List<?> list = (List<?>) new ChildTwo().doStuff();
//        assertThat(list instanceof List).isEqualTo(__);
//    }
}
