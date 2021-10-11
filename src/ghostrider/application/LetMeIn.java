/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghostrider.application;

import ghostrider.GhostRider;
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
        GRiderX poGRider = new GRiderX("gRider");
        GProperty loProp = new GProperty("GhostRiderXP");
        
        GhostRider loLogin = new GhostRider();
        loLogin.setGRider((GRider) poGRider);
        loLogin.setGProperty(loProp);
        
        Application.launch(loLogin.getClass(), args);
    }
}
