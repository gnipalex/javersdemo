package org.github.alex.hnyp.javersdemo;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.repository.sql.ConnectionProvider;
import org.javers.repository.sql.DialectName;
import org.javers.repository.sql.JaversSqlRepository;
import org.javers.repository.sql.SqlRepositoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

//    @Bean(destroyMethod = "close")
//    HikariDataSource dataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        config.setJdbcUrl("jdbc:mysql://localhost:23306/javers_documents");
//        config.setUsername("root");
//        config.setPassword("toor");
//        config.setMaximumPoolSize(5);
//        config.setMinimumIdle(2);
//        return new HikariDataSource(config);
//    }

//    @Bean
//    DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:33306/javers_documents");
//        dataSource.setUsername("root");
//        dataSource.setPassword("toor");
//        dataSource.setMaxWaitMillis(10_000);
//        dataSource.setMaxTotal(100);
//        return dataSource;
//    }
//
//    @Bean
//    ConnectionProvider connectionProvider(DataSource dataSource) {
//        return () -> {
//            return dataSource.getConnection();
//        };
//    }
//
//    @Bean
//    JaversSqlRepository javersSqlRepository(ConnectionProvider connectionProvider) {
//        return SqlRepositoryBuilder.sqlRepository()
//                .withDialect(DialectName.MYSQL)
//                .withConnectionProvider(connectionProvider)
//                .build();
//    }
//
//    @Bean
//    Javers javers(JaversSqlRepository repository) {
//        return JaversBuilder.javers().registerJaversRepository(repository).build();
//    }

}
