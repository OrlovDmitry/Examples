import java.math.BigDecimal;

public interface LedgerService {

    long createAccount();

    BigDecimal getBalance (long accountId);

    void addMoney (Long accountId, BigDecimal amount);

    void transferFunds(long from, long to, BigDecimal amount);


}

