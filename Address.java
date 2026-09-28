public class Address {
    private String street;
    private String city;
    private String country;
    private String zipCode;

    public Address(){
        street="";
        city="";
        country="";
        zipCode="";
    }
    public Address(String street, String city, String country, String zipCode){
        setStreet(street);
        setCity(city);
        setCountry(country);
        setZipCode(zipCode);
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        if (street!=null && !street.isEmpty()){
            this.street=street;
        }
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        if (city!=null && !city.isEmpty()){
            this.city=city;
        }
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        if (country!=null && !country.isEmpty()){
            this.country=country;
        }
    }
    public String getZipCode(){
        return zipCode;
    }
    public void setZipCode(String zipCode){
        if (zipCode!=null && !zipCode.isEmpty()){
            this.zipCode=zipCode;
        }
    }
    public String toString(){
        return "\nAddress:\nstreet = "+street+", \ncity = "+city+",\ncountry = "+country+",\nzipCode = "+zipCode;
    }
}
