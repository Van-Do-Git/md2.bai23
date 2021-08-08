package Strategy.implement;

public class UserController implements UserStorage {
    UserStorage userStorage;

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public void store(User user) {
        userStorage.store(user);
    }
}
