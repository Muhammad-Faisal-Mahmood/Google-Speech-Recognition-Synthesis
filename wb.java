/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.Selection
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.inputmethod.InputConnection
 */
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.InputConnection;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class wb {
    public wb() {
    }

    public /* synthetic */ wb(byte[] byArray) {
    }

    public static xn a(View view) {
        Object object = view.getRootWindowInsets();
        if (object == null) {
            return null;
        }
        object = xn.m((WindowInsets)object);
        ((xn)object).q((xn)object);
        ((xn)object).o(view.getRootView());
        return object;
    }

    public static void b(View view, int n2, int n3) {
        view.setScrollIndicators(n2, 3);
    }

    public static void c(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            sk$$ExternalSyntheticApiModelOutline1.m(window, false);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            View view = window.getDecorView();
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 0x100);
            sk$$ExternalSyntheticApiModelOutline1.m(window, false);
            return;
        }
        window = window.getDecorView();
        window.setSystemUiVisibility(window.getSystemUiVisibility() | 0x700);
    }

    public static boolean d(Editable editable, KeyEvent zmArray, boolean bl2) {
        int n2;
        int n3;
        int n4;
        if (KeyEvent.metaStateHasNoModifiers((int)zmArray.getMetaState()) && !wb.g(n4 = Selection.getSelectionStart((CharSequence)editable), n3 = Selection.getSelectionEnd((CharSequence)editable)) && (zmArray = (zm[])editable.getSpans(n4, n3, zm.class)) != null && (n2 = zmArray.length) > 0) {
            for (n3 = 0; n3 < n2; ++n3) {
                zm zm2 = zmArray[n3];
                int n5 = editable.getSpanStart((Object)zm2);
                int n6 = editable.getSpanEnd((Object)zm2);
                if ((bl2 ? n5 != n4 : n6 != n4) && (n4 <= n5 || n4 >= n6)) {
                    continue;
                }
                editable.delete(n5, n6);
                return true;
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static boolean e(InputConnection var0, Editable var1_1, int var2_2, int var3_3, boolean var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[UNCONDITIONALDOLOOP]], but top level block is 3[WHILELOOP]
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

    public static anp f(aef aef2, agq agq2, AmbientMode$AmbientController ambientMode$AmbientController, wb object) {
        abr.i(aef2.b);
        abr.i(aef2.b);
        object = aef2.b.c;
        return new anp(aef2, agq2, ambientMode$AmbientController, alg.a);
    }

    private static boolean g(int n2, int n3) {
        return n2 == -1 || n3 == -1 || n2 != n3;
        {
        }
    }
}

