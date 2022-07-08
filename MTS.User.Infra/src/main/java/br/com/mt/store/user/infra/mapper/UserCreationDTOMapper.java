package br.com.mt.store.user.infra.mapper;

import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.infra.dto.UserCreationDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserCreationDTOMapper {

    UserCreationDTO convert(User user);

    User convert(UserCreationDTO userCreationDTO);

}
