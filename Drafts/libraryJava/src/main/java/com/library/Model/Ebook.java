package com.library.Model;

public class Ebook extends Product {
    
    public Ebook(){
        super.pc = new PublishingCompany();
        super.author = new Author();
    }

    @Override
    public void setPublishingCompanyName(String pcName){
        pc.setPcName(pcName);
    }
    
}
