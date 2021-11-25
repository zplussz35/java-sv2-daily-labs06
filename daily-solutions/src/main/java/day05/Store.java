package day05;

import java.util.ArrayList;

import java.util.List;


public class Store {


    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("alma", Type.FOOD, 200));
        store.addProduct(new Product("kalapács", Type.APPAREL, 1500));
        store.addProduct(new Product("kenyér", Type.FOOD, 300));
        store.addProduct(new Product("laptop", Type.MACHINE, 100_000));
        store.addProduct(new Product("Windows10", Type.SOFTWARE, 25_000));
        store.addProduct(new Product("asztal", Type.HOUSEHOLD, 10_000));
        store.addProduct(new Product("tányér", Type.HOUSEHOLD, 1000));
        store.addProduct(new Product("banán", Type.FOOD, 450));
        store.addProduct(new Product("autó", Type.MACHINE, 20_000_000));
        store.addProduct(new Product("kanál", Type.APPAREL, 500));
        store.addProduct(new Product("Intellij", Type.SOFTWARE, 20_000));


        List<ProductWithPiece> result = store.productCountByType();

        for (ProductWithPiece pwp: result) {
            System.out.println(pwp.getType()+": "+pwp.getCount());
        }
    }


    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<ProductWithPiece> productCountByType() {
            List<ProductWithPiece> result = new ArrayList<>();
        for (Product p:products) {
            if(containsProduct(p,result)){
                for (ProductWithPiece pwp: result) {
                    if(p.getType()==pwp.getType()){
                        pwp.incrementCount();
                    }
                }
            }
            else{
                result.add(new ProductWithPiece(p.getType()));
            }
        }
        return result;

    }

    private boolean containsProduct(Product p, List<ProductWithPiece> result) {
        for (ProductWithPiece pwp:result) {
            if(p.getType()==pwp.getType()){
                return true;
            }
        }
        return false;

    }

    public List<Product> getProducts() {
        return products;
    }
}
