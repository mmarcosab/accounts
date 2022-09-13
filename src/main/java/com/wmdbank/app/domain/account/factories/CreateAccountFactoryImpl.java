package com.wmdbank.app.domain.account.factories;

import com.wmdbank.app.domain.account.Account;
import com.wmdbank.app.domain.account.CommonAccount;
import com.wmdbank.app.domain.account.in.CreateAccountRequest;

public class CreateAccountFactoryImpl implements CreateAccountFactory{

    @Override
    public Account create(final CreateAccountRequest createAccountRequest) {
        final Long clientId = createAccountRequest.getClientId();
        final String password = createAccountRequest.getPassword();
        return new CommonAccount(clientId, password);
    }

}
