package sevice;


import model.Product;
import sevice.impl.ProductManager;

public class Main {
    public Main(){

    }
    public static void main(String[] args) {
        ProductManager ql = new ProductManager();
        ql.add(new Product(1, "Hello", 15));
        ql.add(new Product(2, "hí", 20));
        ql.add(new Product(3, "chào", 25));
        ql.update(2,(new Product(3,"không chào",30)));
        ql.delete(1);
        ql.print();
        ql.sort();
        ql.print();
    }
}
