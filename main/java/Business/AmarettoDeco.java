package Business;

public class AmarettoDeco extends Decoration {

    public AmarettoDeco(Coffee coffee) {
        super(coffee);
    }

    public void printDesc() {
        coffee.printDesc();
        System.out.print(", ein Schuss Amaretto");
    }

    public double getPrice() {
        return coffee.getPrice() + 2.25;
    }
}
