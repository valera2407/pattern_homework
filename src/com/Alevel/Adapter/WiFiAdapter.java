package com.Alevel.Adapter;

public class WiFiAdapter implements Internet {

    private CableInternet cableInternet;
    public WiFiAdapter (CableInternet cableInternet){
        this.cableInternet = cableInternet;
    }

    @Override
    public void useInternet() {
        this.cableInternet.connect();
    }

    @Override
    public void search() {
        this.cableInternet.search();
    }
}
