package com.wmdbank.app.domain.account.usecase;

import com.wmdbank.app.domain.account.Account;
import com.wmdbank.app.domain.account.in.CreateAccountRequest;

public class CreateAccountImpl implements CreateAccount {

    @Override
    public Account process(final CreateAccountRequest createAccountRequest) {
        //TODO make a orchestration of the creation process
        return null;
    }

}
