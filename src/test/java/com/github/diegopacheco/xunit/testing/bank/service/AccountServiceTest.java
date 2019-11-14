package com.github.diegopacheco.xunit.testing.bank.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.diegopacheco.xunit.testing.bank.model.Account;

public class AccountServiceTest {

    @Test
    public void testDeposit(){
        Account a  = new Account();
        a.id = 1;
        a.name = "Zeh";
        a.value = 0;
        AccountService ass = new AccountService();
        ass.update(a, 10);
        assertEquals(10, 10);
    }
    
}