package Business;

public abstract class Decoration extends Coffee{
    protected Coffee coffee;

    public Decoration(Coffee coffee) {
        this.coffee = coffee;
    }
    public Decoration(){};

    public double getPrice() {
        return coffee.getPrice() + 2.25;
    }

}
