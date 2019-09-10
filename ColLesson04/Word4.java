package com.company.ColLesson04;

public class Word4 {
    //フィールド=オブジェクト
    public String word;
    public String meaning;

    //Wordは下記のデータを持っている
    public Word4(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド

    @Override
    public String toString() {
        return "単語:"+this.word+" 意味:"+this.meaning;
    }

}
