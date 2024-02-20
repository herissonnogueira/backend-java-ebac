/**
 * 
 */
package br.com.herissonnogueira.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author herisson.nogueira
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.herissonnogueira.vendas.online.repository")
public class MongoConfig {

}
