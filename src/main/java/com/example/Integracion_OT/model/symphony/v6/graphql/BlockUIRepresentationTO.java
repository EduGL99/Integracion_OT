package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockUIRepresentationTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private int xPosition;
    private int yPosition;

    public BlockUIRepresentationTO() {
    }

    public BlockUIRepresentationTO(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("xPosition: " + GraphQLRequestSerializer.getEntry(xPosition));
        joiner.add("yPosition: " + GraphQLRequestSerializer.getEntry(yPosition));
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private int xPosition;
        private int yPosition;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setXPosition(int xPosition) {
            this.xPosition = xPosition;
            return this;
        }

        public Builder setYPosition(int yPosition) {
            this.yPosition = yPosition;
            return this;
        }


        public BlockUIRepresentationTO build() {
            return new BlockUIRepresentationTO(name, xPosition, yPosition);
        }

    }
}
