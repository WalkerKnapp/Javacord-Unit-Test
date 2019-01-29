package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.channel.ChannelCategory;
import org.javacord.api.entity.channel.ServerVoiceChannel;
import org.javacord.api.entity.channel.internal.ServerVoiceChannelUpdaterDelegate;
import org.javacord.api.entity.permission.Permissions;

import java.util.concurrent.CompletableFuture;

public class ServerVoiceChannelUpdaterDelegateImpl implements ServerVoiceChannelUpdaterDelegate {

    public ServerVoiceChannelUpdaterDelegateImpl(ServerVoiceChannel channel) {

    }

    @Override
    public void setBitrate(int bitrate) {

    }

    @Override
    public void setUserLimit(int userLimit) {

    }

    @Override
    public void removeUserLimit() {

    }

    @Override
    public void setCategory(ChannelCategory category) {

    }

    @Override
    public void removeCategory() {

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
