/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl.impl;

import com.softtek.rdl.DBMapField;
import com.softtek.rdl.RdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Map Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.impl.DBMapFieldImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.softtek.rdl.impl.DBMapFieldImpl#getPk <em>Pk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBMapFieldImpl extends MinimalEObjectImpl.Container implements DBMapField
{
  /**
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected static final String TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected String table = TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPk()
   * @generated
   * @ordered
   */
  protected static final String PK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPk()
   * @generated
   * @ordered
   */
  protected String pk = PK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DBMapFieldImpl()
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
    return RdlPackage.Literals.DB_MAP_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(String newTable)
  {
    String oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.DB_MAP_FIELD__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPk()
  {
    return pk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPk(String newPk)
  {
    String oldPk = pk;
    pk = newPk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.DB_MAP_FIELD__PK, oldPk, pk));
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
      case RdlPackage.DB_MAP_FIELD__TABLE:
        return getTable();
      case RdlPackage.DB_MAP_FIELD__PK:
        return getPk();
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
      case RdlPackage.DB_MAP_FIELD__TABLE:
        setTable((String)newValue);
        return;
      case RdlPackage.DB_MAP_FIELD__PK:
        setPk((String)newValue);
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
      case RdlPackage.DB_MAP_FIELD__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
      case RdlPackage.DB_MAP_FIELD__PK:
        setPk(PK_EDEFAULT);
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
      case RdlPackage.DB_MAP_FIELD__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
      case RdlPackage.DB_MAP_FIELD__PK:
        return PK_EDEFAULT == null ? pk != null : !PK_EDEFAULT.equals(pk);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (table: ");
    result.append(table);
    result.append(", pk: ");
    result.append(pk);
    result.append(')');
    return result.toString();
  }

} //DBMapFieldImpl