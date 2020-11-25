package com.progmatic.bpdiary.model.evaluation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCondition is a Querydsl query type for Condition
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCondition extends EntityPathBase<Condition> {

    private static final long serialVersionUID = 1569393762L;

    public static final QCondition condition1 = new QCondition("condition1");

    public final StringPath condition = createString("condition");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.progmatic.bpdiary.model.measurement.MeasurementDetails, com.progmatic.bpdiary.model.measurement.QMeasurementDetails> measurementDetails = this.<com.progmatic.bpdiary.model.measurement.MeasurementDetails, com.progmatic.bpdiary.model.measurement.QMeasurementDetails>createList("measurementDetails", com.progmatic.bpdiary.model.measurement.MeasurementDetails.class, com.progmatic.bpdiary.model.measurement.QMeasurementDetails.class, PathInits.DIRECT2);

    public QCondition(String variable) {
        super(Condition.class, forVariable(variable));
    }

    public QCondition(Path<? extends Condition> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCondition(PathMetadata metadata) {
        super(Condition.class, metadata);
    }

}

