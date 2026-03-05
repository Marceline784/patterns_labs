package creational;

public class FactoryMethod {

    public Product createProduct(){
        return new Product();
    }

    public static class Product{

        public void use(){
            System.out.println("Product created using Factory Method");
        }

    }

}