package com.wmdbank.app.domain.account.usecase;

import com.wmdbank.app.domain.account.Account;
import com.wmdbank.app.domain.account.in.CreateAccountRequest;

public interface CreateAccount {
    Account process(final CreateAccountRequest createAccountRequest);
}
