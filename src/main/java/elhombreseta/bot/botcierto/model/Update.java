package elhombreseta.bot.botcierto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {

    private final String update_id;

    private final Message message;

    public Update(
        @JsonProperty("update_id") String update_id,
        @JsonProperty("message") Message message) {

        this.update_id = update_id;
        this.message = message;
    }

    public String getUpdate_id() {
        return update_id;
    }

    public Message getMessage() {
        return message;
    }
}
