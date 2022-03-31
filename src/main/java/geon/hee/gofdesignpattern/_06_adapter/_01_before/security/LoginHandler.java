package geon.hee.gofdesignpattern._06_adapter._01_before.security;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginHandler {

    private UserDetailsService userDetailsService;

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        }
        throw new IllegalArgumentException();
    }
}
