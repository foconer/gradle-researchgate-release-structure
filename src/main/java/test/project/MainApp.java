package test.project;

import test.project.model.Product;

public class MainApp {
    public static void main(String... args) {
        System.out.println(Product.builder().build());
    }
}
