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



}
