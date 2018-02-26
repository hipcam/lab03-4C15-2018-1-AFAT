package com.tecsup.lab03.lab03_4C15_2018_1_AFAT;

import javax.swing.JOptionPane;

public class Metodos {
 
	public void Suma(){
       
      int  a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor para la suma"));
      int  b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor para la suma"));
      int  c=a+b;
        JOptionPane.showMessageDialog(null, "La suma es: "+c);
		
	}
	public void Resta(){
		
	      int  a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor para la resta"));
	      int  b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor para la resta"));
	      int  c=a-b;
	        JOptionPane.showMessageDialog(null, "La resta es: "+c);
		
	}
	
	public static void multiplicacion(){
		
	      int  a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor para la resta"));
	      int  b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor para la resta"));
	      int  c=a*b;
	        JOptionPane.showMessageDialog(null, "El producto es : "+c);
		
	}
	public static void division(){
		
	      int  a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor para la resta"));
	      int  b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor para la resta"));
	      int  c=a/b;
	        JOptionPane.showMessageDialog(null, "La division es : "+c);
		
	}
	
}

