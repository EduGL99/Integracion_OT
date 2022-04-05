package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private BlockUIRepresentationInputTO uiRepresentation;

    public EditBlockInputTO() {
    }

    public EditBlockInputTO(String id, BlockUIRepresentationInputTO uiRepresentation) {
        this.id = id;
        this.uiRepresentation = uiRepresentation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BlockUIRepresentationInputTO getUiRepresentation() {
        return uiRepresentation;
    }

    public void setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
        this.uiRepresentation = uiRepresentation;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (uiRepresentation != null) {
            joiner.add("uiRepresentation: " + GraphQLRequestSerializer.getEntry(uiRepresentation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
            this.uiRepresentation = uiRepresentation;
            return this;
        }


        public EditBlockInputTO build() {
            return new EditBlockInputTO(id, uiRepresentation);
        }

    }
}
