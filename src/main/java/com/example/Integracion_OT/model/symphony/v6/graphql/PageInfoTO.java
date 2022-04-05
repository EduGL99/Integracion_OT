package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageInfoTO implements java.io.Serializable {

    private boolean hasNextPage;
    private boolean hasPreviousPage;
    private String startCursor;
    private String endCursor;

    public PageInfoTO() {
    }

    public PageInfoTO(boolean hasNextPage, boolean hasPreviousPage, String startCursor, String endCursor) {
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
        this.endCursor = endCursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * When paginating forwards, are there more items?
     */
    public boolean getHasNextPage() {
        return hasNextPage;
    }

    /**
     * When paginating forwards, are there more items?
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    /**
     * When paginating backwards, are there more items?
     */
    public boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    /**
     * When paginating backwards, are there more items?
     */
    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    /**
     * When paginating forwards, the cursor to continue.
     */
    public String getStartCursor() {
        return startCursor;
    }

    /**
     * When paginating forwards, the cursor to continue.
     */
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    /**
     * When paginating backwards, the cursor to continue.
     */
    public String getEndCursor() {
        return endCursor;
    }

    /**
     * When paginating backwards, the cursor to continue.
     */
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage));
        joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage));
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor));
        }
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor));
        }
        return joiner.toString();
    }

    public static class Builder {

        private boolean hasNextPage;
        private boolean hasPreviousPage;
        private String startCursor;
        private String endCursor;

        public Builder() {
        }

        /**
         * When paginating forwards, are there more items?
         */
        public Builder setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        /**
         * When paginating backwards, are there more items?
         */
        public Builder setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        /**
         * When paginating forwards, the cursor to continue.
         */
        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }

        /**
         * When paginating backwards, the cursor to continue.
         */
        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }


        public PageInfoTO build() {
            return new PageInfoTO(hasNextPage, hasPreviousPage, startCursor, endCursor);
        }

    }
}
