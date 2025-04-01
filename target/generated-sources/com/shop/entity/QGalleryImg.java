package com.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGalleryImg is a Querydsl query type for GalleryImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGalleryImg extends EntityPathBase<GalleryImg> {

    private static final long serialVersionUID = 1232878641L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGalleryImg galleryImg = new QGalleryImg("galleryImg");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final QGallery gallery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgName = createString("imgName");

    public final StringPath imgUrl = createString("imgUrl");

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    public final StringPath oriImgName = createString("oriImgName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final StringPath repimgYn = createString("repimgYn");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QGalleryImg(String variable) {
        this(GalleryImg.class, forVariable(variable), INITS);
    }

    public QGalleryImg(Path<? extends GalleryImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGalleryImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGalleryImg(PathMetadata metadata, PathInits inits) {
        this(GalleryImg.class, metadata, inits);
    }

    public QGalleryImg(Class<? extends GalleryImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gallery = inits.isInitialized("gallery") ? new QGallery(forProperty("gallery")) : null;
    }

}

