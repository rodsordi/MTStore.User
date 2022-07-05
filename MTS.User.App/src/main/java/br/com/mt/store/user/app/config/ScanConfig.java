package br.com.mt.store.user.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "br.com.mt.store.commons.app.config",
        "br.com.mt.store.user.infra.outputadapter"
})
public class ScanConfig {

}