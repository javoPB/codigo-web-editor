/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl.impl;

import com.softtek.rdl.EntityDateField;
import com.softtek.rdl.EntityDateFieldAttr;
import com.softtek.rdl.RdlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Date Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.impl.EntityDateFieldImpl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityDateFieldImpl extends EntityFieldImpl implements EntityDateField
{
  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected EList<EntityDateFieldAttr> attrs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityDateFieldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RdlPackage.Literals.ENTITY_DATE_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityDateFieldAttr> getAttrs()
  {
    if (attrs == null)
    {
      attrs = new EObjectContainmentEList<EntityDateFieldAttr>(EntityDateFieldAttr.class, this, RdlPackage.ENTITY_DATE_FIELD__ATTRS);
    }
    return attrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RdlPackage.ENTITY_DATE_FIELD__ATTRS:
        return ((InternalEList<?>)getAttrs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RdlPackage.ENTITY_DATE_FIELD__ATTRS:
        return getAttrs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdlPackage.ENTITY_DATE_FIELD__ATTRS:
        getAttrs().clear();
        getAttrs().addAll((Collection<? extends EntityDateFieldAttr>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RdlPackage.ENTITY_DATE_FIELD__ATTRS:
        getAttrs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RdlPackage.ENTITY_DATE_FIELD__ATTRS:
        return attrs != null && !attrs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityDateFieldImpl
