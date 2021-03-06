/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Long Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.EntityLongTextField#getAttrs <em>Attrs</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getEntityLongTextField()
 * @model
 * @generated
 */
public interface EntityLongTextField extends EntityField
{
  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference list.
   * The list contents are of type {@link com.softtek.rdl.EntityLongTextFieldAttr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference list.
   * @see com.softtek.rdl.RdlPackage#getEntityLongTextField_Attrs()
   * @model containment="true"
   * @generated
   */
  EList<EntityLongTextFieldAttr> getAttrs();

} // EntityLongTextField
