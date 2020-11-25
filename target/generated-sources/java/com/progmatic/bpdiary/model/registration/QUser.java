package com.progmatic.bpdiary.model.registration;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1667822841L;

    public static final QUser user = new QUser("user");

    public final StringPath activation = createString("activation");

    public final DatePath<java.time.LocalDate> birthDate = createDate("birthDate", java.time.LocalDate.class);

    public final NumberPath<Double> BMI = createNumber("BMI", Double.class);

    public final StringPath email = createString("email");

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Double> height = createNumber("height", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isMale = createBoolean("isMale");

    public final StringPath lastName = createString("lastName");

    public final ListPath<com.progmatic.bpdiary.model.measurement.MeasurementDetails, com.progmatic.bpdiary.model.measurement.QMeasurementDetails> measurements = this.<com.progmatic.bpdiary.model.measurement.MeasurementDetails, com.progmatic.bpdiary.model.measurement.QMeasurementDetails>createList("measurements", com.progmatic.bpdiary.model.measurement.MeasurementDetails.class, com.progmatic.bpdiary.model.measurement.QMeasurementDetails.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final NumberPath<Long> pictureId = createNumber("pictureId", Long.class);

    public final SetPath<Role, QRole> roles = this.<Role, QRole>createSet("roles", Role.class, QRole.class, PathInits.DIRECT2);

    public final StringPath username = createString("username");

    public final NumberPath<Double> weight = createNumber("weight", Double.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

