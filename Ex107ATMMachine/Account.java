package be.vdab.Ex107ATMMachine;

import java.util.Date;

public class Account {

        // data fields
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private Date dateCreated = new Date();

        // constructors
        public Account() {
        }
        public Account(int id, double balance)  {
            this.id = id;
            this.balance = balance;
        }

        // accessors and mutators
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }
        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }
        public String getDateCreated() {
            return dateCreated.toString();
        }

        // methods
        public double getMonthlyInterestRate()  {
            return annualInterestRate/12;
        }
        public double getMonthlyInterest()  {
            return balance * (annualInterestRate/100)/12;
        }
        public void withdraw(int amount)    {
            balance -= amount;
        }
        public void deposit(int amount) {
            balance += amount;
        }
        public String toString() {
            return "NORMAL ACCOUNT";
        }
}


