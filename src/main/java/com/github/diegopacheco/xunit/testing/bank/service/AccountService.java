package com.github.diegopacheco.xunit.testing.bank.service;

import com.github.diegopacheco.xunit.testing.bank.model.Account;

public class AccountService{

    public void update(Account account,Integer value){
        account.value = value;
    }

}