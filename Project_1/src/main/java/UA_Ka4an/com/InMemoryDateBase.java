package UA_Ka4an.com;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.Map;


public class InMemoryDateBase {
    User user = new User();
    Map<Integer, User> userDateBase = new HashMap<Integer, User>();
}


class PutUser  implements Test{//Клас которы ложит другой клас в базу данних
    @Autowired
 private InMemoryDateBase dataBase;
    User user;
  PutUser(InMemoryDateBase dataBase){
        this.dataBase = dataBase;
  }
    @Override
    public void execute() {//Метод который что то делает
        dataBase.userDateBase.put(1,user);

    }
}
class GetUser implements Test{// Клас который берет что то з базы банных
    @Autowired
    private InMemoryDateBase dataBase;
    User user;

    public GetUser(InMemoryDateBase dataBase) {
        this.dataBase = dataBase;
    }
    @Override
    public void execute() {
        dataBase.userDateBase.get(user);
    }
}
/*
Этот клас работает как Фасат и Делегат
 */
class PushAndGet implements Test{
    @Autowired
    private InMemoryDateBase dataBase;
    PutUser push = new PutUser(dataBase);
    GetUser get = new GetUser(dataBase);
    User user = new User();


    @Override
    public void execute() {
        push.execute();
        get.execute();
    }


}
