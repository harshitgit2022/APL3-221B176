// Abstract Class
abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

// Pandav Class (inherits Bharatvanshi)
class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav fights bravely.");
    }

    @Override
    void obey() {
        System.out.println("Pandav is obedient.");
    }

    @Override
    void kind() {
        System.out.println("Pandav is kind.");
    }
}

// Arjun Class (inherits Pandav)
class Arjun extends Pandav {
    // No changes needed, inherits all behaviors from Pandav
}

// Bheem Class (inherits Pandav, but less kind)
class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println("Bheem is less kind.");
    }
}

// Kaurav Class (inherits Bharatvanshi)
class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav fights aggressively.");
    }

    @Override
    void obey() {
        System.out.println("Kaurav is disobedient.");
    }

    @Override
    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

// Vikarn Class (inherits Kaurav but is noble)
class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

// Main Class for Testing
public class Mahabharata {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

        System.out.println("\nArjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
