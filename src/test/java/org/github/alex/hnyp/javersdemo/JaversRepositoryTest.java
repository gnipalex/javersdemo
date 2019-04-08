package org.github.alex.hnyp.javersdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.github.alex.hnyp.javersdemo.model.Person;
import org.github.alex.hnyp.javersdemo.model.PersonEntity;
import org.javers.core.Javers;
import org.javers.repository.jql.QueryBuilder;
import org.javers.shadow.Shadow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JaversRepositoryTest {

    @Autowired
    private Javers javers;

    @Test
    public void shouldStoreEntityInRepository() {
        // given entity
        Person person = Person.builder().age(10).name("Anton").address("Nauki ave").build();
        PersonEntity entity = new PersonEntity("1", person);

        // when commit entity
        javers.commit("author", entity);

        // then entity is persisted
        List<Shadow<PersonEntity>> shadows = javers.findShadows(QueryBuilder.byInstanceId("1", PersonEntity.class).build());
        assertThat(shadows).isNotEmpty();
    }

}
