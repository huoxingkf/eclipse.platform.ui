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
 * An object in the outer scope that depends on something that exists in an
 * inner scope.
 * 
 * @since 3.1
 */
public class WrongScopeDependency {
    public WrongScopeDependency(ViewScopeDependency d) {
        
    }
}
