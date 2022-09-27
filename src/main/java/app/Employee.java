package app;

public abstract class Employee extends Customer {
    private final double discount = 0.10;

    public Employee(String name, Clothing[] clothingItems, char size, double discount) {
        super(name, clothingItems, size);
    }

    public double getDiscount() {
        return discount;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);
}
