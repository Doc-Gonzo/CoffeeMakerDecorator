package Business;

public class CocoaDeco extends Decoration {
    private  Price price = new Price(2.50);

    public CocoaDeco(Coffee coffee) {
        super(coffee);
    }
    public void printDesc() {
        coffee.printDesc();
        System.out.print(", Kakao");
    }
    public double getPrice() {
        return coffee.getPrice() + 2.80;
    }
}
