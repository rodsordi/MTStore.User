package br.com.mt.store.user.infra.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreationDTO {
    private Long id;
    private String name;
    private String username;
}
