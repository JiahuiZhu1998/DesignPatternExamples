package com.practice.DesignModeUsage.serviceDesignMode.flyweight_mode.example;

import org.checkerframework.checker.units.qual.A;

import java.util.Hashtable;

public class ArtistFactory {
    Hashtable pool = new Hashtable();
    Artist getArtist(String key) {
        Artist result;
        result = (Artist) pool.get(key);
        // 产品新的 Artist
        if (null == result) {
            result = new Artist(key);
            pool.put(key, result);
        }
        return result;
    }
}
