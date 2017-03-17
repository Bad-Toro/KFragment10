package com.mobileappscompany.training.fragment10;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by ferna on 3/17/2017.
 */

public class Contact implements Parcelable {
    private String mId;
    private String mFName;
    private String mLName;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getFName() {
        return mFName;
    }

    public void setFName(String FName) {
        mFName = FName;
    }

    public String getLName() {
        return mLName;
    }

    public void setLName(String LName) {
        mLName = LName;
    }

    public Contact(String id, String FName, String LName) {
        mId = id;
        mFName = FName;
        mLName = LName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mId);
        dest.writeString(this.mFName);
        dest.writeString(this.mLName);
    }

    protected Contact(Parcel in) {
        this.mId = in.readString();
        this.mFName = in.readString();
        this.mLName = in.readString();
    }

    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel source) {
            return new Contact(source);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
}
