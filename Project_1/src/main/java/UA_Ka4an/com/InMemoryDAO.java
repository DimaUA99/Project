package UA_Ka4an.com;

public class InMemoryDAO implements UserDAO {
    public User user = new User();
    @Override
    public boolean validateUser(String l, String p) {
        if (l != user.getLogin()& p !=user.getPassword()){
            System.out.println("Ты сука ввел не правельны пароль (пошол нах)Админ:) !!!!");
            return false;
        }
        return true;
    }

}
