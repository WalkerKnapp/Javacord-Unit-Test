package org.javacord.unittest.entity.emoji;

import org.javacord.api.entity.emoji.KnownCustomEmoji;
import org.javacord.api.entity.emoji.internal.CustomEmojiUpdaterDelegate;
import org.javacord.api.entity.permission.Role;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class CustomEmojiUpdaterDelegateImpl implements CustomEmojiUpdaterDelegate {
    public CustomEmojiUpdaterDelegateImpl(KnownCustomEmoji emoji) {

    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void addRoleToWhitelist(Role role) {

    }

    @Override
    public void removeRoleFromWhitelist(Role role) {

    }

    @Override
    public void removeWhitelist() {

    }

    @Override
    public void setWhitelist(Collection<Role> roles) {

    }

    @Override
    public void setWhitelist(Role... roles) {

    }

    @Override
    public CompletableFuture<Void> update() {
        return null;
    }
}
