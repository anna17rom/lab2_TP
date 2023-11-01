package org.example;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    List<Element> Elements;
    String CustomerName;

    public Invoice(String CustomerName) {
        this.CustomerName=CustomerName;
        this.Elements = new ArrayList<>();
    }

    public void AddElement(Element element) {
        Elements.add(element);
    }

    public void PrintInvoice(){
        for (Element elements : Elements) {
            System.out.println(elements.type + " --> " +elements.amount+" x "+elements.price+" = "+elements.TotalPrice());
        }
    }

}
