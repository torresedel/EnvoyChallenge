
package com.example.admin.envoychallenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GistsResponse implements Parcelable
{

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("git_pull_url")
    @Expose
    private String gitPullUrl;
    @SerializedName("git_push_url")
    @Expose
    private String gitPushUrl;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("files")
    @Expose
    private Files files;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("comments")
    @Expose
    private Integer comments;
    @SerializedName("user")
    @Expose
    private Object user;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("truncated")
    @Expose
    private Boolean truncated;
    public final static Creator<GistsResponse> CREATOR = new Creator<GistsResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GistsResponse createFromParcel(Parcel in) {
            return new GistsResponse(in);
        }

        public GistsResponse[] newArray(int size) {
            return (new GistsResponse[size]);
        }

    }
    ;

    protected GistsResponse(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.forksUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.commitsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.gitPullUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gitPushUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.files = ((Files) in.readValue((Files.class.getClassLoader())));
        this._public = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.comments = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.user = ((Object) in.readValue((Object.class.getClassLoader())));
        this.commentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
        this.truncated = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public GistsResponse() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGitPullUrl() {
        return gitPullUrl;
    }

    public void setGitPullUrl(String gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    public String getGitPushUrl() {
        return gitPushUrl;
    }

    public void setGitPushUrl(String gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(forksUrl);
        dest.writeValue(commitsUrl);
        dest.writeValue(id);
        dest.writeValue(gitPullUrl);
        dest.writeValue(gitPushUrl);
        dest.writeValue(htmlUrl);
        dest.writeValue(files);
        dest.writeValue(_public);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(description);
        dest.writeValue(comments);
        dest.writeValue(user);
        dest.writeValue(commentsUrl);
        dest.writeValue(owner);
        dest.writeValue(truncated);
    }

    public int describeContents() {
        return  0;
    }

}
