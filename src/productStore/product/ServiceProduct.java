package productStore.product;

import java.util.List;

public interface ServiceProduct {
    void companyVerification(List<Product> list2);
    void deadlineCheck(List<Product> list1);
    void discount(String login,String password, List<Product> list);
}
