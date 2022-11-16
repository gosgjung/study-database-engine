CREATE INDEX index_soccer_player_test1__email ON soccer_player_test1 (email);

-- e.g.1
EXPLAIN
SELECT *
FROM soccer_player_test1
WHERE email = 'player-1@gmail.com';

-- e.g.2
EXPLAIN
SELECT email
FROM soccer_player_test1
WHERE email = 'player-1@gmail.com';

-- 이번에는 인덱스를 email, id, age 순서의 인덱스를 추가해준다.
CREATE INDEX index_soccer_player_test1__email_id_age ON soccer_player_test1(email, id, age);
-- e.g.3-1
EXPLAIN
SELECT *
FROM soccer_player_test1
WHERE email LIKE 'player-1@%'
GROUP BY id, age;

-- e.g.3-2
EXPLAIN
SELECT email, id, age
FROM soccer_player_test1
WHERE email LIKE 'player-1%'
GROUP BY id, age;

-- e.g.5
EXPLAIN
SELECT *
FROM soccer_player_test1
WHERE email = 'player-1@gmail.com'
GROUP BY id, age;


EXPLAIN
SELECT *
FROM soccer_player_test1
WHERE email like 'player-1%'
GROUP BY id, age;

-- 인덱스 지우고 테스트할 때 사용
DROP INDEX index_soccer_player_test1__email_id_age ON soccer_player_test1;

EXPLAIN
SELECT *
FROM soccer_player_test1
WHERE email like 'player-1%'
GROUP BY id, age;