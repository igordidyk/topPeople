package cz.people.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories("cz.people.dao")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class DataConfig {
    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("db.driver.class.name"));
//        dataSource.setUrl(env.getProperty("db.url"));
//        dataSource.setUsername(env.getProperty("db.user"));
//        dataSource.setPassword(env.getProperty("db.password"));
//



        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(env.getProperty("db.driver.class.name"));
        hikariConfig.setJdbcUrl(env.getProperty("db.url"));
        hikariConfig.setUsername(env.getProperty("db.user"));
        hikariConfig.setPassword(env.getProperty("db.password"));

        hikariConfig.setMaximumPoolSize(5);
        hikariConfig.setPoolName(env.getProperty("db.poolName"));

        hikariConfig.addDataSourceProperty(env.getProperty("db.cachePrepStmts"), "db.cachePrepStmts.val");
        hikariConfig.addDataSourceProperty(env.getProperty("db.prepStmtCacheSize"), env.getProperty("db.prepStmtCacheSize.val"));
        hikariConfig.addDataSourceProperty(env.getProperty("db.prepStmtCacheSqlLimit"), env.getProperty("db.prepStmtCacheSqlLimit.val"));
        hikariConfig.addDataSourceProperty(env.getProperty("db.useServerPrepStmts"), env.getProperty("db.useServerPrepStmts.val"));

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource;
    }
    @Bean
    public JpaVendorAdapter vendorAdapter() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setShowSql(true);
        return vendorAdapter;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource());
        factory.setJpaVendorAdapter(vendorAdapter());
        factory.setPackagesToScan(env.getProperty("db.factory.packageToScan"));
        Properties properties = new Properties();
        properties.setProperty(env.getProperty("db.hbm2ddl"), env.getProperty("db.hbm2ddl.val"));

        factory.setJpaProperties(properties);
        return factory;
    }
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }

}
