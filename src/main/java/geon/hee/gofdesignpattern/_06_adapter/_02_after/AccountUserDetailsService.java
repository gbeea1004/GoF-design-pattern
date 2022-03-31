package geon.hee.gofdesignpattern._06_adapter._02_after;

import geon.hee.gofdesignpattern._06_adapter._02_after.security.UserDetails;
import geon.hee.gofdesignpattern._06_adapter._02_after.security.UserDetailsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
