package de.deliver.ctrlr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1_0")
public class PickupController {
    @GetMapping("/pickup")
    public String doPickup() {
        return "pickupScheduled";
    }



}
