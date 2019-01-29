package org.javacord.unittest.entity.channel;

import org.javacord.api.entity.channel.GroupChannel;
import org.javacord.api.entity.channel.internal.GroupChannelUpdaterDelegate;

import java.util.concurrent.CompletableFuture;

public class ChannelUpdaterDelegateImpl implements GroupChannelUpdaterDelegate {
    public ChannelUpdaterDelegateImpl(GroupChannel channel) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public CompletableFuture<Void> update() {
        return null;
    }
}
