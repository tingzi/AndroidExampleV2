package com.quick.mvvm.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by beike on 2018/1/12.
 */

public class Movie {

    @SerializedName("actorName1")
    private String actorName1;
    @SerializedName("actorName2")
    private String actorName2;
    @SerializedName("commonSpecial")
    private String commonSpecial;
    @SerializedName("directorName")
    private String directorName;
    @SerializedName("img")
    private String img;
    @SerializedName("is3D")
    private boolean is3D;
    @SerializedName("isDMAX")
    private boolean isDMAX;
    @SerializedName("isFilter")
    private boolean isFilter;
    @SerializedName("isHot")
    private boolean isHot;
    @SerializedName("isIMAX")
    private boolean isIMAX;
    @SerializedName("isIMAX3D")
    private boolean isIMAX3D;
    @SerializedName("isNew")
    private boolean isNew;
    @SerializedName("length")
    private int length;
    @SerializedName("movieId")
    private int movieId;
    @SerializedName("nearestShowtime")
    private NearestShowtime nearestShowtime;
    @SerializedName("preferentialFlag")
    private boolean preferentialFlag;
    @SerializedName("rDay")
    private int rDay;
    @SerializedName("rMonth")
    private int rMonth;
    @SerializedName("rYear")
    private int rYear;
    @SerializedName("ratingFinal")
    private float ratingFinal;
    @SerializedName("titleCn")
    private String titleCn;
    @SerializedName("titleEn")
    private String titleEn;
    @SerializedName("type")
    private String type;
    @SerializedName("wantedCount")
    private int wantedCount;

    public static class NearestShowtime {
        @SerializedName("isTicket")
        private boolean isTicket;
        @SerializedName("nearestCinemaCount")
        private int nearestCinemaCount;
        @SerializedName("nearestShowDay")
        private long nearestShowDay;
        @SerializedName("nearestShowtimeCount")
        private int nearestShowtimeCount;

        public boolean isTicket() {
            return isTicket;
        }

        public void setTicket(boolean ticket) {
            isTicket = ticket;
        }

        public int getNearestCinemaCount() {
            return nearestCinemaCount;
        }

        public void setNearestCinemaCount(int nearestCinemaCount) {
            this.nearestCinemaCount = nearestCinemaCount;
        }

        public long getNearestShowDay() {
            return nearestShowDay;
        }

        public void setNearestShowDay(long nearestShowDay) {
            this.nearestShowDay = nearestShowDay;
        }

        public int getNearestShowtimeCount() {
            return nearestShowtimeCount;
        }

        public void setNearestShowtimeCount(int nearestShowtimeCount) {
            this.nearestShowtimeCount = nearestShowtimeCount;
        }
    }

    public NearestShowtime getNearestShowtime() {
        return nearestShowtime;
    }

    public void setNearestShowtime(NearestShowtime nearestShowtime) {
        this.nearestShowtime = nearestShowtime;
    }

    public String getActorName1() {
        return actorName1;
    }

    public void setActorName1(String actorName1) {
        this.actorName1 = actorName1;
    }

    public String getActorName2() {
        return actorName2;
    }

    public void setActorName2(String actorName2) {
        this.actorName2 = actorName2;
    }

    public String getCommonSpecial() {
        return commonSpecial;
    }

    public void setCommonSpecial(String commonSpecial) {
        this.commonSpecial = commonSpecial;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean isDMAX() {
        return isDMAX;
    }

    public void setDMAX(boolean DMAX) {
        isDMAX = DMAX;
    }

    public boolean isFilter() {
        return isFilter;
    }

    public void setFilter(boolean filter) {
        isFilter = filter;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isIMAX() {
        return isIMAX;
    }

    public void setIMAX(boolean IMAX) {
        isIMAX = IMAX;
    }

    public boolean isIMAX3D() {
        return isIMAX3D;
    }

    public void setIMAX3D(boolean IMAX3D) {
        isIMAX3D = IMAX3D;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public boolean isPreferentialFlag() {
        return preferentialFlag;
    }

    public void setPreferentialFlag(boolean preferentialFlag) {
        this.preferentialFlag = preferentialFlag;
    }

    public int getrDay() {
        return rDay;
    }

    public void setrDay(int rDay) {
        this.rDay = rDay;
    }

    public int getrMonth() {
        return rMonth;
    }

    public void setrMonth(int rMonth) {
        this.rMonth = rMonth;
    }

    public int getrYear() {
        return rYear;
    }

    public void setrYear(int rYear) {
        this.rYear = rYear;
    }

    public float getRatingFinal() {
        return ratingFinal;
    }

    public void setRatingFinal(float ratingFinal) {
        this.ratingFinal = ratingFinal;
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWantedCount() {
        return wantedCount;
    }

    public void setWantedCount(int wantedCount) {
        this.wantedCount = wantedCount;
    }
}
