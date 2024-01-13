package correct.dataaccess;


import shared.DB;
import shared.model.Person;
import shared.model.User;

import java.util.List;
import java.util.Optional;

public abstract class PersonCRUDRepository extends CRUDRepository<Person> {
    @Override
    public void create(User user) {

    }

    @Override
    public void update(User user) throws Exception {

    }
   /* private final DB db = new DB();

    public List<Person> readAll() {
        return db.getDataPerson();
    }

    @Override
    public Optional<Person> read(Long id) {
        return db.getDataPerson()
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<User> read(long id) {
        return Optional.empty();
    }


    public void create(Person person) {
        db.getDataPerson().add(person);
    }

    public void update(Person person) throws Exception {
        Optional<User> oldData = read(person.getId());
        if (!oldData.isEmpty()) {
            throw new Exception("not found!");
        }
        oldData.get().setName(person.getName());

    }


    @Override
    public void create(User user) {

    }

    @Override
    public void update(User user) throws Exception {

    }

    @Override
    public void delete(long id) throws Exception {

    }*/
}
