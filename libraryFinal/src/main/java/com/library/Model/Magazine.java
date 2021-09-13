package com.library.Model;

public class Magazine extends Product{
    
    public Magazine(){
        super.pc = new PublishingCompany();
    }

    @Override
    public void setPublishingCompanyName(String pcName){
        pc.setPcName(pcName);
    }
}
