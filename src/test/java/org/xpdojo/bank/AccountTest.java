package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void canOpenAnAccountWithABalance() {
        final int openingBalance = 10;
        final Account account = Account.withBalance(openingBalance);

        assertThat(account.hasBalance(openingBalance)).isTrue();
    }

    @Test
    public void canDepositAnAmount() {
        final int openingBalance = 10;
        final int depositAmount = 20;

        final Account account = Account.withBalance(openingBalance);
        account.deposit(depositAmount);

        assertThat(account.hasBalance(openingBalance + depositAmount)).isTrue();
    }

    @Test
    public void canGetAReportOfActivity() {
        final int openingBalance = 10;
        final int depositAmount = 20;

        final Account account = Account.withBalance(openingBalance);
        account.deposit(depositAmount);

        final String actual = account.reportActivity();
        assertThat(actual).contains("10", "20");
    }

}
