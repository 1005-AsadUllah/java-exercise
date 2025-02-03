
public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address(String streetAddress,String city,String state, String zipcode,String country)
    { 
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;

    }
    // getter and setter method use for StreetAddress

    public String getStreetAddress(){
        return streetAddress;
    }
    public void setStreetAddress(String address){
        this.streetAddress = address;
    }

    // getter and setter method use for city

    public String getcity(){
        return city;
    }
    public void setcity(String city){
        this.city = city;
    }

    // getter and setter method use for state

    public String getstate(){
        return state;
    }
    public void setstate(String state){
        this.state = state;
    }
   
    // getter and setter method use for zipcode
    
    public String getzipcode(){
        return zipcode;
    }
    public void setzipcode(String zipcode){
        this.zipcode = zipcode;
    }
    // getter and setter method use for country
    
    public String getcountry(){
        return country;
    }
    public void setcountry(String country){
        this.country = country;
    }

}
