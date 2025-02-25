// Interface for flying behavior
interface Flyable {
    void fly();
}

// Interface for quacking behavior
interface Quackable {
    void quack();
}

// Abstract Duck class (all ducks can swim)
abstract class Duck {
    void swim() {
        System.out.println(getClass().getSimpleName() + " is swimming.");
    }
}

// Rubber Duck (Squeaks, Can't Fly)
class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Rubber Duck squeaks.");
    }
}

// Wooden Duck (Mute, Can't Fly)
class WoodenDuck extends Duck {
    // No quack, no fly
}

// RedHead Duck (Quacks, Can Fly)
class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}

// Lake Duck (Quacks, Can Fly)
class LakeDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}

// Main class to test ducks
public class DuckGame {
    public static void main(String[] args) {
        Duck[] ducks = {new RubberDuck(), new WoodenDuck(), new RedHeadDuck(), new LakeDuck()};

        for (Duck duck : ducks) {
            System.out.println("\n" + duck.getClass().getSimpleName() + ":");
            duck.swim();
            
            // Checking if the duck can fly
            if (duck instanceof Flyable) {
                ((Flyable) duck).fly();
            }

            // Checking if the duck can quack
            if (duck instanceof Quackable) {
                ((Quackable) duck).quack();
            }
        }
    }
}
