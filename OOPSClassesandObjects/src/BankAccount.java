public class BankAccount {
    private  int accNumber;
    private double accBalance;
    private String customerName;
    private String eMail;
    private int phoneNumber;

    //No args Constructor
    public BankAccount(){
        this(1631873687,7489.32,"Ajay","sflfdjs", 732988742);
        System.out.println("Empty constructor called");
    }
    public BankAccount(int accNumber,double accBalance,
                       String customerName, String eMail, int phoneNumber){
        System.out.println("Accout constructor with parameters called");
        this.accBalance=accBalance;
        this.accNumber=accNumber;
        this.customerName=customerName;
        String costumermail = eMail;
        int Ph = phoneNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double deposit){
        accBalance=deposit+accBalance;
        System.out.println("Deposit made, Available balance is "+accBalance);


    }
    public void withdraw(double withdraw){

        if(accBalance-withdraw<0){
            System.out.println("Insufficient funds");
        }else {

            accBalance=accBalance-withdraw;
            System.out.println("Withdrawel of "+withdraw+" Sucessfull!!" +
                    " Available balance is "+accBalance);

        }


    }




}
