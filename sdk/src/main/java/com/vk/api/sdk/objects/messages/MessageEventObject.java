package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;


import java.util.Objects;

public class MessageEventObject implements Validable {


    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("peer_id")
    private Integer peerId;

    @SerializedName("event_id")
    private String eventId;

    @SerializedName("payload")
    private JsonObject payload;

    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    public Integer getUserId() {
        return userId;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public String getEventId() {
        return eventId;
    }

    public JsonObject getPayload() {
        return payload;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public MessageEventObject setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public MessageEventObject setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;

    }

    public MessageEventObject setEventId(String eventId) {
        this.eventId = eventId;
        return this;

    }

    public MessageEventObject setPayload(JsonObject payload) {
        this.payload = payload;
        return this;

    }

    public MessageEventObject setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;

    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, peerId, eventId, payload, conversationMessageId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEventObject messageEventObject = (MessageEventObject) o;
        return Objects.equals(userId, messageEventObject.userId) &&
                Objects.equals(peerId, messageEventObject.peerId) &&
                Objects.equals(eventId, messageEventObject.eventId) &&
                Objects.equals(payload, messageEventObject.payload) &&
                Objects.equals(conversationMessageId, messageEventObject.conversationMessageId)
                ;
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageEventObject{");
        sb.append("userId=").append(userId);
        sb.append(", peerId=").append(peerId);
        sb.append(", eventId=").append(eventId);
        sb.append(", payload=").append(payload);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append('}');
        return sb.toString();
    }
}
