public class Account {
    private double balance;
    private int pinCode = 1111;

    //    Constructor    //////////////////////////////////////////////////////////////
    public Account() {

    }

    public Account(double balance) {
        this.balance = balance;
    }


    //    Getter and Setter    //////////////////////////////////////////////////////////

    public int getPinCode() {
        return pinCode;
    }

    //    Methods    ////////////////////////////////////////////////////////////////////
    public double checkBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
        System.out.println("$" + deposit + " cиздин эсебинизге салынды.");
    }

    public void withdrawal(double withdrawal) {
        balance -= withdrawal;
        System.out.println("$" + withdrawal + " эсебинизден чыгарылды.");
    }

    public void transaction(double trans) {

    }
}