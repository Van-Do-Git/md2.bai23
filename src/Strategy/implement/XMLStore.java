package Strategy.implement;

public class XMLStore implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("XML save " +user.getName());
    }
}
