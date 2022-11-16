package io.study.database.mysql_study.soccer_player_test1;

import io.study.database.mysql_study.soccer_player_test1.domain.SoccerPlayerTest1;
import io.study.database.mysql_study.soccer_player_test1.repository.SoccerPlayerTest1Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SoccerPlayerTest1BulkInsert {

    @Autowired
    private SoccerPlayerTest1Repository repository;

    @Test
    public void 데이터_10만개_insert(){
        List<SoccerPlayerTest1> list = new ArrayList<>();
        LocalDateTime baseTime = LocalDateTime.of(LocalDate.of(2022,11,11), LocalTime.of(11,0,0));

        for(int i=0; i<10_0000; i++){
            list.add(
                    new SoccerPlayerTest1(
                            Long.valueOf(String.valueOf(i)), new StringBuilder("PLAYER-").append(String.valueOf(i)).toString(),
                            i+1, new StringBuilder("player").append(String.valueOf(i)).append("@spring.io").toString(),
                            baseTime.plusSeconds(i+1)
                    )
            );
        }
        repository.saveAllAndFlush(list);
    }
}
