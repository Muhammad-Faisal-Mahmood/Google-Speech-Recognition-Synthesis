/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 *  android.speech.tts.Voice
 *  android.text.TextUtils
 *  android.text.format.Formatter
 *  android.view.MenuItem
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.google.android.apps.speech.tts.googletts.local.voicepack.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.speech.tts.Voice;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class MultipleVoicesActivity
extends bvi
implements bju {
    public static final hei k = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity");
    public btn l;
    public izk m;
    private brx n;
    private bve o;
    private btj p;
    private final bti q = new buy(this, 0);
    private bxf r;
    private bxt s;

    public final void D(buc buc2) {
        bti bti2 = this.q;
        this.p.j(buc2, 4, "com.google.android.tts", bti2);
    }

    @Override
    public final void E() {
        this.G();
    }

    public final void F(String string) {
        Object object;
        block5: {
            String string2;
            bvd bvd2;
            block6: {
                block4: {
                    object = this.o;
                    bvd2 = (bvd)object;
                    if (!bvd2.e) break block5;
                    String string3 = String.valueOf(string);
                    Iterator iterator = bvd2.d.getVoices().iterator();
                    do {
                        string2 = string3.concat("-local");
                        if (!iterator.hasNext()) break block4;
                    } while (!(string = (Voice)iterator.next()).getName().equals(string2));
                    break block6;
                }
                string = null;
            }
            if (string == null) {
                ((heg)((heg)bvd.a.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/TextToSpeechSample", "setVoice", 75, "TextToSpeechSample.java")).u("Voice with the required voice name '%s' not found.", string2);
                ((bve)object).a();
            } else {
                bvd2.d.setVoice((Voice)string);
            }
            string = string2 = kh.t(bvd2.b.getResources(), bvd2.c.e());
            if (string2 == null) {
                string = kh.s(bvd2.b.getResources(), bvd2.c.e());
            }
            bvd2 = bvd2.d;
            string2 = new Bundle();
            int n2 = ((bve)object).f;
            ((bve)object).f = n2 + 1;
            object = new StringBuilder("utteranceSampleText_");
            ((StringBuilder)object).append(n2);
            bvd2.speak(string, 0, (Bundle)string2, ((StringBuilder)object).toString());
            return;
        }
        ((bve)object).a();
    }

    public final void G() {
        Object object = this.s.b(this.n);
        Object object2 = null;
        object = object == null ? null : blf.e((buc)object, this.n);
        Object object3 = this.r;
        btn btn2 = this.l;
        Object object4 = this.p;
        brx brx2 = this.n;
        object3 = bvm.a((bxf)object3, btn2, (btj)object4).iterator();
        do {
            object4 = object2;
            if (!object3.hasNext()) break;
            object4 = (izk)object3.next();
        } while (!((bsa)((izk)object4).d).equals(brx2));
        if (object != null && object4 != null) {
            this.m = object4;
            object4 = this.r.b(this.n.toString());
            int n2 = -1;
            for (int i2 = 0; i2 < object.size(); ++i2) {
                if (!((bvj)object.get((int)i2)).c.equals(object4)) continue;
                n2 = i2;
            }
            object4 = new but(this, n2);
            ((but)object4).a((List)object);
            object2 = this.findViewById(2131427721);
            object = new LinearLayoutManager();
            if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                object2 = (CarUiRecyclerView)object2;
                object2.setLayoutStyle(ble.d((ko)object));
                object2.setAdapter((kf)object4);
            } else {
                object2 = (RecyclerView)object2;
                ((RecyclerView)object2).ac((ko)object);
                ((RecyclerView)object2).ab((kf)object4);
            }
            boolean bl2 = ((but)object4).getItemCount() > 0;
            fxf.K(this.n);
            fxf.K(this.m);
            object = (TextView)this.findViewById(2131428020);
            ImageView imageView = (ImageView)this.findViewById(2131428019);
            ImageView imageView2 = (ImageView)this.findViewById(2131428018);
            ImageView imageView3 = (ImageView)this.findViewById(2131428015);
            btn2 = (ImageView)this.findViewById(2131428016);
            brx2 = this.findViewById(2131428017);
            object3 = this.findViewById(2131427721);
            object2 = (heg)((heg)k.c()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity", "updateHeaderSummary", 247, "MultipleVoicesActivity.java");
            object4 = this.m;
            StringBuilder stringBuilder = new StringBuilder(((buc)((izk)object4).c).c);
            stringBuilder.append(" isDownloading ");
            stringBuilder.append(((izk)object4).d());
            stringBuilder.append(" isCanceling ");
            stringBuilder.append(((izk)object4).c());
            stringBuilder.append(" isInstalled ");
            stringBuilder.append(((izk)object4).e());
            stringBuilder.append(" isUpdatable ");
            stringBuilder.append(((izk)object4).g());
            stringBuilder.append(" isRemovable ");
            stringBuilder.append(((izk)object4).f());
            object2.D("voicepack %s showVoicesList %b", stringBuilder.toString(), bl2);
            stringBuilder = this.findViewById(2131428021);
            if (this.m.e() && !this.m.f()) {
                object.setText((CharSequence)"");
                stringBuilder.setVisibility(8);
            } else {
                object2 = this.m;
                if (((izk)object2).c()) {
                    object2 = this.getString(2132017512);
                    object4 = object;
                    object = object2;
                } else if (((izk)object2).d()) {
                    object2 = this.getString(2132017514);
                    object4 = object;
                    object = object2;
                } else {
                    object4 = new ArrayList();
                    Object object5 = ((izk)object2).b;
                    if (object5 != null) {
                        object5 = this.getString(2132017515, new Object[]{Formatter.formatShortFileSize((Context)this, (long)((bsw)object5).b)});
                        ((ArrayList)object4).add(object5);
                    } else {
                        ((ArrayList)object4).add(this.getString(2132017513, new Object[]{Formatter.formatShortFileSize((Context)this, (long)((long)((buc)((izk)object2).c).f * 1024L))}));
                    }
                    if (((izk)object2).g()) {
                        ((ArrayList)object4).add(this.getString(2132017516));
                    }
                    object2 = TextUtils.join((CharSequence)" - ", (Iterable)object4);
                    object4 = object;
                    object = object2;
                }
                object4.setText((CharSequence)object);
                stringBuilder.setVisibility(0);
            }
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            imageView3.setVisibility(8);
            btn2.setVisibility(8);
            object3.setVisibility(8);
            if (this.m.e()) {
                if (bl2) {
                    object3.setVisibility(0);
                    object3.setEnabled(true);
                    if (this.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        object3.requestFocus();
                    }
                }
                if (this.m.g()) {
                    imageView.setVisibility(0);
                    imageView.setOnClickListener((View.OnClickListener)new gpg(this, (Context)this, this.m, 1));
                } else if (this.m.f()) {
                    btn2.setVisibility(0);
                    btn2.setOnClickListener(new bux(this, 1));
                }
            } else if (this.m.d()) {
                imageView3.setVisibility(0);
                imageView3.setOnClickListener((View.OnClickListener)new bux(this, 0));
            } else if (!this.m.c()) {
                imageView2.setVisibility(0);
                imageView2.setOnClickListener((View.OnClickListener)new bux(this, 2));
            }
            if (this.m.e() && !this.m.f() && !this.m.g()) {
                brx2.setVisibility(4);
                btn2.setVisibility(4);
                return;
            }
            brx2.setVisibility(0);
            return;
        }
        throw new IllegalStateException("No voicepacks (available or installed) found for locale: ".concat(String.valueOf(String.valueOf(this.n))));
    }

    /*
     * Exception decompiling
     */
    public final void H(izk var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 208->211)] java.lang.Throwable
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

    public final void I(Context context, izk izk2) {
        new AlertDialog.Builder(context).setMessage(2132017517).setPositiveButton(2132017519, (DialogInterface.OnClickListener)new buv(this, izk2)).setNegativeButton(2132017518, (DialogInterface.OnClickListener)new buw(0)).show();
    }

    @Override
    public final void a(Insets insets) {
        this.requireViewById(2131428022).setPadding(insets.getLeft(), insets.getTop(), insets.getRight(), insets.getBottom());
        this.requireViewById(2131427721).setPadding(0, 0, 0, insets.getBottom());
    }

    @Override
    protected final void onCreate(Bundle object) {
        if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            this.setTheme(2132083246);
        }
        super.onCreate((Bundle)object);
        if (this.getIntent() != null && this.getIntent().getExtras() != null) {
            object = this.getIntent().getExtras().getStringArray("locale");
            if (object == null) {
                ((heg)((heg)k.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity", "onCreate", 134, "MultipleVoicesActivity.java")).r("Missing intent extra \"locale\"");
                this.finish();
                return;
            }
            if (((String[])object).length != 2) {
                ((heg)((heg)k.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity", "onCreate", 139, "MultipleVoicesActivity.java")).r("Intent extra \"locale\" should be a string array with 2 items");
                this.finish();
                return;
            }
            this.n = object = new brx(object[0], object[1]);
            this.setTitle(this.getString(2132017429, new Object[]{((bsa)object).d()}));
            ((mr)this).setContentView(2131624129);
            object = this.n;
            bvd bvd2 = new bvd(this);
            bvd2.c = object;
            this.o = bvd2;
            object = this.getApplicationContext();
            this.p = ((bva)fvd.l((Context)object, bva.class)).j();
            this.l = ((bva)fvd.l((Context)object, bva.class)).k();
            this.s = ((bva)fvd.l((Context)object, bva.class)).P();
            this.r = ((bva)fvd.l((Context)object, bva.class)).A();
            this.G();
            if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                object = AmbientMode$AmbientCallback.g(this);
                object.setState(bnp.b);
                object.setTitle(this.getString(2132017429, new Object[]{this.n.d()}));
                return;
            }
            object = this.o();
            if (object != null) {
                ((de)object).d(true);
                ((de)object).h();
                ((de)object).f(this.getString(2132017429, new Object[]{this.n.d()}));
            }
            return;
        }
        ((heg)((heg)k.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity", "onCreate", 126, "MultipleVoicesActivity.java")).r("Missing intent extras");
        this.finish();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.o.d.shutdown();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.finish();
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.G();
    }
}

