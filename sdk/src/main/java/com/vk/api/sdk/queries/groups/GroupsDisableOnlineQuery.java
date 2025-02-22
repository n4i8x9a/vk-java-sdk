// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.disableOnline method
 */
public class GroupsDisableOnlineQuery extends AbstractQueryBuilder<GroupsDisableOnlineQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1.
     */
    public GroupsDisableOnlineQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.disableOnline", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1.
     */
    public GroupsDisableOnlineQuery(VkApiClient client, GroupActor actor, int groupId) {
        super(client, "groups.disableOnline", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsDisableOnlineQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected GroupsDisableOnlineQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
