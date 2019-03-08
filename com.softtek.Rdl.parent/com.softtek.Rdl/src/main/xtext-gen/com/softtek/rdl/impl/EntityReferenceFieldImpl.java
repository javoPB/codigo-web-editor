/**
 * generated by Xtext 2.16.0
 */
package com.softtek.rdl.impl;

import com.softtek.rdl.EntityReferenceField;
import com.softtek.rdl.EntityReferenceFieldAttr;
import com.softtek.rdl.EnumEntity;
import com.softtek.rdl.RdlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Reference Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softtek.rdl.impl.EntityReferenceFieldImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.softtek.rdl.impl.EntityReferenceFieldImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.softtek.rdl.impl.EntityReferenceFieldImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.softtek.rdl.impl.EntityReferenceFieldImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link com.softtek.rdl.impl.EntityReferenceFieldImpl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityReferenceFieldImpl extends EntityFieldImpl implements EntityReferenceField
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected EnumEntity superType;

  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final String UPPER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected String upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected EntityReferenceField opposite;

  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected EList<EntityReferenceFieldAttr> attrs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityReferenceFieldImpl()
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
    return RdlPackage.Literals.ENTITY_REFERENCE_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntity getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (EnumEntity)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdlPackage.ENTITY_REFERENCE_FIELD__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumEntity basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(EnumEntity newSuperType)
  {
    EnumEntity oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.ENTITY_REFERENCE_FIELD__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(int newLowerBound)
  {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.ENTITY_REFERENCE_FIELD__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(String newUpperBound)
  {
    String oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.ENTITY_REFERENCE_FIELD__UPPER_BOUND, oldUpperBound, upperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityReferenceField getOpposite()
  {
    if (opposite != null && opposite.eIsProxy())
    {
      InternalEObject oldOpposite = (InternalEObject)opposite;
      opposite = (EntityReferenceField)eResolveProxy(oldOpposite);
      if (opposite != oldOpposite)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdlPackage.ENTITY_REFERENCE_FIELD__OPPOSITE, oldOpposite, opposite));
      }
    }
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityReferenceField basicGetOpposite()
  {
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpposite(EntityReferenceField newOpposite)
  {
    EntityReferenceField oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdlPackage.ENTITY_REFERENCE_FIELD__OPPOSITE, oldOpposite, opposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityReferenceFieldAttr> getAttrs()
  {
    if (attrs == null)
    {
      attrs = new EObjectContainmentEList<EntityReferenceFieldAttr>(EntityReferenceFieldAttr.class, this, RdlPackage.ENTITY_REFERENCE_FIELD__ATTRS);
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
      case RdlPackage.ENTITY_REFERENCE_FIELD__ATTRS:
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
      case RdlPackage.ENTITY_REFERENCE_FIELD__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case RdlPackage.ENTITY_REFERENCE_FIELD__LOWER_BOUND:
        return getLowerBound();
      case RdlPackage.ENTITY_REFERENCE_FIELD__UPPER_BOUND:
        return getUpperBound();
      case RdlPackage.ENTITY_REFERENCE_FIELD__OPPOSITE:
        if (resolve) return getOpposite();
        return basicGetOpposite();
      case RdlPackage.ENTITY_REFERENCE_FIELD__ATTRS:
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
      case RdlPackage.ENTITY_REFERENCE_FIELD__SUPER_TYPE:
        setSuperType((EnumEntity)newValue);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__UPPER_BOUND:
        setUpperBound((String)newValue);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__OPPOSITE:
        setOpposite((EntityReferenceField)newValue);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__ATTRS:
        getAttrs().clear();
        getAttrs().addAll((Collection<? extends EntityReferenceFieldAttr>)newValue);
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
      case RdlPackage.ENTITY_REFERENCE_FIELD__SUPER_TYPE:
        setSuperType((EnumEntity)null);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__OPPOSITE:
        setOpposite((EntityReferenceField)null);
        return;
      case RdlPackage.ENTITY_REFERENCE_FIELD__ATTRS:
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
      case RdlPackage.ENTITY_REFERENCE_FIELD__SUPER_TYPE:
        return superType != null;
      case RdlPackage.ENTITY_REFERENCE_FIELD__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case RdlPackage.ENTITY_REFERENCE_FIELD__UPPER_BOUND:
        return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
      case RdlPackage.ENTITY_REFERENCE_FIELD__OPPOSITE:
        return opposite != null;
      case RdlPackage.ENTITY_REFERENCE_FIELD__ATTRS:
        return attrs != null && !attrs.isEmpty();
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
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(')');
    return result.toString();
  }

} //EntityReferenceFieldImpl
