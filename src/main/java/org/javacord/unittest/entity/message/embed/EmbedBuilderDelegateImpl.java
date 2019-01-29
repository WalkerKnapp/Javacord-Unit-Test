package org.javacord.unittest.entity.message.embed;

import org.javacord.api.entity.Icon;
import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.message.embed.EditableEmbedField;
import org.javacord.api.entity.message.embed.EmbedField;
import org.javacord.api.entity.message.embed.internal.EmbedBuilderDelegate;
import org.javacord.api.entity.user.User;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmbedBuilderDelegateImpl implements EmbedBuilderDelegate {
    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void setUrl(String url) {

    }

    @Override
    public void setTimestampToNow() {

    }

    @Override
    public void setTimestamp(Instant timestamp) {

    }

    @Override
    public void setColor(Color color) {

    }

    @Override
    public void setFooter(String text) {

    }

    @Override
    public void setFooter(String text, String iconUrl) {

    }

    @Override
    public void setFooter(String text, Icon icon) {

    }

    @Override
    public void setFooter(String text, File icon) {

    }

    @Override
    public void setFooter(String text, InputStream icon) {

    }

    @Override
    public void setFooter(String text, InputStream icon, String fileType) {

    }

    @Override
    public void setFooter(String text, byte[] icon) {

    }

    @Override
    public void setFooter(String text, byte[] icon, String fileType) {

    }

    @Override
    public void setFooter(String text, BufferedImage icon) {

    }

    @Override
    public void setFooter(String text, BufferedImage icon, String fileType) {

    }

    @Override
    public void setImage(String url) {

    }

    @Override
    public void setImage(Icon image) {

    }

    @Override
    public void setImage(File image) {

    }

    @Override
    public void setImage(InputStream image) {

    }

    @Override
    public void setImage(InputStream image, String fileType) {

    }

    @Override
    public void setImage(byte[] image) {

    }

    @Override
    public void setImage(byte[] image, String fileType) {

    }

    @Override
    public void setImage(BufferedImage image) {

    }

    @Override
    public void setImage(BufferedImage image, String fileType) {

    }

    @Override
    public void setAuthor(MessageAuthor author) {

    }

    @Override
    public void setAuthor(User author) {

    }

    @Override
    public void setAuthor(String name) {

    }

    @Override
    public void setAuthor(String name, String url, String iconUrl) {

    }

    @Override
    public void setAuthor(String name, String url, Icon icon) {

    }

    @Override
    public void setAuthor(String name, String url, File icon) {

    }

    @Override
    public void setAuthor(String name, String url, InputStream icon) {

    }

    @Override
    public void setAuthor(String name, String url, InputStream icon, String fileType) {

    }

    @Override
    public void setAuthor(String name, String url, byte[] icon) {

    }

    @Override
    public void setAuthor(String name, String url, byte[] icon, String fileType) {

    }

    @Override
    public void setAuthor(String name, String url, BufferedImage icon) {

    }

    @Override
    public void setAuthor(String name, String url, BufferedImage icon, String fileType) {

    }

    @Override
    public void setThumbnail(String url) {

    }

    @Override
    public void setThumbnail(Icon thumbnail) {

    }

    @Override
    public void setThumbnail(File thumbnail) {

    }

    @Override
    public void setThumbnail(InputStream thumbnail) {

    }

    @Override
    public void setThumbnail(InputStream thumbnail, String fileType) {

    }

    @Override
    public void setThumbnail(byte[] thumbnail) {

    }

    @Override
    public void setThumbnail(byte[] thumbnail, String fileType) {

    }

    @Override
    public void setThumbnail(BufferedImage thumbnail) {

    }

    @Override
    public void setThumbnail(BufferedImage thumbnail, String fileType) {

    }

    @Override
    public void addField(String name, String value, boolean inline) {

    }

    @Override
    public void updateFields(Predicate<EmbedField> predicate, Consumer<EditableEmbedField> updater) {

    }

    @Override
    public void removeFields(Predicate<EmbedField> predicate) {

    }

    @Override
    public boolean requiresAttachments() {
        return false;
    }
}
