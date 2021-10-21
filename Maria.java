import pepe.Suma;

public  class Maria{
public static void main(String[] args) {
    String hola = "paquito el chocolatero";
    System.out.println("el  pepe se llama maricarmen");
System.out.println(longitud(hola));

System.out.println(Suma.sumar(longitud(hola),23));
}

public static int longitud(String s){

    return s.length();
}


}