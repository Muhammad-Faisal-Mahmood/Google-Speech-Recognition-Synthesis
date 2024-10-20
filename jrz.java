/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class jrz
implements jta,
jry {
    public static final Map a;
    public static final HashMap b;
    public static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private final Class f;

    static {
        Object object;
        int n2 = 0;
        Object object2 = jns.f(jqz.class, jrk.class, jro.class, jrp.class, jrq.class, jrr.class, jrs.class, jrt.class, jru.class, jrv.class, jra.class, jrb.class, jrc.class, jrd.class, jre.class, jrf.class, jrg.class, jrh.class, jri.class, jrj.class, jrl.class, jrm.class, jrn.class);
        Cloneable cloneable = new ArrayList<joc>(jns.B((Iterable)object2));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object = object2.next();
            if (n2 < 0) {
                jns.i();
            }
            cloneable.add(new joc((Class)object, n2));
            ++n2;
        }
        a = jjj.J(cloneable);
        object2 = new HashMap<String, String>();
        ((HashMap)object2).put("boolean", "kotlin.Boolean");
        ((HashMap)object2).put("char", "kotlin.Char");
        ((HashMap)object2).put("byte", "kotlin.Byte");
        ((HashMap)object2).put("short", "kotlin.Short");
        ((HashMap)object2).put("int", "kotlin.Int");
        ((HashMap)object2).put("float", "kotlin.Float");
        ((HashMap)object2).put("long", "kotlin.Long");
        ((HashMap)object2).put("double", "kotlin.Double");
        d = object2;
        object = new HashMap();
        ((HashMap)object).put((String)"java.lang.Boolean", (String)"kotlin.Boolean");
        ((HashMap)object).put("java.lang.Character", "kotlin.Char");
        ((HashMap)object).put("java.lang.Byte", "kotlin.Byte");
        ((HashMap)object).put("java.lang.Short", "kotlin.Short");
        ((HashMap)object).put("java.lang.Integer", "kotlin.Int");
        ((HashMap)object).put("java.lang.Float", "kotlin.Float");
        ((HashMap)object).put("java.lang.Long", "kotlin.Long");
        ((HashMap)object).put("java.lang.Double", "kotlin.Double");
        e = object;
        cloneable = new HashMap();
        ((HashMap)cloneable).put("java.lang.Object", "kotlin.Any");
        ((HashMap)cloneable).put("java.lang.String", "kotlin.String");
        ((HashMap)cloneable).put("java.lang.CharSequence", "kotlin.CharSequence");
        ((HashMap)cloneable).put("java.lang.Throwable", "kotlin.Throwable");
        ((HashMap)cloneable).put("java.lang.Cloneable", "kotlin.Cloneable");
        ((HashMap)cloneable).put("java.lang.Number", "kotlin.Number");
        ((HashMap)cloneable).put("java.lang.Comparable", "kotlin.Comparable");
        ((HashMap)cloneable).put("java.lang.Enum", "kotlin.Enum");
        ((HashMap)cloneable).put("java.lang.annotation.Annotation", "kotlin.Annotation");
        ((HashMap)cloneable).put("java.lang.Iterable", "kotlin.collections.Iterable");
        ((HashMap)cloneable).put("java.util.Iterator", "kotlin.collections.Iterator");
        ((HashMap)cloneable).put("java.util.Collection", "kotlin.collections.Collection");
        ((HashMap)cloneable).put("java.util.List", "kotlin.collections.List");
        ((HashMap)cloneable).put("java.util.Set", "kotlin.collections.Set");
        ((HashMap)cloneable).put("java.util.ListIterator", "kotlin.collections.ListIterator");
        ((HashMap)cloneable).put("java.util.Map", "kotlin.collections.Map");
        ((HashMap)cloneable).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        ((HashMap)cloneable).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        ((HashMap)cloneable).put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        ((HashMap)cloneable).putAll(object2);
        ((HashMap)cloneable).putAll(object);
        object2 = ((HashMap)object2).values();
        jse.d(object2, "<get-values>(...)");
        object2 = object2.iterator();
        while (object2.hasNext()) {
            String object3 = (String)object2.next();
            jse.b(object3);
            String string = jse.Y(object3, object3);
            object = new StringBuilder("kotlin.jvm.internal.");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("CompanionObject");
            object = new joc(((StringBuilder)object).toString(), String.valueOf(object3).concat(".Companion"));
            cloneable.put(((joc)object).a, ((joc)object).b);
        }
        for (Map.Entry entry : a.entrySet()) {
            object = (Class)entry.getKey();
            n2 = ((Number)entry.getValue()).intValue();
            String string = ((Class)object).getName();
            object = new StringBuilder("kotlin.Function");
            ((StringBuilder)object).append(n2);
            ((HashMap)cloneable).put(string, ((StringBuilder)object).toString());
        }
        b = cloneable;
        object2 = new LinkedHashMap(jjj.E(cloneable.size()));
        for (Map.Entry entry : cloneable.entrySet()) {
            cloneable = entry.getKey();
            String string = (String)entry.getValue();
            object2.put(cloneable, jse.Y(string, string));
        }
        c = object2;
    }

    public jrz(Class clazz) {
        jse.e(clazz, "jClass");
        this.f = clazz;
    }

    @Override
    public final Class a() {
        return this.f;
    }

    @Override
    public final String b() {
        Object object = this.f;
        jse.e(object, "jClass");
        boolean bl2 = ((Class)object).isAnonymousClass();
        String string = null;
        String string2 = null;
        if (bl2) {
            string2 = string;
        } else if (((Class)object).isLocalClass()) {
            string2 = string;
        } else if (((Class)object).isArray()) {
            object = ((Class)object).getComponentType();
            string = string2;
            if (((Class)object).isPrimitive()) {
                object = (String)b.get(((Class)object).getName());
                string = string2;
                if (object != null) {
                    string = ((String)object).concat("Array");
                }
            }
            string2 = string;
            if (string == null) {
                string2 = "kotlin.Array";
            }
        } else {
            string2 = string = (String)b.get(((Class)object).getName());
            if (string == null) {
                string2 = ((Class)object).getCanonicalName();
            }
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String c() {
        Object object = this.f;
        jse.e(object, "jClass");
        boolean bl2 = ((Class)object).isAnonymousClass();
        Object object2 = null;
        Object object3 = null;
        if (bl2) {
            return object2;
        }
        if (((Class)object).isLocalClass()) {
            object3 = ((Class)object).getSimpleName();
            object2 = ((Class)object).getEnclosingMethod();
            if (object2 != null) {
                jse.b(object3);
                object2 = jse.z((String)object3, String.valueOf(((Method)object2).getName()).concat("$"), (String)object3);
                if (object2 != null) return object2;
            }
            if ((object2 = ((Class)object).getEnclosingConstructor()) != null) {
                jse.b(object3);
                return jse.z(object3, String.valueOf(((Constructor)object2).getName()).concat("$"), (String)object3);
            }
            jse.b(object3);
            jse.e(object3, "<this>");
            jse.e(object3, "missingDelimiterValue");
            int n2 = jse.L((CharSequence)object3, '$', 0, 6);
            if (n2 == -1) return object3;
            object3 = ((String)object3).substring(n2 + 1, ((String)object3).length());
            jse.d(object3, "substring(...)");
            return object3;
        } else {
            if (((Class)object).isArray()) {
                object = ((Class)object).getComponentType();
                object2 = object3;
                if (((Class)object).isPrimitive()) {
                    object = (String)c.get(((Class)object).getName());
                    object2 = object3;
                    if (object != null) {
                        object2 = ((String)object).concat("Array");
                    }
                }
                object3 = object2;
                if (object2 != null) return object3;
                return "Array";
            }
            object3 = object2 = (String)c.get(((Class)object).getName());
            if (object2 != null) return object3;
            return ((Class)object).getSimpleName();
        }
    }

    @Override
    public final boolean d(Object object) {
        boolean bl2;
        Class clazz = this.f;
        jse.e(clazz, "jClass");
        Object object2 = a;
        jse.c(object2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        object2 = (Integer)object2.get(clazz);
        if (object2 != null) {
            bl2 = jsl.b(object, ((Number)object2).intValue());
        } else {
            object2 = clazz;
            if (clazz.isPrimitive()) {
                object2 = jsd.d(jsd.e(clazz));
            }
            bl2 = ((Class)object2).isInstance(object);
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        return object instanceof jrz && jse.i(jsd.d(this), jsd.d((jta)object));
    }

    public final int hashCode() {
        return jsd.d(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f.toString()).concat(" (Kotlin reflection is not available)");
    }
}

