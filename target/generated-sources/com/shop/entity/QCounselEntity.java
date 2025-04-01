package com.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCounselEntity is a Querydsl query type for CounselEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCounselEntity extends EntityPathBase<CounselEntity> {

    private static final long serialVersionUID = -2054642344L;

    public static final QCounselEntity counselEntity = new QCounselEntity("counselEntity");

    public final StringPath adminId = createString("adminId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath message = createString("message");

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final StringPath senderId = createString("senderId");

    public final StringPath senderName = createString("senderName");

    public final NumberPath<Integer> unreadCount = createNumber("unreadCount", Integer.class);

    public final StringPath userId = createString("userId");

    public final StringPath username = createString("username");

    public QCounselEntity(String variable) {
        super(CounselEntity.class, forVariable(variable));
    }

    public QCounselEntity(Path<? extends CounselEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCounselEntity(PathMetadata metadata) {
        super(CounselEntity.class, metadata);
    }

}

