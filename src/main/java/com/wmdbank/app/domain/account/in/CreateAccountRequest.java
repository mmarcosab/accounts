package com.wmdbank.app.domain.account.in;

public class CreateAccountRequest {

    private Long clientId;
    private Long debitCardId;
    private String password;

    public CreateAccountRequest(Long clientId, Long debitCardId, String password) {
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
