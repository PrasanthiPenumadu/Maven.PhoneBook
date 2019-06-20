package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    List<String> listPhone=new ArrayList<>();
    Map<String,List<String>> map=new LinkedHashMap<>();
    List<String> listNames=new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {
        this.map=map;
    }

    public PhoneBook() {

    }

    public void add(String name, String phoneNumber) {
        listPhone.add(phoneNumber);
    map.put(name, listPhone);
    }

    public void addAll(String name, String... phoneNumbers) {
        for(String pn:phoneNumbers){
            listPhone.add(pn);}
        map.put(name,listPhone);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String phoneNumber) {
       if(listPhone.contains(phoneNumber)){
       return true;}
        return false;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String namekey="";
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
        if(entry.getValue().contains(phoneNumber))
           namekey=entry.getKey();}
        return namekey;
    }

    public List<String> getAllContactNames() {
        listNames.addAll(map.keySet());
        return listNames;
    }

    public Map<String, List<String>> getMap() {
        return this.map;
    }
}
