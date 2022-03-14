package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("11111")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("manager") && password.equals("22222")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("33333")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
