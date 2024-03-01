package org.example.configuration;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdaper;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
public class SpringSecurityOld // extends WebSecurityConfigurerAdapter
{
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("boss")
//                .password("pass")
//                .roles("ADMIN")
//                .and()
//                .withUser("subBoss")
//                .password("subPass")
//                .roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/users").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/guest").permitAll()
//                .antMatchers("/").permitAll()
//                .and().formLogin();
//
//    }
//
//    @Bean
//    public PasswordEncoder encoder() {return NoOpPasswordEncoder.getInstance();}
}
