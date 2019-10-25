package elhombreseta.bot.botcierto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Response implements Serializable {

    @JsonProperty("text")
    private final String text;

    @JsonProperty("chat_id")
    private final Integer chat_id;

    public Response(String text, Integer chat_id) {
        this.text = text;
        this.chat_id = chat_id;
    }

    @Override
    public String toString() {
        return "Response{" +
            "text='" + text + '\'' +
            ", chat_id=" + chat_id +
            '}';
    }
}
