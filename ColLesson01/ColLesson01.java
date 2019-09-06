package com.company.ColLesson01;
import java.awt.*;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[10];
        String[] text = new String[10];
        int j=0;
        int i=0;
        while(scanner.hasNext()) {
            System.out.println("次の単語と意味を入力してください。”e”で終了します");
            String input = scanner.nextLine(); //入力します
            if ("e".equals(input)) break;    //"e"で終了
            str[i] = input;
            text = str[i].split(" "); //半スぺで区切って格納
            Word word1 = new Word(text[j],text[j++]);
            i=i+1;
            j=j+1;

            for(String a: str) {
                if(a != null)
                    System.out.println(a);
            }

//            for(String tmp: text) {
//                System.out.println(tmp);
//            }
//            System.out.println(text[1]);
//            System.out.println(text[2]);
//            System.out.println(text[3]);

        }


//        System.out.println(str[i]);
//        System.out.println(i);
//        System.out.println(text[0]);
//        System.out.println(text[1]);

//            //オブジェクト
//            Word word1 = new Word(text[0],text[1]);
//            Word word2 = new Word(text[3],text[4]);
//            Word word3 = new Word(text[5],text[6]);

//            //オブジェクトを配列に格納
//             Word [] words = new Word[10];
//             words[0] = word1;
//             words[1] = word2;
//             words[2] = word3;

            }
        }

