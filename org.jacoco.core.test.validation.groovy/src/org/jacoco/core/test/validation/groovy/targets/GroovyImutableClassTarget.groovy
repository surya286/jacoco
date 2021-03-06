/*******************************************************************************
 * Copyright (c) 2009, 2019 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Oliver Nautsch - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core.test.validation.groovy.targets

import groovy.transform.Immutable

@Immutable
class GroovyImutableClassTarget { // assertEmpty()

    String name // assertEmpty()
    int age     // assertEmpty()

    static void main(String[] args) {
        new GroovyImutableClassTarget() // assertFullyCovered()
    }
}
