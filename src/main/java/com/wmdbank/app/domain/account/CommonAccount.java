package com.wmdbank.app.domain.account;

import java.math.BigDecimal;
import java.util.List;

public class CommonAccount implements Account {

    private Long id;
    private Long number;
    private Long digit;
    private Long clientId;
    private List<BigDecimal> entrances;
    private List<BigDecimal> exits;
    private List<Long> creditCardIds;
    private Long debitCardId;
    private String password;
    private AccountStatus status;

    protected CommonAccount() {}

    public CommonAccount(
            final Long clientId,
            final String password
    ) {
        create(clientId, password);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Long getNumber() {
        return number;
    }

    @Override
    public Long getDigit() {
        return digit;
    }

    @Override
    public Long getClientId() {
        return clientId;
    }

    @Override
    public List<BigDecimal> getEntrances() {
        return entrances;
    }

    @Override
    public List<BigDecimal> getExits() {
        return exits;
    }

    @Override
    public List<Long> getCreditCardIds() {
        return creditCardIds;
    }

    @Override
    public Long getDebitCardId() {
        return debitCardId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public AccountStatus getStatus() {
        return status;
    }

    protected void setId(final Long id) {
        this.id = id;
    }

    protected void setNumber(final Long number) {
        this.number = number;
    }

    protected void setDigit(final Long digit) {
        this.digit = digit;
    }

    protected void setClientId(final Long clientId) {
        this.clientId = clientId;
    }

    protected void setEntrances(final List<BigDecimal> entrances) {
        this.entrances = entrances;
    }

    protected void setExits(final List<BigDecimal> exits) {
        this.exits = exits;
    }

    protected void setCreditCardIds(final List<Long> creditCardIds) {
        this.creditCardIds = creditCardIds;
    }

    protected void setDebitCardId(final Long debitCardId) {
        this.debitCardId = debitCardId;
    }

    protected void setPassword(final String password) {
        this.password = password;
    }

    protected void setStatus(final AccountStatus accountStatus) {
        this.status = accountStatus;
    }

    public static Account create(final Long clientId, final String password) {
        CommonAccount account = new CommonAccount();
        account.setClientId(clientId);
        account.setPassword(password);
        return null;
    }

}

class Builder {

    private CommonAccount commonAccount;

    public Builder() {
        this.commonAccount = new CommonAccount();
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder withID(final Long id) {
        this.commonAccount.setId(id);
        return this;
    }

    public Builder withNumber(final Long number) {
        this.commonAccount.setNumber(number);
        return this;
    }

    public Builder withDigit(final Long digit) {
        this.commonAccount.setDigit(digit);
        return this;
    }

    public Builder withClientId(final Long clientId) {
        this.commonAccount.setClientId(clientId);
        return this;
    }

    public Builder withEntrances(final List<BigDecimal> entrances) {
        this.commonAccount.setEntrances(entrances);
        return this;
    }

    public Builder withExits(final List<BigDecimal> exits) {
        this.commonAccount.setExits(exits);
        return this;
    }

    public Builder withCreditCardIds(final List<Long> creditCardIds) {
        this.commonAccount.setCreditCardIds(creditCardIds);
        return this;
    }

    public Builder withDebitCardId(final Long debitCardId) {
        this.commonAccount.setDebitCardId(debitCardId);
        return this;
    }

    public Builder withPassword(final String password) {
        this.commonAccount.setPassword(password);
        return this;
    }

    public Builder withStatus(final AccountStatus accountStatus) {
        this.commonAccount.setStatus(accountStatus);
        return this;
    }

    public CommonAccount build() {
        return this.commonAccount;
    }

}
