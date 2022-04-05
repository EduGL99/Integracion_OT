package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportFlowDraftInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionInputTO> endParamDefinitions;
    private StartBlockInputTO startBlock;
    @javax.validation.constraints.NotNull
    private java.util.List<EndBlockInputTO> endBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<DecisionBlockInputTO> decisionBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<GotoBlockInputTO> gotoBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<SubflowBlockInputTO> subflowBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<TriggerBlockInputTO> triggerBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<ActionBlockInputTO> actionBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<TrueFalseBlockInputTO> trueFalseBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<ConnectorInputTO> connectors;

    public ImportFlowDraftInputTO() {
    }

    public ImportFlowDraftInputTO(String id, String name, String description, java.util.List<VariableDefinitionInputTO> endParamDefinitions, StartBlockInputTO startBlock, java.util.List<EndBlockInputTO> endBlocks, java.util.List<DecisionBlockInputTO> decisionBlocks, java.util.List<GotoBlockInputTO> gotoBlocks, java.util.List<SubflowBlockInputTO> subflowBlocks, java.util.List<TriggerBlockInputTO> triggerBlocks, java.util.List<ActionBlockInputTO> actionBlocks, java.util.List<TrueFalseBlockInputTO> trueFalseBlocks, java.util.List<ConnectorInputTO> connectors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.endParamDefinitions = endParamDefinitions;
        this.startBlock = startBlock;
        this.endBlocks = endBlocks;
        this.decisionBlocks = decisionBlocks;
        this.gotoBlocks = gotoBlocks;
        this.subflowBlocks = subflowBlocks;
        this.triggerBlocks = triggerBlocks;
        this.actionBlocks = actionBlocks;
        this.trueFalseBlocks = trueFalseBlocks;
        this.connectors = connectors;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<VariableDefinitionInputTO> getEndParamDefinitions() {
        return endParamDefinitions;
    }

    public void setEndParamDefinitions(java.util.List<VariableDefinitionInputTO> endParamDefinitions) {
        this.endParamDefinitions = endParamDefinitions;
    }

    public StartBlockInputTO getStartBlock() {
        return startBlock;
    }

    public void setStartBlock(StartBlockInputTO startBlock) {
        this.startBlock = startBlock;
    }

    public java.util.List<EndBlockInputTO> getEndBlocks() {
        return endBlocks;
    }

    public void setEndBlocks(java.util.List<EndBlockInputTO> endBlocks) {
        this.endBlocks = endBlocks;
    }

    public java.util.List<DecisionBlockInputTO> getDecisionBlocks() {
        return decisionBlocks;
    }

    public void setDecisionBlocks(java.util.List<DecisionBlockInputTO> decisionBlocks) {
        this.decisionBlocks = decisionBlocks;
    }

    public java.util.List<GotoBlockInputTO> getGotoBlocks() {
        return gotoBlocks;
    }

    public void setGotoBlocks(java.util.List<GotoBlockInputTO> gotoBlocks) {
        this.gotoBlocks = gotoBlocks;
    }

    public java.util.List<SubflowBlockInputTO> getSubflowBlocks() {
        return subflowBlocks;
    }

    public void setSubflowBlocks(java.util.List<SubflowBlockInputTO> subflowBlocks) {
        this.subflowBlocks = subflowBlocks;
    }

    public java.util.List<TriggerBlockInputTO> getTriggerBlocks() {
        return triggerBlocks;
    }

    public void setTriggerBlocks(java.util.List<TriggerBlockInputTO> triggerBlocks) {
        this.triggerBlocks = triggerBlocks;
    }

    public java.util.List<ActionBlockInputTO> getActionBlocks() {
        return actionBlocks;
    }

    public void setActionBlocks(java.util.List<ActionBlockInputTO> actionBlocks) {
        this.actionBlocks = actionBlocks;
    }

    public java.util.List<TrueFalseBlockInputTO> getTrueFalseBlocks() {
        return trueFalseBlocks;
    }

    public void setTrueFalseBlocks(java.util.List<TrueFalseBlockInputTO> trueFalseBlocks) {
        this.trueFalseBlocks = trueFalseBlocks;
    }

    public java.util.List<ConnectorInputTO> getConnectors() {
        return connectors;
    }

    public void setConnectors(java.util.List<ConnectorInputTO> connectors) {
        this.connectors = connectors;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (endParamDefinitions != null) {
            joiner.add("endParamDefinitions: " + GraphQLRequestSerializer.getEntry(endParamDefinitions));
        }
        if (startBlock != null) {
            joiner.add("startBlock: " + GraphQLRequestSerializer.getEntry(startBlock));
        }
        if (endBlocks != null) {
            joiner.add("endBlocks: " + GraphQLRequestSerializer.getEntry(endBlocks));
        }
        if (decisionBlocks != null) {
            joiner.add("decisionBlocks: " + GraphQLRequestSerializer.getEntry(decisionBlocks));
        }
        if (gotoBlocks != null) {
            joiner.add("gotoBlocks: " + GraphQLRequestSerializer.getEntry(gotoBlocks));
        }
        if (subflowBlocks != null) {
            joiner.add("subflowBlocks: " + GraphQLRequestSerializer.getEntry(subflowBlocks));
        }
        if (triggerBlocks != null) {
            joiner.add("triggerBlocks: " + GraphQLRequestSerializer.getEntry(triggerBlocks));
        }
        if (actionBlocks != null) {
            joiner.add("actionBlocks: " + GraphQLRequestSerializer.getEntry(actionBlocks));
        }
        if (trueFalseBlocks != null) {
            joiner.add("trueFalseBlocks: " + GraphQLRequestSerializer.getEntry(trueFalseBlocks));
        }
        if (connectors != null) {
            joiner.add("connectors: " + GraphQLRequestSerializer.getEntry(connectors));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<VariableDefinitionInputTO> endParamDefinitions;
        private StartBlockInputTO startBlock;
        private java.util.List<EndBlockInputTO> endBlocks;
        private java.util.List<DecisionBlockInputTO> decisionBlocks;
        private java.util.List<GotoBlockInputTO> gotoBlocks;
        private java.util.List<SubflowBlockInputTO> subflowBlocks;
        private java.util.List<TriggerBlockInputTO> triggerBlocks;
        private java.util.List<ActionBlockInputTO> actionBlocks;
        private java.util.List<TrueFalseBlockInputTO> trueFalseBlocks;
        private java.util.List<ConnectorInputTO> connectors;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEndParamDefinitions(java.util.List<VariableDefinitionInputTO> endParamDefinitions) {
            this.endParamDefinitions = endParamDefinitions;
            return this;
        }

        public Builder setStartBlock(StartBlockInputTO startBlock) {
            this.startBlock = startBlock;
            return this;
        }

        public Builder setEndBlocks(java.util.List<EndBlockInputTO> endBlocks) {
            this.endBlocks = endBlocks;
            return this;
        }

        public Builder setDecisionBlocks(java.util.List<DecisionBlockInputTO> decisionBlocks) {
            this.decisionBlocks = decisionBlocks;
            return this;
        }

        public Builder setGotoBlocks(java.util.List<GotoBlockInputTO> gotoBlocks) {
            this.gotoBlocks = gotoBlocks;
            return this;
        }

        public Builder setSubflowBlocks(java.util.List<SubflowBlockInputTO> subflowBlocks) {
            this.subflowBlocks = subflowBlocks;
            return this;
        }

        public Builder setTriggerBlocks(java.util.List<TriggerBlockInputTO> triggerBlocks) {
            this.triggerBlocks = triggerBlocks;
            return this;
        }

        public Builder setActionBlocks(java.util.List<ActionBlockInputTO> actionBlocks) {
            this.actionBlocks = actionBlocks;
            return this;
        }

        public Builder setTrueFalseBlocks(java.util.List<TrueFalseBlockInputTO> trueFalseBlocks) {
            this.trueFalseBlocks = trueFalseBlocks;
            return this;
        }

        public Builder setConnectors(java.util.List<ConnectorInputTO> connectors) {
            this.connectors = connectors;
            return this;
        }


        public ImportFlowDraftInputTO build() {
            return new ImportFlowDraftInputTO(id, name, description, endParamDefinitions, startBlock, endBlocks, decisionBlocks, gotoBlocks, subflowBlocks, triggerBlocks, actionBlocks, trueFalseBlocks, connectors);
        }

    }
}
