package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        /*Scanner sf = new Scanner(new File(""));
        int maxIndx = -1;
        String text[] = new String[1000];
        while(sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        sf.close();*/

        BufferedReader br = new BufferedReader(new FileReader());
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        br.close();





    }
    
}
