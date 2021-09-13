package com.library.Model;

public class Book extends Product {

    public Book(){
        super.pc = new PublishingCompany();
        super.author = new Author();
    }

    @Override
    public void setPublishingCompanyName(String pcName){
        pc.setPcName(pcName);
    }

    public String toString() {
        return "{" +
            " name='" + getProductName() + "'" +
            ", description='" + getDescription() + "'" +
            ", value='" + getValue() + "'" +
            ", isbn='" + getIsbn() + "'" +
            ", author='" + author.getName() + "'" +
            ", PublishCompany='" + pc.getPcName() + "'" +
            "}";
    } 
}
