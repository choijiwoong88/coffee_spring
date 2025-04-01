//package com.shop.entity;
//
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//
////그냥 실험
//@Entity
//@Getter
//@Setter
//@Table(name = "Group_Purchase_Member")
//public class GroupPurchaseMember extends BaseEntity{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Group_Purchase")
//    private GroupPurchase groupPurchase;
//
//    private String impUid;
//    private int amount;
//    private boolean isRefunded;
//
//}
