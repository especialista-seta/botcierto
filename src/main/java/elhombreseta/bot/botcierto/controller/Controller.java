package elhombreseta.bot.botcierto.controller;

import elhombreseta.bot.botcierto.model.Update;
import elhombreseta.bot.botcierto.rest.Post;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bot")
public class Controller {

    private Post post;

    public Controller(Post post) {
        this.post = post;
    }

    @RequestMapping(value = "/botcierto", method = RequestMethod.GET)
    public String getBotciertos() {
        return "{botcierto}";
    }

    @RequestMapping(value = "/botcierto", method = RequestMethod.POST)
    public String postBotciertos(@RequestBody Update update) {
        String editedMessage =
            update.getMessage().getText().contains("/botcierto") ? update.getMessage().getText()
                .replace("/botcierto", "") : update.getMessage().getText();
        post.post(editedMessage, update.getMessage().getChat().getId());
        return "{botcierto}";
    }
}
