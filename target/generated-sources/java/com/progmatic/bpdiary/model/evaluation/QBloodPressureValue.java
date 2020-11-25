package com.progmatic.bpdiary.model.evaluation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBloodPressureValue is a Querydsl query type for BloodPressureValue
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBloodPressureValue extends EntityPathBase<BloodPressureValue> {

    private static final long serialVersionUID = 1176354539L;

    public static final QBloodPressureValue bloodPressureValue = new QBloodPressureValue("bloodPressureValue");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxAge = createNumber("maxAge", Integer.class);

    public final StringPath maxValue = createString("maxValue");

    public final NumberPath<Integer> minAge = createNumber("minAge", Integer.class);

    public final StringPath minValue = createString("minValue");

    public final StringPath properValue = createString("properValue");

    public QBloodPressureValue(String variable) {
        super(BloodPressureValue.class, forVariable(variable));
    }

    public QBloodPressureValue(Path<? extends BloodPressureValue> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBloodPressureValue(PathMetadata metadata) {
        super(BloodPressureValue.class, metadata);
    }

}

