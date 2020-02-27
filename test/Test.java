/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.Calc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 *
 * @author Dr.Abuzant
 */
public class Test {
     @org.junit.Test
    public void add_TwoPositiveNumbers_ReturnOnePositiveOne(){
     Calc m =new Calc();
     assertEquals("1+1=2",m.add(1,1),2);
}
    
     
     
   
    

}