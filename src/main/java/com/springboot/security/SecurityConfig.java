//package com.springboot.security;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//import com.springboot.repository.UsersRepository;
//import com.springboot.service.CustomUserDetailsService;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableJpaRepositories(basePackageClasses = UsersRepository.class)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	  @Autowired
//	    private CustomUserDetailsService userDetailsService;
//
//	    @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//	        auth.userDetailsService(userDetailsService)
//	        .passwordEncoder(getPasswordEncoder());
//	    }
//
//
//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//
//	        http.csrf().disable();
//	        http.authorizeRequests()
//	                .antMatchers("**/secured/**").authenticated()
//	                .anyRequest().permitAll()
//	                .and()
//	                .formLogin().permitAll();
//	    }
//
//	    private PasswordEncoder getPasswordEncoder() {
//	        return new PasswordEncoder() {
//	            @Override
//	            public String encode(CharSequence charSequence) {
//	                return charSequence.toString();
//	            }
//
//	            @Override
//	            public boolean matches(CharSequence charSequence, String s) {
//	                return true;
//	            }
//	        };
//	    }
////    @Autowired
////    DataSource dataSource;
////
////    @Autowired
////    
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
////    }
////    
////    
////    
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////
////        http.authorizeRequests().anyRequest().permitAll()        
////        .antMatchers("/personList")
////            .hasRole("ADMIN")
////        .antMatchers("/index")
////            .hasRole("CUSTOMER")
////        .and()
////            .formLogin()
////            .loginPage("/login.html")
////            .defaultSuccessUrl("/personList")
////            .failureUrl("/login?error=true")
////            .permitAll()
////        .and()
////            .logout()
////            .logoutSuccessUrl("/login?logout=true")
////            .invalidateHttpSession(true)
////            .permitAll()
////        .and()
////            .csrf()
////            .disable();
////   
//// 
////    }
//    
//}
//	
//////    @Bean
//////    public BCryptPasswordEncoder passwordEncoder() {
//////        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//////        return bCryptPasswordEncoder;
//////    }
////    @Bean
////    public PersistentTokenRepository persistentTokenRepository() {
////    InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl();
////    return memory;
////}
////
////}