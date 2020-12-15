package ua.com.alevel.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Iehor Funtusov, created 15/12/2020 - 9:17 PM
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByEmailContaining(String email);

    @Query(value = "select u from User u where length(u.userName) <= :size")
    List<User> findByUserNameMoreThan(@Param("size") Integer size);
}
