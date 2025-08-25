package doa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements doa.Dao<doa.User> {

    private List<doa.User> users = new ArrayList<>();

    public UserDao() {
        users.add(new doa.User("Sammy Alice", "s.alice@mail.com00"));
        users.add(new doa.User("Alice Black", "blackstar@hotmail.com"));
    }

    @Override
    public Optional<doa.User> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<doa.User> getAll() {
        return users;
    }

    @Override
    public void save(doa.User user) {
        users.add(user);
    }

    @Override
    public void update(doa.User user, String[] params) {
        user.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        users.add(user);

    }

    @Override
    public void delete(doa.User user) {
        users.remove(user);
    }
}

