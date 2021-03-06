package br.com.mt.store.user.infra.outputadapter;

import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.domain.usecase.user.creation.UserCreationOutputPort;
import br.com.mt.store.user.infra.mapper.UserCreationDTOMapper;
import br.com.mt.store.user.infra.mapper.UserEntityMapper;
import br.com.mt.store.user.infra.message.UserMessage;
import br.com.mt.store.user.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserCreationOutputAdapter implements UserCreationOutputPort {
    private static final UserEntityMapper userEntityMapper = Mappers.getMapper(UserEntityMapper.class);
    private static final UserCreationDTOMapper userCreationDTOMapper = Mappers.getMapper(UserCreationDTOMapper.class);

    private final UserRepository userRepository;

    private final UserMessage userMessage;

    @Override
    public Optional<User> execute(User user) {
        var userEntity = userRepository.save(userEntityMapper.convert(user));
        user = userEntityMapper.convert(userEntity);
        userMessage.sendCreation(userCreationDTOMapper.convert(user));
        return Optional.of(user);
    }

}
