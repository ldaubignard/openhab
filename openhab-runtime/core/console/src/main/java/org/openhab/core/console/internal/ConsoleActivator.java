/* 
 * openHAB, the open Home Automation Bus.
 * Copyright 2010, openHAB.org
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openhab.core.console.internal;

import org.openhab.core.items.ItemRegistry;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Extension of the default OSGi bundle activator
 */
public final class ConsoleActivator implements BundleActivator {
	
	public static ServiceTracker itemRegistryTracker;
	
	/**
	 * Called whenever the OSGi framework starts our bundle
	 */
	public void start(BundleContext bc) throws Exception {
		itemRegistryTracker = new ServiceTracker(bc, ItemRegistry.class.getName(), null);
		itemRegistryTracker.open();
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	public void stop(BundleContext bc) throws Exception {
	}
}