package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationsCategoryConnectionTO implements java.io.Serializable {

    private int totalCount;
    @javax.validation.constraints.NotNull
    private java.util.List<RecommendationsCategoryEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public RecommendationsCategoryConnectionTO() {
    }

    public RecommendationsCategoryConnectionTO(int totalCount, java.util.List<RecommendationsCategoryEdgeTO> edges, PageInfoTO pageInfo) {
        this.totalCount = totalCount;
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Total RecommendationsCategory of projects in all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Total RecommendationsCategory of projects in all pages.
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * A list of RecommendationsCategory edges.
     */
    public java.util.List<RecommendationsCategoryEdgeTO> getEdges() {
        return edges;
    }

    /**
     * A list of RecommendationsCategory edges.
     */
    public void setEdges(java.util.List<RecommendationsCategoryEdgeTO> edges) {
        this.edges = edges;
    }

    /**
     * Information to aid in pagination.
     */
    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    /**
     * Information to aid in pagination.
     */
    public void setPageInfo(PageInfoTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        return joiner.toString();
    }

    public static class Builder {

        private int totalCount;
        private java.util.List<RecommendationsCategoryEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        /**
         * Total RecommendationsCategory of projects in all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of RecommendationsCategory edges.
         */
        public Builder setEdges(java.util.List<RecommendationsCategoryEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * Information to aid in pagination.
         */
        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public RecommendationsCategoryConnectionTO build() {
            return new RecommendationsCategoryConnectionTO(totalCount, edges, pageInfo);
        }

    }
}
