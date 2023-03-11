package productStore.product.wheatProduct;

import java.time.LocalDate;

public class Bread extends WheatProduct{
    public Bread(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
