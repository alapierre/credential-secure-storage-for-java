// Copyright (c) 2026 Adrian Lapierre.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.credentialstorage.implementation.posix.libsecret;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 17.09.2026
 */
public class LibSecretLibraryTest {

    @Test
    public void secretSchemaShouldMatchNativeFixedSizeAttributeArray() {
        final LibSecretLibrary.SecretSchema schema = new LibSecretLibrary.SecretSchema();

        assertEquals(32, schema.attributes.length);
        for (LibSecretLibrary.SecretSchemaAttribute attribute : schema.attributes) {
            assertNotNull(attribute);
        }
    }
}
