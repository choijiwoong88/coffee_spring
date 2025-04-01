//package com.shop.entity;
//
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//
////그냥 실험
//@Entity
//@Getter
//@Setter
//@Table(name = "Group_Purchase")
//public class GroupPurchase {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "item_id")
//    private Item item;
//
//    private int targetParticipants; // 목표 참여 인원
//    private int currentParticipants; // 현재 참여 인원
//    private double discountRate; // 할인율 (0.1 = 10%)
//    private boolean isCompleted; // 공동구매 완료 여부
//    private LocalDateTime endTime; // 종료 시간
//
//    @OneToMany(mappedBy = "groupPurchase", cascade = CascadeType.ALL)
//    private List<GroupPurchaseMember> participants = new ArrayList<>();
//
//
//
//}
