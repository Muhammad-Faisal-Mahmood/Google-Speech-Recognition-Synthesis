/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$NotFoundException
 *  android.os.BadParcelableException
 *  android.os.Bundle
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public final class gbb {
    public final Object a;
    public int b;
    public final Object c;
    private boolean d;
    private final Object e;

    public gbb() {
        this.a = new Object();
        this.e = new HashSet();
        this.c = new ggt(this, 1);
    }

    public gbb(awg awg2, bqv bqv2, be be2) {
        this.d = false;
        this.b = -1;
        this.a = awg2;
        this.e = bqv2;
        this.c = be2;
    }

    public gbb(awg object, bqv bqv2, be be2, Bundle bundle) {
        this.d = false;
        this.b = -1;
        this.a = object;
        this.e = bqv2;
        this.c = be2;
        object = be2;
        be2.h = null;
        be2.i = null;
        be2.z = 0;
        be2.v = false;
        be2.q = false;
        object = be2.m;
        object = object != null ? ((be)object).k : null;
        be2.n = object;
        be2.m = null;
        be2.g = bundle;
        be2.l = bundle.getBundle("arguments");
    }

    public gbb(awg object, bqv object2, ClassLoader object3, bl bl2, Bundle bundle) {
        this.d = false;
        this.b = -1;
        this.a = object;
        this.e = object2;
        object2 = (cc)bundle.getParcelable("state");
        object = bl2.b(((cc)object2).a);
        ((be)object).k = ((cc)object2).b;
        ((be)object).u = ((cc)object2).c;
        ((be)object).w = ((cc)object2).d;
        ((be)object).x = true;
        ((be)object).E = ((cc)object2).e;
        ((be)object).F = ((cc)object2).f;
        ((be)object).G = ((cc)object2).g;
        ((be)object).J = ((cc)object2).h;
        ((be)object).r = ((cc)object2).i;
        ((be)object).I = ((cc)object2).j;
        ((be)object).H = ((cc)object2).k;
        ((be)object).Y = aba.values()[((cc)object2).l];
        ((be)object).n = ((cc)object2).m;
        ((be)object).o = ((cc)object2).n;
        ((be)object).R = ((cc)object2).o;
        this.c = object;
        object2 = (be)object;
        ((be)object).g = bundle;
        object2 = bundle.getBundle("arguments");
        if (object2 != null) {
            object2.setClassLoader((ClassLoader)object3);
        }
        object3 = (be)object;
        ((be)object).setArguments((Bundle)object2);
        if (by.S(2)) {
            Objects.toString(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        fpk.c();
        Object object = this.a;
        synchronized (object) {
            if (bl2 != this.d) {
                Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    ((Runnable)iterator.next()).run();
                }
                this.d = bl2;
            }
            return;
        }
    }

    public final void b() {
        int n2;
        Object object;
        block10: {
            Object object2;
            Object object3;
            object = ((be)this.c).O;
            while (true) {
                object3 = null;
                if (object == null || (object3 = by.f((View)object)) != null) break;
                if ((object = object.getParent()) instanceof View) {
                    object = (View)object;
                    continue;
                }
                object = null;
            }
            object = ((be)this.c).D;
            if (object3 != null && !object3.equals(object)) {
                object = this.c;
                object2 = (be)object;
                n2 = ((be)object2).F;
                jse.e(object, "fragment");
                object3 = new aak((be)object2, (be)object3, n2);
                zy.d((aai)object3);
                object2 = zy.b((be)object2);
                if (((zx)object2).b.contains((Object)zw.e) && zy.e((zx)object2, object.getClass(), object3.getClass())) {
                    zy.c((zx)object2, (aai)object3);
                }
            }
            object3 = this.e;
            object2 = this.c;
            object = ((be)object2).O;
            int n3 = -1;
            if (object == null) {
                n2 = n3;
            } else {
                object3 = (bqv)object3;
                int n4 = ((ArrayList)((bqv)object3).d).indexOf(object2);
                int n5 = n4 - 1;
                while (true) {
                    n2 = n4;
                    if (n5 < 0) break;
                    object2 = (be)((ArrayList)((bqv)object3).d).get(n5);
                    if (((be)object2).O == object && (object2 = ((be)object2).P) != null) {
                        n2 = object.indexOfChild((View)object2) + 1;
                        break block10;
                    }
                    --n5;
                }
                while (true) {
                    n5 = n2 + 1;
                    n2 = n3;
                    if (n5 >= ((ArrayList)((bqv)object3).d).size()) break;
                    object2 = (be)((ArrayList)((bqv)object3).d).get(n5);
                    if (((be)object2).O == object && (object2 = ((be)object2).P) != null) {
                        n2 = object.indexOfChild((View)object2);
                        break;
                    }
                    n2 = n5;
                }
            }
        }
        object = (be)this.c;
        ((be)object).O.addView(((be)object).P, n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c() {
        int n2;
        Object object;
        LayoutInflater layoutInflater;
        Object object2;
        Object object3;
        block20: {
            Object object4;
            block21: {
                block19: {
                    if (((be)this.c).u) {
                        return;
                    }
                    if (by.S(3)) {
                        Objects.toString(this.c);
                    }
                    object3 = ((be)this.c).g;
                    object2 = null;
                    object3 = object3 != null ? object3.getBundle("savedInstanceState") : null;
                    object4 = (be)this.c;
                    layoutInflater = ((be)object4).l((Bundle)object3);
                    object = ((be)object4).O;
                    if (object == null) break block19;
                    object2 = object;
                    break block20;
                }
                n2 = ((be)object4).F;
                if (n2 == 0) break block20;
                if (n2 == -1) {
                    object2 = new StringBuilder("Cannot create fragment ");
                    ((StringBuilder)object2).append(this.c);
                    ((StringBuilder)object2).append(" for a container view with no id");
                    throw new IllegalArgumentException(((StringBuilder)object2).toString());
                }
                object = (ViewGroup)((be)object4).A.m.a(n2);
                if (object != null) break block21;
                Object object5 = this.c;
                object4 = (be)object5;
                object2 = object;
                if (((be)object4).x) break block20;
                if (((be)object4).w) {
                    object2 = object;
                    break block20;
                } else {
                    try {
                        object2 = ((be)object5).getResources().getResourceName(((be)this.c).F);
                    }
                    catch (Resources.NotFoundException notFoundException) {
                        object2 = "unknown";
                    }
                    object3 = new StringBuilder("No view found for id 0x");
                    ((StringBuilder)object3).append(Integer.toHexString(((be)this.c).F));
                    ((StringBuilder)object3).append(" (");
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(") for fragment ");
                    ((StringBuilder)object3).append(this.c);
                    throw new IllegalArgumentException(((StringBuilder)object3).toString());
                }
            }
            object2 = object;
            if (!(object instanceof bk)) {
                Object object6 = this.c;
                jse.e(object6, "fragment");
                object2 = (be)object6;
                object4 = new aaj((be)object2, (ViewGroup)object);
                zy.d((aai)object4);
                zx zx2 = zy.b((be)object2);
                object2 = object;
                if (zx2.b.contains((Object)zw.i)) {
                    object2 = object;
                    if (zy.e(zx2, object6.getClass(), object4.getClass())) {
                        zy.c(zx2, (aai)object4);
                        object2 = object;
                    }
                }
            }
        }
        object = (be)this.c;
        ((be)object).O = object2;
        ((be)object).d(layoutInflater, (ViewGroup)object2, (Bundle)object3);
        if (((be)this.c).P != null) {
            float f2;
            if (by.S(3)) {
                Objects.toString(this.c);
            }
            ((be)this.c).P.setSaveFromParentEnabled(false);
            object = this.c;
            ((be)object).P.setTag(2131427660, object);
            if (object2 != null) {
                this.b();
            }
            object2 = (be)this.c;
            if (((be)object2).H) {
                ((be)object2).P.setVisibility(8);
            }
            if (((be)this.c).P.isAttachedToWindow()) {
                vy.d(((be)this.c).P);
            } else {
                object2 = ((be)this.c).P;
                object2.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new fk(object2, 1));
            }
            ((be)this.c).q();
            object = this.a;
            object2 = (be)this.c;
            layoutInflater = ((be)object2).P;
            ((awg)object).z((be)object2, (View)layoutInflater, (Bundle)object3, false);
            n2 = ((be)this.c).P.getVisibility();
            ((be)this.c).k().q = f2 = ((be)this.c).P.getAlpha();
            object2 = (be)this.c;
            if (((be)object2).O != null && n2 == 0) {
                object2 = ((be)object2).P.findFocus();
                if (object2 != null) {
                    ((be)this.c).t((View)object2);
                    if (by.S(2)) {
                        Objects.toString(object2);
                        Objects.toString(this.c);
                    }
                }
                ((be)this.c).P.setAlpha(0.0f);
            }
        }
        ((be)this.c).f = 2;
    }

    public final void d() {
        be be2 = (be)this.c;
        if (be2.u && be2.v && !be2.y) {
            if (by.S(3)) {
                Objects.toString(this.c);
            }
            be2 = (be2 = ((be)this.c).g) != null ? be2.getBundle("savedInstanceState") : null;
            Object object = (be)this.c;
            ((be)object).d(((be)object).l((Bundle)be2), null, (Bundle)be2);
            object = ((be)this.c).P;
            if (object != null) {
                object.setSaveFromParentEnabled(false);
                object = this.c;
                ((be)object).P.setTag(2131427660, object);
                object = (be)this.c;
                if (((be)object).H) {
                    ((be)object).P.setVisibility(8);
                }
                ((be)this.c).q();
                Object object2 = this.a;
                be be3 = (be)this.c;
                object = be3.P;
                ((awg)object2).z(be3, (View)object, (Bundle)be2, false);
                ((be)this.c).f = 2;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void e() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [78[FORLOOP]], but top level block is 23[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(ClassLoader object) {
        Object object2 = ((be)this.c).g;
        if (object2 == null) return;
        object2.setClassLoader((ClassLoader)object);
        if (((be)this.c).g.getBundle("savedInstanceState") == null) {
            ((be)this.c).g.putBundle("savedInstanceState", new Bundle());
        }
        try {
            object2 = this.c;
            object = ((be)object2).g.getSparseParcelableArray("viewState");
            ((be)object2).h = object;
        }
        catch (BadParcelableException badParcelableException) {
            object2 = this.c;
            Objects.toString(object2);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(object2)), badParcelableException);
        }
        object = (be)this.c;
        ((be)object).i = ((be)object).g.getBundle("viewRegistryState");
        object = (cc)((be)this.c).g.getParcelable("state");
        if (object != null) {
            object2 = this.c;
            Object object3 = ((cc)object).m;
            object2 = (be)object2;
            object2.n = object3;
            object2.o = ((cc)object).n;
            object3 = object2.j;
            if (object3 != null) {
                object2.R = (Boolean)object3;
                ((be)this.c).j = null;
            } else {
                object2.R = ((cc)object).o;
            }
        }
        object = (be)this.c;
        if (((be)object).R) return;
        ((be)object).Q = true;
    }

    public final void g() {
        if (((be)this.c).P != null) {
            if (by.S(2)) {
                Objects.toString(this.c);
                Objects.toString(((be)this.c).P);
            }
            SparseArray sparseArray = new SparseArray();
            ((be)this.c).P.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                ((be)this.c).h = sparseArray;
            }
            sparseArray = new Bundle();
            ((be)this.c).aa.b.c((Bundle)sparseArray);
            if (!sparseArray.isEmpty()) {
                ((be)this.c).i = sparseArray;
            }
        }
    }
}

