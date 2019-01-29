package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.channel.ChannelCategory;
import org.javacord.api.entity.channel.ServerTextChannel;
import org.javacord.api.entity.channel.internal.ServerTextChannelBuilderDelegate;
import org.javacord.api.entity.channel.internal.ServerTextChannelUpdaterDelegate;
import org.javacord.api.entity.permission.Permissions;

import java.util.concurrent.CompletableFuture;

public class ServerTextChannelUpdaterDelegateImpl implements ServerTextChannelUpdaterDelegate {

    public ServerTextChannelUpdaterDelegateImpl(ServerTextChannel channel) {

    }

    @Override
    public void setTopic(String topic) {

    }

    @Override
    public void setNsfwFlag(boolean nsfw) {

    }

    @Override
    public void setCategory(ChannelCategory category) {

    }

    @Override
    public void removeCategory() {

    }

    @Override
    public void setSlowmodeDelayInSeconds(int delay) {

    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setRawPosition(int rawPosition) {

    }

    @Override
    public <T extends Permissionable & DiscordEntity> void addPermissionOverwrite(T permissionable, Permissions permissions) {

    }

    @Override
    public <T extends Permissionable & DiscordEntity> void removePermissionOverwrite(T permissionable) {

    }

    @Override
    public CompletableFuture<Void> update() {
        return null;
    }
}
