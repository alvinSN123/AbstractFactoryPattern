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
public class AbstractFactoryPatternDemo {
     public static void main(String[] args) {
         
         AbstractFactory bidangfFactory = FactoryProducer.getFactory(false);
         //
         Bidang bidang1 = bidangfFactory.getBidang("SEGITIGA");
         bidang1.draw();
         //
         bidang1.draw();
         //
         Bidang bidang2 = bidangfFactory.getBidang("JAJARGENJANG");
         //
         bidang2.draw();
         //
         AbstractFactory bidangFactory1 = FactoryProducer.getFactory(true);
         //
         Bidang bidang3 = bidangfFactory.getBidang("SEGITIGA");
         //
         bidang3.draw();
         //
         Bidang bidang4 = bidangfFactory.getBidang("JAJARGENJANG");
         //
         bidang4.draw();

        

    }
}
 
