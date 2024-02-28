package sudhir.authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class CustomUserDetailsManager {

    @Bean
    InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        UserDetails userDetails = User.withDefaultPasswordEncoder().roles("admin", "user").password("admin").username("admin").build();
        UserDetails userDetails2 = User.withDefaultPasswordEncoder().roles("user").password("user").username("user").build();
        return new InMemoryUserDetailsManager(userDetails, userDetails2);


    }
}
