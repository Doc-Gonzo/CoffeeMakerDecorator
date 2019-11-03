package Business;

public class PlainCoffee extends Coffee {

    private Price price = new Price(2.50);

    public double getPrice() {
        return 2.50;
    }

    public void printDesc() {
        System.out.print("Eine ausgewogene Mischung aus Arabica Bohnen");
    }
}
