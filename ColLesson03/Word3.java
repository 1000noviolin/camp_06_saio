package com.company.ColLesson03;

public class Word3 {
    //フィールド=オブジェクト
    public String word;
    public String meaning;

    //Wordは下記のデータを持っている
    public Word3(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド

    @Override
    public String toString() {
        return "単語:"+this.word+" 意味:"+this.meaning;
    }

}
