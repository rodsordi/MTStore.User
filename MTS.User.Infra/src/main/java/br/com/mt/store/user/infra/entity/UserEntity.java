package br.com.mt.store.user.infra.entity;

import br.com.mt.store.commons.infra.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity(name = "USER")
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String lastname;

    @Column
    private String username;

    @Column
    private Instant birthDate;

    @Column
    private String email;

    @Column
    private String document;

}
