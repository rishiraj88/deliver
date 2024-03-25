package de.deliver.data;

import de.deliver.entity.Pickup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Pickup, Integer> {

}
