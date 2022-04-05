package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Node
 */

public class NodeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NodeResponseProjection() {
    }

    public NodeResponseProjection all$() {
        return all$(3);
    }

    public NodeResponseProjection all$(int maxDepth) {
        this.id();
        this.typename();
        return this;
    }

    public NodeResponseProjection id() {
        return id(null);
    }

    public NodeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NodeResponseProjection onAppointment(AppointmentResponseProjection subProjection) {
        return onAppointment(null, subProjection);
    }

    public NodeResponseProjection onAppointment(String alias, AppointmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Appointment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRecommendationsSources(RecommendationsSourcesResponseProjection subProjection) {
        return onRecommendationsSources(null, subProjection);
    }

    public NodeResponseProjection onRecommendationsSources(String alias, RecommendationsSourcesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RecommendationsSources").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCustomer(CustomerResponseProjection subProjection) {
        return onCustomer(null, subProjection);
    }

    public NodeResponseProjection onCustomer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Customer").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKpi(KpiResponseProjection subProjection) {
        return onKpi(null, subProjection);
    }

    public NodeResponseProjection onKpi(String alias, KpiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Kpi").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onExitPoint(ExitPointResponseProjection subProjection) {
        return onExitPoint(null, subProjection);
    }

    public NodeResponseProjection onExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ExitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onActivity(ActivityResponseProjection subProjection) {
        return onActivity(null, subProjection);
    }

    public NodeResponseProjection onActivity(String alias, ActivityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Activity").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEntryPoint(EntryPointResponseProjection subProjection) {
        return onEntryPoint(null, subProjection);
    }

    public NodeResponseProjection onEntryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EntryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPropertyType(PropertyTypeResponseProjection subProjection) {
        return onPropertyType(null, subProjection);
    }

    public NodeResponseProjection onPropertyType(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PropertyType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipmentType(EquipmentTypeResponseProjection subProjection) {
        return onEquipmentType(null, subProjection);
    }

    public NodeResponseProjection onEquipmentType(String alias, EquipmentTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EquipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDocumentCategory(DocumentCategoryResponseProjection subProjection) {
        return onDocumentCategory(null, subProjection);
    }

    public NodeResponseProjection onDocumentCategory(String alias, DocumentCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DocumentCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onComparator(ComparatorResponseProjection subProjection) {
        return onComparator(null, subProjection);
    }

    public NodeResponseProjection onComparator(String alias, ComparatorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Comparator").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTech(TechResponseProjection subProjection) {
        return onTech(null, subProjection);
    }

    public NodeResponseProjection onTech(String alias, TechResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tech").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSurveyTemplateCategory(SurveyTemplateCategoryResponseProjection subProjection) {
        return onSurveyTemplateCategory(null, subProjection);
    }

    public NodeResponseProjection onSurveyTemplateCategory(String alias, SurveyTemplateCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SurveyTemplateCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFormula(FormulaResponseProjection subProjection) {
        return onFormula(null, subProjection);
    }

    public NodeResponseProjection onFormula(String alias, FormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Formula").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onWorkerType(WorkerTypeResponseProjection subProjection) {
        return onWorkerType(null, subProjection);
    }

    public NodeResponseProjection onWorkerType(String alias, WorkerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on WorkerType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onWorkOrder(WorkOrderResponseProjection subProjection) {
        return onWorkOrder(null, subProjection);
    }

    public NodeResponseProjection onWorkOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on WorkOrder").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCounter(CounterResponseProjection subProjection) {
        return onCounter(null, subProjection);
    }

    public NodeResponseProjection onCounter(String alias, CounterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Counter").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSurveyWiFiScan(SurveyWiFiScanResponseProjection subProjection) {
        return onSurveyWiFiScan(null, subProjection);
    }

    public NodeResponseProjection onSurveyWiFiScan(String alias, SurveyWiFiScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SurveyWiFiScan").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onServiceType(ServiceTypeResponseProjection subProjection) {
        return onServiceType(null, subProjection);
    }

    public NodeResponseProjection onServiceType(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ServiceType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipmentPortType(EquipmentPortTypeResponseProjection subProjection) {
        return onEquipmentPortType(null, subProjection);
    }

    public NodeResponseProjection onEquipmentPortType(String alias, EquipmentPortTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EquipmentPortType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqiCategory(KqiCategoryResponseProjection subProjection) {
        return onKqiCategory(null, subProjection);
    }

    public NodeResponseProjection onKqiCategory(String alias, KqiCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KqiCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReportFilter(ReportFilterResponseProjection subProjection) {
        return onReportFilter(null, subProjection);
    }

    public NodeResponseProjection onReportFilter(String alias, ReportFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReportFilter").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onThreshold(ThresholdResponseProjection subProjection) {
        return onThreshold(null, subProjection);
    }

    public NodeResponseProjection onThreshold(String alias, ThresholdResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Threshold").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCounterFamily(CounterFamilyResponseProjection subProjection) {
        return onCounterFamily(null, subProjection);
    }

    public NodeResponseProjection onCounterFamily(String alias, CounterFamilyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CounterFamily").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqi(KqiResponseProjection subProjection) {
        return onKqi(null, subProjection);
    }

    public NodeResponseProjection onKqi(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Kqi").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFlowInstance(FlowInstanceResponseProjection subProjection) {
        return onFlowInstance(null, subProjection);
    }

    public NodeResponseProjection onFlowInstance(String alias, FlowInstanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FlowInstance").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRuleType(RuleTypeResponseProjection subProjection) {
        return onRuleType(null, subProjection);
    }

    public NodeResponseProjection onRuleType(String alias, RuleTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RuleType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipmentPosition(EquipmentPositionResponseProjection subProjection) {
        return onEquipmentPosition(null, subProjection);
    }

    public NodeResponseProjection onEquipmentPosition(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EquipmentPosition").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUsersGroup(UsersGroupResponseProjection subProjection) {
        return onUsersGroup(null, subProjection);
    }

    public NodeResponseProjection onUsersGroup(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UsersGroup").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onExportTask(ExportTaskResponseProjection subProjection) {
        return onExportTask(null, subProjection);
    }

    public NodeResponseProjection onExportTask(String alias, ExportTaskResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ExportTask").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onServiceEndpointDefinition(ServiceEndpointDefinitionResponseProjection subProjection) {
        return onServiceEndpointDefinition(null, subProjection);
    }

    public NodeResponseProjection onServiceEndpointDefinition(String alias, ServiceEndpointDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ServiceEndpointDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProject(ProjectResponseProjection subProjection) {
        return onProject(null, subProjection);
    }

    public NodeResponseProjection onProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKpiCategory(KpiCategoryResponseProjection subProjection) {
        return onKpiCategory(null, subProjection);
    }

    public NodeResponseProjection onKpiCategory(String alias, KpiCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KpiCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSurvey(SurveyResponseProjection subProjection) {
        return onSurvey(null, subProjection);
    }

    public NodeResponseProjection onSurvey(String alias, SurveyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Survey").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipmentPositionDefinition(EquipmentPositionDefinitionResponseProjection subProjection) {
        return onEquipmentPositionDefinition(null, subProjection);
    }

    public NodeResponseProjection onEquipmentPositionDefinition(String alias, EquipmentPositionDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EquipmentPositionDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProjectType(ProjectTypeResponseProjection subProjection) {
        return onProjectType(null, subProjection);
    }

    public NodeResponseProjection onProjectType(String alias, ProjectTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ProjectType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSurveyTemplateQuestion(SurveyTemplateQuestionResponseProjection subProjection) {
        return onSurveyTemplateQuestion(null, subProjection);
    }

    public NodeResponseProjection onSurveyTemplateQuestion(String alias, SurveyTemplateQuestionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SurveyTemplateQuestion").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBlock(BlockResponseProjection subProjection) {
        return onBlock(null, subProjection);
    }

    public NodeResponseProjection onBlock(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Block").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRule(RuleResponseProjection subProjection) {
        return onRule(null, subProjection);
    }

    public NodeResponseProjection onRule(String alias, RuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Rule").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDomain(DomainResponseProjection subProjection) {
        return onDomain(null, subProjection);
    }

    public NodeResponseProjection onDomain(String alias, DomainResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Domain").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFile(FileResponseProjection subProjection) {
        return onFile(null, subProjection);
    }

    public NodeResponseProjection onFile(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on File").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLink(LinkResponseProjection subProjection) {
        return onLink(null, subProjection);
    }

    public NodeResponseProjection onLink(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Link").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onAlarmFilter(AlarmFilterResponseProjection subProjection) {
        return onAlarmFilter(null, subProjection);
    }

    public NodeResponseProjection onAlarmFilter(String alias, AlarmFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AlarmFilter").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public NodeResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public NodeResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onWorkOrderType(WorkOrderTypeResponseProjection subProjection) {
        return onWorkOrderType(null, subProjection);
    }

    public NodeResponseProjection onWorkOrderType(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on WorkOrderType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqiComparator(KqiComparatorResponseProjection subProjection) {
        return onKqiComparator(null, subProjection);
    }

    public NodeResponseProjection onKqiComparator(String alias, KqiComparatorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KqiComparator").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqiSource(KqiSourceResponseProjection subProjection) {
        return onKqiSource(null, subProjection);
    }

    public NodeResponseProjection onKqiSource(String alias, KqiSourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KqiSource").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipmentPort(EquipmentPortResponseProjection subProjection) {
        return onEquipmentPort(null, subProjection);
    }

    public NodeResponseProjection onEquipmentPort(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EquipmentPort").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFlowExecutionTemplate(FlowExecutionTemplateResponseProjection subProjection) {
        return onFlowExecutionTemplate(null, subProjection);
    }

    public NodeResponseProjection onFlowExecutionTemplate(String alias, FlowExecutionTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FlowExecutionTemplate").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRuleLimit(RuleLimitResponseProjection subProjection) {
        return onRuleLimit(null, subProjection);
    }

    public NodeResponseProjection onRuleLimit(String alias, RuleLimitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RuleLimit").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRecommendations(RecommendationsResponseProjection subProjection) {
        return onRecommendations(null, subProjection);
    }

    public NodeResponseProjection onRecommendations(String alias, RecommendationsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Recommendations").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSurveyCellScan(SurveyCellScanResponseProjection subProjection) {
        return onSurveyCellScan(null, subProjection);
    }

    public NodeResponseProjection onSurveyCellScan(String alias, SurveyCellScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SurveyCellScan").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqiTarget(KqiTargetResponseProjection subProjection) {
        return onKqiTarget(null, subProjection);
    }

    public NodeResponseProjection onKqiTarget(String alias, KqiTargetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KqiTarget").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onNetworkType(NetworkTypeResponseProjection subProjection) {
        return onNetworkType(null, subProjection);
    }

    public NodeResponseProjection onNetworkType(String alias, NetworkTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on NetworkType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProperty(PropertyResponseProjection subProjection) {
        return onProperty(null, subProjection);
    }

    public NodeResponseProjection onProperty(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Property").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCounterFormula(CounterFormulaResponseProjection subProjection) {
        return onCounterFormula(null, subProjection);
    }

    public NodeResponseProjection onCounterFormula(String alias, CounterFormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CounterFormula").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onComment(CommentResponseProjection subProjection) {
        return onComment(null, subProjection);
    }

    public NodeResponseProjection onComment(String alias, CommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Comment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEventSeverity(EventSeverityResponseProjection subProjection) {
        return onEventSeverity(null, subProjection);
    }

    public NodeResponseProjection onEventSeverity(String alias, EventSeverityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EventSeverity").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqiPerspective(KqiPerspectiveResponseProjection subProjection) {
        return onKqiPerspective(null, subProjection);
    }

    public NodeResponseProjection onKqiPerspective(String alias, KqiPerspectiveResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KqiPerspective").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onWorkOrderDefinition(WorkOrderDefinitionResponseProjection subProjection) {
        return onWorkOrderDefinition(null, subProjection);
    }

    public NodeResponseProjection onWorkOrderDefinition(String alias, WorkOrderDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on WorkOrderDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCheckListItem(CheckListItemResponseProjection subProjection) {
        return onCheckListItem(null, subProjection);
    }

    public NodeResponseProjection onCheckListItem(String alias, CheckListItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CheckListItem").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipmentPortDefinition(EquipmentPortDefinitionResponseProjection subProjection) {
        return onEquipmentPortDefinition(null, subProjection);
    }

    public NodeResponseProjection onEquipmentPortDefinition(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on EquipmentPortDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onService(ServiceResponseProjection subProjection) {
        return onService(null, subProjection);
    }

    public NodeResponseProjection onService(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Service").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFloorPlan(FloorPlanResponseProjection subProjection) {
        return onFloorPlan(null, subProjection);
    }

    public NodeResponseProjection onFloorPlan(String alias, FloorPlanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FloorPlan").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onVendor(VendorResponseProjection subProjection) {
        return onVendor(null, subProjection);
    }

    public NodeResponseProjection onVendor(String alias, VendorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Vendor").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPermissionsPolicy(PermissionsPolicyResponseProjection subProjection) {
        return onPermissionsPolicy(null, subProjection);
    }

    public NodeResponseProjection onPermissionsPolicy(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PermissionsPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFlow(FlowResponseProjection subProjection) {
        return onFlow(null, subProjection);
    }

    public NodeResponseProjection onFlow(String alias, FlowResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Flow").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onKqiTemporalFrequency(KqiTemporalFrequencyResponseProjection subProjection) {
        return onKqiTemporalFrequency(null, subProjection);
    }

    public NodeResponseProjection onKqiTemporalFrequency(String alias, KqiTemporalFrequencyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on KqiTemporalFrequency").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onEquipment(EquipmentResponseProjection subProjection) {
        return onEquipment(null, subProjection);
    }

    public NodeResponseProjection onEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Equipment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBlockInstance(BlockInstanceResponseProjection subProjection) {
        return onBlockInstance(null, subProjection);
    }

    public NodeResponseProjection onBlockInstance(String alias, BlockInstanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BlockInstance").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onAlarmStatus(AlarmStatusResponseProjection subProjection) {
        return onAlarmStatus(null, subProjection);
    }

    public NodeResponseProjection onAlarmStatus(String alias, AlarmStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AlarmStatus").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRecommendationsCategory(RecommendationsCategoryResponseProjection subProjection) {
        return onRecommendationsCategory(null, subProjection);
    }

    public NodeResponseProjection onRecommendationsCategory(String alias, RecommendationsCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RecommendationsCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCheckListCategory(CheckListCategoryResponseProjection subProjection) {
        return onCheckListCategory(null, subProjection);
    }

    public NodeResponseProjection onCheckListCategory(String alias, CheckListCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CheckListCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLocationType(LocationTypeResponseProjection subProjection) {
        return onLocationType(null, subProjection);
    }

    public NodeResponseProjection onLocationType(String alias, LocationTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LocationType").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onFlowDraft(FlowDraftResponseProjection subProjection) {
        return onFlowDraft(null, subProjection);
    }

    public NodeResponseProjection onFlowDraft(String alias, FlowDraftResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on FlowDraft").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onServiceEndpoint(ServiceEndpointResponseProjection subProjection) {
        return onServiceEndpoint(null, subProjection);
    }

    public NodeResponseProjection onServiceEndpoint(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ServiceEndpoint").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onHyperlink(HyperlinkResponseProjection subProjection) {
        return onHyperlink(null, subProjection);
    }

    public NodeResponseProjection onHyperlink(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Hyperlink").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLocation(LocationResponseProjection subProjection) {
        return onLocation(null, subProjection);
    }

    public NodeResponseProjection onLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Location").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSurveyQuestion(SurveyQuestionResponseProjection subProjection) {
        return onSurveyQuestion(null, subProjection);
    }

    public NodeResponseProjection onSurveyQuestion(String alias, SurveyQuestionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SurveyQuestion").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection typename() {
        return typename(null);
    }

    public NodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
