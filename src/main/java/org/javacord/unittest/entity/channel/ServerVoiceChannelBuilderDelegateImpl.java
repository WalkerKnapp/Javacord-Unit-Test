package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.channel.ChannelCategory;
import org.javacord.api.entity.channel.ServerVoiceChannel;
import org.javacord.api.entity.channel.internal.ServerVoiceChannelBuilderDelegate;
import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.server.Server;

import java.util.concurrent.CompletableFuture;

public class ServerVoiceChannelBuilderDelegateImpl implements ServerVoiceChannelBuilderDelegate {
    public ServerVoiceChannelBuilderDelegateImpl(Server server) {

    }

    @Override
    public void setBitrate(int bitrate) {

    }

    @Override
    public void setUserlimit(int userlimit) {

    }

    @Override
    public void setCategory(ChannelCategory category) {

    }

    @Override
    public CompletableFuture<ServerVoiceChannel> create() {
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
