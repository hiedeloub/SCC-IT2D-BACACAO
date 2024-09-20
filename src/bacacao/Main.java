package bacacao;

public class Main {
    
  
    public static void main(String[] args) {

        Accounts accounts = new Accounts();
        accounts.addAccount(new Account("user1", "password123"));

        Grades grades = new Grades();
        grades.addGrade(new Grade("Math", 85));
        grades.addGrade(new Grade("English", 90));

        System.out.println("Average Grade: " + grades.getAverage());

        Products products = new Products();
        products.addProduct(new Product("Laptop", 999.99));
        products.addProduct(new Product("Phone", 599.99));

        System.out.println("Products:");
        products.getProducts().forEach((product) -> {
            System.out.println(product);
        });
    }
}