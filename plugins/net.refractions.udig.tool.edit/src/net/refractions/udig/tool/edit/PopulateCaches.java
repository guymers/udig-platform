/* uDig - User Friendly Desktop Internet GIS client
 * http://udig.refractions.net
 * (C) 2004, Refractions Research Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * version 2.1 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */
package net.refractions.udig.tool.edit;

import net.refractions.udig.tools.edit.EditBlackboardUtil;
import net.refractions.udig.tools.edit.support.EditBlackboard;

import org.eclipse.ui.IStartup;

/**
 * Temporary until we have good caching of MathTransforms and CRS objects
 * @author Jesse
 * @since 1.1.0
 */
public class PopulateCaches implements IStartup {

    public void earlyStartup() {
        @SuppressWarnings("unused")
        EditBlackboard bb = EditBlackboardUtil.EMPTY_BLACKBOARD;
    }

}
