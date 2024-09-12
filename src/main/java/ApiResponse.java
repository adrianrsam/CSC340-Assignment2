// ApiResponse.java
import java.util.List;

public class ApiResponse {
    private int response_code;
    private List<Question> results;

    // Getters and Setters
    public int getResponseCode() {
        return response_code;
    }

    public void setResponseCode(int response_code) {
        this.response_code = response_code;
    }

    public List<Question> getResults() {
        return results;
    }

    public void setResults(List<Question> results) {
        this.results = results;
    }
}