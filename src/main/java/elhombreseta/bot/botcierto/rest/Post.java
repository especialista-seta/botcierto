package elhombreseta.bot.botcierto.rest;

import elhombreseta.bot.botcierto.model.Response;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Post {

    public void post(String message, Integer chatId) {
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Response> request = new HttpEntity<>(new Response(message, chatId));

        restTemplate.postForObject(
            "https://api.telegram.org/bot947427046:AAFfe_45SEIW6C4--ztf6rip8PaHcx1dpDc/sendMessage",
            request, String.class);
    }
}
