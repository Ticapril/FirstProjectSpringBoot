package com.GabrielOliveiraProgrammer.Project1.DAO;

import com.GabrielOliveiraProgrammer.Project1.MODEL.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao") //essa classe serve como repositório
public class FakePersonDataAcessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

}
