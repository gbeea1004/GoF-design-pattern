package geon.hee.gofdesignpattern._06_adapter._02_after;

import geon.hee.gofdesignpattern._06_adapter._02_after.security.UserDetails;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountUserDetails implements UserDetails {

    private Account account;

    @Override
    public String getPassword() {
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        return account.getName();
    }
}
