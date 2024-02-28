package sudhir.authserver.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/*@RestController
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/")
    public String welcome(Principal principal){
        logger.info("User: {} loggedin", SecurityContextHolder.getContext().getAuthentication().getName());
        return "Welcome, "+principal.getName();
    }
}*/
