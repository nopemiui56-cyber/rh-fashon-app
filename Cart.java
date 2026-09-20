package com.rhfashon.app;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static class Item { public int id; public String name, image; public double price; public int qty;
        Item(int id,String name,String image,double price){this.id=id;this.name=name;this.image=image;this.price=price;this.qty=1;}
    }
    private static final List<Item> items = new ArrayList<>();
    public static synchronized void add(Item x){ for(Item i:items) if(i.id==x.id){i.qty++;return;} items.add(x); }
    public static synchronized void remove(int id){ items.removeIf(i->i.id==id); }
    public static synchronized void inc(int id){ for(Item i:items)if(i.id==id){i.qty++;return;} }
    public static synchronized void dec(int id){ for(Item i:items)if(i.id==id){i.qty--;if(i.qty<=0)items.remove(i);return;} }
    public static synchronized List<Item> all(){return new ArrayList<>(items);}
    public static synchronized int count(){int n=0;for(Item i:items)n+=i.qty;return n;}
    public static synchronized double total(){double n=0;for(Item i:items)n+=i.price*i.qty;return n;}
}
