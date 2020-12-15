package ua.com.alevel.springdata;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Iehor Funtusov, created 15/12/2020 - 9:38 PM
 */

@Getter
@Setter
@ToString
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToOne
    private User user;
}
