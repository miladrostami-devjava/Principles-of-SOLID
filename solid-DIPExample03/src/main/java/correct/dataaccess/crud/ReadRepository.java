package correct.dataaccess.crud;

import shared.model.Entity;
import shared.model.Person;
import shared.model.User;

import java.util.List;
import java.util.Optional;

public interface ReadRepository<T extends Entity>{
    List<T> readAll();
    Optional<T> read(Long id);

    Optional<User> read(long id);
}
