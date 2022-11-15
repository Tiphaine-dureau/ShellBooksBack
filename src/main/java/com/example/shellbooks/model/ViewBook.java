package com.example.shellbooks.model;

public class ViewBook {
    private String name;

    public ViewBook() {
    }

    public ViewBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ViewBook{" +
                "name='" + name + '\'' +
                '}';
    }
}
