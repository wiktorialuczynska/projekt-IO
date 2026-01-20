package org.example.wika1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Test1 {

    private final List<Person> people = List.of(
            new Person("Anna", "Kowalska", 21),
            new Person("Jan", "Nowak", 23),
            new Person("Kasia", "Wiśniewska", 22)
    );
    @GetMapping("/people")
    public List<Person> getPeople() {
        return people;
    }
    @GetMapping("/hello")
    public String hello() {
        return "Przykładowy Endpoint";
    }
}
