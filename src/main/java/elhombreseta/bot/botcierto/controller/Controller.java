package elhombreseta.bot.botcierto.controller;

import elhombreseta.bot.botcierto.model.Update;
import elhombreseta.bot.botcierto.rest.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bot")
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    private Post post;

    public Controller(Post post) {
        this.post = post;
    }

    @RequestMapping(value = "/botcierto", method = RequestMethod.GET)
    public String getBotciertos() {
        return "{botcierto}";
    }

    @RequestMapping(value = "/botcierto", method = RequestMethod.POST)
    public void postBotciertos(@RequestBody Update update) {
        logger.info("Update received : " + update);
        post.post(update.getMessage().getText(), update.getMessage().getChat().getId());
    }
}
