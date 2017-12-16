
package com.example.admin.envoychallenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AptSh implements Parcelable
{

    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("raw_url")
    @Expose
    private String rawUrl;
    @SerializedName("size")
    @Expose
    private Integer size;
    public final static Creator<AptSh> CREATOR = new Creator<AptSh>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AptSh createFromParcel(Parcel in) {
            return new AptSh(in);
        }

        public AptSh[] newArray(int size) {
            return (new AptSh[size]);
        }

    }
    ;

    protected AptSh(Parcel in) {
        this.filename = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.language = ((String) in.readValue((String.class.getClassLoader())));
        this.rawUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.size = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public AptSh() {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(filename);
        dest.writeValue(type);
        dest.writeValue(language);
        dest.writeValue(rawUrl);
        dest.writeValue(size);
    }

    public int describeContents() {
        return  0;
    }

}
