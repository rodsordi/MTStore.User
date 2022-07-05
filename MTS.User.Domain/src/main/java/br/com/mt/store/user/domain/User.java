package br.com.mt.store.user.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private String username;
    private String password;
    private String name;
    private String email;

}
