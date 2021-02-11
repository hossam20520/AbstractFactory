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
public abstract class AbstractProductFactory {
        abstract IProduct getMobile(String mobileType);
        abstract IProduct getCar(String carType);
}
