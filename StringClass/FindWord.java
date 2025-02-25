package StringClass;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String s = sobj.nextLine();

        System.out.println("Enter Word :");
        String word = sobj.next();

        String w []= s.split("\\W+");

        for(int i =0; i<w.length;i++)   //

        {
            if(w[i].equals(word))
            {
                System.out.println("Word found");
            }
        }

    }
}

/*
if we use i<s.length() then
Enter String :
java ia lang
Enter Word :
java
Word found
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at StringClass.FindWord.main(FindWord.java:19)


	therefore i<w.length use.
* */