/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl.impl;

import com.softtek.rdl.EntityField;
import com.softtek.rdl.RdlPackage;
import com.softtek.rdl.StatementReturn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.impl.StatementReturnImpl#getEntityfield <em>Entityfield</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementReturnImpl extends StatementImpl implements StatementReturn
{
  /**
   * The cached value of the '{@link #getEntityfield() <em>Entityfield</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityfield()
   * @generated
   * @ordered
   */
  protected EntityField entityfield;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementReturnImpl()
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
    return RdlPackage.Literals.STATEMENT_RETURN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityField getEntityfield()
  {
    if (entityfield != null && entityfield.eIsProxy())
    {
      InternalEObject oldEntityfield = (InternalEObject)entityfield;
      entityfield = (EntityField)eResolveProxy(oldEntityfield);
      if (entityfield != oldEntityfield)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdlPackage.STATEMENT_RETURN__ENTITYFIELD, oldEntityfield, entityfield));
      }
    }
    return entityfield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityField basicGetEntityfield()
  {
    return entityfield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityfield(EntityField newEntityfield)
  {
    EntityField oldEntityfield = entityfield;
    entityfield = newEntityfield;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.STATEMENT_RETURN__ENTITYFIELD, oldEntityfield, entityfield));
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
      case RdlPackage.STATEMENT_RETURN__ENTITYFIELD:
        if (resolve) return getEntityfield();
        return basicGetEntityfield();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdlPackage.STATEMENT_RETURN__ENTITYFIELD:
        setEntityfield((EntityField)newValue);
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
      case RdlPackage.STATEMENT_RETURN__ENTITYFIELD:
        setEntityfield((EntityField)null);
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
      case RdlPackage.STATEMENT_RETURN__ENTITYFIELD:
        return entityfield != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementReturnImpl
