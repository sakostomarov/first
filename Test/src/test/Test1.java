/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno1{
    int i();
    String s();
}

/**
 *
 * @author stanislav.kostomarov
 */
@Anno1(i = 58, s = "Хер")
public class Test1 {
    @Anno1(i = 58, s = "Хер")
    Test1(){
        Annotation[] anno;
        anno = this.getClass().getAnnotations();

        for(Annotation a : anno) System.out.println(a + "  ");
    }
    
    @Anno1(i = 58, s = "Хер")
    public void Print(){
        DataOutputStream logFile;
                //= new FileOutputStream("C:\\temp\\12\\out.log");
        logFile = new DataOutputStream();
        
        Test1 t11 = new Test1();
        
        Annotation[] anno;
        anno = t11.getClass().getAnnotations();
        logFile.writeChars("Test!!!");
        logFile.

        System.out.println("In print");
        for(Annotation a : anno) System.out.println(a + "  ");
    }
}
