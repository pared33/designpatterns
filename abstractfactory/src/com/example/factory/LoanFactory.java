package com.example.factory;


import com.example.AbstractFactory;
import com.example.banks.Bank;
import com.example.loans.BussinessLoan;
import com.example.loans.EducationLoan;
import com.example.loans.HomeLoan;
import com.example.loans.Loan;

public class LoanFactory extends AbstractFactory {
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
