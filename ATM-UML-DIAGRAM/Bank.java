public class Bank{
    private String name;
    private String bankcode;
    Account account;

    public String getBankCode()
    {
        return bankcode ;
    }
    public boolean addAtm()
    {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}