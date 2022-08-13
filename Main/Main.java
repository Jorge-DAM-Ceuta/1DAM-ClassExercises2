package Tema3;

import java.util.Scanner;

public class Main {

   public static boolean esPar(int num){
        boolean resultado;
        
        if(num%2==0){
            resultado=true;
        }
        else{
            resultado=false;
        }
        
        return resultado;
    }

    public static double leerNumeros(){
    Scanner scan=new Scanner(System.in);
        double num;
    
        System.out.println("Introduce un número: ");
        num=scan.nextDouble();
    
        if(num<0){
        System.out.println("El número es negativo");
        return (num*(-1));
    }
    if(num==0){
        System.out.println("El número es 0");
        return -1;
    }
    if(num>10){
        System.out.println("El numero es mayor que 10");
        return num%10;
    } 
    return num;
    }
    
    public static void leerEdad(){
    Scanner scan=new Scanner(System.in);
        int edad;
    
        System.out.println("Introduce tu edad: ");
        edad=scan.nextInt();
     
    if(edad<0){
    System.err.println("La edad no puede ser menor que 0");
    } 
    if(edad>120){
    System.err.println("La edad no puede ser mayor que 120");
    }
    if(edad>=0 && edad<18){
    System.out.println("El usuario es menor de edad");
    }
    
    /*if(edad>0 && edad<=120){
    System.out.println("La edad está en el rango");
        if(edad<18){
            System.out.println("El usuario es menor de edad");
        }
        else{
        System.out.println("La edad introducida no es válida");
        }
    }*/
}
    
    public static double devuelvePeso(double pesoKg){
    Scanner scan=new Scanner(System.in);
       
        pesoKg=2;
        double resultado=0;
        
    System.out.println("Elige la conversión con: g, t, o, l...");
    String con=scan.nextLine();
    
    switch(con){
        case "g":
            resultado=pesoKg*1000;
        break;
        
        case "t":
            resultado=pesoKg/1000;
        break;
        
        case "o":
            pesoKg=pesoKg*1000; 
            resultado=pesoKg/1000;
        break;
        
        case"l":
            pesoKg=pesoKg*1000;
            resultado=pesoKg/28.35;
        break;
        
        default:
            System.err.println("No es válido");
        break;
    }
    return resultado;
    }
    
    public static void mesdelA�o(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Introduce un mes del año: ");
    int mes=scan.nextInt();
        
        if(mes<0 || mes>12){
        System.err.println("El mes no es válido");
        }else{
            
            switch(mes){
        case 1:
            System.out.println("Enero");
            break;
        case 2:
            System.out.println("Febrero");
            break;
        case 3:
            System.out.println("Marzo");
            break;
        case 4:
            System.out.println("Abril");
            break;
        case 5:
            System.out.println("Mayo");
            break;
        case 6:
            System.out.println("Junio");
            break;
        case 7:
            System.out.println("Julio");
            break;
        case 8:
            System.out.println("Agosto");
            break;
        case 9:
            System.out.println("Septiempre");
            break;
        case 10:
            System.out.println("Octubre");
            break;
        case 11:
            System.out.println("Noviembre");
            break;
        case 12:
            System.out.println("Diciembre");
            break;
        default:
            System.err.println("Mes incorrecto");
    }
     }
   }
    
    public static void cadenaFin(){
    Scanner scan=new Scanner(System.in);
    String cadena;
    
    do{
        System.out.println("Escribe FIN: ");
        cadena=scan.nextLine();
        
    }while(!cadena.equals("FIN"));
    //equals, contains... 
    }
    
    public static void escribeunNumero(){
    Scanner scan=new Scanner(System.in);
    double num;

    do{
        System.out.println("Escribe un numero del 1 al 10");
        num=scan.nextDouble();
        
    }while(!(num>=1 && num<=10));
    }
    
    private static void bucle1(){
    
        for(int i=1; i<11; i+=2){
        i--;
        System.out.println(i);
        }
    }
    
    private static void bucle2(){
    
        for(int i=1; i!=10; i++){
        i++;
        System.out.println(i);
        }
    }
    
    private static void bucle3(){
    
        for(int i=0; i<=100; i*=2){
        i++;
        System.out.println(i);
        }
    }
    
    private static void bucle4(){
    
        for(int i=1; i<=10; i*=2){
        i++;
        System.out.println(i);
        }
    }
    
    private static void bucle5(){
    
        for(int i=0; i%2==0; i+=2){
        if(i==50){
            
           i++;}
        System.out.println(i);
        }
    }
    
