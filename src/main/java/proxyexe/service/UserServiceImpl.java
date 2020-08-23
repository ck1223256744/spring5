package proxyexe.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add one");
    }

    @Override
    public void delete() {
        System.out.println("delete one");
    }

    @Override
    public void update() {
        System.out.println("update one");
    }

    @Override
    public void query() {
        System.out.println("query one");
    }
}
