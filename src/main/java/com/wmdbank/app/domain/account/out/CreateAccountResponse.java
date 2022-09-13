package com.wmdbank.app.domain.account.out;

public class CreateAccountResponse {

    private Long clientId;
    private Long debitCardId;
    private String password;

    public CreateAccountResponse(final Long clientId, final Long debitCardId, final String password) {
        this.clientId = clientId;
        this.debitCardId = debitCardId;
        this.password = password;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getDebitCardId() {
        return debitCardId;
    }

    public String getPassword() {
        return password;
    }
}
