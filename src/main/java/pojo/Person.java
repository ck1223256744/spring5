package pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
public class Person {
    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;


    private String str;
}



