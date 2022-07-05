package br.com.mt.store.user.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories("br.com.mt.store.user.infra.repository")
@EntityScan("br.com.mt.store.user.infra.entity")
public class PersistenceConfig {

}