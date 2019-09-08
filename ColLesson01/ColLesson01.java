package com.company.ColLesson01;
import java.awt.*;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        Integer hoge = null;
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[10]; //入力した単語&意味配列
        String[] text = new String[10]; //半スぺで区切って格納配列
        Word[] word = new Word[10]; //オブジェクトの配列
        int i=0;
        System.out.println("次の単語と意味を入力してください。”e”で終了します");
        while(scanner.hasNext()) {
            System.out.println("次の単語と意味を入力してください。”e”で終了します");
            String input = scanner.nextLine(); //入力します
            if ("e".equals(input)) break;    //"e"で終了
            str[i] = input;
            text = str[i].split(" "); //半スぺで区切って格納
            word[i] = new Word(text[0],text[1]); //オブジェクトを10個作ります
            i=i+1;
            //str配列からnullをカット
            for(String a: str) {
                if(a != null){
                    //出力を入れるための{}
                }
            }
        }//while終わり

        //作ったオブジェクトを呼び出します
        try {
            for (int j = 0; j < word.length; j++) {
                word[j].attack();
            }
        }
        catch (NullPointerException e){
            System.out.println("※Null発生");
        }
        System.out.println("※後続処理");

        System.out.println(i+"件登録しました");
        }
    }


