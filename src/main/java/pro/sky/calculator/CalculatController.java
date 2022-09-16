package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class CalculatController {
@GetMapping
public String helloCalculayter(){
    return "hello ";
}


    @GetMapping(path = "/hello")
    public String answerCalculayter(@RequestParam("name")String userName ){
        return "hello" + userName;
    }

}
