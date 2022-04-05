package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field hyperlinksByEntity in type DocumentCategory
 */

public class DocumentCategoryHyperlinksByEntityParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private ImageEntityTO entity;
    private String entityID;

    public DocumentCategoryHyperlinksByEntityParametrizedInput() {
    }

    public DocumentCategoryHyperlinksByEntityParametrizedInput(ImageEntityTO entity, String entityID) {
        this.entity = entity;
        this.entityID = entityID;
    }

    public DocumentCategoryHyperlinksByEntityParametrizedInput entity(ImageEntityTO entity) {
        this.entity = entity;
        return this;
    }

    public DocumentCategoryHyperlinksByEntityParametrizedInput entityID(String entityID) {
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
