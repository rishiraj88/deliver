package de.deliver.ctrlr;

import de.deliver.data.PickupRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1_0/pickup")
public class PickupController {

    private final PickupRepository pickupRepository;

    public PickupController(final PickupRepository pickupRepository) {
        this.pickupRepository = pickupRepository;
    }

    /*
         fetch Order
         enrich Order
         pay
         dispatch
         notify
         */
    @GetMapping("/finish")
    public String doPickup() {
        // Select an 'item collection' out of 'display listings'.
        // Schedule a pickup (time and location).
        return "Pickup completed!";
    }
    @GetMapping("/time")
    public String schedulePickup() {
        // Select an 'item collection' out of 'display listings'.
        // Schedule a pickup (time and location).
        return "Pickup scheduled.";
    }




}
