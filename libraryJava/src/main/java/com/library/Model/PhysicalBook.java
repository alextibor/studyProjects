package com.library.Model;

public class PhysicalBook extends Product{

    public PhysicalBook(){
        super.pc = new PublishingCompany();
        super.author = new Author();
    }

    @Override
    public void setPublishingCompanyName(String pcName){
        pc.setPcName(pcName);
    }

    public Double getPrintingTax() {
        return this.getValue() * 0.05;
    }

}