public class Order {
    private int orderId;
    private String customerName;
    private int quantity;
    private String status;

    public Order(){
        orderId=0;
        customerName="";
        quantity=0;
        status="";
    }
    public Order(int orderId, String customerName, int quantity, String status){
        setOrderId(orderId);
        setCustomerName(customerName);
        setQuantity(quantity);
        setStatus(status);
    }
    public int getOrderId(){
        return orderId;
    }
    public void setOrderId(int orderId){
        if (orderId>0){
            this.orderId=orderId;
        }
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        if (customerName!=null && !customerName.isEmpty()){
            this.customerName=customerName;
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
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        if (status!=null && !status.isEmpty()){
            this.status=status;
        }
    }
    public String toString(){
        return "\nOrder:\norderId = "+orderId+", \ncustomerName = "+customerName+",\nquantity = "+quantity+",\nstatus = "+status;
    }
}