/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bidang;

/**
 *
 * @author USER
 */
public class BulatBidangFactory extends AbstractFactory {

    @Override
    public Bidang getBidang(String bidangType) {
         if (bidangType.equalsIgnoreCase("SEGITIGA")){
            return new BulatSegitiga();
        }else if(bidangType.equalsIgnoreCase("JAJARGENJANG")){
            return new BulatJajargenjang();
        }
        return null; 
         
        
    }
    
}

    

  
