import duck.Duck;
import duck.MallardDuck;
import fly.FlyNoWay;

void main() {
    Duck mallard = new MallardDuck();

    System.out.println("--- Mallard Duck Test ---");
    mallard.display();
    mallard.performFly();
    mallard.performQuack();

    System.out.println("\n--- Dynamic Behavior Change ---");

    mallard.setFlyBehavior(new FlyNoWay());

    System.out.print("After injury: ");
    mallard.performFly();
}