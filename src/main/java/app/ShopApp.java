package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ShopApp {
    public static double calcTotal(Clothing[] clothing){
        double sum = 0.00;
        for(int i = 0; i < clothing.length; i++){
            sum += clothing[i].getPrice();
        }
        return sum;
    }

    public static boolean isAFit(Customer customer, Clothing clothing){
        if(customer.getSize() != clothing.getSize()){
            return false;
        }
        return true;
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingArrayList){
        Collections.sort(clothingArrayList, Comparator.comparingDouble(Clothing :: getPrice));
        clothingArrayList.forEach(clothing -> System.out.println(clothing));
    }

    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }

    public static void printDiscAmtOff(IDiscountable[] discount, Clothing clothing){
        for(int i = 0; i < discount.length; i++){
            System.out.println(discount[i].calcDiscount(clothing));
        }
    }
}
