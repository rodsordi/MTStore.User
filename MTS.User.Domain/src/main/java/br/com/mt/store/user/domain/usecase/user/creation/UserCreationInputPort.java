package br.com.mt.store.user.domain.usecase.user.creation;

import br.com.mt.store.user.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.Locale;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class UserCreationInputPort<INPUT, OUTPUT> {

    protected final UserCreationUseCase userCreationUseCase;

    public Optional<OUTPUT> execute(INPUT input) {
        return execute(input, null);
    }

    public Optional<OUTPUT> execute(INPUT input, Locale locale) {
        return userCreationUseCase.execute(convert(input))
                .map(user -> convert(user));
    }

    protected abstract User convert(INPUT dto);

    protected abstract OUTPUT convert(User user);

}
