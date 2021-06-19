package sda.store.onlinestore.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "USERS")
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;
}
