package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.messages.MessageEventObject;

import java.util.Objects;

public class MessageEvent extends Base implements Validable {
    @SerializedName("type")
    private Type type;

    @SerializedName("object")
    @Required
    private MessageEventObject object;

    public Type getType() {
        return type;
    }

    public MessageEvent setType(Type type) {
        this.type = type;
        return this;
    }

    public MessageEventObject getObject() {
        return object;
    }

    public MessageEvent setObject(MessageEventObject object) {
        this.object = object;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, object);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEvent messageEvent = (MessageEvent) o;
        return Objects.equals(type, messageEvent.type) &&
                Objects.equals(object, messageEvent.object);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageEvent{");
        sb.append("type=").append(type);
        sb.append(", object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
