package TH;

public class MainProCat {
    public static void main(String[] args) {
        // danh mục
        Category dm1 = new Category(1,"Quần");
        Category dm2 = new Category(2,"Áo");
        // sản phẩm danh mục 1
        Product product1 = new Product(1,"Quần âu", 150000, dm1);
        Product product2 = new Product(2,"Quần jean", 200000, dm1);
        // sản phẩm danh mục 2
        Product product3 = new Product(3,"Áo cà sa", 250000, dm2);
        Product product4 = new Product(4,"Áo lưới", 50000, dm2);
        // hiển thị
        System.out.println("Danh sách sản phẩm");
        product1.displayPro();
        product2.displayPro();
        product3.displayPro();
        product4.displayPro();

    }
}
