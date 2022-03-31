package geon.hee.gofdesignpattern._06_adapter._01_before;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword("123");
        account.setEmail("test@com");
        return account;
    }
}
