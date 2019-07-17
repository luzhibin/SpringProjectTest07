package demo4;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

/*    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    @Override
    public void addMoney(String name, Double money) {
        this.getJdbcTemplate().update("update account set  money=money+? where name=?",money,name);
    }

    @Override
    public void minusMiney(String name, Double money) {
        this.getJdbcTemplate().update("update account set money=money-? where name =?",money,name);
    }
}
