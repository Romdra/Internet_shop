public class Category {

    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {

        this.name = name;
        this.products = products;
    }

    public void lookCategories(Category[] category) {

        System.out.println("Список категорий");
        for (int i = 0; i < category.length; i++) {
            System.out.println(category[i].name);
        }
    }

    public void lookCategory(Product[] products) {

        System.out.println("Список товаров");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
