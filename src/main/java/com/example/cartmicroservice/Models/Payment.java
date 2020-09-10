package com.example.cartmicroservice.Models;


import javax.persistence.*;

enum PaymentStatus {
    INCOMPLETE,
    PROCESSING,
    DONE
}


enum PaymentType {
    CREDITCARD,
    DEBITCARD,
    NETBANKING,
    UPI,
    WALLET
}

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @Enumerated
    @Column(columnDefinition = "smallint")
    private PaymentStatus paymentStatus;

    @Enumerated
    @Column(columnDefinition = "smallint")
    private PaymentType paymentType;

    private int amount;

    private String cardNumber;

    private String expiryDate;

    private String upiId;

    public Payment(int id, User user, PaymentStatus paymentStatus, PaymentType paymentType, int amount, String cardNumber, String expiryDate, String upiId) {
        this.id = id;
        this.user = user;
        this.paymentStatus = PaymentStatus.INCOMPLETE;
        this.paymentType = paymentType;
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.upiId = upiId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
