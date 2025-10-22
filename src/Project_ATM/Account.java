package Project_ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingbalance = 0;

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustpomerNumber() {

		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingbalance;
	}

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calcSavingWithdraw(double amount) {
		savingbalance = (savingbalance - amount);
		return savingbalance;
	}

	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	public double calsSavingDeposit(double amount) {
		savingbalance = (savingbalance + amount);
		return savingbalance;
	}

	public void getCheckingWithdrawInput() {
		System.out.println("Checkin Accoun Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount You Want To Withdraw From Checking Amount: ");
		double amount = input.nextDouble();

		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Cheking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {

			System.out.println("Balance Cannot Be Negative." + "\n");
		}
	}

	public void getsavingWithdrawInput() {
		System.out.println("Savaing Account Balance" + moneyFormat.format(savingbalance));
		System.out.println("Amount You Want To Withdraw From Saving Account");
		double amount = input.nextDouble();

		if ((savingbalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance:" + moneyFormat.format(savingbalance));
		}

		else {
			System.out.println("Balance Cannot Be Negative." + "\n");
		}
	}

	public void getCheckingDepositeInput() {
		System.out.println("Checking Accoun Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount U want to Deposit from Checking Account:");
		double amount = input.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance Canot Be Negative." + "\n");
		}
	}

	public void getSavingDepositInput() {
    System.out.println("Saving Account alance: "+moneyFormat.format(savingbalance));
    System.out.println("Amount You Want To Deposit From Saving Account: ");
    double amount=input.nextDouble();
    
    if((savingbalance + amount)>=0) {
    	calsSavingDeposit(amount);
    	System.out.println("New Saving Account Balance: "+moneyFormat.format(savingbalance));    	
    }
    else {
    	System.out.println("Blanace Cannot be Negative. "+"\n ");
    }
    
	}
}
