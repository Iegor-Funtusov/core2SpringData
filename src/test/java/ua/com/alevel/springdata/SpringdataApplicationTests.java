package ua.com.alevel.springdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class SpringdataApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testUserFind() {
//        User user = userRepository.getOne(11);
//        user.setEmail("gdfs@gmail.com");
//        user.setUserName("gdfs@");
//        user = userRepository.save(user);

//        user.setUserName("gdfs");
//        userRepository.save(user);

//        userRepository.delete(user);

//        Page<User> users = userRepository
//                .findAll(PageRequest.of(2, 3, Sort.by("id").ascending()));
//
//
//
//        users.getContent().forEach(System.out::println);

//        User user = new User();
//        user.getUserName().length()

        List<User> users = userRepository.findByUserNameMoreThan(8);
        users.forEach(System.out::println);
    }
}
