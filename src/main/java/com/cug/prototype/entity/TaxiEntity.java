package com.cug.prototype.entity;

import java.util.Date;

public class TaxiEntity {
    private int  TAXI_ID;
    private String VEHICLENUMBER;
    private Date GPS_DATE;
    private double MAP_LON;
    private double MAP_LAT;
    private Integer DIRECTION;
    private Integer GPS_SPEED;
    private boolean EMPTY_LOAD;

    public TaxiEntity() {
    }

    public TaxiEntity(int TAXI_ID, String VEHICLENUMBER, Date GPS_DATE, double MAP_LON, double MAP_LAT, Integer DIRECTION, Integer GPS_SPEED, boolean EMPTY_LOAD) {
        this.TAXI_ID = TAXI_ID;
        this.VEHICLENUMBER = VEHICLENUMBER;
        this.GPS_DATE = GPS_DATE;
        this.MAP_LON = MAP_LON;
        this.MAP_LAT = MAP_LAT;
        this.DIRECTION = DIRECTION;
        this.GPS_SPEED = GPS_SPEED;
        this.EMPTY_LOAD = EMPTY_LOAD;
    }

    public int getTAXI_ID() {
        return TAXI_ID;
    }

    public void setTAXI_ID(int TAXI_ID) {
        this.TAXI_ID = TAXI_ID;
    }

    public String getVEHICLENUMBER() {
        return VEHICLENUMBER;
    }

    public void setVEHICLENUMBER(String VEHICLENUMBER) {
        this.VEHICLENUMBER = VEHICLENUMBER;
    }

    public Date getGPS_DATE() {
        return GPS_DATE;
    }

    public void setGPS_DATE(Date GPS_DATE) {
        this.GPS_DATE = GPS_DATE;
    }

    public double getMAP_LON() {
        return MAP_LON;
    }

    public void setMAP_LON(double MAP_LON) {
        this.MAP_LON = MAP_LON;
    }

    public double getMAP_LAT() {
        return MAP_LAT;
    }

    public void setMAP_LAT(double MAP_LAT) {
        this.MAP_LAT = MAP_LAT;
    }

    public Integer getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(Integer DIRECTION) {
        this.DIRECTION = DIRECTION;
    }

    public Integer getGPS_SPEED() {
        return GPS_SPEED;
    }

    public void setGPS_SPEED(Integer GPS_SPEED) {
        this.GPS_SPEED = GPS_SPEED;
    }

    public boolean isEMPTY_LOAD() {
        return EMPTY_LOAD;
    }

    public void setEMPTY_LOAD(boolean EMPTY_LOAD) {
        this.EMPTY_LOAD = EMPTY_LOAD;
    }
}
