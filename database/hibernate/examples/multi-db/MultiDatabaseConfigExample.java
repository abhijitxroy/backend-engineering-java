package database.hibernate.examples.multidb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import jakarta.persistence.EntityManagerFactory;
import java.util.HashMap;

public class MultiDatabaseConfigExample {

    public static void main(String[] args) {

        System.out.println(
                "Multi Database Configuration Example"
        );

        System.out.println(
                "Primary DB + Audit DB"
        );

    }

}

@Configuration
@EnableJpaRepositories(
        basePackages =
                "database.primary.repository",
        entityManagerFactoryRef =
                "primaryEntityManager",
        transactionManagerRef =
                "primaryTransactionManager"
)
@EntityScan(
        basePackages =
                "database.primary.entity"
)
class PrimaryDatabaseConfig {

    @Bean
    @ConfigurationProperties(
            prefix =
                    "spring.datasource.primary"
    )
    DataSource primaryDataSource() {

        return DataSourceBuilder

                .create()

                .build();
    }

    @Bean
    LocalContainerEntityManagerFactoryBean
    primaryEntityManager(

            @Qualifier(
                    "primaryDataSource"
            )
            DataSource dataSource

    ) {

        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();

        factory.setDataSource(dataSource);

        factory.setPackagesToScan(
                "database.primary.entity"
        );

        factory.setJpaVendorAdapter(
                new HibernateJpaVendorAdapter()
        );

        factory.setJpaPropertyMap(
                new HashMap<>()
        );

        return factory;
    }

    @Bean
    JpaTransactionManager
    primaryTransactionManager(

            @Qualifier(
                    "primaryEntityManager"
            )
            EntityManagerFactory entityManagerFactory

    ) {

        return new JpaTransactionManager(
                entityManagerFactory
        );
    }

}

@Configuration
@EnableJpaRepositories(
        basePackages =
                "database.audit.repository",
        entityManagerFactoryRef =
                "auditEntityManager",
        transactionManagerRef =
                "auditTransactionManager"
)
@EntityScan(
        basePackages =
                "database.audit.entity"
)
class AuditDatabaseConfig {

    @Bean
    @ConfigurationProperties(
            prefix =
                    "spring.datasource.audit"
    )
    DataSource auditDataSource() {

        return DataSourceBuilder

                .create()

                .build();
    }

    @Bean
    LocalContainerEntityManagerFactoryBean
    auditEntityManager(

            @Qualifier(
                    "auditDataSource"
            )
            DataSource dataSource

    ) {

        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();

        factory.setDataSource(dataSource);

        factory.setPackagesToScan(
                "database.audit.entity"
        );

        factory.setJpaVendorAdapter(
                new HibernateJpaVendorAdapter()
        );

        return factory;
    }

    @Bean
    JpaTransactionManager
    auditTransactionManager(

            @Qualifier(
                    "auditEntityManager"
            )
            EntityManagerFactory entityManagerFactory

    ) {

        return new JpaTransactionManager(
                entityManagerFactory
        );
    }

}

