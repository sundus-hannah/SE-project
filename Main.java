import java.io.*;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      try {
         Scanner scnr = new Scanner(new File("simulation1.txt"));
         SimpleHost centralHost = new SimpleHost();
         LinkedEventList list = new LinkedEventList();
         int num, distance;
         num = scnr.nextInt();
         centralHost.setHostParameters(num, list);
         while (scnr.hasNextLine()) {
            num = scnr.nextInt();
            if (num < 0) {
               scnr.nextLine();
               break;
            }
            distance = scnr.nextInt();
            scnr.nextLine();
            SimpleHost neighborHost = new SimpleHost();
            neighborHost.setHostParameters(num, list);
            neighborHost.addNeighbor(centralHost, distance);
            centralHost.addNeighbor(neighborHost, distance);
         }
         while(scnr.hasNextLine()) {
            int host = scnr.nextInt(), dest = scnr.nextInt(), interval = scnr.nextInt(), duration = scnr.nextInt();
            
            centralHost.sendPings(dest, interval, duration);
            
         }
         









         scnr.close();
      } catch (FileNotFoundException e) {
         System.err.println("File not found: " + e);
      }
   }
}
