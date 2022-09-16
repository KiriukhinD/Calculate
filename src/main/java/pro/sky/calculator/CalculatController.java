package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class CalculatController {
  private  final CalculateServis calculateServis;

  CalculatController(CalculateServis calculateServis){
      this.calculateServis = calculateServis;
  }


@GetMapping
public String helloCalculayter(){
    return calculateServis.helloCalculayter();
}
    @GetMapping(path = "/calculator/plus")
    public int plusCalculayter(@RequestParam("name1")int number1,@RequestParam("name2")int number2 ){
        return calculateServis.plusCalculayter(number1,number2);
    }
    @GetMapping(path = "/calculator/minus")
    public int minusCalculayter(@RequestParam("name1")int number1,@RequestParam("name2")int number2 ){
        return calculateServis.minusCalculayter(number1,number2);
    }
    @GetMapping(path = "/calculator/multi")
    public int multiCalculayter(@RequestParam("name1")int number1,@RequestParam("name2")int number2 ){
        return calculateServis.multisCalculayter(number1,number2);
    }
    @GetMapping(path = "/calculator/divide")
    public int divideCalculayter(@RequestParam("name1")int number1,@RequestParam("name2")int number2 ){
        return calculateServis.dividesCalculayter(number1,number2);
    }

}
