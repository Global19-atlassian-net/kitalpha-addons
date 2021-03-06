/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PluginDependencyItemProvider extends EclipseElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginDependencyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTargetPropertyDescriptor(object);
			addMinimumVersionPropertyDescriptor(object);
			addMaximumVersionPropertyDescriptor(object);
			addMinimumInclusionPropertyDescriptor(object);
			addMaximumInclusionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDependency_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDependency_target_feature", "_UI_PluginDependency_type"),
				 PlatformPackage.Literals.PLUGIN_DEPENDENCY__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Minimum Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumVersionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDependency_minimumVersion_feature"),
				 getString("_UI_PluginDependency_minimumVersion_description"),
				 PlatformPackage.Literals.PLUGIN_DEPENDENCY__MINIMUM_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Maximum Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumVersionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDependency_maximumVersion_feature"),
				 getString("_UI_PluginDependency_maximumVersion_description"),
				 PlatformPackage.Literals.PLUGIN_DEPENDENCY__MAXIMUM_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Minimum Inclusion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumInclusionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDependency_minimumInclusion_feature"),
				 getString("_UI_PluginDependency_minimumInclusion_description"),
				 PlatformPackage.Literals.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Maximum Inclusion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumInclusionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDependency_maximumInclusion_feature"),
				 getString("_UI_PluginDependency_maximumInclusion_description"),
				 PlatformPackage.Literals.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This returns PluginDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PluginDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		/**
		 * CUSTOM_CODE_BEGIN
		 **/
		String firstBracket = "|";
		String lastBracket = "|";
		PluginDependency dependency = (PluginDependency) object;
		String id = "";
		String minimumVersion = "UNDEFINED";
		String maximumVersion = "UNDEFINED";
		
		// brackets
		if (dependency.getMinimumInclusion().getName() == InclusionKind.INCLUSIVE.getLiteral())
			firstBracket = "[";
		else if (dependency.getMinimumInclusion().getName() == InclusionKind.EXCLUSIVE.getLiteral())
			firstBracket = "]";
		else
			firstBracket = "|";
		if (dependency.getMaximumInclusion().getName() == InclusionKind.INCLUSIVE.getLiteral())
			lastBracket = "]";
		else if (dependency.getMaximumInclusion().getName() == InclusionKind.EXCLUSIVE.getLiteral())
			lastBracket = "[";
		else
			lastBracket = "|";

		//versions
		String modelMinimumVersion = dependency.getMinimumVersion();
		if ((modelMinimumVersion != null)&&(!modelMinimumVersion.isEmpty()))
			minimumVersion = modelMinimumVersion;
		
		String modelMaximumVersion = dependency.getMaximumVersion();
		if ((modelMaximumVersion != null)&&(!modelMaximumVersion.isEmpty()))
			maximumVersion = modelMaximumVersion;
		
		
		//dependency
		if (dependency.getTarget() != null) {
			id = dependency.getTarget().getId();
		}
		
		return "" + id + " " + firstBracket + minimumVersion + " ; "
				+ maximumVersion + lastBracket+" [Plugin Dependency]";
		/**
		 * CUSTOM_CODE_END : []
		 **/

	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PluginDependency.class)) {
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_VERSION:
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_VERSION:
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION:
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}


}
