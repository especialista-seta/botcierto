package elhombreseta.bot.botcierto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {

    private final String id;

    private final Message message;

    public Update(
        @JsonProperty("update_id") String id,
        @JsonProperty("message") Message message) {

        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Update{" +
            "id='" + id + '\'' +
            ", message=" + message +
            '}';
    }
}
