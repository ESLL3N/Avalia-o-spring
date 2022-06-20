package esllen.licurgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller

public class HomeController {
    @RequestMapping("/")
    public String numeros (Model model) {
    int[] resultado = new int[30];
    for(int i = 2;i <30;i++) {
        resultado[i] = (i);
    }
    model.addAttribute("numeros", resultado);
    return "/home/index";
}

}