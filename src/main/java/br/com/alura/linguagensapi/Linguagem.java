package br.com.alura.linguagensapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
    
    @Id
    private String id;
    
    private String title;
    private String image;
    private int ranking;
    private int votes;

    public Linguagem(){

    }

    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
        this.votes = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getId() {
        return id;
    }

    public int getRanking() {
        return ranking;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

}
