package sevice.impl;

import model.Product;
import sevice.GeneralService;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager implements GeneralService<Product> {
    private ArrayList<Product> listProduct;

    public ProductManager(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ProductManager() {
        listProduct = new ArrayList();
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.listProduct.size(); ++i) {
            if (((Product) this.listProduct.get(i)).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void add(Product product) {
        this.listProduct.add(product);
    }

    @Override
    public void update(int id, Product product) {
        int index = findIndexById(id);
        listProduct.set(index, product);
    }

    @Override
    public void delete(int id) {
        int index = this.findIndexById(id);
        this.listProduct.remove(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < this.listProduct.size(); ++i) {
            System.out.println(this.listProduct.get(i));
        }
    }

    @Override
    public void sort() {
        listProduct.sort(Comparator.comparingInt(Product::getPrice));
    }
}
