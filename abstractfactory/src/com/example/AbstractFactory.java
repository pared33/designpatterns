package com.example;


import com.example.banks.Bank;
import com.example.loans.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
