package org.javacord.unittest.entity.message;

import org.javacord.api.entity.Icon;
import org.javacord.api.entity.Mentionable;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageDecoration;
import org.javacord.api.entity.message.Messageable;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.entity.message.internal.MessageBuilderDelegate;
import org.javacord.api.entity.user.User;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class MessageBuilderDelegateImpl implements MessageBuilderDelegate {
    @Override
    public void appendCode(String language, String code) {

    }

    @Override
    public void append(String message, MessageDecoration... decorations) {

    }

    @Override
    public void append(Mentionable entity) {

    }

    @Override
    public void append(Object object) {

    }

    @Override
    public void appendNewLine() {

    }

    @Override
    public void setContent(String content) {

    }

    @Override
    public void setEmbed(EmbedBuilder embed) {

    }

    @Override
    public void setTts(boolean tts) {

    }

    @Override
    public void addFile(BufferedImage image, String fileName) {

    }

    @Override
    public void addFile(File file) {

    }

    @Override
    public void addFile(Icon icon) {

    }

    @Override
    public void addFile(URL url) {

    }

    @Override
    public void addFile(byte[] bytes, String fileName) {

    }

    @Override
    public void addFile(InputStream stream, String fileName) {

    }

    @Override
    public void addAttachment(BufferedImage image, String fileName) {

    }

    @Override
    public void addAttachment(File file) {

    }

    @Override
    public void addAttachment(Icon icon) {

    }

    @Override
    public void addAttachment(URL url) {

    }

    @Override
    public void addAttachment(byte[] bytes, String fileName) {

    }

    @Override
    public void addAttachment(InputStream stream, String fileName) {

    }

    @Override
    public void setNonce(String nonce) {

    }

    @Override
    public StringBuilder getStringBuilder() {
        return null;
    }

    @Override
    public CompletableFuture<Message> send(User user) {
        return null;
    }

    @Override
    public CompletableFuture<Message> send(TextChannel channel) {
        return null;
    }

    @Override
    public CompletableFuture<Message> send(Messageable messageable) {
        return null;
    }
}
