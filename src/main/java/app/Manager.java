package app;

public class Manager extends Employee implements IDiscountable{

    private static final double discount = 0.25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size, discount);
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * discount;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }

}
