/*
 * Decompiled with CFR 0.152.
 */
package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.PACKAGE, ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
public @interface Keep {
}

