package otavioms.med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotação necessário para ser considerada uma classe controller
@RestController
//Anotação usada para maperar o caminho de URL para o controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String olaMundo() {
        return "Hello, World Spring!";
    }

}
