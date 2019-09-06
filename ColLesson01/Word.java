package com.company.ColLesson01;

public class Word {
    //フィールド=オブジェクト
    public String word;
    public String meaning;


    public Word(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド
    public void attack(){
        System.out.println("単語"+word+"：意味"+meaning);
    }
}