    private static void codigoASCII(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Introduce texto: ");
    while(true){
        int letra=scan.nextInt();
        System.out.println((char)letra);
    }
    }
    
    private static void myBucle1(){
    
        for(double i=200; i<=300; i++){
        System.out.println(i);
        }
    }
    
    private static void ejercicio11(){
    
    int i=0;
        
        while(i<15){
        System.out.println(i);
            i++;
        }
    }
    
    private static void ejercicio12(){
    
        for(int i=1; 1<=10; i++){
    
        switch (i){
            case 1:
                System.out.println("One");
            break;
            
            case 2:
                System.out.println("Two");
            break;
            
            case 3:
                System.out.println("Three");
            break;
            
            case 4:
                System.out.println("Four");
            break;
            
            case 5:
                System.out.println("Five");
            break;
            
            case 6:
                System.out.println("Six");
            break;
            
            case 7:
                System.out.println("Seven");
            break;
            
            case 8:
                System.out.println("Eight");
            break;
            
            case 9:
                System.out.println("Nine");
            break;
            
            case 10:
                System.out.println("Ten");
            break;
    }
    }
    }
    
    private static void ejercicio13(){
    Scanner scan=new Scanner(System.in);
    int x, y;
            
    int s;
    
    System.out.println("Introduce dos numeros");
    x=scan.nextInt();
    y=scan.nextInt();
    
    System.out.println("Elige una opcion 1, 2 o 3");
    s=scan.nextInt();
    
    switch (s){
    
        case 1:
        
        if(x>y){
        System.out.println("El primer numero es mayor");
        }
        break;
        
        case 2:
            
        if(x==y){
        System.out.println("Los numeros son iguales");
        }
        break;
        
        case 3:
        
        int potencia=1;
        int i;
        for(i=1;i<=y;i++){
         potencia=potencia*x;
         System.out.println(potencia);
        }
        break;
    }
    
    }
    
    private static void ejercicio14(){
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Introduce un numero: ");
    double actual;
            actual=scan.nextDouble();
    double mayor=actual, menor=actual;
    
    while(actual!=-1){
        System.out.println("INTRODUCE OTRO NUMERO: EL -1 DETIENE LA PETICION ");
    actual=scan.nextDouble();
    
    if(actual>mayor){
        mayor=actual;
    }
    if(actual<menor){ 
        menor=actual;
    }
    }
    System.out.println("El mayor es: " + mayor + "El menor es: " + menor);
    }
    
    
    public static void ejercicio15(){
        
    Scanner scan=new Scanner(System.in);
    
    int num;
    int cifras=1;  
            
    do{
    System.out.println("Introduce un numero positivo");
    num=scan.nextInt();
    
    while(num/10!=0){
    cifras++;
    num/=10;
    System.out.println(num);
    }
   
        System.out.println("El numero tiene " + cifras + " cifras.");
    }
    while(num<0);
    }
    
    public static void factorial(int num){
    
    int factorial, i, j;
    
       for(i=num; i>0; i--){
            factorial=1;
        
       for(j=i; j>0; j--){
            factorial=factorial*j;
        }
        System.out.println("Factorial de " +i+ ":" + factorial);
        }
    }
    
    
    public static void asterisco(int altura){
    
    int i, j;
    
        for(i=1; i<=altura; i++){
            
            for(j=1; j<=i; j++){
                System.out.print('*');
            }
        System.out.println("");
        }
    }
    
    
    public static void ejercicio20(){
    
        char x, y;
            
            for(x='Z'; x>='A'; x--){
            
                for(y=x; y>='A'; y--){
                    System.out.print(y);
                }
            System.out.println("");
            }
    }

   public static void main(String[] args) {
        
        //System.out.println(esPar(2));
        
        /*double n;
        n=leerNumeros();
        System.out.println(n);*/
        
        //leerEdad();
        
        //System.out.println(devuelvePeso(5.5));
        
        //mesdelAño();
        
        //cadenaFin();
        
        //escribeunNumero();
        
        //bucle1();
        //bucle5();
        
        //codigoASCII();
        
        //ejercicio11()
        //ejercicio12();
        //ejercicio13();
        
        //ejercicio14();
        //ejercicio15();
        
        /*Temperatura t=new Temperatura(20);
        t.pronostico(2);*/
        
        //System.out.println(factorial(5));
        
        //asterisco(4);
        
        ejercicio20();
    }


        
}