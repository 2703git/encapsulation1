public class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(){
        name="";
        email="";
        phone="";
    }
    public Customer(String name, String email, String phone){
        setName(name);
        setEmail(email);
        setPhone(phone);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name!=null && !name.isEmpty()){
            this.name=name;
        }
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if (email!=null && email.contains("@")){
            this.email=email;
        }
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        if (phone!=null && !phone.isEmpty()){
            this.phone=phone;
        }
    }
    public String toString(){
        return "\nCustomer:\nname = "+name+", \nemail = "+email+",\nphone = "+phone;
    }
}
