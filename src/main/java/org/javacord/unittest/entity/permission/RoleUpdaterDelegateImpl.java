package org.javacord.unittest.entity.permission;

import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.permission.internal.RoleUpdaterDelegate;

import java.awt.*;
import java.util.concurrent.CompletableFuture;

public class RoleUpdaterDelegateImpl implements RoleUpdaterDelegate {
    public RoleUpdaterDelegateImpl(Role role) {

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
    public void setDisplaySeparatelyFlag(boolean displaySeparately) {

    }

    @Override
    public void setMentionableFlag(boolean mentionable) {

    }

    @Override
    public CompletableFuture<Void> update() {
        return null;
    }
}
