/*package com.zensar.im.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;*/
/*import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;*/
//
/*@EnableWebSecurity*/
/*
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    */
/*@Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication()
               .withUser("Arikaran")
               .password(getPasswordEncoder().encode("Ari123"))
               .roles("USER").and()
               .withUser("Ari")
               .password(getPasswordEncoder().encode("Ari123")).roles("ADMIN");

    }

@Bean
   public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
   }

    @Override
   public void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
               .antMatchers("/interview").permitAll();
    }*//*

}
*/
