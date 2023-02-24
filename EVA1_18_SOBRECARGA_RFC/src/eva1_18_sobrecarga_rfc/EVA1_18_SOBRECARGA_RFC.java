/*

 */
package eva1_18_sobrecarga_rfc;


public class EVA1_18_SOBRECARGA_RFC {


    public static void main(String[] args) {
    String rfc = generarRFC("YESSLY","MAYORGA","PUENTES",2004,9,10); 
    System.out.println("RFC de la persona: "+rfc);
    }
   
  public static String generarRFC(String nombre, String aPat, String aMat, int año, int mes, int dia){
  String ap = aPat.charAt(0) + "";
  String ap2 = aPat.charAt(1) + "";
  String am = aMat.charAt(0) + "";
  String nom = nombre.charAt(0) + "";
  String rfc = nom+ap+ap2+am+año+mes+dia+ "";
  return rfc;       
  }
 //SOBRECARGAR PARA LOS CASOS:
 //FALTE UN APELLIDO --> SUSTITUIR POR X
 //FALTEN 2 APELLIDOS --> SUSTITUIR POR XX
  
  
  
}
