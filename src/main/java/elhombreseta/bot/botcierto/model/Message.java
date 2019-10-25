package elhombreseta.bot.botcierto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    private final String text;

    private final Chat chat;

    public Message(
        @JsonProperty("text") String text,
        @JsonProperty("chat") Chat chat) {
        this.text = text;
        this.chat = chat;
    }

    public String getText() {
        return text;
    }

    public Chat getChat() {
        return chat;
    }

    @Override
    public String toString() {
        return "Message{" +
            "text='" + text + '\'' +
            ", chat=" + chat +
            '}';
    }

}
