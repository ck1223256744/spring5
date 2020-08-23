import dao.UserDaoMysqlImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Cat;
import pojo.Person;
import pojo.Student;
import pojo.User;
import service.UserServiceImpl;
import service.Userservice;

public class test {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void t(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserDaoMysqlImpl());
        service.func1();
    }

    @Test
    public void t2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userServiceImpl.func1();
    }

    @Test
    public void t3(){
        User user = (User) applicationContext.getBean("User");
        System.out.println(user);

    }

    @Test
    public void t4(){
        Person person = (Person) applicationContext.getBean("person");

        person.getDog().show();

    }


    @Test
    public void t5(){

        Student student = (Student) applicationContext.getBean("ck");

        System.out.println(student.name);
    }
}
