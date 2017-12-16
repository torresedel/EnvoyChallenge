
package com.example.admin.envoychallenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Files implements Parcelable
{

    @SerializedName("apt.sh")
    @Expose
    private AptSh aptSh;
    @SerializedName("user.go")
    @Expose
    private UserGo userGo;
    public final static Creator<Files> CREATOR = new Creator<Files>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Files createFromParcel(Parcel in) {
            return new Files(in);
        }

        public Files[] newArray(int size) {
            return (new Files[size]);
        }

    }
    ;

    protected Files(Parcel in) {
        this.aptSh = ((AptSh) in.readValue((AptSh.class.getClassLoader())));
        this.userGo = ((UserGo) in.readValue((UserGo.class.getClassLoader())));
    }

    public Files() {
    }

    public AptSh getAptSh() {
        return aptSh;
    }

    public void setAptSh(AptSh aptSh) {
        this.aptSh = aptSh;
    }

    public UserGo getUserGo() {
        return userGo;
    }

    public void setUserGo(UserGo userGo) {
        this.userGo = userGo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aptSh);
        dest.writeValue(userGo);
    }

    public int describeContents() {
        return  0;
    }

}
