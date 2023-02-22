package org.example.products;
import java.util.ArrayList;
import java.util.List;

public class Products {
    private String name;
    private double price;

    private static List<Products> productList = new ArrayList<Products>();

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public  Products(){
        super();
    }

    public static List<Products> declareProducts(){
        ArrayList<Products> productList = new ArrayList<Products>();
        Products product1 = new Products("Eggs", 100.0);

        Products product2 = new Products("bread", 900.0);

        Products product3 = new Products("Sardine", 450.0);

        Products product4 = new Products("Fish", 500.0);

        Products product5 = new Products("Butter", 400.0);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product1);
        productList.add(product5);
        return productList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Products> getProductList() {
        return productList;
    }

    public static void setProductList(List<Products> productList) {
        Products.productList = productList;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

