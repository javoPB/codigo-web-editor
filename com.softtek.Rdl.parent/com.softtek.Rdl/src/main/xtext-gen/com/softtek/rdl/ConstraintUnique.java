/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Unique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.ConstraintUnique#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getConstraintUnique()
 * @model
 * @generated
 */
public interface ConstraintUnique extends EntityTextConstraint
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.softtek.rdl.RdlPackage#getConstraintUnique_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.softtek.rdl.ConstraintUnique#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ConstraintUnique