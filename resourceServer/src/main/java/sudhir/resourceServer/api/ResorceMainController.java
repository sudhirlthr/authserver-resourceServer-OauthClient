package sudhir.resourceServer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sudhir.resourceServer.service.GreetingService;

import java.util.Map;

@RestController
public class ResorceMainController {
    private final GreetingService greetingService;

    public ResorceMainController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public Map<String, String> greet(){
        return greetingService.greet();
    }
}
