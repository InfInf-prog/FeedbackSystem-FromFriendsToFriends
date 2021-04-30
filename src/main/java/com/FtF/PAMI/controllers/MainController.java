package com.FtF.PAMI.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("greeting", "Приветсвуем Вас в крутом приложении PAMI");
        return "main";
    }

}