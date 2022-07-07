package br.com.mt.store.user.api.mapper;

import br.com.mt.store.user.api.dto.UserDTO;
import br.com.mt.store.user.domain.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserDTOMapper {

    User convert(UserDTO.Request request);

    UserDTO.Response convert(User user);

}
