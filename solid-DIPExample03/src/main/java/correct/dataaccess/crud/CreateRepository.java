package correct.dataaccess.crud;

import shared.model.Entity;

public interface CreateRepository <T extends Entity>{
    void create(T data);
}
