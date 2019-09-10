package com.company.ColLesson02;

public class Word2 {
    //フィールド=オブジェクト
    public String word;
    public String meaning;

    //Wordは下記のデータを持っている
    public Word2(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド

    @Override
    public String toString() {
        return "単語:"+this.word+" 意味:"+this.meaning;
    }

}
