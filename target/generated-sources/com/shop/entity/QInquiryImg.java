package com.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInquiryImg is a Querydsl query type for InquiryImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInquiryImg extends EntityPathBase<InquiryImg> {

    private static final long serialVersionUID = -1545987684L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInquiryImg inquiryImg = new QInquiryImg("inquiryImg");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgName = createString("imgName");

    public final StringPath imgUrl = createString("imgUrl");

    public final QInquiry inquiry;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    public final StringPath oriImgName = createString("oriImgName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QInquiryImg(String variable) {
        this(InquiryImg.class, forVariable(variable), INITS);
    }

    public QInquiryImg(Path<? extends InquiryImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInquiryImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInquiryImg(PathMetadata metadata, PathInits inits) {
        this(InquiryImg.class, metadata, inits);
    }

    public QInquiryImg(Class<? extends InquiryImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.inquiry = inits.isInitialized("inquiry") ? new QInquiry(forProperty("inquiry"), inits.get("inquiry")) : null;
    }

}

