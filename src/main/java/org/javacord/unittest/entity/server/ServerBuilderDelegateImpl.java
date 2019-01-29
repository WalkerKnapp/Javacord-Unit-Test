package org.javacord.unittest.entity.server;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.Icon;
import org.javacord.api.entity.Region;
import org.javacord.api.entity.server.DefaultMessageNotificationLevel;
import org.javacord.api.entity.server.ExplicitContentFilterLevel;
import org.javacord.api.entity.server.VerificationLevel;
import org.javacord.api.entity.server.internal.ServerBuilderDelegate;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class ServerBuilderDelegateImpl implements ServerBuilderDelegate {
    public ServerBuilderDelegateImpl(DiscordApi api) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setRegion(Region region) {

    }

    @Override
    public void setExplicitContentFilterLevel(ExplicitContentFilterLevel explicitContentFilterLevel) {

    }

    @Override
    public void setVerificationLevel(VerificationLevel verificationLevel) {

    }

    @Override
    public void setDefaultMessageNotificationLevel(DefaultMessageNotificationLevel defaultMessageNotificationLevel) {

    }

    @Override
    public void setAfkTimeoutInSeconds(int afkTimeout) {

    }

    @Override
    public void setIcon(BufferedImage icon) {

    }

    @Override
    public void setIcon(BufferedImage icon, String fileType) {

    }

    @Override
    public void setIcon(File icon) {

    }

    @Override
    public void setIcon(Icon icon) {

    }

    @Override
    public void setIcon(URL icon) {

    }

    @Override
    public void setIcon(byte[] icon) {

    }

    @Override
    public void setIcon(byte[] icon, String fileType) {

    }

    @Override
    public void setIcon(InputStream icon) {

    }

    @Override
    public void setIcon(InputStream icon, String fileType) {

    }

    @Override
    public CompletableFuture<Long> create() {
        return null;
    }
}
