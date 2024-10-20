/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.libraries.speech.transcription.ui.DrawSoundLevelsView;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public final class gfl {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public gfl(View view) {
        this.a = (FrameLayout)view.findViewById(2131427970);
        this.b = (DrawSoundLevelsView)view.findViewById(2131427975);
        this.f = (ImageView)view.findViewById(2131427971);
        this.g = (ImageView)view.findViewById(2131427972);
        this.h = (ProgressBar)view.findViewById(2131427983);
        view = view.getContext();
        Drawable drawable = kh.g((Context)view, 2131231144);
        fxf.K(drawable);
        Drawable drawable2 = drawable.mutate();
        this.d = drawable2;
        int n2 = view.getColor(2131099794);
        drawable = drawable2;
        drawable2.setTint(n2);
        drawable = kh.g((Context)view, 2131231145);
        fxf.K(drawable);
        drawable = drawable.mutate();
        this.c = drawable;
        n2 = view.getColor(2131099788);
        drawable2 = drawable;
        drawable.setTint(n2);
        view = kh.g((Context)view, 2131231141);
        fxf.K(view);
        this.e = view.mutate();
    }

    public gfl(gto gto2, ScheduledExecutorService scheduledExecutorService, gpm gpm2, gpm gpm3, Map map, dus dus2, bzo bzo2, cya cya2) {
        jse.e(gto2, "reaper");
        jse.e(scheduledExecutorService, "executor");
        jse.e(gpm2, "uiDeviceState");
        jse.e(gpm3, "deviceState");
        jse.e(map, "packages");
        jse.e(cya2, "storageInfoProvider");
        this.a = gto2;
        this.b = scheduledExecutorService;
        this.c = gpm2;
        this.d = gpm3;
        this.e = map;
        this.f = dus2;
        this.g = bzo2;
        this.h = cya2;
    }

    public gfl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9) {
        this.d = jnu2;
        this.g = jnu3;
        this.a = jnu4;
        this.e = jnu5;
        this.f = jnu6;
        this.c = jnu7;
        this.h = jnu8;
        this.b = jnu9;
    }

    public gfl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, byte[] byArray) {
        jnu2.getClass();
        this.h = jnu2;
        jnu3.getClass();
        this.b = jnu3;
        jnu4.getClass();
        this.g = jnu4;
        jnu5.getClass();
        this.a = jnu5;
        jnu6.getClass();
        this.d = jnu6;
        jnu7.getClass();
        this.f = jnu7;
        jnu8.getClass();
        this.c = jnu8;
        jnu9.getClass();
        this.e = jnu9;
    }

    /*
     * Exception decompiling
     */
    public final hpn a(String var1_1, boolean var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    public final void b(View.OnClickListener onClickListener, String string) {
        ((FrameLayout)this.a).setOnClickListener(onClickListener);
        ((FrameLayout)this.a).setContentDescription((CharSequence)string);
        if (string == null) {
            ((FrameLayout)this.a).setFocusable(false);
            return;
        }
        ((FrameLayout)this.a).setFocusable(true);
    }

    public final void c(int n2) {
        ((heg)((heg)DrawSoundLevelsView.a.f()).j("com/google/android/libraries/speech/transcription/ui/DrawSoundLevelsView", "setSpeechLevel", 53, "DrawSoundLevelsView.java")).s("#setSpeechLevel %d", n2);
        DrawSoundLevelsView drawSoundLevelsView = (DrawSoundLevelsView)((Object)this.b);
        ((gze)drawSoundLevelsView.b).add((Object)n2);
        drawSoundLevelsView.invalidate();
    }

    public final void d() {
        ((ProgressBar)this.h).setVisibility(4);
        Drawable drawable = (Drawable)this.d;
        ((ImageView)this.f).setImageDrawable(drawable);
        ((ImageView)this.g).setBackgroundResource(2131231164);
        ((DrawSoundLevelsView)((Object)this.b)).setEnabled(false);
    }

    public final void e() {
        ((ProgressBar)this.h).setVisibility(4);
        Drawable drawable = (Drawable)this.d;
        ((ImageView)this.f).setImageDrawable(drawable);
        ((ImageView)this.g).setBackgroundResource(2131231162);
        ((DrawSoundLevelsView)((Object)this.b)).setEnabled(false);
    }

    public final void f() {
        ((ProgressBar)this.h).setVisibility(4);
        Drawable drawable = (Drawable)this.c;
        ((ImageView)this.f).setImageDrawable(drawable);
        ((ImageView)this.g).setBackgroundResource(2131231163);
        ((DrawSoundLevelsView)((Object)this.b)).setEnabled(true);
    }
}

