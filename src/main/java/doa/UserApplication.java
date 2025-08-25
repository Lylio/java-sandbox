package doa;

import java.util.List;
import java.util.Optional;

public class UserApplication {

    private static doa.Dao<doa.User> userDao;

    public static void main(String[] args) {
        userDao = new doa.Dao<doa.User>() {
            @Override
            public Optional<doa.User> get(long id) {
                return Optional.empty();
            }

            @Override
            public List<doa.User> getAll() {
                return List.of();
            }

            @Override
            public void save(doa.User user) {

            }

            @Override
            public void update(doa.User user, String[] params) {

            }

            @Override
            public void delete(doa.User user) {

            }
        };
        doa.User user1 = getUser(0);
        System.out.println(user1);
        userDao.update(user1, new String[]{"Jake", "jake@domain.com"});

        doa.User user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new doa.User("Julie", "julie@domain.com"));

        userDao.getAll().forEach(user -> System.out.println(user.getName()));
    }

    private static doa.User getUser(long id) {
        Optional<doa.User> user = userDao.get(id);

        return user.orElseGet(
                () -> new doa.User("non-existing user", "no-email"));
    }
}

