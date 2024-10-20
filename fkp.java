/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Layout
 *  android.text.SpannableStringBuilder
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  android.text.style.ForegroundColorSpan
 */
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import java.text.BreakIterator;
import java.util.Locale;

final class fkp {
    public final SpannableStringBuilder a;
    public final BreakIterator b = BreakIterator.getWordInstance(Locale.getDefault());
    public final ForegroundColorSpan c;
    public int d;
    public int e;
    private final TextPaint f;

    public fkp(Context context, TextPaint textPaint) {
        this.c = new ForegroundColorSpan(context.getColor(2131101062));
        this.a = new SpannableStringBuilder();
        this.f = textPaint;
    }

    public final Layout a(String string) {
        return StaticLayout.Builder.obtain((CharSequence)string, (int)0, (int)string.length(), (TextPaint)this.f, (int)this.e).build();
    }
}

