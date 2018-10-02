package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;


class Config {
    static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e("Internet","No internet");
        }

        BASE_URL = url;
    }
}
