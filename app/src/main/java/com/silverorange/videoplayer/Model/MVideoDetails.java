package com.silverorange.videoplayer.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
//Model for video details
public class MVideoDetails {
    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("hlsURL")
    @Expose
    private String hlsURL;

    @SerializedName("fullURL")
    @Expose
    private String fullURL;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("publishedAt")
    @Expose
    private Date publishedAt;

    @SerializedName("author")
    @Expose
    private MAuthorDetails author;


    public MVideoDetails() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHlsURL() {
        return hlsURL;
    }

    public void setHlsURL(String hlsURL) {
        this.hlsURL = hlsURL;
    }

    public String getFullURL() {
        return fullURL;
    }

    public void setFullURL(String fullURL) {
        this.fullURL = fullURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public MAuthorDetails getAuthor() {
        return author;
    }

    public void setAuthor(MAuthorDetails author) {
        this.author = author;
    }
}

