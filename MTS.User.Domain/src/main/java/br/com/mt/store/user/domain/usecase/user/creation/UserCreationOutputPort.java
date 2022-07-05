package br.com.mt.store.user.domain.usecase.user.creation;

import br.com.mt.store.user.domain.User;

import java.util.Optional;

public interface UserCreationOutputPort {

    Optional<User> execute(User user);

}
