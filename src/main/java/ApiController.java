import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final String API_URL = "https://opentdb.com/api.php?amount=1";

    @GetMapping("/trivia")
    public ApiResponse getTrivia() {
        RestTemplate restTemplate = new RestTemplate();
        ApiResponse response = restTemplate.getForObject(API_URL, ApiResponse.class);
        return response;
    }
}