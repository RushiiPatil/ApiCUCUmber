package Resources;

import io.cucumber.java.Before;
import org.example.StepDefination.StepDefination;

public class Hooks {


    @Before("@DeletePlaceApi")
    public void beforeScenario() throws Exception {
        StepDefination step = new StepDefination();
        if (Util.place_id == null) {

            // 1. Create AddPlace payload
            step.add_place_payload_with("Sheet", "French", "Asia");

            // 2. Call AddPlace API
            step.user_called_with_post_http_request("AddPlaceAPI", "POST");

            // 3. Validate response has status 200
            step.the_api_call_is_successful_with_status_code(200);

            // 4. Ensure response is OK (this also updates Util.place_id inside StepDefination)
            step.in_response_body_is("status", "OK");
        }

    }
}
