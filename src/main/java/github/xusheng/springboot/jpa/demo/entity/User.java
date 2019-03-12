package github.xusheng.springboot.jpa.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-03-12 13:53
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "user")
public class User {
    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private String sex;
    @Column(nullable = false)
    private String address;
}