package br.com.mt.store.user.infra.mapper;

import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.infra.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserEntityMapper {

    UserEntity convert(User user);

    User convert(UserEntity userEntity);

}
