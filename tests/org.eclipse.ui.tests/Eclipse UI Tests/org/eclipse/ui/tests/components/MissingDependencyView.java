/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.tests.components;

/**
 * Component used for testing dependency errors. This component can never
 * be created because it depends on a type that is not a valid component.
 * 
 * @since 3.1
 */
public class MissingDependencyView {
    public MissingDependencyView(NotAValidComponent otherComponent) {
        
    }
}
