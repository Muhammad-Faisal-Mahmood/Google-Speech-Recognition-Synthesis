/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.Spanned
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.View
 */
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public final class bol
extends bok {
    public List a = Collections.emptyList();
    public vl b;

    public bol(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public final void a(bjh bjh2) {
        this.a = Collections.singletonList(Objects.requireNonNull(bjh2));
        if (this.b == null) {
            this.b = vl.a((View)this, new bpv((Object)this, 1));
        }
        this.setText(bjh2.a());
    }

    public final CharSequence b(CharSequence charSequence) {
        float f2;
        int n2;
        int n3;
        int n4 = Objects.requireNonNull(this.getLayout()).getWidth();
        int n5 = charSequence.length();
        int n6 = 0;
        int n7 = n3 = (n2 = 0);
        while (true) {
            int n8 = n3;
            if (n2 != 0) break;
            f2 = n4;
            n6 = this.getPaint().breakText(charSequence, n8, n5, true, f2, null) + n8;
            int n9 = TextUtils.indexOf((CharSequence)charSequence, (CharSequence)"\n", (int)n8, (int)n6);
            n3 = n6;
            if (n9 != -1) {
                n3 = Math.min(n6, n9 + 1);
            }
            if ((n9 = n7 + 1) == Integer.MAX_VALUE || n3 > n5 - 1) {
                n2 = 1;
            }
            n7 = n3;
            if (n2 == 0) {
                n7 = n3;
                if (!Character.isWhitespace(charSequence.charAt(n3))) {
                    n7 = n3;
                    if (n3 > 0) {
                        block9: {
                            n7 = 0;
                            do {
                                n6 = n7;
                                if (Character.isWhitespace(charSequence.charAt(n3 - n7 - 1))) break block9;
                                n6 = n7 + 1;
                                if (n3 - n6 == n8) break;
                                n7 = n6;
                            } while (n6 < n3);
                            n6 = 0;
                        }
                        n7 = n3 - n6;
                    }
                }
            }
            n3 = n7;
            n6 = n8;
            n7 = n9;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence.subSequence(0, n6));
        Scanner scanner = new Scanner(charSequence.subSequence(n6, n5).toString());
        if (scanner.hasNextLine()) {
            f2 = n4;
            spannableStringBuilder.append(TextUtils.ellipsize((CharSequence)scanner.nextLine(), (TextPaint)this.getPaint(), (float)f2, (TextUtils.TruncateAt)TextUtils.TruncateAt.END));
            if (charSequence instanceof Spanned) {
                TextUtils.copySpansFrom((Spanned)((Spanned)charSequence), (int)0, (int)spannableStringBuilder.length(), Object.class, (Spannable)spannableStringBuilder, (int)0);
            }
        }
        return spannableStringBuilder;
    }
}

