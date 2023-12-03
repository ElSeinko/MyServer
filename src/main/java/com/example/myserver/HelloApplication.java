package com.example.myserver;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    @GET
    public String Test(){
        return "HELLO";
    }

}