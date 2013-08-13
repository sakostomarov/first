/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.lang.annotation.Annotation;

/**
 *
 * @author stanislav.kostomarov
 */

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        Test1 t1 = new Test1();

        t1.Print();
        
        Annotation[] anno;
        anno = t1.getClass().getAnnotations();

        for(Annotation a : anno) System.out.println("В main " + a + "  ");
    }
}
