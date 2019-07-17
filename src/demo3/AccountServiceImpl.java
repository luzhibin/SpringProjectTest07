package demo3;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transferMoney(String from, String to, Double money) {


                accountDao.minusMiney(from,money);
                int i = 1/0;
                accountDao.addMoney(to,money);
            }


    }
