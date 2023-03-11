package productStore.product;

import productStore.product.MilkProduct.Kefir;
import productStore.product.MilkProduct.Milk;
import productStore.product.MilkProduct.Yogurt;
import productStore.product.Product;
import productStore.product.ServiceProductImpl;
import productStore.product.meatProduct.Fish;
import productStore.product.meatProduct.LambMeat;
import productStore.product.meatProduct.Sausage;
import productStore.product.wheatProduct.Bread;
import productStore.product.wheatProduct.Flour;
import productStore.product.wheatProduct.Pasta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        list.add(new Fish(1, "Fish", "TOIBOSS", LocalDate.of(2023, 3, 12)));
        list.add(new Fish(1, "Fish", "TOIBOSS", LocalDate.of(2023, 4, 20)));
        list.add(new LambMeat(2, "Lamb", "TOIBOSS", LocalDate.of(2023, 4, 28)));
        list.add(new LambMeat(2, "Lamb", "TOIBOSS", LocalDate.of(2024, 4, 25)));
        list.add(new Sausage(3, "Sausage", "TOIBOSS", LocalDate.of(2023, 4, 14)));
        list.add(new Sausage(3, "Sausage", "TOIBOSS", LocalDate.of(2022, 3, 30)));

        list.add(new Kefir(4, "Kefir", "MILKA", LocalDate.of(2023, 3, 23)));
        list.add(new Kefir(4, "Kefir", "MILKa", LocalDate.of(2024, 4, 17)));
        list.add(new Milk(5, "Milk", "MILKA", LocalDate.of(2025, 3, 26)));
        list.add(new Milk(5, "Milk", "MILKA", LocalDate.of(2022, 4, 9)));
        list.add(new Yogurt(6, "Yogurt", "MILKA", LocalDate.of(2023, 2, 4)));
        list.add(new Yogurt(6, "Yogurt", "MILKA", LocalDate.of(2023, 3, 11)));

        list.add(new Bread(7, "Bread", "NUR", LocalDate.of(2023, 3, 27)));
        list.add(new Bread(7, "Bread", "NUR", LocalDate.of(2024, 4, 20)));
        list.add(new Flour(8, "Flour", "NUR", LocalDate.of(2023, 4, 18)));
        list.add(new Flour(8, "Flour", "NUR", LocalDate.of(2022, 4, 3)));
        list.add(new Pasta(9, "Pasta", "NUR", LocalDate.of(2023, 4, 16)));
        list.add(new Pasta(9, "Pasta", "NUR", LocalDate.of(2023, 3, 5)));

        /**          Login and password    **/
        //            tairovasan11@gmail.com
       //                asan24101999

        ServiceProductImpl serviceProductImpl = new ServiceProductImpl();
        System.out.println("Login и password жазыныз");
        serviceProductImpl.checkToManager(scanner.nextLine(), scanner.nextLine(),list);


    }
}