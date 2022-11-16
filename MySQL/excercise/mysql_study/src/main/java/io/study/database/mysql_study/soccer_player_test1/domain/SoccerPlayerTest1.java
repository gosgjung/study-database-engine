package io.study.database.mysql_study.soccer_player_test1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class SoccerPlayerTest1 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private LocalDateTime registeredAt;

    public SoccerPlayerTest1(){}

    public SoccerPlayerTest1(Long id, String name, Integer age, String email, LocalDateTime registeredAt){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.registeredAt = registeredAt;
    }
}
