/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.SurfaceControlViewHost
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceControlViewHost;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.android.car.ui.recyclerview.CarUiRecyclerView;

public final class bne {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Context b;
    public final InputMethodManager c;
    public TextView d;
    public SurfaceControlViewHost e;
    public int f;
    public int g;
    public boolean h = false;
    public ViewGroup i;
    public ViewGroup.LayoutParams j;
    public bmu k = new bmt().a();

    public bne(Context context) {
        this.b = context;
        this.c = (InputMethodManager)context.getSystemService(InputMethodManager.class);
    }

    public final View a() {
        Object object = this.k.a;
        if (object instanceof CarUiRecyclerView) {
            return ((CarUiRecyclerView)object).getView();
        }
        return (View)object;
    }

    /*
     * Exception decompiling
     */
    public final bms b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [2 : 265->268)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public final void c(bmu bmu2) {
        bmu bmu3 = bmu2;
        if (bmu2 == null) {
            bmu3 = new bmt().a();
        }
        this.k = bmu3;
    }

    public final void d(TextView object) {
        if (this.d == null) {
            TextView textView;
            this.d = object;
            object = new bnc(this);
            if (Build.VERSION.SDK_INT >= 30 && (textView = this.d) != null) {
                if (textView.isAttachedToWindow()) {
                    this.d.getRootView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)object);
                    return;
                }
                this.d.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new bnd(this, (View.OnApplyWindowInsetsListener)object, 0));
            }
            return;
        }
        throw new IllegalStateException("TextView already set");
    }
}

