package com.wmdbank.app.domain.account;

import java.math.BigDecimal;
import java.util.List;

public interface Account {
    Long getId();
    Long getNumber();
    Long getDigit();
    Long getClientId();
    List<BigDecimal> getEntrances();
    List<BigDecimal> getExits();
    List<Long> getCreditCardIds();
    Long getDebitCardId();
    String getPassword();
    AccountStatus getStatus();
}
