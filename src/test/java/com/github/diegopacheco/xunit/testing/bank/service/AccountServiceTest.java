package com.github.diegopacheco.xunit.testing.bank.service;

import com.github.diegopacheco.xunit.testing.bank.model.Account;

import org.junit.jupiter.api.Test;

public class AccountServiceTest {

    @Test
    public void testDeposit(){
        Account a  = new Account();
        a.id = 1;
        a.name = "Zeh";
        a.value = 0;
        AccountService ass = new AccountService();
        ass.update(a, 10);
    }
    
}