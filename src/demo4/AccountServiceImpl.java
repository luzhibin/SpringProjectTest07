package demo4;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transferMoney(String from, String to, Double money) {


                accountDao.minusMiney(from,money);
              //  int i = 1/0;//在此处添加一个错误，让程序抛出异常，查看数据库的数据变化
                accountDao.addMoney(to,money);
            }


    }
