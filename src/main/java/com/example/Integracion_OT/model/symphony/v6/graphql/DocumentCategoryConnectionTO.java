package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryConnectionTO implements java.io.Serializable {

    private int totalCount;
    @javax.validation.constraints.NotNull
    private java.util.List<DocumentCategoryEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public DocumentCategoryConnectionTO() {
    }

    public DocumentCategoryConnectionTO(int totalCount, java.util.List<DocumentCategoryEdgeTO> edges, PageInfoTO pageInfo) {
        this.totalCount = totalCount;
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public java.util.List<DocumentCategoryEdgeTO> getEdges() {
        return edges;
    }

    public void setEdges(java.util.List<DocumentCategoryEdgeTO> edges) {
        this.edges = edges;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

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
        private java.util.List<DocumentCategoryEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder setEdges(java.util.List<DocumentCategoryEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public DocumentCategoryConnectionTO build() {
            return new DocumentCategoryConnectionTO(totalCount, edges, pageInfo);
        }

    }
}
