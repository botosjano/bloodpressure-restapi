package com.progmatic.bpdiary.model.evaluation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEvaluate is a Querydsl query type for Evaluate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEvaluate extends EntityPathBase<Evaluate> {

    private static final long serialVersionUID = -1006729102L;

    public static final QEvaluate evaluate = new QEvaluate("evaluate");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath text = createString("text");

    public QEvaluate(String variable) {
        super(Evaluate.class, forVariable(variable));
    }

    public QEvaluate(Path<? extends Evaluate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvaluate(PathMetadata metadata) {
        super(Evaluate.class, metadata);
    }

}

