/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Map Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.DBMapField#getTable <em>Table</em>}</li>
 *   <li>{@link com.softtek.rdl.DBMapField#getPk <em>Pk</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getDBMapField()
 * @model
 * @generated
 */
public interface DBMapField extends EObject
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(String)
   * @see com.softtek.rdl.RdlPackage#getDBMapField_Table()
   * @model
   * @generated
   */
  String getTable();

  /**
   * Sets the value of the '{@link com.softtek.rdl.DBMapField#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
  void setTable(String value);

  /**
   * Returns the value of the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk</em>' attribute.
   * @see #setPk(String)
   * @see com.softtek.rdl.RdlPackage#getDBMapField_Pk()
   * @model
   * @generated
   */
  String getPk();

  /**
   * Sets the value of the '{@link com.softtek.rdl.DBMapField#getPk <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk</em>' attribute.
   * @see #getPk()
   * @generated
   */
  void setPk(String value);

} // DBMapField
