package productStore.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ServiceProductImpl implements ServiceProduct {
    private List<Product> list = new ArrayList<Product>();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    @Override
    public void companyVerification(List<Product> list2) {
        System.out.println(ANSI_GREEN + "Goods received " + ANSI_RESET);
        List<Product> products = list2.stream().filter(x -> x.getCompanyName().equals("NUR")
                        || x.getCompanyName().equals("MILKA") || x.getCompanyName().equals("TOIBOSS"))
                .filter(e -> e.getDate().isAfter(LocalDate.now().plusDays(30))).toList();
        products.forEach(System.out::println);
    }

    @Override
    public void deadlineCheck(List<Product> list1) {
        System.out.println(ANSI_YELLOW + "Expired products " +ANSI_RESET);
        List<Product> productList = list1.stream().filter(s -> s.getDate().isBefore(LocalDate.now())).toList();
        productList.forEach(System.out::println);
        list1.removeIf(x -> x.getDate().isBefore(LocalDate.now()));
        List<Product> productList2 = list1.stream().filter(x -> x.getCompanyName().equals("NUR")
                        || x.getCompanyName().equals("MILKA") || x.getCompanyName().equals("TOIBOSS"))
                .filter(e -> !e.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        System.out.println(ANSI_RED + "Promotion for goods " + ANSI_RESET);
        productList2.forEach(System.out::println);
    }

    @Override
    public void checkToManager(String login, String password, List<Product> list) {
        if (login.equals(Manager.login) && password.equals(Manager.password)) {
            System.out.println(ANSI_BLUE+"Welcome to Globus -> store Asan Tairovich"+ANSI_RESET);
            companyVerification(list);
            deadlineCheck(list);
        } else {
            System.out.println("Login and password is wrong");
        }
    }
}
