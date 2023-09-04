package packeges;

public class ATM {

    private double balance;
    private double DepositAmount;
    private double withdrawAmount;

    public  ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return DepositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        DepositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
