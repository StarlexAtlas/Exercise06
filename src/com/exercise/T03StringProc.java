package com.exercise;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**Demo Class
 * @author Starlex
 * @date 18.11.28
 */

public class T03StringProc {
    public static void main(String[] args) throws IOException {
        //完成文件的初始化任务
        String filename01 = "text01.txt";
        String filename02 = "text02.txt";
        String filename03 = "text03.txt";
        String filename04 = "text04.txt";
        String filename05 = "text05.txt";
        String filename06 = "text06.txt";
        String filename07 = "text07.txt";
        String filename08 = "text08.txt";
        String filename09 = "text09.txt";
        String filename10 = "text10.txt";
        File text01 = new File(filename01);
        File text02 = new File(filename02);
        File text03 = new File(filename03);
        File text04 = new File(filename04);
        File text05 = new File(filename05);
        File text06 = new File(filename06);
        File text07 = new File(filename07);
        File text08 = new File(filename08);
        File text09 = new File(filename09);
        File text10 = new File(filename10);
        File[] files = new File[]{text01, text02, text03, text04, text05, text06, text07, text08, text09, text10};

        for (int count = 0; count < files.length; count++) {
            BufferedReader br = new BufferedReader(new FileReader(files[count]));
            Random random = new Random();
            StringBuilder line = new StringBuilder();
            String thisLine;
            String fileContent;
            final int MAX = 100;
            double sNum = 0;
            double zNum = 0;
            double caseNum = 0;
            double sSimple = 0;
            double zSimple = 0;
            double caseSimple = 0;

            while((thisLine = br.readLine())!= null){
                line.append(thisLine);
            }
            fileContent = line.toString();
            //完整读取循环
            for (int i = 0; i < fileContent.length(); i++) {
                if (fileContent.charAt(i) == 's') {
                    sNum++;
                }else if(fileContent.charAt(i) == 'z'){
                    zNum++;
                }
                caseNum++;
            }
            //样本抽查循环
            for (int i = 0; i < MAX; i++) {
                int rd = random.nextInt(fileContent.length());
                if (fileContent.charAt(rd) == 's') {
                    sSimple++;
                }else if(fileContent.charAt(rd) == 'z'){
                    zSimple++;
                }
                caseSimple++;
            }

            System.out.printf("percentage of 's' of text%s is %.02f%%%n",count+1,sNum/caseNum*100);
            System.out.printf("percentage of 'z' of text%s is %.02f%%%n",count+1,zNum/caseNum*100);
            System.out.printf("percentage of 's' of text%s in simple is %.02f%%%n",count+1,sSimple/caseSimple*100);
            System.out.printf("percentage of 'z' of text%s in simple is %.02f%%%n%n",count+1,zSimple/caseSimple*100);
        }
    }
}
