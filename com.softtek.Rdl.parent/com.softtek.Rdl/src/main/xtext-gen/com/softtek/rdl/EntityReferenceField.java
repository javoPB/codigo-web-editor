/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Reference Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.EntityReferenceField#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityReferenceField#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityReferenceField#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityReferenceField#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link com.softtek.rdl.EntityReferenceField#getAttrs <em>Attrs</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getEntityReferenceField()
 * @model
 * @generated
 */
public interface EntityReferenceField extends EntityField
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(EnumEntity)
   * @see com.softtek.rdl.RdlPackage#getEntityReferenceField_SuperType()
   * @model
   * @generated
   */
  EnumEntity getSuperType();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityReferenceField#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(EnumEntity value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see com.softtek.rdl.RdlPackage#getEntityReferenceField_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityReferenceField#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(String)
   * @see com.softtek.rdl.RdlPackage#getEntityReferenceField_UpperBound()
   * @model
   * @generated
   */
  String getUpperBound();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityReferenceField#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(String value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(EntityReferenceField)
   * @see com.softtek.rdl.RdlPackage#getEntityReferenceField_Opposite()
   * @model
   * @generated
   */
  EntityReferenceField getOpposite();

  /**
   * Sets the value of the '{@link com.softtek.rdl.EntityReferenceField#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(EntityReferenceField value);

  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference list.
   * The list contents are of type {@link com.softtek.rdl.EntityReferenceFieldAttr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference list.
   * @see com.softtek.rdl.RdlPackage#getEntityReferenceField_Attrs()
   * @model containment="true"
   * @generated
   */
  EList<EntityReferenceFieldAttr> getAttrs();

} // EntityReferenceField