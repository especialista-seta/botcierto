package elhombreseta.bot.botcierto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Chat {

    private final Integer id;

    public Chat(@JsonProperty("id") Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
