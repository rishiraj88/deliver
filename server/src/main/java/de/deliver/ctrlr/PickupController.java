package de.deliver.ctrlr;

import de.deliver.data.PickupRepository;
import de.deliver.entity.Item;
import de.deliver.entity.Pickup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1_0/pickup")
public class PickupController {
    private final PickupRepository pickupRepository;

    public PickupController(final PickupRepository pickupRepository) {
        this.pickupRepository = pickupRepository;
    }

    /*
        [1] fetch Order
        [2] enrich Order
        [3] pay
        [4] dispatch
        [5] notify
     */
    @GetMapping("/pickups")

    public String listPickups() {
        return "list";
    }

    @GetMapping("/time")
    public String schedulePickup(List<Item> items, String dateTime) {
        //[1] fetch Order
        // Select an 'item collection' out of 'display listings'.
        //Pickup pickup = new Pickup(items, Utils.stringToDatetime(dateTime));
        // Schedule a pickup (time and location).
        return "pickups";
    }
    @GetMapping("/finish")
    public String doPickup(Pickup pickup) {
        // Select a Pickup in whole. Partial pickups not supported currently.
        // Pick the products and/or get the sevices performed.
        // [4] dispatch
        pickup.setCompletedAt(ZonedDateTime.now());
        //return "{\"message\":\"Pickup completed!\"}";
        return "list";
    }


}
