package shifter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner {

    public static void main(String args[]) throws IOException {
        int[] arr = NumberShifter.makeLucky7Array(10);
        for(int i : arr){
            System.out.print(i);
        }
        NumberShifter.shiftEm(arr);
        out.println("");
        for(int i : arr){
            System.out.print(i);
        }
    }
}
