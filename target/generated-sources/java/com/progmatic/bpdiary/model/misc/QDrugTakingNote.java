package com.progmatic.bpdiary.model.misc;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDrugTakingNote is a Querydsl query type for DrugTakingNote
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDrugTakingNote extends EntityPathBase<DrugTakingNote> {

    private static final long serialVersionUID = -710474753L;

    public static final QDrugTakingNote drugTakingNote = new QDrugTakingNote("drugTakingNote");

    public final NumberPath<Integer> everyGivenHours = createNumber("everyGivenHours", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nameOfDrug = createString("nameOfDrug");

    public QDrugTakingNote(String variable) {
        super(DrugTakingNote.class, forVariable(variable));
    }

    public QDrugTakingNote(Path<? extends DrugTakingNote> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDrugTakingNote(PathMetadata metadata) {
        super(DrugTakingNote.class, metadata);
    }

}

