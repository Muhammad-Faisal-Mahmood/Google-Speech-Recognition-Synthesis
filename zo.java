/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.SpannableStringBuilder
 */
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zo
extends SpannableStringBuilder {
    private final Class a;
    private final List b = new ArrayList();

    public zo(Class clazz, CharSequence charSequence) {
        super(charSequence);
        this.a = clazz;
    }

    public zo(Class clazz, CharSequence charSequence, int n2, int n3) {
        super(charSequence, n2, n3);
        a.s(clazz, "watcherClass cannot be null");
        this.a = clazz;
    }

    private final zn a(Object object) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            zn zn2 = (zn)this.b.get(i2);
            if (zn2.a != object) continue;
            return zn2;
        }
        return null;
    }

    private final void b() {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            ((zn)this.b.get((int)i2)).b.incrementAndGet();
        }
    }

    private final void c() {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            ((zn)this.b.get((int)i2)).b.decrementAndGet();
        }
    }

    private final boolean d(Class clazz) {
        return this.a == clazz;
    }

    private final boolean e(Object object) {
        return object != null && this.d(object.getClass());
    }

    public final /* synthetic */ Editable append(char c2) {
        super.append(c2);
        return this;
    }

    public final /* synthetic */ Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final /* synthetic */ Editable append(CharSequence charSequence, int n2, int n3) {
        super.append(charSequence, n2, n3);
        return this;
    }

    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, int n2, int n3) {
        super.append(charSequence, n2, n3);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object object, int n2) {
        super.append(charSequence, object, n2);
        return this;
    }

    public final /* synthetic */ Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    public final /* synthetic */ Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final /* synthetic */ Appendable append(CharSequence charSequence, int n2, int n3) {
        super.append(charSequence, n2, n3);
        return this;
    }

    public final /* synthetic */ Editable delete(int n2, int n3) {
        super.delete(n2, n3);
        return this;
    }

    public final SpannableStringBuilder delete(int n2, int n3) {
        super.delete(n2, n3);
        return this;
    }

    public final int getSpanEnd(Object object) {
        Object object2 = object;
        if (this.e(object)) {
            zn zn2 = this.a(object);
            object2 = object;
            if (zn2 != null) {
                object2 = zn2;
            }
        }
        return super.getSpanEnd(object2);
    }

    public final int getSpanFlags(Object object) {
        Object object2 = object;
        if (this.e(object)) {
            zn zn2 = this.a(object);
            object2 = object;
            if (zn2 != null) {
                object2 = zn2;
            }
        }
        return super.getSpanFlags(object2);
    }

    public final int getSpanStart(Object object) {
        Object object2 = object;
        if (this.e(object)) {
            zn zn2 = this.a(object);
            object2 = object;
            if (zn2 != null) {
                object2 = zn2;
            }
        }
        return super.getSpanStart(object2);
    }

    public final Object[] getSpans(int n2, int n3, Class objectArray) {
        if (this.d((Class)objectArray)) {
            zn[] znArray = (zn[])super.getSpans(n2, n3, zn.class);
            objectArray = (Object[])Array.newInstance(objectArray, znArray.length);
            for (n2 = 0; n2 < znArray.length; ++n2) {
                objectArray[n2] = znArray[n2].a;
            }
            return objectArray;
        }
        return super.getSpans(n2, n3, (Class)objectArray);
    }

    public final /* synthetic */ Editable insert(int n2, CharSequence charSequence) {
        super.insert(n2, charSequence);
        return this;
    }

    public final /* synthetic */ Editable insert(int n2, CharSequence charSequence, int n3, int n4) {
        super.insert(n2, charSequence, n3, n4);
        return this;
    }

    public final SpannableStringBuilder insert(int n2, CharSequence charSequence) {
        super.insert(n2, charSequence);
        return this;
    }

    public final SpannableStringBuilder insert(int n2, CharSequence charSequence, int n3, int n4) {
        super.insert(n2, charSequence, n3, n4);
        return this;
    }

    public final int nextSpanTransition(int n2, int n3, Class clazz) {
        Class<zn> clazz2;
        block3: {
            block2: {
                if (clazz == null) break block2;
                clazz2 = clazz;
                if (!this.d(clazz)) break block3;
            }
            clazz2 = zn.class;
        }
        return super.nextSpanTransition(n2, n3, clazz2);
    }

    public final void removeSpan(Object object) {
        zn zn2;
        if (this.e(object)) {
            zn zn3;
            zn2 = zn3 = this.a(object);
            if (zn3 != null) {
                object = zn3;
                zn2 = zn3;
            }
        } else {
            zn2 = null;
        }
        super.removeSpan(object);
        if (zn2 != null) {
            this.b.remove(zn2);
        }
    }

    public final SpannableStringBuilder replace(int n2, int n3, CharSequence charSequence) {
        this.b();
        super.replace(n2, n3, charSequence);
        this.c();
        return this;
    }

    public final SpannableStringBuilder replace(int n2, int n3, CharSequence charSequence, int n4, int n5) {
        this.b();
        super.replace(n2, n3, charSequence, n4, n5);
        this.c();
        return this;
    }

    public final void setSpan(Object object, int n2, int n3, int n4) {
        Object object2 = object;
        if (this.e(object)) {
            object2 = new zn(object);
            this.b.add(object2);
        }
        super.setSpan(object2, n2, n3, n4);
    }

    public final CharSequence subSequence(int n2, int n3) {
        return new zo(this.a, (CharSequence)((Object)this), n2, n3);
    }
}

