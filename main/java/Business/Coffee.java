package Business;

public abstract class Coffee {

    private Price price = new Price(0.00);

    public double getPrice() {
        double price = this.price.getPrice();
        return price;
    }
    public void printDesc(){

    };
}
