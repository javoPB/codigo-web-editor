/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.Glossary#getGlossary_name <em>Glossary name</em>}</li>
 *   <li>{@link com.softtek.rdl.Glossary#getGlossary_description <em>Glossary description</em>}</li>
 * </ul>
 *
 * @see com.softtek.rdl.RdlPackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends EObject
{
  /**
   * Returns the value of the '<em><b>Glossary name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glossary name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glossary name</em>' containment reference.
   * @see #setGlossary_name(GlossaryName)
   * @see com.softtek.rdl.RdlPackage#getGlossary_Glossary_name()
   * @model containment="true"
   * @generated
   */
  GlossaryName getGlossary_name();

  /**
   * Sets the value of the '{@link com.softtek.rdl.Glossary#getGlossary_name <em>Glossary name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glossary name</em>' containment reference.
   * @see #getGlossary_name()
   * @generated
   */
  void setGlossary_name(GlossaryName value);

  /**
   * Returns the value of the '<em><b>Glossary description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glossary description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glossary description</em>' containment reference.
   * @see #setGlossary_description(GlossaryDescription)
   * @see com.softtek.rdl.RdlPackage#getGlossary_Glossary_description()
   * @model containment="true"
   * @generated
   */
  GlossaryDescription getGlossary_description();

  /**
   * Sets the value of the '{@link com.softtek.rdl.Glossary#getGlossary_description <em>Glossary description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glossary description</em>' containment reference.
   * @see #getGlossary_description()
   * @generated
   */
  void setGlossary_description(GlossaryDescription value);

} // Glossary
