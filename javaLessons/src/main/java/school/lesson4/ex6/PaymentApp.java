package school.lesson4.ex6;

public class PaymentApp {
    public static void main(String[] args) {
        Payment.Products banana = new Payment().new Products("Банан", 100);
        Payment.Products apple = new Payment().new Products("Яблоко", 200);
        Payment.Products rice = new Payment().new Products("Рис", 300);
        Payment.Products fish = new Payment().new Products("Рыба", 400);
        Payment.listOfProducts();
    }
}
