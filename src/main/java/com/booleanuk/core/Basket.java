package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Item> items = new ArrayList<>();
//    List<Game> games = new ArrayList<>();
//    List<Drink> drinks = new ArrayList<>();
//    List<Book> books = new ArrayList<>();

    public void add(Item item) {
        this.items.add((item));
    }

//    public void add(Game game) {
//        this.games.add(game);
//    }
//
//    public void add(Drink drink) {
//        this.drinks.add(drink);
//    }
//
//    public void add(Book book) {
//        this.books.add(book);
//    }

    public int getTotal() {
        int total = 0;

        for (Item item : this.items) {
            total += item.getPrice();
        }

//        for (Game game : this.games) {
//            total += game.getPrice();
//        }
//
//        for (Drink drink : this.drinks) {
//            total += drink.getPrice();
//        }
//
//        for (Book book : this.books) {
//            total += book.getPrice();
//        }

        return total;
    }

    public boolean isInBasket(String name) {

        for (Item item : this.items) {
            if (item.getName().equals(name))
                return true;
        }

//        for (Game game : this.games) {
//            if (game.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Drink drink : this.drinks) {
//            if (drink.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Book book : this.books) {
//            if (book.getName().equals(name)) {
//                return true;
//            }
//        }

        return false;
    }
}
