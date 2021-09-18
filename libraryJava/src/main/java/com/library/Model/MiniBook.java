package com.library.Model;

public class MiniBook extends Product{

    public MiniBook(){
        super.pc = new PublishingCompany();
        super.author = new Author();
    }

    @Override
    public void setPublishingCompanyName(String pcName){
        pc.setPcName(pcName);
    }
}
