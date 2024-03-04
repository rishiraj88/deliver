package de.deliver.ctrlr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1_0")
public class PickupController {
    @GetMapping("/pickup")
    public String doPickup() {
        // Select an 'item collection' out of 'display listings'.
        // Schedule a pickup (time and location).
        return "pickupScheduled";
    }



}
