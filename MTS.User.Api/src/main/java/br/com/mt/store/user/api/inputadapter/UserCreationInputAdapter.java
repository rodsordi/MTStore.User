package br.com.mt.store.user.api.inputadapter;

import br.com.mt.store.user.api.dto.UserDTO;
import br.com.mt.store.user.api.mapper.UserDTOMapper;
import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.domain.usecase.user.creation.UserCreationInputPort;
import br.com.mt.store.user.domain.usecase.user.creation.UserCreationUseCase;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class UserCreationInputAdapter extends UserCreationInputPort<UserDTO.Request, UserDTO.Response> {
    private final UserDTOMapper mapper = Mappers.getMapper(UserDTOMapper.class);

    public UserCreationInputAdapter(UserCreationUseCase userCreationUseCase) {
        super(userCreationUseCase);
    }

    @Override
    protected User convert(UserDTO.Request dto) {
        return mapper.convert(dto);
    }

    @Override
    protected UserDTO.Response convert(User user) {
        return mapper.convert(user);
    }

}
