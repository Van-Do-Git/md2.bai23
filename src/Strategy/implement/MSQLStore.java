package Strategy.implement;

public class MSQLStore implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("MSQL save "+user.getName());
    }
}
