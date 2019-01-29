package org.javacord.unittest.entity.server.invite;

import org.javacord.api.entity.channel.ServerChannel;
import org.javacord.api.entity.server.invite.Invite;
import org.javacord.api.entity.server.invite.internal.InviteBuilderDelegate;

import java.util.concurrent.CompletableFuture;

public class InviteBuilderDelegateImpl implements InviteBuilderDelegate {
    public InviteBuilderDelegateImpl(ServerChannel channel) {

    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setMaxAgeInSeconds(int maxAge) {

    }

    @Override
    public void setNeverExpire() {

    }

    @Override
    public void setMaxUses(int maxUses) {

    }

    @Override
    public void setTemporary(boolean temporary) {

    }

    @Override
    public void setUnique(boolean unique) {

    }

    @Override
    public CompletableFuture<Invite> create() {
        return null;
    }
}
