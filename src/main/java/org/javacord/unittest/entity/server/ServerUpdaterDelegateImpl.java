package org.javacord.unittest.entity.server;

import org.javacord.api.entity.Icon;
import org.javacord.api.entity.Region;
import org.javacord.api.entity.channel.ServerTextChannel;
import org.javacord.api.entity.channel.ServerVoiceChannel;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.server.DefaultMessageNotificationLevel;
import org.javacord.api.entity.server.ExplicitContentFilterLevel;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.server.VerificationLevel;
import org.javacord.api.entity.server.internal.ServerUpdaterDelegate;
import org.javacord.api.entity.user.User;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ServerUpdaterDelegateImpl implements ServerUpdaterDelegate {
    public ServerUpdaterDelegateImpl(Server server) {

    }

    @Override
    public void setAuditLogReason(String reason) {

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
    public void setAfkChannel(ServerVoiceChannel afkChannel) {

    }

    @Override
    public void removeAfkChannel() {

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
    public void removeIcon() {

    }

    @Override
    public void setOwner(User owner) {

    }

    @Override
    public void setSplash(BufferedImage splash) {

    }

    @Override
    public void setSplash(BufferedImage splash, String fileType) {

    }

    @Override
    public void setSplash(File splash) {

    }

    @Override
    public void setSplash(Icon splash) {

    }

    @Override
    public void setSplash(URL splash) {

    }

    @Override
    public void setSplash(byte[] splash) {

    }

    @Override
    public void setSplash(byte[] splash, String fileType) {

    }

    @Override
    public void setSplash(InputStream splash) {

    }

    @Override
    public void setSplash(InputStream splash, String fileType) {

    }

    @Override
    public void removeSplash() {

    }

    @Override
    public void setSystemChannel(ServerTextChannel systemChannel) {

    }

    @Override
    public void removeSystemChannel() {

    }

    @Override
    public void setNickname(User user, String nickname) {

    }

    @Override
    public void setMuted(User user, boolean muted) {

    }

    @Override
    public void setDeafened(User user, boolean deafened) {

    }

    @Override
    public void setVoiceChannel(User user, ServerVoiceChannel channel) {

    }

    @Override
    public void reorderRoles(List<Role> roles) {

    }

    @Override
    public void addRoleToUser(User user, Role role) {

    }

    @Override
    public void addRolesToUser(User user, Collection<Role> roles) {

    }

    @Override
    public void removeRoleFromUser(User user, Role role) {

    }

    @Override
    public void removeRolesFromUser(User user, Collection<Role> roles) {

    }

    @Override
    public void removeAllRolesFromUser(User user) {

    }

    @Override
    public CompletableFuture<Void> update() {
        return null;
    }
}
