/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikipediateste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WikipediaTalker {

    //Create the Scanner Object that we need
    

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        System.out.println("Digite a entrada");
        entrada = scanner.nextLine();
        Document doc = Jsoup.connect("https://www.google.com/search?q="+entrada).get();
        String html = doc.html();
        Files.write(Paths.get("C:\\Users\\junio\\Desktop\\teste.txt"),html.getBytes());
        Elements el = doc.getElementsByClass("kno-rdesc");
        Elements al = null;
        Element certo = null;
        int i = 0;
        for(Element oi:el){
            al = oi.getElementsByTag("span");
            break;
        }
        if(al==null){
            System.out.println("NOT FOUND");
        }else{
        System.out.println(al.text());
        }
        scanner.close();
    }

    }
    