package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiComparatorTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private KqiTargetTO kqiTargetFk;
    @javax.validation.constraints.NotNull
    private ComparatorTO comparatorFk;
    private double number;
    @javax.validation.constraints.NotNull
    private String comparatorType;

    public KqiComparatorTO() {
    }

    public KqiComparatorTO(String id, KqiTargetTO kqiTargetFk, ComparatorTO comparatorFk, double number, String comparatorType) {
        this.id = id;
        this.kqiTargetFk = kqiTargetFk;
        this.comparatorFk = comparatorFk;
        this.number = number;
        this.comparatorType = comparatorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public KqiTargetTO getKqiTargetFk() {
        return kqiTargetFk;
    }

    public void setKqiTargetFk(KqiTargetTO kqiTargetFk) {
        this.kqiTargetFk = kqiTargetFk;
    }

    public ComparatorTO getComparatorFk() {
        return comparatorFk;
    }

    public void setComparatorFk(ComparatorTO comparatorFk) {
        this.comparatorFk = comparatorFk;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getComparatorType() {
        return comparatorType;
    }

    public void setComparatorType(String comparatorType) {
        this.comparatorType = comparatorType;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (kqiTargetFk != null) {
            joiner.add("kqiTargetFk: " + GraphQLRequestSerializer.getEntry(kqiTargetFk));
        }
        if (comparatorFk != null) {
            joiner.add("comparatorFk: " + GraphQLRequestSerializer.getEntry(comparatorFk));
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (comparatorType != null) {
            joiner.add("comparatorType: " + GraphQLRequestSerializer.getEntry(comparatorType));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private KqiTargetTO kqiTargetFk;
        private ComparatorTO comparatorFk;
        private double number;
        private String comparatorType;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKqiTargetFk(KqiTargetTO kqiTargetFk) {
            this.kqiTargetFk = kqiTargetFk;
            return this;
        }

        public Builder setComparatorFk(ComparatorTO comparatorFk) {
            this.comparatorFk = comparatorFk;
            return this;
        }

        public Builder setNumber(double number) {
            this.number = number;
            return this;
        }

        public Builder setComparatorType(String comparatorType) {
            this.comparatorType = comparatorType;
            return this;
        }


        public KqiComparatorTO build() {
            return new KqiComparatorTO(id, kqiTargetFk, comparatorFk, number, comparatorType);
        }

    }
}
