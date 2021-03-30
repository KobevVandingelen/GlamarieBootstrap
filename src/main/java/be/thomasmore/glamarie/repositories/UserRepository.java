package be.thomasmore.glamarie.repositories;

import be.thomasmore.glamarie.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

     User findUserByUsername(String username);
}
