package com.wmdbank.app.domain.account.factories;

import com.wmdbank.app.domain.account.Account;
import com.wmdbank.app.domain.account.in.CreateAccountRequest;

public interface CreateAccountFactory {
    Account create(final CreateAccountRequest createAccountRequest);
}
