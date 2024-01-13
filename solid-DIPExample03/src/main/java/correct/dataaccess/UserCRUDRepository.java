package correct.dataaccess;

import shared.DB;
import shared.model.User;

import java.util.List;
import java.util.Optional;

public class UserCRUDRepository extends CRUDRepository {
    private final DB db = new DB();

    @Override
    public List<User> readAll() {
        return db.getDataUser();
    }

    @Override
    public Optional<User> read(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> read(long id) {
        return db.getDataUser()
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();
    }
    @Override
    public void create(User user) {
        db.getDataUser().add(user);
    }
    @Override
    public void update(User user) throws Exception {
        Optional<User> oldData = read(user.getId());
        if (!oldData.isEmpty()) {
            throw new Exception("not found!");
        }
        oldData.get().setName(user.getName());

    }

    @Override
    public void delete(long id) throws Exception {
        Optional<User> user = read(id);
        if (!user.isEmpty()) {
            throw new Exception("not found!");
        }
        db.getDataUser().remove(user.get());
    }


}
