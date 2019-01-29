package org.javacord.unittest;

import org.javacord.api.AccountType;
import org.javacord.api.DiscordApi;
import org.javacord.api.entity.ApplicationInfo;
import org.javacord.api.entity.activity.Activity;
import org.javacord.api.entity.activity.ActivityType;
import org.javacord.api.entity.channel.GroupChannel;
import org.javacord.api.entity.emoji.KnownCustomEmoji;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageSet;
import org.javacord.api.entity.message.UncachedMessageUtil;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.server.invite.Invite;
import org.javacord.api.entity.user.User;
import org.javacord.api.entity.user.UserStatus;
import org.javacord.api.entity.webhook.Webhook;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.util.concurrent.ThreadPool;
import org.javacord.api.util.event.ListenerManager;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class DiscordApiImpl implements DiscordApi {
    @Override
    public String getToken() {
        return null;
    }

    @Override
    public String getPrefixedToken() {
        return null;
    }

    @Override
    public ThreadPool getThreadPool() {
        return null;
    }

    @Override
    public UncachedMessageUtil getUncachedMessageUtil() {
        return null;
    }

    @Override
    public AccountType getAccountType() {
        return null;
    }

    @Override
    public void setMessageCacheSize(int capacity, int storageTimeInSeconds) {

    }

    @Override
    public int getDefaultMessageCacheCapacity() {
        return 0;
    }

    @Override
    public int getDefaultMessageCacheStorageTimeInSeconds() {
        return 0;
    }

    @Override
    public void setAutomaticMessageCacheCleanupEnabled(boolean automaticMessageCacheCleanupEnabled) {

    }

    @Override
    public boolean isDefaultAutomaticMessageCacheCleanupEnabled() {
        return false;
    }

    @Override
    public int getCurrentShard() {
        return 0;
    }

    @Override
    public int getTotalShards() {
        return 0;
    }

    @Override
    public boolean isWaitingForServersOnStartup() {
        return false;
    }

    @Override
    public void updateStatus(UserStatus status) {

    }

    @Override
    public UserStatus getStatus() {
        return null;
    }

    @Override
    public void updateActivity(String name) {

    }

    @Override
    public void updateActivity(ActivityType type, String name) {

    }

    @Override
    public void updateActivity(String name, String streamingUrl) {

    }

    @Override
    public void unsetActivity() {

    }

    @Override
    public Optional<Activity> getActivity() {
        return Optional.empty();
    }

    @Override
    public User getYourself() {
        return null;
    }

    @Override
    public long getOwnerId() {
        return 0;
    }

    @Override
    public long getClientId() {
        return 0;
    }

    @Override
    public void disconnect() {

    }

    @Override
    public void setReconnectDelay(Function<Integer, Integer> reconnectDelayProvider) {

    }

    @Override
    public int getReconnectDelay(int attempt) {
        return 0;
    }

    @Override
    public CompletableFuture<ApplicationInfo> getApplicationInfo() {
        return null;
    }

    @Override
    public CompletableFuture<Webhook> getWebhookById(long id) {
        return null;
    }

    @Override
    public Collection<Long> getUnavailableServers() {
        return null;
    }

    @Override
    public CompletableFuture<Invite> getInviteByCode(String code) {
        return null;
    }

    @Override
    public CompletableFuture<Invite> getInviteWithMemberCountsByCode(String code) {
        return null;
    }

    @Override
    public Collection<User> getCachedUsers() {
        return null;
    }

    @Override
    public Optional<User> getCachedUserById(long id) {
        return Optional.empty();
    }

    @Override
    public CompletableFuture<User> getUserById(long id) {
        return null;
    }

    @Override
    public MessageSet getCachedMessages() {
        return null;
    }

    @Override
    public Optional<Message> getCachedMessageById(long id) {
        return Optional.empty();
    }

    @Override
    public Collection<Server> getServers() {
        return null;
    }

    @Override
    public Collection<KnownCustomEmoji> getCustomEmojis() {
        return null;
    }

    @Override
    public Collection<GroupChannel> getGroupChannels() {
        return null;
    }

    @Override
    public <T extends GloballyAttachableListener> ListenerManager<T> addListener(Class<T> listenerClass, T listener) {
        return null;
    }

    @Override
    public Collection<ListenerManager<? extends GloballyAttachableListener>> addListener(GloballyAttachableListener listener) {
        return null;
    }

    @Override
    public void removeListener(GloballyAttachableListener listener) {

    }

    @Override
    public <T extends GloballyAttachableListener> void removeListener(Class<T> listenerClass, T listener) {

    }

    @Override
    public <T extends GloballyAttachableListener> Map<T, List<Class<T>>> getListeners() {
        return null;
    }

    @Override
    public <T extends GloballyAttachableListener> List<T> getListeners(Class<T> listenerClass) {
        return null;
    }
}
