package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field filesByEntity in type DocumentCategory
 */

public class DocumentCategoryFilesByEntityParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private ImageEntityTO entity;
    private String entityID;

    public DocumentCategoryFilesByEntityParametrizedInput() {
    }

    public DocumentCategoryFilesByEntityParametrizedInput(ImageEntityTO entity, String entityID) {
        this.entity = entity;
        this.entityID = entityID;
    }

    public DocumentCategoryFilesByEntityParametrizedInput entity(ImageEntityTO entity) {
        this.entity = entity;
        return this;
    }

    public DocumentCategoryFilesByEntityParametrizedInput entityID(String entityID) {
        this.entityID = entityID;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (entity != null) {
            joiner.add("entity: " + GraphQLRequestSerializer.getEntry(entity));
        }
        if (entityID != null) {
            joiner.add("entityID: " + GraphQLRequestSerializer.getEntry(entityID));
        }
        return joiner.toString();
    }

}
