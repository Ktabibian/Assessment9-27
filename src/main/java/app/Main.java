package app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20, 'M');
        Clothing tShirt = new Clothing("White T Shirt", 5.0, 'S');
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, 'L');

        Clothing[] managerCart = {buttonUp, tShirt, jeans};
        Clothing[] employeeCart = {jeans, buttonUp};
        Manager manager = new Manager("Jim Jones", managerCart, 'L');
        HourlyEmployee employee = new HourlyEmployee("Mike Jones", employeeCart, 'M');
        IDiscountable[] discountable = {employee, manager};

        ArrayList<Clothing> clothingItems = new ArrayList<>();
        clothingItems.add(jeans);
        clothingItems.add(tShirt);
        clothingItems.add(buttonUp);

        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println(ShopApp.isAFit(manager, jeans));
        employee.printEmpPriceAfterDisc(jeans);
        employee.printEmpPriceAfterDisc(tShirt);
        manager.printEmpPriceAfterDisc(jeans);
        ShopApp.sortAndPrintClothingByPrice(clothingItems);
        ShopApp.printEmployeeName(manager);
        ShopApp.printEmployeeName(employee);

        ShopApp.printDiscAmtOff(discountable, jeans);

    }
}
