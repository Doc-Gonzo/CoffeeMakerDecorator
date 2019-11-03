package Business;

public class MilkDeco extends Decoration{

    private Price price = new Price(2.50);

    public MilkDeco(Coffee coffee) {
            super(coffee);
    }

    public void printDesc() {
            coffee.printDesc();
            System.out.print(", Milchschaum");
    }
    public double getPrice() {
        return coffee.getPrice() + 2.90;
    }
}
