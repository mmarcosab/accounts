package com.wmdbank.app.domain.account;

public enum AccountStatus {
    OPEN(1, "open"),
    CLOSED(2, "closed");

    private Integer code;
    private String description;

    private AccountStatus(final Integer code, final String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCode() {
        return code;
    }

    public boolean isClosed(AccountStatus accountStatus) {
        return accountStatus.equals(AccountStatus.CLOSED);
    }

}
