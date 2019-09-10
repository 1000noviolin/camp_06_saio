package com.company.ColLesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        ArrayList<Word4> words = new ArrayList<>(); //ArrayListに修正

        //※入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("わからない単語とその意味をスペースで区切って入力してください");
        String input = scanner.nextLine(); //1回目の入力はループ外に出す

        //※while
        int index=0;
        while(!input.equals("e")) {
            String[] tmp = input.split(" "); //tmpという配列に半スぺで区切って格納
            Word4 wd = new Word4(tmp[0],tmp[1]); //オブジェクト作る
            try {
                words.add(wd); //オブジェクトを配列に入れて5個作る
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済のデータは以下になります");
                break;
            }
            index++;
            System.out.println("次の単語と意味を入力してください。”e”で終了します");
            input = scanner.nextLine(); //2回目以降はループさせる
        }
        for(int i =0; i<index; i++) {
            System.out.println(words.get(i)); //オブジェクト[i]のwordとmeaning
        }
        System.out.println(words.size()+"件登録しました");
    }
}
