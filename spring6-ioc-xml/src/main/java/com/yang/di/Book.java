package com.yang.di;

public class Book {

    private String bname;
    private String author;

    //生成set方法

    public Book() {
        System.out.println("无参数构造执行了");
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //有参数的构造方法
    public Book(String bname, String author) {
        System.out.println("有参数构造执行了。。。。");
        this.bname = bname;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("尚硅谷");

        //通过构造方法注入
        Book book1 = new Book("c++", "黑马");

    }
}
