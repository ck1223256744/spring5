package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ck")
public class Student {

    @Value("ckckckiuiuiu")
    public String name;

}
