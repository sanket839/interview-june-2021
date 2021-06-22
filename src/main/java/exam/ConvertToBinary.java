package exam;
import java.io.*;
import java.util.*;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int binary[] = new int[40];
    int index = 0;
    while(decimal > 0){
    binary[index++] = decimal%2;
    decimal = decimal/2;
    String k=Arrays.toString(binary);
    return k;
  }
}
