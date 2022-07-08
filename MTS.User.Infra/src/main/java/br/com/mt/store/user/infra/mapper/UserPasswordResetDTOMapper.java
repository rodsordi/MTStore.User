package br.com.mt.store.user.infra.mapper;

import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.infra.dto.UserPasswordResetDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserPasswordResetDTOMapper {

    User convert(UserPasswordResetDTO userPasswordResetDTO);

    UserPasswordResetDTO convert(User user);

}
