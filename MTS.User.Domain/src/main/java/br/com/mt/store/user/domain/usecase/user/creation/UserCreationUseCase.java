package br.com.mt.store.user.domain.usecase.user.creation;

import br.com.mt.store.user.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserCreationUseCase {
    private final UserCreationOutputPort createUserOutputPort;

    public Optional<User> execute(User user) {
        return createUserOutputPort.execute(user);
    }

}
