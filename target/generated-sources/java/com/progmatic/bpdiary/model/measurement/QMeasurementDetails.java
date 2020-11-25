package com.progmatic.bpdiary.model.measurement;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeasurementDetails is a Querydsl query type for MeasurementDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMeasurementDetails extends EntityPathBase<MeasurementDetails> {

    private static final long serialVersionUID = 1436243665L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeasurementDetails measurementDetails = new QMeasurementDetails("measurementDetails");

    public final com.progmatic.bpdiary.model.evaluation.QCondition condition;

    public final DateTimePath<java.time.ZonedDateTime> date = createDateTime("date", java.time.ZonedDateTime.class);

    public final NumberPath<Integer> diastolicValue = createNumber("diastolicValue", Integer.class);

    public final com.progmatic.bpdiary.model.evaluation.QEvaluate evaluate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.progmatic.bpdiary.model.evaluation.QMedicalMeteorology medicalMeteorology;

    public final NumberPath<Integer> pulsePerMin = createNumber("pulsePerMin", Integer.class);

    public final NumberPath<Integer> systolicValue = createNumber("systolicValue", Integer.class);

    public final com.progmatic.bpdiary.model.registration.QUser user;

    public final com.progmatic.bpdiary.model.evaluation.QWeatherData wd;

    public QMeasurementDetails(String variable) {
        this(MeasurementDetails.class, forVariable(variable), INITS);
    }

    public QMeasurementDetails(Path<? extends MeasurementDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeasurementDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeasurementDetails(PathMetadata metadata, PathInits inits) {
        this(MeasurementDetails.class, metadata, inits);
    }

    public QMeasurementDetails(Class<? extends MeasurementDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.condition = inits.isInitialized("condition") ? new com.progmatic.bpdiary.model.evaluation.QCondition(forProperty("condition")) : null;
        this.evaluate = inits.isInitialized("evaluate") ? new com.progmatic.bpdiary.model.evaluation.QEvaluate(forProperty("evaluate")) : null;
        this.medicalMeteorology = inits.isInitialized("medicalMeteorology") ? new com.progmatic.bpdiary.model.evaluation.QMedicalMeteorology(forProperty("medicalMeteorology")) : null;
        this.user = inits.isInitialized("user") ? new com.progmatic.bpdiary.model.registration.QUser(forProperty("user")) : null;
        this.wd = inits.isInitialized("wd") ? new com.progmatic.bpdiary.model.evaluation.QWeatherData(forProperty("wd")) : null;
    }

}

