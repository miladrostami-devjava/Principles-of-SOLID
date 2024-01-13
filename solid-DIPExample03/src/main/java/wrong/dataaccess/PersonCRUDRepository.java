package wrong.dataaccess;

import shared.DB;
import shared.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonCRUDRepository {
    private final DB db = new DB();

    public List<Person> readAll() {
        return db.getDataPerson();
    }

    public Optional<Person> read(long id) {
        return db.getDataPerson()
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();
    }

    public void create(Person person) {
        db.getDataPerson().add(person);
    }

    public void update(Person person) throws Exception {
        Optional<Person> oldData = read(person.getId());
        if (!oldData.isEmpty()) {
            throw new Exception("not found!");
        }
        oldData.get().setName(person.getName());

    }

    public void delete(long id) throws Exception {
        Optional<Person> person = read(id);
        if (!person.isEmpty()) {
            throw new Exception("not found!");
        }
        db.getDataPerson().remove(person.get());

    }


}
