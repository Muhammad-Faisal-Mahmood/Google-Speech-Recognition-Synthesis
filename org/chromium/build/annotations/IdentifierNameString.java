/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.build.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.FIELD, ElementType.METHOD})
public @interface IdentifierNameString {
}

