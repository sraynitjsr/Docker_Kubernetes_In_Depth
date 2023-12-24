import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KeycloakDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(KeycloakDemoApplication.class, args);
    }
}

@RestController
class DemoController {
    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint!";
    }
    @GetMapping("/secured")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String securedEndpoint() {
        return "This is a secured endpoint!";
    }
}
