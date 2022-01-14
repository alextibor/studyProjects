package com.library.Model;

public abstract class Product {
    
    protected String productName;
    protected String description;
    protected Double value;
    protected String isbn;
    protected Author author;
    protected PublishingCompany pc;
    protected Boolean printed;
    
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public PublishingCompany getPc() {
        return this.pc;
    }

    public void setPc(PublishingCompany pc) {
        this.pc = pc;
    }

    public Boolean isPrinted() {
        return this.printed;
    }

    public Boolean getPrinted() {
        return this.printed;
    }

    public void setPrinted(Boolean printed) {
        this.printed = printed;
    }

    public void setAuthorName(String authorName){

        author.setName(authorName);
    }

    public void setPublishingCompanyName(String pcName){

        pc.setPcName(pcName);
    }
}