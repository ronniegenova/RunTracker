package com.example.runtracker;

public class Run {

    //TODO Verify 'Undefined' is what I want.
    protected enum Type
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
    protected Double myMiles;
    protected Integar myIntensity;
    protected Double myElevGain;
    protected Shoe myShoes;

    //TODO Need to initialize anything? I'm sorta thinking no.
    Run () {}

    // Getters
    public final Date getDate() {
        return myDate;
    }

    public final Double getElevGain() {
        return myElevGain;
    }

    public final Double getIntensity() {
        return myIntensity;
    }
    public final Double getMiles() {
        return myMiles;
    }
    public final Shoe getShoes() {
        return myShoes;
    }

    // Setters
    public void setDate(Date theDate) {
        myDate = theDate;
    }

    public void setElevGain(Double theElevGain) {
        myElevGain = theElevGain;
    }

    public void setIntensity(Integar theIntensity) {
        myIntensity = theIntensity;
    }

    public void setMiles(Double theMiles) {
        myMiles = theMiles;
    }

    public void setShoes(Shoe theShoes) {
        myShoes = theShoes;
    }

    public void setType(Type theType) {
        myType = theType
    }
}
