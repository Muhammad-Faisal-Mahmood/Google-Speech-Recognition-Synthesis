/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCodec
 *  android.os.Bundle
 *  android.util.SparseIntArray
 *  android.view.textclassifier.TextClassificationManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 */
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.wear.ambient.WearableControllerProvider;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class awf {
    public static int c;
    public final Object a;
    public Object b;

    public awf() {
        this.a = new HashSet();
    }

    public awf(brg brg2) {
        this.a = brg2;
    }

    public awf(cbp cbp2) {
        this.a = new SparseIntArray();
        kl.at(cbp2);
        this.b = cbp2;
    }

    public awf(Object object) {
        this.a = object;
    }

    public awf(ra ra2) {
        this.b = null;
        this.a = new ArrayList();
        ++c;
        this.b = ra2;
    }

    public awf(byte[] byArray) {
        this.a = new HashMap();
    }

    public awf(char[] cArray) {
        this.a = new HashSet();
    }

    protected static final File n(Context context) {
        return context.getDir("lib", 0);
    }

    protected static final File p(Context context, String string) {
        string = SharedLibraryVersion.b(string);
        if (WearableControllerProvider.d(null)) {
            return new File(awf.n(context), string);
        }
        return new File(awf.n(context), String.valueOf(string).concat(".null"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Bundle a(String string) {
        awi awi2 = (awi)this.a;
        if (!awi2.e) throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        Bundle bundle = awi2.d;
        Bundle bundle2 = null;
        if (bundle == null) {
            return bundle2;
        }
        if (bundle.containsKey(string)) {
            if (!bundle.containsKey(string)) throw new IllegalStateException(a.aj(string, "Saved state key '", "' was not found"));
            bundle2 = bundle.getBundle(string);
            if (bundle2 == null) throw new IllegalStateException(a.aj(string, "Saved state key '", "' was not found"));
        } else {
            bundle2 = null;
        }
        xm.h(bundle);
        bundle.remove(string);
        if (!bundle.isEmpty()) return bundle2;
        awi2.d = null;
        return bundle2;
    }

    public final void b(String object, awe awe2) {
        jse.e(awe2, "provider");
        jse.e(awe2, "provider");
        Object object2 = this.a;
        xm xm2 = ((awi)object2).g;
        synchronized (xm2) {
            if (!((awi)object2).b.containsKey(object)) {
                ((awi)object2).b.put(object, awe2);
                return;
            }
            object = new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            throw object;
        }
    }

    public final void c(Class object) {
        if (((awi)this.a).f) {
            block4: {
                Object object2;
                Object object3 = object2 = this.b;
                if (object2 == null) {
                    object3 = new awb(this);
                }
                this.b = object3;
                try {
                    ((Class)object).getDeclaredConstructor(null);
                    object3 = this.b;
                    if (object3 == null) break block4;
                    object = ((Class)object).getName();
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    object3 = new StringBuilder("Class ");
                    ((StringBuilder)object3).append(((Class)object).getSimpleName());
                    ((StringBuilder)object3).append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalArgumentException(((StringBuilder)object3).toString(), noSuchMethodException);
                }
                jse.d(object, "clazz.name");
                jse.e(object, "className");
                ((awb)object3).a.add(object);
            }
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final boolean d() {
        return ((awi)this.a).e;
    }

    public final awe e() {
        Object object = this.a;
        xm xm2 = ((awi)object).g;
        synchronized (xm2) {
            Object var3_6;
            boolean bl2;
            Iterator iterator = ((awi)object).b.entrySet().iterator();
            while (true) {
                bl2 = iterator.hasNext();
                object = null;
                var3_6 = null;
                if (!bl2) break;
                break;
            }
            {
                object = iterator.next();
                String string = (String)object.getKey();
                object = (awe)object.getValue();
                bl2 = jse.i(string, "androidx.lifecycle.internal.SavedStateHandlesProvider");
                if (bl2) continue;
                object = var3_6;
                if (object == null) continue;
            }
            return object;
        }
    }

    public final void f(MediaCodec mediaCodec) {
        Object object = this.b;
        if (object != null && !ki$$ExternalSyntheticApiModelOutline0.m(ki$$ExternalSyntheticApiModelOutline0.m(object), mediaCodec)) {
            return;
        }
        abr.f(((HashSet)this.a).add(mediaCodec));
    }

    public final void g(MediaCodec mediaCodec) {
        Object object;
        if (((HashSet)this.a).remove(mediaCodec) && (object = this.b) != null) {
            ki$$ExternalSyntheticApiModelOutline0.m(ki$$ExternalSyntheticApiModelOutline0.m(object), mediaCodec);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map h() {
        synchronized (this) {
            if (this.b != null) return this.b;
            Object object = this.a;
            HashMap hashMap = new HashMap(object);
            this.b = DesugarCollections.unmodifiableMap(hashMap);
            return this.b;
        }
    }

    public final long i(qs qs2, long l2) {
        long l3;
        ra ra2 = qs2.d;
        if (ra2 instanceof qw) {
            return l2;
        }
        int n2 = qs2.j.size();
        long l4 = l2;
        for (int i2 = 0; i2 < n2; ++i2) {
            qq qq2 = (qq)qs2.j.get(i2);
            l3 = l4;
            if (qq2 instanceof qs) {
                qq2 = (qs)qq2;
                l3 = ((qs)qq2).d == ra2 ? l4 : Math.min(l4, this.i((qs)qq2, (long)((qs)qq2).e + l2));
            }
            l4 = l3;
        }
        if (qs2 == ra2.i) {
            l3 = ra2.a();
            qs2 = ra2.h;
            return Math.min(Math.min(l4, this.i(qs2, l2 -= l3)), l2 - (long)ra2.h.e);
        }
        return l4;
    }

    public final long j(qs qs2, long l2) {
        long l3;
        ra ra2 = qs2.d;
        if (ra2 instanceof qw) {
            return l2;
        }
        int n2 = qs2.j.size();
        long l4 = l2;
        for (int i2 = 0; i2 < n2; ++i2) {
            qq qq2 = (qq)qs2.j.get(i2);
            l3 = l4;
            if (qq2 instanceof qs) {
                qq2 = (qs)qq2;
                l3 = ((qs)qq2).d == ra2 ? l4 : Math.max(l4, this.j((qs)qq2, (long)((qs)qq2).e + l2));
            }
            l4 = l3;
        }
        if (qs2 == ra2.h) {
            l3 = ra2.a();
            qs2 = ra2.i;
            return Math.max(Math.max(l4, this.j(qs2, l2 += l3)), l2 - (long)ra2.i.e);
        }
        return l4;
    }

    public final TextClassifier k() {
        Object object;
        Object object2 = object = this.b;
        if (object == null) {
            object2 = ag$$ExternalSyntheticApiModelOutline0.m(((TextView)this.a).getContext().getSystemService(ag$$ExternalSyntheticApiModelOutline0.m()));
            object2 = object2 != null ? ag$$ExternalSyntheticApiModelOutline0.m((TextClassificationManager)object2) : ag$$ExternalSyntheticApiModelOutline0.m();
        }
        return object2;
    }

    public final void l(String string) {
        Object object = this.b;
        if (object != null) {
            object.a(string);
        }
    }

    public final void m(String string, Object ... objectArray) {
        this.l(String.format(Locale.US, string, objectArray));
    }

    /*
     * Exception decompiling
     */
    public final void o(Context var1_1, String var2_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [54[UNCONDITIONALDOLOOP], 30[CATCHBLOCK], 53[UNCONDITIONALDOLOOP]], but top level block is 19[TRYBLOCK]
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

    public final void q(Context context, String string, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        if (context != null) {
            if (!WearableControllerProvider.d(string)) {
                this.m("Beginning load of %s...", string);
                if (ambientModeSupport$AmbientController == null) {
                    this.o(context, string);
                    return;
                }
                new Thread(new ww(this, context, string, ambientModeSupport$AmbientController, 8)).start();
                return;
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r() {
        Object object = this.a;
        synchronized (object) {
            ((SparseIntArray)this.a).clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int s(int n2) {
        Object object = this.a;
        synchronized (object) {
            return ((SparseIntArray)this.a).get(n2, -1);
        }
    }
}

