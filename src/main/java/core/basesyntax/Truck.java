package core.basesyntax;

public class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck is transporting");
    }

    public void stopWork() {
        System.out.println("Truck stopped transporting");
    }
}
