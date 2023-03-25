package netologiya.hibernateorm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Nikolashka")
                .password("{noop}Nikolashka")
                .authorities("READ");
        auth.inMemoryAuthentication()
                .withUser("Matvey")
                .password("{noop}Matvey")
                .authorities("WRITE", "READ");
        auth.inMemoryAuthentication()
                .withUser("Fedor")
                .password("{noop}Fedor")
                .authorities("WRITE");
    }

    @Override
//    @Autowired
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().and()
                .authorizeRequests()
                .antMatchers("/persons/by-city").hasAuthority("READ")
                .and()
                .authorizeRequests()
                .antMatchers("persons/by-age-less-that").hasAuthority("WRITE")
                .and()
                .authorizeRequests().anyRequest().authenticated();
//        super.configure(http);
    }
}
