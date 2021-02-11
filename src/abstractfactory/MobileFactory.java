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
public class MobileFactory extends AbstractProductFactory {

    @Override
    IProduct getMobile(String mobileType) {
               if(mobileType == null){
                       return  null;
                   }
        if(mobileType.equalsIgnoreCase("Nokia")){
            return new Nokia();
        }else  if(mobileType.equalsIgnoreCase("Samsung")){
        return  new Samsung();   
        }
        
         return null;
    }

    @Override
    IProduct getCar(String carType) {
       return null;
    
    }
    
}
