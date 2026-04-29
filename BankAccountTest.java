import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Imed", 1000.0);
    }

    @Test
    void deposit_should_work() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void withdraw_should_work() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void withdraw_too_much_should_fail() {
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(9999.0);
        });
    }
    
}
