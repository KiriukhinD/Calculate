package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculateServis {
    public String helloCalculayter() {
        return "Добро пожаловать в калькулятор ";
    }

    public int plusCalculayter(int number1, int number2) {
        if (number1 == 0 || number2 == 0){
            throw new RuntimeException("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ А НЕ 0");
        }
        return number1 + number2;
    }

    public int minusCalculayter(int number1, int number2) {
        if (number1 == 0 || number2 == 0){
            throw new RuntimeException("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ А НЕ 0");
        }
        return number1 - number2;
    }

    public int multisCalculayter(int number1, int number2) {
        if (number1 == 0 || number2 == 0){
            throw new RuntimeException("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ А НЕ 0");
        }
        return number1 * number2;
    }

    public int dividesCalculayter(int number1, int number2) {
        if (number1 == 0 || number2 == 0){
            throw new RuntimeException("НУЖНО ВВЕСТИ ЗНАЧЕНИЕ А НЕ 0");
        }
            int sum = 0;
        if (number2 == 0) {
            throw new RuntimeException("ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ");
        } else {
            sum = number1 / number2;
        }
        return sum;

    }

}

