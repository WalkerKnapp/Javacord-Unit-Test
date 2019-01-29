package org.javacord.unittest;

import org.javacord.api.AccountType;
import org.javacord.api.DiscordApi;
import org.javacord.api.internal.DiscordApiBuilderDelegate;
import org.javacord.api.util.auth.Authenticator;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class DiscordApiBuilderDelegateImpl implements DiscordApiBuilderDelegate {
    @Override
    public void setProxySelector(ProxySelector proxySelector) {

    }

    @Override
    public void setProxy(Proxy proxy) {

    }

    @Override
    public void setProxyAuthenticator(Authenticator authenticator) {

    }

    @Override
    public void setTrustAllCertificates(boolean trustAllCertificates) {

    }

    @Override
    public void setToken(String token) {

    }

    @Override
    public Optional<String> getToken() {
        return Optional.empty();
    }

    @Override
    public void setAccountType(AccountType accountType) {

    }

    @Override
    public AccountType getAccountType() {
        return null;
    }

    @Override
    public void setTotalShards(int totalShards) {

    }

    @Override
    public int getTotalShards() {
        return 0;
    }

    @Override
    public void setCurrentShard(int currentShard) {

    }

    @Override
    public int getCurrentShard() {
        return 0;
    }

    @Override
    public void setWaitForServersOnStartup(boolean waitForServersOnStartup) {

    }

    @Override
    public boolean isWaitingForServersOnStartup() {
        return false;
    }

    @Override
    public CompletableFuture<DiscordApi> login() {
        return null;
    }

    @Override
    public Collection<CompletableFuture<DiscordApi>> loginShards(int... shards) {
        return null;
    }

    @Override
    public CompletableFuture<Void> setRecommendedTotalShards() {
        return null;
    }
}
