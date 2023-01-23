import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LedgerServiceImpl implements LedgerService {

    Map<Long, BigDecimal> repository = new HashMap<> ();

    @Override
    public long createAccount() {
        Random random = new Random ();
        Long accountId = random.nextLong (99999999);
        repository.put (accountId, BigDecimal.ZERO);
        return accountId;
    }

    @Override
    public BigDecimal getBalance(long accountId) {
        return repository.get (accountId);
    }

    @Override
    public void addMoney(Long accountId, BigDecimal amount) {
        BigDecimal balance = repository.get (accountId);
        repository.put (accountId, balance.add (amount));
    }

    @Override
    public void transferFunds(long from, long to, BigDecimal amount) {
        BigDecimal balanceFrom = repository.get (from);
        BigDecimal balanceTo = repository.get (to);
        if (balanceFrom.compareTo (amount) < 0) {
            throw new RuntimeException ("Ќедостаточно средств дл€ проведени€ операции");
        }
        repository.put (from, balanceFrom.subtract (amount));
        repository.put (to, balanceTo.add (amount));
    }

}
