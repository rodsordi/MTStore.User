package br.com.mt.store.user.infra.outputadapter;

import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.domain.usecase.user.creation.UserCreationOutputPort;
import br.com.mt.store.user.infra.mapper.UserEntityMapper;
import br.com.mt.store.user.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserCreationOutputAdapter implements UserCreationOutputPort {
    private final UserEntityMapper mapper = Mappers.getMapper(UserEntityMapper.class);

    private final UserRepository userRepository;

    @Override
    public Optional<User> execute(User user) {
        var savedEmail = userRepository.save(mapper.convert(user));
        return Optional.of(mapper.convert(savedEmail));
    }

}
