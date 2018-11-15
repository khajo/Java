package weekP2.Ex1.printer;

import weekP2.Ex1.Magazine.Magazine;

import java.util.List;

public class Printer {

    public void print(Article article) {
        System.out.println(article.getTitle());
        System.out.println(article.getText());
    }


    public void printMagazine(Magazine magazine){
        System.out.println(magazine.getTitle());
        List<Article> articles= magazine.getArticle();
        for (Article article: articles
             ) {
            System.out.println(article.getTitle());
        }


    }
}



/*Reuse the Printer from exercise 1 (don’t copy it, reuse the existing one from the package where it already is).
 Add the new method printMagazine to the Printer that receives a Magazine and displays its title and then all the articles.*/