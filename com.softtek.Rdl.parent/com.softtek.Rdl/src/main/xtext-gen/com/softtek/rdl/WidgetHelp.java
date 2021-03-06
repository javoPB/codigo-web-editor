/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Help</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.WidgetHelp#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getWidgetHelp()
 * @model
 * @generated
 */
public interface WidgetHelp extends WidgetAttr, WidgetAttrEnumType, WidgetAttrDate, WidgetAttrText
{
  /**
   * Returns the value of the '<em><b>Help</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Help</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help</em>' attribute.
   * @see #setHelp(String)
   * @see com.softtek.rdl.RdlPackage#getWidgetHelp_Help()
   * @model
   * @generated
   */
  String getHelp();

  /**
   * Sets the value of the '{@link com.softtek.rdl.WidgetHelp#getHelp <em>Help</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Help</em>' attribute.
   * @see #getHelp()
   * @generated
   */
  void setHelp(String value);

} // WidgetHelp
