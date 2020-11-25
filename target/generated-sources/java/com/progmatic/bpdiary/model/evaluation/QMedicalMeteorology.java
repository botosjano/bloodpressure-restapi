package com.progmatic.bpdiary.model.evaluation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMedicalMeteorology is a Querydsl query type for MedicalMeteorology
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMedicalMeteorology extends EntityPathBase<MedicalMeteorology> {

    private static final long serialVersionUID = -1147243072L;

    public static final QMedicalMeteorology medicalMeteorology = new QMedicalMeteorology("medicalMeteorology");

    public final DateTimePath<java.time.ZonedDateTime> date = createDateTime("date", java.time.ZonedDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.progmatic.bpdiary.model.measurement.MeasurementDetails, com.progmatic.bpdiary.model.measurement.QMeasurementDetails> measurementDetails = this.<com.progmatic.bpdiary.model.measurement.MeasurementDetails, com.progmatic.bpdiary.model.measurement.QMeasurementDetails>createList("measurementDetails", com.progmatic.bpdiary.model.measurement.MeasurementDetails.class, com.progmatic.bpdiary.model.measurement.QMeasurementDetails.class, PathInits.DIRECT2);

    public final StringPath text = createString("text");

    public QMedicalMeteorology(String variable) {
        super(MedicalMeteorology.class, forVariable(variable));
    }

    public QMedicalMeteorology(Path<? extends MedicalMeteorology> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMedicalMeteorology(PathMetadata metadata) {
        super(MedicalMeteorology.class, metadata);
    }

}

