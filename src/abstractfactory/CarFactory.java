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
public class CarFactory extends AbstractProductFactory {

    @Override
    IProduct getMobile(String mobileType) {
        return  null;
    }

    @Override
    IProduct getCar(String carType) {
       if(carType == null){
            return  null;
        }
        
      if(carType.equalsIgnoreCase("Ferrari")){
      return new Ferrari();
        
    }else if(carType.equalsIgnoreCase("Lamborghini")){
        return new Lamborghini();
    }
    
    
    return null;
    
    }
    
}
