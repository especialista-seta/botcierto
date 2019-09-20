package elhombreseta.bot.botcierto.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/botcierto")
    public String getBotciertos() {
        return "botcierto";
    }
}
