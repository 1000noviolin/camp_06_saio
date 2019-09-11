package com.company.ColLesson01;

import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        Word[] words = new Word[10]; //オブジェクトの配列

        //※入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("わからない単語とその意味をスペースで区切って入力してください");
        String input = scanner.nextLine(); //1回目の入力はループ外に出す

        //※while
        int index=0;
        while(!input.equals("e")) {
            String[] tmp = input.split(" "); //tmpという配列に半スぺで区切って格納
            Word wd = new Word(tmp[0],tmp[1]); //オブジェクト作る
            words[index] =wd; //オブジェクトを配列に入れて10個作る
            index++;
            System.out.println("次の単語と意味を入力してください。”e”で終了します");
            input = scanner.nextLine(); //2回目以降はループさせる
        }
        for(int i =0; i<index; i++) {
            System.out.println("単語:" + words[i].word + " 日本語:" + words[i].meaning); //wordsオブジェクト[i]のwordとmeaning
        }
        System.out.println(index+"件登録しました");
    }
}



