import java.util.*;
import java.io.*;

public class Solution{
  public static int countSetBits(int n){
    String binaryString = Integer.toBinaryString(n);
    int count = 0;
    for (int i = 0; i<binaryString.length(); i++){
      if(binaryString.charAt(i) == '1'){
        count++;
      }
    }
    return count;
  }
