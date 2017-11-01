package com.wangyuan.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wangyuan on 2017/11/1.
 */

public class Person implements Parcelable {
    public int id;
    public String name;
    public String sex;
    public int age;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.sex);
        dest.writeInt(this.age);
    }

    public Person() {
    }

    protected Person(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.sex = in.readString();
        this.age = in.readInt();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
