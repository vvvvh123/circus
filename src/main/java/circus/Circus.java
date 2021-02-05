package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
<<<<<<< HEAD:src/main/java/circus/Circus.java
=======
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;
>>>>>>> improved:src/main/java/Circus.java

public class Circus {
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

<<<<<<< HEAD:src/main/java/circus/Circus.java
    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset asset : assets) {
            if (asset.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + asset.getValue());
                continue;
            }
            total += asset.getValue();
            System.out.println("Adding item value: " + asset.getValue());
=======
    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
>>>>>>> improved:src/main/java/Circus.java
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
<<<<<<< HEAD:src/main/java/circus/Circus.java
        System.out.println("Total value of equipments " + calculateValue(equipments));
        System.out.println("Total value of animals " + calculateValue(animals));
=======
        System.out.println("Total value of animals " + calculateAssetValue(animals));
        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
>>>>>>> improved:src/main/java/Circus.java
    }
}
