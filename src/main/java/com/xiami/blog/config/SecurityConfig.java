package com.xiami.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Spring Security 配置类.
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 自定义配置
     *
     * @param http
     * @throws Exception
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/js/**", "/css/**", "/fonts/**", "/index").permitAll(); // 都可以访问
//                .antMatchers("/admins/**").hasRole("ADMIN") // 需要相应的角色才能访问
//                .antMatchers("/user/**").hasRole("ADMIN") // 需要相应的角色才能访问
//                .and()
//                .formLogin() //基于 Form 表单登录验证
//                .loginPage("/login").failureUrl("/login-error"); // 自定义登录界面
    }


    /**
     * 认证信息管理
     *
     * @param auth
     * @throws Exception
     */
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("xiami").password("123").roles("ADMIN");
//    }
}
