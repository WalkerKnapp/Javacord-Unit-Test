package org.javacord.unittest.entity.webhook;

import org.javacord.api.entity.Icon;
import org.javacord.api.entity.channel.ServerTextChannel;
import org.javacord.api.entity.webhook.Webhook;
import org.javacord.api.entity.webhook.internal.WebhookUpdaterDelegate;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class WebhookUpdaterDelegateImpl implements WebhookUpdaterDelegate {
    public WebhookUpdaterDelegateImpl(Webhook webhook) {

    }

    @Override
    public void setAuditLogReason(String reason) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setChannel(ServerTextChannel channel) {

    }

    @Override
    public void setAvatar(BufferedImage avatar) {

    }

    @Override
    public void setAvatar(BufferedImage avatar, String fileType) {

    }

    @Override
    public void setAvatar(File avatar) {

    }

    @Override
    public void setAvatar(Icon avatar) {

    }

    @Override
    public void setAvatar(URL avatar) {

    }

    @Override
    public void setAvatar(byte[] avatar) {

    }

    @Override
    public void setAvatar(byte[] avatar, String fileType) {

    }

    @Override
    public void setAvatar(InputStream avatar) {

    }

    @Override
    public void setAvatar(InputStream avatar, String fileType) {

    }

    @Override
    public void removeAvatar() {

    }

    @Override
    public CompletableFuture<Webhook> update() {
        return null;
    }
}
