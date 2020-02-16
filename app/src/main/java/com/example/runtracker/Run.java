package com.example.runtracker;

public class Run {

    //TODO Verify 'Undefined' is what I want.
    public enum Type
    {
        UNDEFINED,
        BASE,
        FARTLEK,
        HILLS,
        INTERVAL,
        LONG_RUN,
        STRENGTH,
        TEMPO,
        THRESHOLD
    }

    protected Date myDate;
    protected Type myType;
    protected double myMiles;
    protected int myIntensity;
    protected int myElevGain;
    protected Shoe myShoes;

    Run (Date theDate, Type theType, double theMiles, int theIntensity, int theElevGain, Shoe theShoes) {
      myDate = theDate;
      myType = theType;
      myMiles = theMiles;
      myIntensity = theIntensity;
      myElevGain = theElevGain;
      myShoes = theShoes;
    }

    // Getters
    public final Date getDate() {
        return myDate;
    }

    public final int getElevGain() {
        return myElevGain;
    }

    public final double getIntensity() {
        return myIntensity;
    }
    public final double getMiles() {
        return myMiles;
    }
    public final Shoe getShoes() {
        return myShoes;
    }

    // Setters
    public void setDate(Date theDate) {
        myDate = theDate;
    }

    public void setElevGain(int theElevGain) {
        myElevGain = theElevGain;
    }

    public void setIntensity(int theIntensity) {
        myIntensity = theIntensity;
    }

    public void setMiles(double theMiles) {
        myMiles = theMiles;
    }

    public void setShoes(Shoe theShoes) {
        myShoes = theShoes;
    }

    public void setType(Type theType) {
        myType = theType
    }
}
