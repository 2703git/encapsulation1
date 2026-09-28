public class Main {
    public static void main(String[] args) {
        Product product=new Product("Laptop",850.0,5);
        Order order=new Order(101,"Zuhra",2,"Pending");
        Customer customer=new Customer("Zuhra","zuhra@gmail.com","901234567");
        Address address=new Address("Amir Temur Street","Tashkent","Uzbekistan","100000");
        PaymentCard card=new PaymentCard("1234567890123456","Zuhra",10,2028);
        System.out.println(product);
        System.out.println(order);
        System.out.println(customer);
        System.out.println(address);
        System.out.println(card);
    }
}
