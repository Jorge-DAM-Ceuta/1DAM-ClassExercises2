package Tema3;

    import java.util.Scanner;

public class Temperatura {
    
    private double celsius;
    
    Temperatura(double t){
    celsius=t;
    }
    
    public void pronostico(int nub){
        
    Scanner scan=new Scanner(System.in);
    
        if(celsius<0){
        System.out.print("Temperatura muy fría");
        }
        
        if(celsius>=0 && celsius<15){
        System.out.print("Temperatura fría");
        }
        
        if(celsius>15 && celsius<30){
        System.out.print("Temperatura calurosa");
        }
        
        if(celsius>30){
        System.out.print("Temperatura muy calurosa");
        }
        
        System.out.print("Elige 1, 2 o 3: ");
        nub=scan.nextInt();
        
        switch(nub){
            
            case 1:
              System.out.println("El cielo está despejado");  
                break;
                
            case 2:
              System.out.println("El cielo está ligeramente nublado"); 
                break;
                
            case 3:
              System.out.println("El cielo está encapotado");  
                break;
        }
    }
    
    public double CelsiusToFarenheit(double n){
        double resultado=0;
        resultado=((9/5)*n)+32;
        return resultado;
    }
 
    public double FarenheitToCelsius(double n){
        return (n-32)*0.5;
        
    }
    
}
