package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for BlockDetails
 */

public class BlockDetailsResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public BlockDetailsResponseProjection() {
    }

    public BlockDetailsResponseProjection all$() {
        return all$(3);
    }

    public BlockDetailsResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public BlockDetailsResponseProjection onTriggerBlock(TriggerBlockResponseProjection subProjection) {
        return onTriggerBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onTriggerBlock(String alias, TriggerBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TriggerBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onGotoBlock(GotoBlockResponseProjection subProjection) {
        return onGotoBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onGotoBlock(String alias, GotoBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GotoBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onActionBlock(ActionBlockResponseProjection subProjection) {
        return onActionBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onActionBlock(String alias, ActionBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ActionBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onSubflowBlock(SubflowBlockResponseProjection subProjection) {
        return onSubflowBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onSubflowBlock(String alias, SubflowBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SubflowBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onStartBlock(StartBlockResponseProjection subProjection) {
        return onStartBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onStartBlock(String alias, StartBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on StartBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onEndBlock(EndBlockResponseProjection subProjection) {
        return onEndBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onEndBlock(String alias, EndBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EndBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onDecisionBlock(DecisionBlockResponseProjection subProjection) {
        return onDecisionBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onDecisionBlock(String alias, DecisionBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DecisionBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection onTrueFalseBlock(TrueFalseBlockResponseProjection subProjection) {
        return onTrueFalseBlock(null, subProjection);
    }

    public BlockDetailsResponseProjection onTrueFalseBlock(String alias, TrueFalseBlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TrueFalseBlock").alias(alias).projection(subProjection));
        return this;
    }

    public BlockDetailsResponseProjection typename() {
        return typename(null);
    }

    public BlockDetailsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
