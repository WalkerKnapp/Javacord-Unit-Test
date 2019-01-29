package org.javacord.unittest.entity.emoji;

import org.javacord.api.entity.Icon;
import org.javacord.api.entity.emoji.KnownCustomEmoji;
import org.javacord.api.entity.emoji.internal.CustomEmojiBuilderDelegate;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.server.Server;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class CustomEmojiBuilderDelegateImpl implements CustomEmojiBuilderDelegate {
    public CustomEmojiBuilderDelegateImpl(Server server) {

    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setImage(Icon image) {

    }

    @Override
    public void setImage(URL image) {

    }

    @Override
    public void setImage(File image) {

    }

    @Override
    public void setImage(BufferedImage image) {

    }

    @Override
    public void setImage(BufferedImage image, String type) {

    }

    @Override
    public void setImage(byte[] image) {

    }

    @Override
    public void setImage(byte[] image, String type) {

    }

    @Override
    public void setImage(InputStream image) {

    }

    @Override
    public void setImage(InputStream image, String type) {

    }

    @Override
    public void addRoleToWhitelist(Role role) {

    }

    @Override
    public void setWhitelist(Collection<Role> roles) {

    }

    @Override
    public void setWhitelist(Role... roles) {

    }

    @Override
    public CompletableFuture<KnownCustomEmoji> create() {
        return null;
    }
}
