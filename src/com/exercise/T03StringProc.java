package com.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**Demo Class
 * @author Starlex
 * @date 18.11.28
 */

public class T03StringProc {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "text01.txt";
        Scanner sc = new Scanner(new File(filename));
        Random random = new Random();
        StringBuilder line = new StringBuilder();
        String fileContent;
        final int MAX = 100;
        double sNum = 0;
        double caseNum = 0;
        double sSimple = 0;
        double caseSimple = 0;
        if (sc.hasNext()) {
            line.append(sc.nextLine());
        }
        fileContent = line.toString();
        for(int i = 0;i < fileContent.length();i++){
            if(fileContent.charAt(i) == 's'){
                sNum++;
            }
            caseNum++;
        }
        for(int i = 0;i < MAX;i++){
            int rd = random.nextInt(fileContent.length());
            if(fileContent.charAt(rd) == 's'){
                sSimple++;
            }
            caseSimple++;
        }
        System.out.println("percentage of 's' is " + (sNum / caseNum)*100 +"%");
        System.out.println("percentage of 's' in simple is "+ (sSimple/caseSimple)*100 +"%");
    }
}
