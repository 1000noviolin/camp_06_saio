package com.company.ColLesson01;

public class Word {
    //フィールド=オブジェクト
    public String word;
    public String meaning;

//Wordは下記のデータを持っている
    public Word(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド
    public void attack(){
        System.out.println("単語:"+this.word+" 意味:"+this.meaning);
    }
}
