/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Text Field Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.EntityTextFieldAttr#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityTextFieldAttr#getWidget <em>Widget</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityTextFieldAttr#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityTextFieldAttr#getDb_map <em>Db map</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityTextFieldAttr#getData_domain <em>Data domain</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityTextFieldAttr#getBusiness_rule <em>Business rule</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr()
 * @model
 * @generated
 */
public interface EntityTextFieldAttr extends EObject
{
  /**
   * Returns the value of the '<em><b>Glossary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glossary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glossary</em>' containment reference.
   * @see #setGlossary(Glossary)
   * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr_Glossary()
   * @model containment="true"
   * @generated
   */
  Glossary getGlossary();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityTextFieldAttr#getGlossary <em>Glossary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glossary</em>' containment reference.
   * @see #getGlossary()
   * @generated
   */
  void setGlossary(Glossary value);

  /**
   * Returns the value of the '<em><b>Widget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widget</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widget</em>' containment reference.
   * @see #setWidget(WidgetText)
   * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr_Widget()
   * @model containment="true"
   * @generated
   */
  WidgetText getWidget();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityTextFieldAttr#getWidget <em>Widget</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widget</em>' containment reference.
   * @see #getWidget()
   * @generated
   */
  void setWidget(WidgetText value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(EntityTextConstraintDef)
   * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr_Constraint()
   * @model containment="true"
   * @generated
   */
  EntityTextConstraintDef getConstraint();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityTextFieldAttr#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(EntityTextConstraintDef value);

  /**
   * Returns the value of the '<em><b>Db map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db map</em>' containment reference.
   * @see #setDb_map(DBMapField)
   * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr_Db_map()
   * @model containment="true"
   * @generated
   */
  DBMapField getDb_map();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityTextFieldAttr#getDb_map <em>Db map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db map</em>' containment reference.
   * @see #getDb_map()
   * @generated
   */
  void setDb_map(DBMapField value);

  /**
   * Returns the value of the '<em><b>Data domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data domain</em>' containment reference.
   * @see #setData_domain(DataDomain)
   * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr_Data_domain()
   * @model containment="true"
   * @generated
   */
  DataDomain getData_domain();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityTextFieldAttr#getData_domain <em>Data domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data domain</em>' containment reference.
   * @see #getData_domain()
   * @generated
   */
  void setData_domain(DataDomain value);

  /**
   * Returns the value of the '<em><b>Business rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business rule</em>' containment reference.
   * @see #setBusiness_rule(BusinessRule)
   * @see com.softtek.rdl.RdlPackage#getEntityTextFieldAttr_Business_rule()
   * @model containment="true"
   * @generated
   */
  BusinessRule getBusiness_rule();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityTextFieldAttr#getBusiness_rule <em>Business rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Business rule</em>' containment reference.
   * @see #getBusiness_rule()
   * @generated
   */
  void setBusiness_rule(BusinessRule value);

} // EntityTextFieldAttr
