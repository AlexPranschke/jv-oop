package core.basesyntax;

public class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck started transporting");
    }

    public void stopWork() {
        System.out.println("Truck stopped transporting");
    }
}
