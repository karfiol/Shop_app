package com.dinotest.dinogimbaltest;

import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 11.06.15..
 */
public class Beacon {
    List<NameValuePair> list = new ArrayList<NameValuePair>();

    // TODO staviti tagove od apia
    String ID_TAG = "facto";
    String DICOUNT_TAG = "status";
    String PRODUCT_TAG = "centers";
    String NEW_PRICE_TAG = "name";
    String OLD_PRICE_TAG = "lat";
    String VALID_FROM_TAG = "lat";
    String VALID_TO_TAG = "lat";


    public Beacon(List<NameValuePair> _list){
        this.list = _list;
    }

    public String getValue(String value){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(value)){
                return list.get(i).getValue();
            }
        }
        return "";
    }

    public String getId(){
        return getValue(ID_TAG);
    }

    public String getDiscount(){
        return getValue(DICOUNT_TAG);
    }

    public String getProduct(){
        return getValue(PRODUCT_TAG);
    }

    public String getNewPrice(){
        return getValue(NEW_PRICE_TAG);
    }

    public String getOldPrice(){
        return getValue(OLD_PRICE_TAG);
    }

    public String getValidFrom(){
        return getValue(VALID_FROM_TAG);
    }

    public String getVALID_TO_TAG(){
        return getValue(VALID_TO_TAG);
    }

}
