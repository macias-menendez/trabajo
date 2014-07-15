/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Genesis
 */
public class EjerciciosProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0, y=0, a=7, b=6, r=0, m;
        int[] arreglo1=new int[128];
        int[] arreglo2=new int[128];
        int[] arreglo3=new int[255];
        for (int i = 0; i <= 127; i++) 
        {            
            arreglo1[i]=a;
            a=a+1;
            
        }
        for (int j = 0; j <= 127; j++) 
        {            
            arreglo2[j]=b;
            b=b-2;
            
        }
        a=0;
        for (int i = 0; i < 255; i++) 
        {
            m=i % 2;
            if (m==0)
            {
             arreglo3[i]=arreglo1[a];
             
            }
            else
            {                
                arreglo3[i]=arreglo2[a]; 
                a=a+1;
            }
            System.out.println(i+" "+arreglo3[i]);            
            
        }
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            r=-1;
        }
        else
        {
            for (int i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    a=arreglo3[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        b=arreglo3[i];
                    }
                    
                }
            }
            r=a+b;
        }
        JOptionPane.showMessageDialog(null, r);
        
        //Ejercicio 2
        
        int x,y,z;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255)
        {
            z=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+z);   
        }
        else
        {
            int[] array=new int[y];
            array[0]=x;
            for (int i = 1; i < array.length; i++) 
            {
               x=x*(i+1);
               array[i]=x;
                System.out.println(i+" "+array[i]);               
            }
            for (int i = 0; i < array.length; i++) 
            {
                if(i==(y-1))
                {
                    z=array[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+z);
                }
            }
            
            //Ejercicio 3
            
            int x,y,z,resultante;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255)
        {
            z=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+z);
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (int i = 1;i<arreglo.length; i++) 
            {
               resultante=x/(i+1);
               arreglo[i]=resultante;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
              if(i==(y-1))
                {
                    
                    JOptionPane.showMessageDialog(null,"Resultado "+arreglo[i]);
                }  
            }
        }
        
        //Ejercicio 4
        
        Scanner Ingreso = new Scanner(System.in);
        
        String S1="";
        String S2="";
        S1=(JOptionPane.showInputDialog("Ingrese Valor dentro de la Cadena 1"));
        S2=(JOptionPane.showInputDialog("Ingrese Valor dentro de la Cadena 2"));
        int longitud1=S1.length();
        int longitud2=S2.length();
        char[] frasecadena1 = S1.toCharArray();
        char[] frasecadena2 = S2.toCharArray();
        for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frasecadena1[j]== frasecadena2[i]) 
                  {
                      frasecadena1[j]=' ';
                  }
              }
          }
         for (int i=0;i<frasecadena1.length;i++)
               if (frasecadena1[i]!=' ') {
                   JOptionPane.showMessageDialog(null, frasecadena1[i] + " ");
               }
         //Ejercicio 5
          int p=Integer.parseInt(JOptionPane.showInputDialog("Registre rango del vector"));
        int[] vector=new int[p];
        int n=0;
        for (int i = 0; i < vector.length; i++) {
            
            int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad número"));

            vector[i]=num;
        }
        int i, j, varaux;
        for(i=0;i<vector.length-1;i++)
        for(j=0;j<vector.length-i-1;j++)
        if(vector[j+1]<vector[j]){
        varaux=vector[j+1];
        vector[j+1]=vector[j];
        vector[j]=varaux;
        } 
        JOptionPane.showMessageDialog(null, "Vector con numeros ingresados \n");
         for ( i = 0; i < vector.length; i++) {
         JOptionPane.showMessageDialog(null,vector[i]) ;     
    }
        JOptionPane.showMessageDialog(null, "\n El vector sin numeros repetidos \n"); 
         int a;
         for ( i = 0; i < vector.length; i++) {
         if (i==0) {
         JOptionPane.showMessageDialog(null,vector[i]) ;
         }
         else
             {
                 a=i-1;
                 varaux=vector[i];
             if (varaux==vector[a]) {
                 
             }else{
          JOptionPane.showMessageDialog(null,vector[i]) ;
             }
             }
        } 
         
         //Ejercicio 6
               BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese uns frase : ");
      String frase=a.readLine();
      String []palabra=frase.split(" ");

      for(int i=palabra.length-1;i>=0;i--){
          System.out.print(palabra[i]+" ");
      }
      
      //Ejercicio 9
       int num=0,c=0;
    for (int i = 0; i < 2; i++) 
    {
    num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
    if (num>0)
   {i=2;}
    else
            {
        i=0;
        JOptionPane.showMessageDialog(null, "Debe de Ingresar Valores Enteros Positivos es Decir Numeros Mayores a 0" );
            }  
        }
    long[] arreglo=new long[num];
    for (int i = 0; i < arreglo.length; i++) 
     {arreglo[i]=i*i;
     }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (num==arreglo[i])
            {
                i=arreglo.length;
                c=1;
            }
        }
        if (c==1 || num == 1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }
        
        
    }
    
}
