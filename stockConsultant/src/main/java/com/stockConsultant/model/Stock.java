package com.stockConsultant.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tab_stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="valueSymbol")
    private String symbol;
    @Column(name="valueOpen")
    private String open;
    @Column(name="valueHigh")
    private String high;
    @Column(name="valueLow")
    private String low;
    @Column(name="valuePrice")
    private String price;
    @Column(name="valueVolume")
    private String volume;
    @Column(name="valueLatestTradingDay")
    private String latestTradingDay;
    @Column(name="valuePreviousClose")
    private String previousClose;
    @Column(name="valueChange")
    private String change;
    @Column(name="valueChangePercent")
    private String changePercent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getLatestTradingDay() {
        return latestTradingDay;
    }

    public void setLatestTradingDay(String latestTradingDay) {
        this.latestTradingDay = latestTradingDay;
    }

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(String changePercent) {
        this.changePercent = changePercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return getId().equals(stock.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}