package app;

public class HourlyEmployee extends Employee implements IDiscountable{

    private static final double discount = 0.10;

    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size, discount);
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * this.discount;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }
}
