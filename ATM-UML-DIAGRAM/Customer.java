
public class Customer  {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;
    private Card card;
    private Account account;
    private Atm atm;
    private Transaction transaction;

    public Customer(String name,String email, String phone,Address address,CustomerStatus status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }
    
    //Name
    public String getname(){
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }

    //Email
    public String getemail(){
        return email;
    }
    public void setemail(String email)
    {
        this.email = email;
    }

    //Phone
    public String getphone(){
        return phone;
    }
    public void setphone(String phone)
    {
        this.phone = phone;
    }

    //Address
    public Address getaddress(){
        return address;
    }
    public void setaddress(Address address)
    {
        this.address = address;
    }

    //Status
    public CustomerStatus getstatus(){
        return status;
    }
    public void setstatus(CustomerStatus status)
    {
        this.status = status;
    }

    //Card
    public Card getcard(){
        return card;
    }
    public void setcard(Card card)
    {
        this.card = card;
    }

    //Account
    public Account getaccount(){
        return account;
    }
    public void setname(Account account)
    {
        this.account = account;
    }

    //Atm
    public Atm getatm(){
        return atm;
    }
    public void setatm(Atm atm)
    {
        this.atm = atm;
    }
    //Transcation
    public Transaction gettransaction(){
        return transaction;
    }
    public void settransaction(Transaction transaction)
    {
        this.transaction = transaction;
    }

    //method
    public boolean makeTransaction() {
        return false;
    }
}
