package com.wmdbank.app.domain;

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

    protected CommonAccount() {}

    public CommonAccount(
            Long id,
            Long number,
            Long digit,
            Long clientId,
            List<BigDecimal> entrances,
            List<BigDecimal> exits,
            List<Long> creditCardIds,
            Long debitCardId,
            String password
    ) {
        this.id = id;
        this.number = number;
        this.digit = digit;
        this.clientId = clientId;
        this.entrances = entrances;
        this.exits = exits;
        this.creditCardIds = creditCardIds;
        this.debitCardId = debitCardId;
        this.password = password;
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

    protected void setId(Long id) {
        this.id = id;
    }

    protected void setNumber(Long number) {
        this.number = number;
    }

    protected void setDigit(Long digit) {
        this.digit = digit;
    }

    protected void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    protected void setEntrances(List<BigDecimal> entrances) {
        this.entrances = entrances;
    }

    protected void setExits(List<BigDecimal> exits) {
        this.exits = exits;
    }

    protected void setCreditCardIds(List<Long> creditCardIds) {
        this.creditCardIds = creditCardIds;
    }

    protected void setDebitCardId(Long debitCardId) {
        this.debitCardId = debitCardId;
    }

    protected void setPassword(String password) {
        this.password = password;
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

    public Builder withID(Long id) {
        this.commonAccount.setId(id);
        return this;
    }

    public Builder withNumber(Long number) {
        this.commonAccount.setNumber(number);
        return this;
    }

    public Builder withDigit(Long digit) {
        this.commonAccount.setDigit(digit);
        return this;
    }

    public Builder withClientId(Long clientId) {
        this.commonAccount.setClientId(clientId);
        return this;
    }

    public Builder withEntrances(List<BigDecimal> entrances) {
        this.commonAccount.setEntrances(entrances);
        return this;
    }

    public Builder withExits(List<BigDecimal> exits) {
        this.commonAccount.setExits(exits);
        return this;
    }

    public Builder withCreditCardIds(List<Long> creditCardIds) {
        this.commonAccount.setCreditCardIds(creditCardIds);
        return this;
    }

    public Builder withDebitCardId(Long debitCardId) {
        this.commonAccount.setDebitCardId(debitCardId);
        return this;
    }

    public Builder withPassword(String password) {
        this.commonAccount.setPassword(password);
        return this;
    }

    public CommonAccount build() {
        return this.commonAccount;
    }

}
