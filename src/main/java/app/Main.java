package app;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20, 'M');
        Clothing tShirt = new Clothing("White T Shirt", 5.0, 'S');
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, 'L');
        
        Clothing[] managerCart = {buttonUp, tShirt, jeans};
        Clothing[] employeeCart = {jeans, buttonUp};
        Manager manager = new Manager("Jim Jones", managerCart, 'L');
        HourlyEmployee employee = new HourlyEmployee("Mike Jones", employeeCart, 'M');

        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println(ShopApp.isAFit(manager, jeans));
        employee.printEmpPriceAfterDisc(jeans);
        employee.printEmpPriceAfterDisc(tShirt);
        manager.printEmpPriceAfterDisc(jeans);
        ShopApp.printEmployeeName(manager);
        ShopApp.printEmployeeName(employee);


        System.out.println(employee.calcDiscount(jeans)); //wrong method
        System.out.println(manager.calcDiscount(jeans)); //wrong method

    }
}
