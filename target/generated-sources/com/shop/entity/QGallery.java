package com.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGallery is a Querydsl query type for Gallery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGallery extends EntityPathBase<Gallery> {

    private static final long serialVersionUID = -37298638L;

    public static final QGallery gallery = new QGallery("gallery");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final DatePath<java.time.LocalDate> endTime = createDate("endTime", java.time.LocalDate.class);

    public final EnumPath<com.shop.constant.GalleryStatus> galleryStatus = createEnum("galleryStatus", com.shop.constant.GalleryStatus.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final DatePath<java.time.LocalDate> startTime = createDate("startTime", java.time.LocalDate.class);

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QGallery(String variable) {
        super(Gallery.class, forVariable(variable));
    }

    public QGallery(Path<? extends Gallery> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGallery(PathMetadata metadata) {
        super(Gallery.class, metadata);
    }

}

