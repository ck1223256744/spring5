package proxyexe.service;

import lombok.Setter;

@Setter
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    private void log(String msg) {
        System.out.println("do " + msg);
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("update");
        userService.query();
    }
}
