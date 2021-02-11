/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Hossam Hassan
 */
public class FactoryProducer {
    
    
      public  static AbstractProductFactory getFactory(String factoryName) {
      
      if(factoryName == null){
          return  null;
      }
      if(factoryName.equalsIgnoreCase("Mobiles")){
          return new MobileFactory();
      }else if (factoryName.equalsIgnoreCase("Cars")){
          return new CarFactory();
      }
      
      return  null;
      
  }
}
