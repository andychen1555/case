package com.andy.demo.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

/**
 * @author: weipeng
 * @create: 2020-05-14 12:00
 * @description:
 */
public class JsoupTest {
    public static void main(String[] args) {
        String html = "<p style='margin-left: auto; margin-right: auto;'><font>100% Brand New and High Quality<br/>Material: Rhinestones / Alloy<br/>Quantity: 2pcs<br/>Pattern: Geometric<br/>Style: Korean<br/>Color: green, colorful, red, gray<br/>Package: 2pcs / set hair clip<br/></font></p><p><img style='width: 1000px; height: auto;display: block; margin-left: auto; margin-right: auto;' src='http://pspk.longpean.com/4360492659820514.jpeg?imageMogr2/thumbnail/1000x1000!'/></p><p><img style='width: 1000px; height: auto;display: block; margin-left: auto; margin-right: auto;' src='http://pspk.longpean.com/8224943257507125.jpeg?imageMogr2/thumbnail/1000x1000!'/></p><p><img style='width: 1000px; height: auto;display: block; margin-left: auto; margin-right: auto;' src='http://pspk.longpean.com/6060776138551156.jpeg?imageMogr2/thumbnail/1000x1000!'/></p><p><img style='width: 1000px; height: auto;display: block; margin-left: auto; margin-right: auto;' src='http://pspk.longpean.com/3141979728583349.jpeg?imageMogr2/thumbnail/1000x1000!'/></p><p><img style='width: 1000px; height: auto;display: block; margin-left: auto; margin-right: auto;' src='http://pspk.longpean.com/3167192623018756.jpeg?imageMogr2/thumbnail/1000x1000!'/></p><p><img style='width: 1000px; height: auto;display: block; margin-left: auto; margin-right: auto;' src='http://pspk.longpean.com/8349029047566570.jpeg?imageMogr2/thumbnail/1000x1000!'/></p>";
        Document htmlDoc = Jsoup.parse(html);
        htmlDoc.select("img").remove();
//        System.out.println(htmlDoc.text());
        Elements pElements = htmlDoc.select("p");
        for (Element e :pElements){
            if (!e.hasText()){
                e.remove();
            }
        }
        System.out.println(htmlDoc.toString());

//        Elements pngs = htmlDoc.select("img[src]");
//        for (Element element : pngs) {
//            String src = element.attr("src");
//            System.out.println(src);
//        }
    }
}
