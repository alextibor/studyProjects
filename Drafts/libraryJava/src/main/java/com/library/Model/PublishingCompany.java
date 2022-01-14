package com.library.Model;

public class PublishingCompany {
    private String pcName;

    public PublishingCompany() {
    }

    public PublishingCompany(String pcName) {
        this.pcName = pcName;
    }

    public String getPcName() {
        return this.pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public PublishingCompany pcName(String pcName) {
        setPcName(pcName);
        return this;
    }
}
    
