package org.javacord.unittest.entity.permission;

import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.permission.internal.RoleBuilderDelegate;
import org.javacord.api.entity.server.Server;

import java.awt.*;
import java.util.concurrent.CompletableFuture;

public class RoleBuilderDelegateImpl implements RoleBuilderDelegate {
    public RoleBuilderDelegateImpl(Server server) {

    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setPermissions(Permissions permissions) {

    }

    @Override
    public void setColor(Color color) {

    }

    @Override
    public void setMentionable(boolean mentionable) {

    }

    @Override
    public void setDisplaySeparately(boolean displaySeparately) {

    }

    @Override
    public CompletableFuture<Role> create() {
        return null;
    }
}
