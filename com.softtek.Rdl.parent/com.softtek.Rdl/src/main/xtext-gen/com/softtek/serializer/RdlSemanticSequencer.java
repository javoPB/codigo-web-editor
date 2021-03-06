/*
 * generated by Xtext 2.16.0
 */
package com.softtek.serializer;

import com.google.inject.Inject;
import com.softtek.rdl.ActionAdd;
import com.softtek.rdl.ActionDelete;
import com.softtek.rdl.ActionEdit;
import com.softtek.rdl.ActionSearch;
import com.softtek.rdl.Actions;
import com.softtek.rdl.BusinessRule;
import com.softtek.rdl.ConstraintMaxLength;
import com.softtek.rdl.ConstraintMinLength;
import com.softtek.rdl.ConstraintRequired;
import com.softtek.rdl.ConstraintUnique;
import com.softtek.rdl.DATE;
import com.softtek.rdl.DBMapAttrAutoId;
import com.softtek.rdl.DBMapAttrIdentity;
import com.softtek.rdl.DBMapEntity;
import com.softtek.rdl.DBMapField;
import com.softtek.rdl.DataDomain;
import com.softtek.rdl.Entity;
import com.softtek.rdl.EntityAttr;
import com.softtek.rdl.EntityCurrencyField;
import com.softtek.rdl.EntityDateField;
import com.softtek.rdl.EntityDateFieldAttr;
import com.softtek.rdl.EntityDecimalField;
import com.softtek.rdl.EntityEmailField;
import com.softtek.rdl.EntityFileField;
import com.softtek.rdl.EntityImageField;
import com.softtek.rdl.EntityIntegerField;
import com.softtek.rdl.EntityLongTextField;
import com.softtek.rdl.EntityLongTextFieldAttr;
import com.softtek.rdl.EntityReferenceField;
import com.softtek.rdl.EntityReferenceFieldAttr;
import com.softtek.rdl.EntityTextConstraintDef;
import com.softtek.rdl.EntityTextField;
import com.softtek.rdl.EntityTextFieldAttr;
import com.softtek.rdl.EnumLiteral;
import com.softtek.rdl.Glossary;
import com.softtek.rdl.GlossaryDescription;
import com.softtek.rdl.GlossaryName;
import com.softtek.rdl.MethodDeclaration;
import com.softtek.rdl.Model;
import com.softtek.rdl.RdlPackage;
import com.softtek.rdl.StatementReturn;
import com.softtek.rdl.Widget;
import com.softtek.rdl.WidgetDate;
import com.softtek.rdl.WidgetDisplayResult;
import com.softtek.rdl.WidgetEndYear;
import com.softtek.rdl.WidgetEnum;
import com.softtek.rdl.WidgetExposedFilter;
import com.softtek.rdl.WidgetHelp;
import com.softtek.rdl.WidgetLabel;
import com.softtek.rdl.WidgetSize;
import com.softtek.rdl.WidgetSortBy;
import com.softtek.rdl.WidgetStartYear;
import com.softtek.rdl.WidgetText;
import com.softtek.rdl.WidgetType;
import com.softtek.rdl.WidgetTypeSelect;
import com.softtek.services.RdlGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RdlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RdlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RdlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RdlPackage.ACTION_ADD:
				sequence_ActionAdd(context, (ActionAdd) semanticObject); 
				return; 
			case RdlPackage.ACTION_DELETE:
				sequence_ActionDelete(context, (ActionDelete) semanticObject); 
				return; 
			case RdlPackage.ACTION_EDIT:
				sequence_ActionEdit(context, (ActionEdit) semanticObject); 
				return; 
			case RdlPackage.ACTION_SEARCH:
				sequence_ActionSearch(context, (ActionSearch) semanticObject); 
				return; 
			case RdlPackage.ACTIONS:
				sequence_Actions(context, (Actions) semanticObject); 
				return; 
			case RdlPackage.BUSINESS_RULE:
				sequence_BusinessRule(context, (BusinessRule) semanticObject); 
				return; 
			case RdlPackage.CONSTRAINT_MAX_LENGTH:
				sequence_ConstraintMaxLength(context, (ConstraintMaxLength) semanticObject); 
				return; 
			case RdlPackage.CONSTRAINT_MIN_LENGTH:
				sequence_ConstraintMinLength(context, (ConstraintMinLength) semanticObject); 
				return; 
			case RdlPackage.CONSTRAINT_REQUIRED:
				sequence_ConstraintRequired(context, (ConstraintRequired) semanticObject); 
				return; 
			case RdlPackage.CONSTRAINT_UNIQUE:
				sequence_ConstraintUnique(context, (ConstraintUnique) semanticObject); 
				return; 
			case RdlPackage.DATE:
				sequence_DATE(context, (DATE) semanticObject); 
				return; 
			case RdlPackage.DB_MAP_ATTR_AUTO_ID:
				sequence_DBMapAttrAutoId(context, (DBMapAttrAutoId) semanticObject); 
				return; 
			case RdlPackage.DB_MAP_ATTR_IDENTITY:
				sequence_DBMapAttrIdentity(context, (DBMapAttrIdentity) semanticObject); 
				return; 
			case RdlPackage.DB_MAP_ENTITY:
				sequence_DBMapEntity(context, (DBMapEntity) semanticObject); 
				return; 
			case RdlPackage.DB_MAP_FIELD:
				sequence_DBMapField(context, (DBMapField) semanticObject); 
				return; 
			case RdlPackage.DATA_DOMAIN:
				sequence_DataDomain(context, (DataDomain) semanticObject); 
				return; 
			case RdlPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case RdlPackage.ENTITY_ATTR:
				sequence_EntityAttr(context, (EntityAttr) semanticObject); 
				return; 
			case RdlPackage.ENTITY_CURRENCY_FIELD:
				sequence_EntityCurrencyField(context, (EntityCurrencyField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_DATE_FIELD:
				sequence_EntityDateField(context, (EntityDateField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_DATE_FIELD_ATTR:
				sequence_EntityDateFieldAttr(context, (EntityDateFieldAttr) semanticObject); 
				return; 
			case RdlPackage.ENTITY_DECIMAL_FIELD:
				sequence_EntityDecimalField(context, (EntityDecimalField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_EMAIL_FIELD:
				sequence_EntityEmailField(context, (EntityEmailField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_FILE_FIELD:
				sequence_EntityFileField(context, (EntityFileField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_IMAGE_FIELD:
				sequence_EntityImageField(context, (EntityImageField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_INTEGER_FIELD:
				sequence_EntityIntegerField(context, (EntityIntegerField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_LONG_TEXT_FIELD:
				sequence_EntityLongTextField(context, (EntityLongTextField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_LONG_TEXT_FIELD_ATTR:
				sequence_EntityLongTextFieldAttr(context, (EntityLongTextFieldAttr) semanticObject); 
				return; 
			case RdlPackage.ENTITY_REFERENCE_FIELD:
				sequence_EntityReferenceField(context, (EntityReferenceField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_REFERENCE_FIELD_ATTR:
				sequence_EntityReferenceFieldAttr(context, (EntityReferenceFieldAttr) semanticObject); 
				return; 
			case RdlPackage.ENTITY_TEXT_CONSTRAINT_DEF:
				sequence_EntityTextConstraintDef(context, (EntityTextConstraintDef) semanticObject); 
				return; 
			case RdlPackage.ENTITY_TEXT_FIELD:
				sequence_EntityTextField(context, (EntityTextField) semanticObject); 
				return; 
			case RdlPackage.ENTITY_TEXT_FIELD_ATTR:
				sequence_EntityTextFieldAttr(context, (EntityTextFieldAttr) semanticObject); 
				return; 
			case RdlPackage.ENUM:
				sequence_Enum(context, (com.softtek.rdl.Enum) semanticObject); 
				return; 
			case RdlPackage.ENUM_LITERAL:
				sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
				return; 
			case RdlPackage.GLOSSARY:
				sequence_Glossary(context, (Glossary) semanticObject); 
				return; 
			case RdlPackage.GLOSSARY_DESCRIPTION:
				sequence_GlossaryDescription(context, (GlossaryDescription) semanticObject); 
				return; 
			case RdlPackage.GLOSSARY_NAME:
				sequence_GlossaryName(context, (GlossaryName) semanticObject); 
				return; 
			case RdlPackage.METHOD_DECLARATION:
				sequence_MethodDeclaration(context, (MethodDeclaration) semanticObject); 
				return; 
			case RdlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RdlPackage.MODULE:
				sequence_Module(context, (com.softtek.rdl.Module) semanticObject); 
				return; 
			case RdlPackage.STATEMENT_RETURN:
				sequence_StatementReturn(context, (StatementReturn) semanticObject); 
				return; 
			case RdlPackage.WIDGET:
				sequence_Widget(context, (Widget) semanticObject); 
				return; 
			case RdlPackage.WIDGET_DATE:
				sequence_WidgetDate(context, (WidgetDate) semanticObject); 
				return; 
			case RdlPackage.WIDGET_DISPLAY_RESULT:
				sequence_WidgetDisplayResult(context, (WidgetDisplayResult) semanticObject); 
				return; 
			case RdlPackage.WIDGET_END_YEAR:
				sequence_WidgetEndYear(context, (WidgetEndYear) semanticObject); 
				return; 
			case RdlPackage.WIDGET_ENUM:
				sequence_WidgetEnum(context, (WidgetEnum) semanticObject); 
				return; 
			case RdlPackage.WIDGET_EXPOSED_FILTER:
				sequence_WidgetExposedFilter(context, (WidgetExposedFilter) semanticObject); 
				return; 
			case RdlPackage.WIDGET_HELP:
				sequence_WidgetHelp(context, (WidgetHelp) semanticObject); 
				return; 
			case RdlPackage.WIDGET_LABEL:
				sequence_WidgetLabel(context, (WidgetLabel) semanticObject); 
				return; 
			case RdlPackage.WIDGET_SIZE:
				sequence_WidgetSize(context, (WidgetSize) semanticObject); 
				return; 
			case RdlPackage.WIDGET_SORT_BY:
				sequence_WidgetSortBy(context, (WidgetSortBy) semanticObject); 
				return; 
			case RdlPackage.WIDGET_START_YEAR:
				sequence_WidgetStartYear(context, (WidgetStartYear) semanticObject); 
				return; 
			case RdlPackage.WIDGET_TEXT:
				sequence_WidgetText(context, (WidgetText) semanticObject); 
				return; 
			case RdlPackage.WIDGET_TYPE:
				sequence_WidgetType(context, (WidgetType) semanticObject); 
				return; 
			case RdlPackage.WIDGET_TYPE_SELECT:
				if (rule == grammarAccess.getWidgetAttrEnumRule()
						|| rule == grammarAccess.getWidgetAttrEnumTypeSelectRule()) {
					sequence_WidgetAttrEnumTypeSelect_WidgetTypeSelect(context, (WidgetTypeSelect) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWidgetTypeSelectRule()) {
					sequence_WidgetTypeSelect(context, (WidgetTypeSelect) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionAdd returns ActionAdd
	 *     Action returns ActionAdd
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_ActionAdd(ISerializationContext context, ActionAdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionDelete returns ActionDelete
	 *     Action returns ActionDelete
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_ActionDelete(ISerializationContext context, ActionDelete semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionEdit returns ActionEdit
	 *     Action returns ActionEdit
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_ActionEdit(ISerializationContext context, ActionEdit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionSearch returns ActionSearch
	 *     Action returns ActionSearch
	 *
	 * Constraint:
	 *     (value='Simple' | value='Complex' | value='None')
	 */
	protected void sequence_ActionSearch(ISerializationContext context, ActionSearch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actions returns Actions
	 *
	 * Constraint:
	 *     (action+=Action action+=Action*)
	 */
	protected void sequence_Actions(ISerializationContext context, Actions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BusinessRule returns BusinessRule
	 *
	 * Constraint:
	 *     (code=STRING description=STRING)
	 */
	protected void sequence_BusinessRule(ISerializationContext context, BusinessRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.BUSINESS_RULE__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.BUSINESS_RULE__CODE));
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.BUSINESS_RULE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.BUSINESS_RULE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBusinessRuleAccess().getCodeSTRINGTerminalRuleCall_4_0(), semanticObject.getCode());
		feeder.accept(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityTextConstraint returns ConstraintMaxLength
	 *     ConstraintMaxLength returns ConstraintMaxLength
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_ConstraintMaxLength(ISerializationContext context, ConstraintMaxLength semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.CONSTRAINT_MAX_LENGTH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.CONSTRAINT_MAX_LENGTH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintMaxLengthAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityTextConstraint returns ConstraintMinLength
	 *     ConstraintMinLength returns ConstraintMinLength
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_ConstraintMinLength(ISerializationContext context, ConstraintMinLength semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.CONSTRAINT_MIN_LENGTH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.CONSTRAINT_MIN_LENGTH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintMinLengthAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityTextConstraint returns ConstraintRequired
	 *     ConstraintRequired returns ConstraintRequired
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_ConstraintRequired(ISerializationContext context, ConstraintRequired semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityTextConstraint returns ConstraintUnique
	 *     ConstraintUnique returns ConstraintUnique
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_ConstraintUnique(ISerializationContext context, ConstraintUnique semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DATE returns DATE
	 *
	 * Constraint:
	 *     (date=DATETIME | now='Now')
	 */
	protected void sequence_DATE(ISerializationContext context, DATE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBMapAttr returns DBMapAttrAutoId
	 *     DBMapAttrAutoId returns DBMapAttrAutoId
	 *
	 * Constraint:
	 *     (autoid='true' | autoid='false')
	 */
	protected void sequence_DBMapAttrAutoId(ISerializationContext context, DBMapAttrAutoId semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBMapAttr returns DBMapAttrIdentity
	 *     DBMapAttrIdentity returns DBMapAttrIdentity
	 *
	 * Constraint:
	 *     identity=STRING
	 */
	protected void sequence_DBMapAttrIdentity(ISerializationContext context, DBMapAttrIdentity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.DB_MAP_ATTR_IDENTITY__IDENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.DB_MAP_ATTR_IDENTITY__IDENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDBMapAttrIdentityAccess().getIdentitySTRINGTerminalRuleCall_2_0(), semanticObject.getIdentity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DBMapEntity returns DBMapEntity
	 *
	 * Constraint:
	 *     (table=STRING (dbmap_attrs+=DBMapAttr dbmap_attrs+=DBMapAttr*)?)
	 */
	protected void sequence_DBMapEntity(ISerializationContext context, DBMapEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBMapField returns DBMapField
	 *
	 * Constraint:
	 *     (table=STRING (pk='true' | pk='false')?)
	 */
	protected void sequence_DBMapField(ISerializationContext context, DBMapField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataDomain returns DataDomain
	 *
	 * Constraint:
	 *     domain=STRING
	 */
	protected void sequence_DataDomain(ISerializationContext context, DataDomain semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.DATA_DOMAIN__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.DATA_DOMAIN__DOMAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataDomainAccess().getDomainSTRINGTerminalRuleCall_4_0(), semanticObject.getDomain());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityAttr returns EntityAttr
	 *
	 * Constraint:
	 *     (
	 *         glossary=Glossary | 
	 *         widget=Widget | 
	 *         constraint=EntityTextConstraintDef | 
	 *         db_map=DBMapField | 
	 *         data_domain=DataDomain | 
	 *         business_rule=BusinessRule
	 *     )
	 */
	protected void sequence_EntityAttr(ISerializationContext context, EntityAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityCurrencyField
	 *     EntityCurrencyField returns EntityCurrencyField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityAttr*)
	 */
	protected void sequence_EntityCurrencyField(ISerializationContext context, EntityCurrencyField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityDateFieldAttr returns EntityDateFieldAttr
	 *
	 * Constraint:
	 *     (
	 *         default=DATE | 
	 *         glossary=Glossary | 
	 *         widget=WidgetDate | 
	 *         constraint=EntityTextConstraintDef | 
	 *         db_map=DBMapField | 
	 *         data_domain=DataDomain | 
	 *         business_rule=BusinessRule
	 *     )
	 */
	protected void sequence_EntityDateFieldAttr(ISerializationContext context, EntityDateFieldAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityDateField
	 *     EntityDateField returns EntityDateField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityDateFieldAttr*)
	 */
	protected void sequence_EntityDateField(ISerializationContext context, EntityDateField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityDecimalField
	 *     EntityDecimalField returns EntityDecimalField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityAttr*)
	 */
	protected void sequence_EntityDecimalField(ISerializationContext context, EntityDecimalField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityEmailField
	 *     EntityEmailField returns EntityEmailField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityAttr*)
	 */
	protected void sequence_EntityEmailField(ISerializationContext context, EntityEmailField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityFileField
	 *     EntityFileField returns EntityFileField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityAttr*)
	 */
	protected void sequence_EntityFileField(ISerializationContext context, EntityFileField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityImageField
	 *     EntityImageField returns EntityImageField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityAttr*)
	 */
	protected void sequence_EntityImageField(ISerializationContext context, EntityImageField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityIntegerField
	 *     EntityIntegerField returns EntityIntegerField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityAttr*)
	 */
	protected void sequence_EntityIntegerField(ISerializationContext context, EntityIntegerField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityLongTextFieldAttr returns EntityLongTextFieldAttr
	 *
	 * Constraint:
	 *     (
	 *         glossary=Glossary | 
	 *         widget=Widget | 
	 *         constraint=EntityTextConstraintDef | 
	 *         db_map=DBMapField | 
	 *         data_domain=DataDomain | 
	 *         business_rule=BusinessRule
	 *     )
	 */
	protected void sequence_EntityLongTextFieldAttr(ISerializationContext context, EntityLongTextFieldAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityLongTextField
	 *     EntityLongTextField returns EntityLongTextField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityLongTextFieldAttr*)
	 */
	protected void sequence_EntityLongTextField(ISerializationContext context, EntityLongTextField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityReferenceFieldAttr returns EntityReferenceFieldAttr
	 *
	 * Constraint:
	 *     (
	 *         glossary=Glossary | 
	 *         widget=WidgetEnum | 
	 *         constraint=EntityTextConstraintDef | 
	 *         db_map=DBMapField | 
	 *         data_domain=DataDomain | 
	 *         business_rule=BusinessRule
	 *     )
	 */
	protected void sequence_EntityReferenceFieldAttr(ISerializationContext context, EntityReferenceFieldAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityReferenceField
	 *     EntityReferenceField returns EntityReferenceField
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         superType=[EnumEntity|QualifiedName] 
	 *         lowerBound=INT 
	 *         upperBound=CardinalityUpperBound 
	 *         opposite=[EntityReferenceField|QualifiedName]? 
	 *         attrs+=EntityReferenceFieldAttr*
	 *     )
	 */
	protected void sequence_EntityReferenceField(ISerializationContext context, EntityReferenceField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityTextConstraintDef returns EntityTextConstraintDef
	 *
	 * Constraint:
	 *     (constraints+=EntityTextConstraint constraints+=EntityTextConstraint*)
	 */
	protected void sequence_EntityTextConstraintDef(ISerializationContext context, EntityTextConstraintDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityTextFieldAttr returns EntityTextFieldAttr
	 *
	 * Constraint:
	 *     (
	 *         glossary=Glossary | 
	 *         widget=WidgetText | 
	 *         constraint=EntityTextConstraintDef | 
	 *         db_map=DBMapField | 
	 *         data_domain=DataDomain | 
	 *         business_rule=BusinessRule
	 *     )
	 */
	protected void sequence_EntityTextFieldAttr(ISerializationContext context, EntityTextFieldAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityField returns EntityTextField
	 *     EntityTextField returns EntityTextField
	 *
	 * Constraint:
	 *     (name=ID attrs+=EntityTextFieldAttr*)
	 */
	protected void sequence_EntityTextField(ISerializationContext context, EntityTextField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Entity
	 *     Entity returns Entity
	 *     EnumEntity returns Entity
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         actions=Actions? 
	 *         glossary=Glossary? 
	 *         db_map=DBMapEntity? 
	 *         entity_fields+=EntityField+ 
	 *         entity_methods+=MethodDeclaration*
	 *     )
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumLiteral returns EnumLiteral
	 *
	 * Constraint:
	 *     (key=ID value=STRING)
	 */
	protected void sequence_EnumLiteral(ISerializationContext context, EnumLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.ENUM_LITERAL__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.ENUM_LITERAL__KEY));
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.ENUM_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.ENUM_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumLiteralAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEnumLiteralAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Enum
	 *     Enum returns Enum
	 *     EnumEntity returns Enum
	 *
	 * Constraint:
	 *     (name=ID enum_literals+=EnumLiteral+)
	 */
	protected void sequence_Enum(ISerializationContext context, com.softtek.rdl.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GlossaryDescription returns GlossaryDescription
	 *
	 * Constraint:
	 *     label=STRING
	 */
	protected void sequence_GlossaryDescription(ISerializationContext context, GlossaryDescription semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.GLOSSARY_DESCRIPTION__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.GLOSSARY_DESCRIPTION__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlossaryDescriptionAccess().getLabelSTRINGTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GlossaryName returns GlossaryName
	 *
	 * Constraint:
	 *     label=STRING
	 */
	protected void sequence_GlossaryName(ISerializationContext context, GlossaryName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.GLOSSARY_NAME__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.GLOSSARY_NAME__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlossaryNameAccess().getLabelSTRINGTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Glossary returns Glossary
	 *
	 * Constraint:
	 *     (glossary_name=GlossaryName glossary_description=GlossaryDescription)
	 */
	protected void sequence_Glossary(ISerializationContext context, Glossary semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.GLOSSARY__GLOSSARY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.GLOSSARY__GLOSSARY_NAME));
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.GLOSSARY__GLOSSARY_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.GLOSSARY__GLOSSARY_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlossaryAccess().getGlossary_nameGlossaryNameParserRuleCall_2_0(), semanticObject.getGlossary_name());
		feeder.accept(grammarAccess.getGlossaryAccess().getGlossary_descriptionGlossaryDescriptionParserRuleCall_4_0(), semanticObject.getGlossary_description());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodDeclaration returns MethodDeclaration
	 *
	 * Constraint:
	 *     (name=ID def_statements+=Statement+)
	 */
	protected void sequence_MethodDeclaration(ISerializationContext context, MethodDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     module=Module
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.MODEL__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.MODEL__MODULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getModuleModuleParserRuleCall_0(), semanticObject.getModule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Module returns Module
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_Module(ISerializationContext context, com.softtek.rdl.Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns StatementReturn
	 *     StatementReturn returns StatementReturn
	 *
	 * Constraint:
	 *     entityfield=[EntityField|QualifiedName]
	 */
	protected void sequence_StatementReturn(ISerializationContext context, StatementReturn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.STATEMENT_RETURN__ENTITYFIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.STATEMENT_RETURN__ENTITYFIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementReturnAccess().getEntityfieldEntityFieldQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(RdlPackage.Literals.STATEMENT_RETURN__ENTITYFIELD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidgetAttrEnum returns WidgetTypeSelect
	 *     WidgetAttrEnumTypeSelect returns WidgetTypeSelect
	 *
	 * Constraint:
	 *     (type='SelectList' sortby=WidgetSortBy?)
	 */
	protected void sequence_WidgetAttrEnumTypeSelect_WidgetTypeSelect(ISerializationContext context, WidgetTypeSelect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetDate returns WidgetDate
	 *
	 * Constraint:
	 *     (widget='widget' attrs+=WidgetAttrDate attrs+=WidgetAttrDate*)
	 */
	protected void sequence_WidgetDate(ISerializationContext context, WidgetDate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetAttr returns WidgetDisplayResult
	 *     WidgetAttrEnum returns WidgetDisplayResult
	 *     WidgetAttrDate returns WidgetDisplayResult
	 *     WidgetAttrText returns WidgetDisplayResult
	 *     WidgetDisplayResult returns WidgetDisplayResult
	 *
	 * Constraint:
	 *     (display_result='true' | display_result='false')
	 */
	protected void sequence_WidgetDisplayResult(ISerializationContext context, WidgetDisplayResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetEndYear returns WidgetEndYear
	 *     WidgetAttrDate returns WidgetEndYear
	 *
	 * Constraint:
	 *     end='-'?
	 */
	protected void sequence_WidgetEndYear(ISerializationContext context, WidgetEndYear semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetEnum returns WidgetEnum
	 *
	 * Constraint:
	 *     (widget='widget' attrs+=WidgetAttrEnum attrs+=WidgetAttrEnum*)
	 */
	protected void sequence_WidgetEnum(ISerializationContext context, WidgetEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetExposedFilter returns WidgetExposedFilter
	 *     WidgetAttr returns WidgetExposedFilter
	 *     WidgetAttrEnum returns WidgetExposedFilter
	 *     WidgetAttrEnumType returns WidgetExposedFilter
	 *     WidgetAttrDate returns WidgetExposedFilter
	 *     WidgetAttrText returns WidgetExposedFilter
	 *
	 * Constraint:
	 *     (exposed_filter='true' | exposed_filter='false')
	 */
	protected void sequence_WidgetExposedFilter(ISerializationContext context, WidgetExposedFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetHelp returns WidgetHelp
	 *     WidgetAttr returns WidgetHelp
	 *     WidgetAttrEnum returns WidgetHelp
	 *     WidgetAttrEnumType returns WidgetHelp
	 *     WidgetAttrDate returns WidgetHelp
	 *     WidgetAttrText returns WidgetHelp
	 *
	 * Constraint:
	 *     help=STRING
	 */
	protected void sequence_WidgetHelp(ISerializationContext context, WidgetHelp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.WIDGET_HELP__HELP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.WIDGET_HELP__HELP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWidgetHelpAccess().getHelpSTRINGTerminalRuleCall_2_0(), semanticObject.getHelp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidgetLabel returns WidgetLabel
	 *     WidgetAttr returns WidgetLabel
	 *     WidgetAttrEnum returns WidgetLabel
	 *     WidgetAttrEnumType returns WidgetLabel
	 *     WidgetAttrDate returns WidgetLabel
	 *     WidgetAttrText returns WidgetLabel
	 *
	 * Constraint:
	 *     label=STRING
	 */
	protected void sequence_WidgetLabel(ISerializationContext context, WidgetLabel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.WIDGET_LABEL__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.WIDGET_LABEL__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWidgetLabelAccess().getLabelSTRINGTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidgetAttrText returns WidgetSize
	 *     WidgetSize returns WidgetSize
	 *
	 * Constraint:
	 *     type=WidgetSizeType
	 */
	protected void sequence_WidgetSize(ISerializationContext context, WidgetSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.WIDGET_SIZE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.WIDGET_SIZE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWidgetSizeAccess().getTypeWidgetSizeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidgetSortBy returns WidgetSortBy
	 *
	 * Constraint:
	 *     sortby=ID
	 */
	protected void sequence_WidgetSortBy(ISerializationContext context, WidgetSortBy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.WIDGET_SORT_BY__SORTBY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.WIDGET_SORT_BY__SORTBY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWidgetSortByAccess().getSortbyIDTerminalRuleCall_2_0(), semanticObject.getSortby());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidgetStartYear returns WidgetStartYear
	 *     WidgetAttrDate returns WidgetStartYear
	 *
	 * Constraint:
	 *     start='-'?
	 */
	protected void sequence_WidgetStartYear(ISerializationContext context, WidgetStartYear semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetText returns WidgetText
	 *
	 * Constraint:
	 *     (widget='widget' attrs+=WidgetAttrText attrs+=WidgetAttrText*)
	 */
	protected void sequence_WidgetText(ISerializationContext context, WidgetText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WidgetTypeSelect returns WidgetTypeSelect
	 *
	 * Constraint:
	 *     type='SelectList'
	 */
	protected void sequence_WidgetTypeSelect(ISerializationContext context, WidgetTypeSelect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdlPackage.Literals.WIDGET_TYPE_SELECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdlPackage.Literals.WIDGET_TYPE_SELECT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWidgetTypeSelectAccess().getTypeSelectListKeyword_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WidgetType returns WidgetType
	 *     WidgetAttrEnum returns WidgetType
	 *     WidgetAttrEnumType returns WidgetType
	 *
	 * Constraint:
	 *     (type='Option' | type='Check' | type='Autocomplete')
	 */
	protected void sequence_WidgetType(ISerializationContext context, WidgetType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Widget
	 *
	 * Constraint:
	 *     (widget='widget' attrs+=WidgetAttr attrs+=WidgetAttr*)
	 */
	protected void sequence_Widget(ISerializationContext context, Widget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
