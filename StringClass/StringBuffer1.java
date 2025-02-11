package StringClass;

public class StringBuffer1 {
    public static void main(String[] args) {

        // StringBuffer

        StringBuffer str= new StringBuffer("Hello");

        StringBuffer str2= str.append("World");
        System.out.println(str);  // mutable
        System.out.println(str2);  //

        System.out.println(str.length());  //10 due to mutable

        //String Builder

        StringBuilder str3= new StringBuilder("StringBuilder");
        System.out.println(str3.append("Is Class of "));

        System.out.println(" Reverse StringBuffer"+str3.reverse());

        // convert string buffer to string builder

        StringBuffer str4= new StringBuffer("Hello");
        String s5= str4.toString();

        StringBuilder str5= new StringBuilder(s5);

        System.out.println("StringBuffer str4 : " +  str4);


        System.out.println("StringBuilder str5 : " +  str5);

        // convert StringBuilder to stringbufer

        StringBuilder str6 = new StringBuilder("Java");

        String str7 = str6.toString();

        StringBuffer str8 = new StringBuffer(str7);

        System.out.println("StringBuilder str6 " + str6);
        System.out.println("String str7 : "+ str7);
        System.out.println("StringBuffer str8: " +str8 );


    }

}
