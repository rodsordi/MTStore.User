package br.com.mt.store.user.domain.usecase.user.passwordreset;

import br.com.mt.store.user.domain.User;

import java.util.Optional;

public interface UserPasswordResetOutputPort {

    Optional<User> execute(User user);

}
