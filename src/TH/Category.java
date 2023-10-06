package TH;

public class Category {
    int categoryId;
    String categoryName;
    public Category(int categoryId, String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public void displayCat(){
        System.out.println("Mã danh mục : " + categoryId + "\n" +
                "Tên danh mục : " + categoryName + "\n");
    }
}
