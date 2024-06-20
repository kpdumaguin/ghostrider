/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rmj.ghostrider.app;

import org.rmj.ghostrider.ui.GhostRider;
import javafx.application.Application;
import org.rmj.appdriver.GProperty;
import org.rmj.appdriver.GRider;
import org.rmj.appdriver.agent.GRiderX;

/**
 *
 * @author user
 */
public class LetMeIn {
     public static void main(String [] args){
        String path;
        
        if(System.getProperty("os.name").toLowerCase().contains("win")){
            path = "D:/GGC_Java_Systems";
        }
        else{
            path = "/srv/GGC_Java_Systems";
        }
        
        System.setProperty("sys.default.path.config", path); 
         
        GRiderX poGRider = new GRiderX("gRider");
        GProperty loProp = new GProperty("GhostRiderXP");
        
        GhostRider loLogin = new GhostRider();
        loLogin.setGRider((GRider) poGRider);
        loLogin.setGProperty(loProp);
        
        if (args.length > 0) loLogin.setProdctID(args[0]);
        
        Application.launch(loLogin.getClass(), args);
        
        poGRider = null; loProp = null; loLogin = null;
    }
}
