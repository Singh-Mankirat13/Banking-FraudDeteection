package com.fraud.model;

import java.time.LocalDateTime;

public class Transaction {
    private static int nextId = 1;

    private final int id;
    private String accountId;
    private double amount;
    private String merchant;
    private final String type;
    private String location;
    private LocalDateTime timestamp;
    private int riskScore;
    private boolean flagged;

     public Transaction(String accountId, double amount, String merchant,
                       String location, LocalDateTime timestamp,String type) {
        this.id = nextId++;
        this.accountId = accountId;
        this.amount = amount;
        this.merchant = merchant;
        this.type=type;
        this.location = location;
        this.timestamp = timestamp;
        this.riskScore = 0;
        this.flagged = false;
    }

    public int getId() { return id; }
    public String getAccountId() { return accountId; }
    public double getAmount() { return amount; }
    public String getMerchant() { return merchant; }
    public String getLocation() { return location; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getType() { return type; }
    public int getRiskScore() { return riskScore; }
    public boolean isFlagged() { return flagged; }

    public void setRiskScore(int riskScore) { this.riskScore = riskScore; }
    public void setFlagged(boolean flagged) { this.flagged = flagged; }

        @Override
    public String toString() {
        return "#" + id + " " + accountId + " " + amount + " " + merchant
                + " " + location + " risk=" + riskScore + " flagged=" + flagged;
    }
}