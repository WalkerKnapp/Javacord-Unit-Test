package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.channel.ChannelCategory;
import org.javacord.api.entity.channel.internal.ChannelCategoryBuilderDelegate;
import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.server.Server;

import java.util.concurrent.CompletableFuture;

public class ChannelCategoryBuilderDelegateImpl implements ChannelCategoryBuilderDelegate {
    public ChannelCategoryBuilderDelegateImpl(Server server) {

    }

    @Override
    public CompletableFuture<ChannelCategory> create() {
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
