package wrong.dataaccess;

import shared.DB;
import shared.model.User;

import java.util.List;
import java.util.Optional;

public class UserCRUDRepository {
    private final DB db = new DB();

    public List<User> readAll() {
        return db.getDataUser();
    }

    public Optional<User> read(long id) {
        return db.getDataUser()
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();
    }

    public void create(User user) {
        db.getDataUser().add(user);
    }

    public void update(User user) throws Exception {
        Optional<User> oldData = read(user.getId());
        if (!oldData.isEmpty()) {
            throw new Exception("not found!");
        }
        oldData.get().setName(user.getName());

    }

    public void delete(long id) throws Exception {
        Optional<User> user = read(id);
        if (!user.isEmpty()) {
            throw new Exception("not found!");
        }
        db.getDataUser().remove(user.get());

    }


}
