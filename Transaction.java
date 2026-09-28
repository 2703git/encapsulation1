public class Transaction {
    private String type;
    private double amount;
    private String description;

    public Transaction(){
        type="";
        amount=0.0;
        description="";
    }
    public Transaction(String type, double amount, String description){
        setType(type);
        setAmount(amount);
        setDescription(description);
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        if (type!=null && !type.isEmpty()){
            this.type=type;
        }
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        if (amount>=0){
            this.amount=amount;
        }
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        if (description!=null && !description.isEmpty()){
            this.description=description;
        }
    }
    public String toString(){
        return "Transaction:\ntype = "+type+", \namount = "+amount+",\ndescription = "+description;
    }
}
