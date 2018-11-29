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
        double sNum = 0;
        double caseNum = 0;
        while (true) {
            if (sc.hasNext()) {
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == 's') {
                        sNum++;
                    }
                    caseNum++;
                }
            } else {
                break;
            }
        }
        System.out.println("percentage of 's' is " + sNum / caseNum);
    }
}
