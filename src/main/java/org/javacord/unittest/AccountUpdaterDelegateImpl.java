package org.javacord.unittest;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.Icon;
import org.javacord.api.internal.AccountUpdaterDelegate;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class AccountUpdaterDelegateImpl implements AccountUpdaterDelegate {
    public AccountUpdaterDelegateImpl(DiscordApi api) {

    }

    @Override
    public void setUsername(String username) {

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
    public CompletableFuture<Void> update() {
        return null;
    }
}
