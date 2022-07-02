package day_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    @Test
    @DisplayName("Deposit into account")
    void deposit(){

        BankAccount acc = new BankAccount(250.00);
        assertAll(
                () -> assertEquals(500.00, acc.deposit(250.00)),
                () -> assertEquals(500.00, acc.deposit(6000.00))
        );
    }

    @Test
    @DisplayName("Withdraw from account")
    void withdraw(){
        BankAccount acc = new BankAccount(250.00);
        assertAll(
                () -> assertEquals(200.00, acc.withdraw(50)),
                () -> assertEquals(200.00, acc.withdraw(300.00))
        );
    }
}