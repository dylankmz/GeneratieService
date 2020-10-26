package be.ehb.generatieservice.dao;

import be.ehb.generatieservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {
}
