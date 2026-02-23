public class Strings {
    public static void main(String[] args) {
        String name = " Praveen ";
        int value = name.length();

        System.out.println(name);   //Praveen
        System.out.println("The length of Praveen Lamani is " +  value);   //Length 9
        
        String lstring = name.toLowerCase();
        System.out.println(lstring);    //praveen

        String ustring = name.toUpperCase();  
        System.out.println(ustring);   //PRAVEEN

        System.out.println(name.substring(1));     //raveen
        System.out.println(name.substring(1,4));   //rav
 
        System.out.println(name.startsWith(" Praveen "));   //true
        System.out.println(name.endsWith("vin"));        //false

    }

    
}
