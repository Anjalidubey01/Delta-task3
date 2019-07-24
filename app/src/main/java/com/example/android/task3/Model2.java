package com.example.android.task3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model2 {
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("location_type")
    @Expose
    private String locationType;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("context")
    @Expose
    private String context;
    @SerializedName("outcome_status")
    @Expose
    private OutcomeStatus outcomeStatus;
    @SerializedName("persistent_id")
    @Expose
    private String persistentId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("location_subtype")
    @Expose
    private String locationSubtype;
    @SerializedName("month")
    @Expose
    private String month;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public OutcomeStatus getOutcomeStatus() {
        return outcomeStatus;
    }

    public void setOutcomeStatus(OutcomeStatus outcomeStatus) {
        this.outcomeStatus = outcomeStatus;
    }

    public String getPersistentId() {
        return persistentId;
    }

    public void setPersistentId(String persistentId) {
        this.persistentId = persistentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationSubtype() {
        return locationSubtype;
    }

    public void setLocationSubtype(String locationSubtype) {
        this.locationSubtype = locationSubtype;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

 class Location {

        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("street")
        @Expose
        private Street street;
        @SerializedName("longitude")
        @Expose
        private String longitude;

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public Street getStreet() {
            return street;
        }

        public void setStreet(Street street) {
            this.street = street;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        class Street {
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }


    }

 class OutcomeStatus {

        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("date")
        @Expose
        private String date;

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }


    }
}
