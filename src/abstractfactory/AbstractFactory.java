/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author hossam hassan
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         AbstractProductFactory mobFac = FactoryProducer.getFactory("Mobiles");
        IProduct mobile = mobFac.getMobile("Nokia");
        mobile.Build();
        
        AbstractProductFactory carFa = FactoryProducer.getFactory("Cars");
        IProduct car = carFa.getCar("Ferrari");
        car.Build();
        
    }
    
}
