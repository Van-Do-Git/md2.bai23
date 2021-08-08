package Strategy.implement;

public class Main {
    public static void main(String[] args) {
        User van = new User("Van File");
        UserController userController = new UserController();

        userController.setUserStorage(new MSQLStore());
        userController.store(van);

        userController.setUserStorage(new XMLStore());
        userController.store(van);
    }
}
