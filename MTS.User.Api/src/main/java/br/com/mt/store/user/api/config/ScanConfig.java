package br.com.mt.store.user.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "br.com.mt.store.commons.app.config",
        "br.com.mt.store.user.infra.outputadapter",
        "br.com.mt.store.user.infra.message"
})
public class ScanConfig {

}