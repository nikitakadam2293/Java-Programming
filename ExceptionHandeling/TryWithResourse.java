package ExceptionHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourse {
    public static void main(String[] args) {

        Scanner scanner =null;
        try
        {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext())
            {
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        finally {
            if(scanner != null)
                scanner.close();
        }

        // java 7 => try with resoure

        try(Scanner scanner1 = new Scanner(new File("test.txt")))
        {
            while (scanner1.hasNext())
            {
                System.out.println(scanner1.nextLine());
            }
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
    }
}
