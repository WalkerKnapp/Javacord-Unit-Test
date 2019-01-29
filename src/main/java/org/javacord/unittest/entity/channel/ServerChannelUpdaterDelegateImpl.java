package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.DiscordEntity;
import org.javacord.api.entity.Permissionable;
import org.javacord.api.entity.channel.ServerChannel;
import org.javacord.api.entity.channel.internal.ServerChannelUpdaterDelegate;
import org.javacord.api.entity.permission.Permissions;

import java.util.concurrent.CompletableFuture;

public class ServerChannelUpdaterDelegateImpl implements ServerChannelUpdaterDelegate {
    public ServerChannelUpdaterDelegateImpl(ServerChannel channel) {

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
