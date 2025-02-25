// Defining the interface Testable
interface Testable {
    void display(); // Implicitly public and abstract
}

// Concrete class implementing Testable
class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Display method implemented in Test class.");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}

// Abstract class implementing Testable
abstract class AbsTest implements Testable {
    // No need to implement display() here; AbsTest remains abstract
}

// Concrete subclass of AbsTest that must implement display()
class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteTest.");
    }

    public static void main(String[] args) {
        ConcreteTest obj = new ConcreteTest();
        obj.display();
    }
}
