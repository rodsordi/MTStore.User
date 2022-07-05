package br.com.mt.store.user.domain.usecase.user.passwordreset;

import br.com.mt.store.user.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.Locale;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class UserPasswordResetInputPort<INPUT, OUTPUT> {

    protected final UserPasswordResetUseCase userPasswordResetUseCase;

    public Optional<OUTPUT> execute(INPUT input) {
        return execute(input, null);
    }

    public Optional<OUTPUT> execute(INPUT input, Locale locale) {
        return userPasswordResetUseCase.execute(convert(input))
                .map(email -> convert(email));
    }

    protected abstract User convert(INPUT dto);

    protected abstract OUTPUT convert(User user);

}
