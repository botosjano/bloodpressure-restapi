package com.progmatic.bpdiary.model.evaluation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWeatherData is a Querydsl query type for WeatherData
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWeatherData extends EntityPathBase<WeatherData> {

    private static final long serialVersionUID = -427922619L;

    public static final QWeatherData weatherData = new QWeatherData("weatherData");

    public final StringPath airPressure = createString("airPressure");

    public final StringPath humidity = createString("humidity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath temperature = createString("temperature");

    public QWeatherData(String variable) {
        super(WeatherData.class, forVariable(variable));
    }

    public QWeatherData(Path<? extends WeatherData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWeatherData(PathMetadata metadata) {
        super(WeatherData.class, metadata);
    }

}

