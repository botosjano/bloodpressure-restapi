package com.progmatic.bpdiary.model.registration;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProfilePicture is a Querydsl query type for ProfilePicture
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProfilePicture extends EntityPathBase<ProfilePicture> {

    private static final long serialVersionUID = -406573231L;

    public static final QProfilePicture profilePicture = new QProfilePicture("profilePicture");

    public final ArrayPath<byte[], Byte> data = createArray("data", byte[].class);

    public final StringPath fileName = createString("fileName");

    public final StringPath fileType = createString("fileType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QProfilePicture(String variable) {
        super(ProfilePicture.class, forVariable(variable));
    }

    public QProfilePicture(Path<? extends ProfilePicture> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProfilePicture(PathMetadata metadata) {
        super(ProfilePicture.class, metadata);
    }

}

