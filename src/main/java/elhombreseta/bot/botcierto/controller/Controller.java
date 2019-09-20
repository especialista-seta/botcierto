package elhombreseta.bot.botcierto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bot")
public class Controller {

    @RequestMapping(value = "/botcierto", method = RequestMethod.GET)
    public String getBotciertos() {
        return "{botcierto}";
    }
}
