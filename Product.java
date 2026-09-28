public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){
        name="";
        price=0.0;
        quantity=0;
    }
    public Product(String name, double price, int quantity){
        this.name=name;
        setPrice(price);
        setQuantity(quantity);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name!=null && !name.isEmpty()){
            this.name=name;
        }
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price>=0){
            this.price = price;
        }
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity>=0){
            this.quantity=quantity;
        }
    }
    public String toString(){
        return "Product:\nname = "+name+", \nprice = "+price+",\nquantity = "+quantity;
    }
}
