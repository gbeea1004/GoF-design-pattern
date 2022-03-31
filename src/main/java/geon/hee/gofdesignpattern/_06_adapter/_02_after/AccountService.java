package geon.hee.gofdesignpattern._06_adapter._02_after;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword("1234");
        account.setEmail("test@com");
        return account;
    }
}
