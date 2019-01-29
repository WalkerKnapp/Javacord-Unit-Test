package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.channel.ChannelCategory;
import org.javacord.api.entity.channel.ServerTextChannel;
import org.javacord.api.entity.channel.internal.ServerTextChannelBuilderDelegate;
import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.server.Server;

import java.util.concurrent.CompletableFuture;

public class ServerTextChannelBuilderDelegateImpl implements ServerTextChannelBuilderDelegate {
    public ServerTextChannelBuilderDelegateImpl(Server server) {

    }

    @Override
    public void setTopic(String topic) {

    }

    @Override
    public void setCategory(ChannelCategory category) {

    }

    @Override
    public void setSlowmodeDelayInSeconds(int delay) {

    }

    @Override
    public CompletableFuture<ServerTextChannel> create() {
        return null;
    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public <T extends Permissionable & DiscordEntity> void addPermissionOverwrite(T permissionable, Permissions permissions) {

    }

    @Override
    public <T extends Permissionable & DiscordEntity> void removePermissionOverwrite(T permissionable) {

    }
}
