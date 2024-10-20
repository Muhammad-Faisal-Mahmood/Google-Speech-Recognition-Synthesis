/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.apps.speech.tts.googletts.local.greco3.AndroidComposer;
import com.google.android.libraries.assistant.soda.Soda;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

public final class bto
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final int e;

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2) {
        this.e = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, byte[] byArray) {
        this.e = n2;
        this.d = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.a = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, char[] cArray) {
        this.e = n2;
        this.d = jnu2;
        this.c = jnu3;
        this.b = jnu4;
        this.a = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, float[] fArray) {
        this.e = n2;
        this.a = jnu2;
        this.d = jnu3;
        this.c = jnu4;
        this.b = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, int[] nArray) {
        this.e = n2;
        this.c = jnu2;
        this.a = jnu3;
        this.b = jnu4;
        this.d = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, short[] sArray) {
        this.e = n2;
        this.c = jnu2;
        this.b = jnu3;
        this.d = jnu4;
        this.a = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, boolean[] blArray) {
        this.e = n2;
        this.c = jnu2;
        this.d = jnu3;
        this.b = jnu4;
        this.a = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, byte[][] byArray) {
        this.e = n2;
        this.c = jnu2;
        this.d = jnu3;
        this.a = jnu4;
        this.b = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, char[][] cArray) {
        this.e = n2;
        this.b = jnu2;
        this.c = jnu3;
        this.a = jnu4;
        this.d = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, float[][] fArray) {
        this.e = n2;
        this.d = jnu2;
        this.b = jnu3;
        this.a = jnu4;
        this.c = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, short[][] sArray) {
        this.e = n2;
        this.c = jnu2;
        this.a = jnu3;
        this.d = jnu4;
        this.b = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, byte[][][] byArray) {
        this.e = n2;
        this.b = jnu2;
        this.a = jnu3;
        this.d = jnu4;
        this.c = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, char[][][] cArray) {
        this.e = n2;
        this.b = jnu2;
        this.a = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, int[][][] nArray) {
        this.e = n2;
        this.b = jnu2;
        this.d = jnu3;
        this.c = jnu4;
        this.a = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, short[][][] sArray) {
        this.e = n2;
        this.b = jnu2;
        this.d = jnu3;
        this.a = jnu4;
        this.c = jnu5;
    }

    public bto(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, boolean[][][] blArray) {
        this.e = n2;
        this.a = jnu2;
        this.c = jnu3;
        this.d = jnu4;
        this.b = jnu5;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.e) {
            default: {
                hpq hpq2 = (hpq)this.d.b();
                cya cya2 = (cya)this.b.b();
                jnu jnu2 = this.c;
                return new cya(this.a, jnu2, hpq2, cya2);
            }
            case 16: {
                Object object = (Map)((imc)this.b).a;
                Object object2 = ((ime)this.d).a();
                ArrayList arrayList = (Map)this.c.b();
                Object object3 = (Map)this.a.b();
                jse.e(object, "providedParams");
                jse.e(object2, "baseToSubpackage");
                jse.e(arrayList, "allPackages");
                jse.e(object3, "legacyProperties");
                Iterator iterator = new gzy();
                for (Map.Entry entry : object.entrySet()) {
                    object = (gfz)entry.getKey();
                    jnu jnu2 = (jnu)entry.getValue();
                    ((gzy)((Object)iterator)).d(fvc.y((Map)object2, (gfz)object), jnu2.b());
                }
                object2 = ((gzy)((Object)iterator)).b();
                if (arrayList.keySet().containsAll(((hac)object2).l())) {
                    iterator = ((hac)object2).l();
                    arrayList = new ArrayList();
                    iterator = iterator.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        object = (String)t2;
                        if (!object3.keySet().contains(object)) continue;
                        arrayList.add(t2);
                    }
                    if (arrayList.isEmpty()) {
                        return object2;
                    }
                    ((Object)arrayList).toString();
                    throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(((Object)arrayList).toString()));
                }
                object3 = arrayList.keySet();
                arrayList = ((hac)object2).l();
                object2 = new StringBuilder("Parameters provided for mendel package not in use. Known packages: ");
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(", params provided: ");
                ((StringBuilder)object2).append(arrayList);
                throw new IllegalStateException(((StringBuilder)object2).toString());
            }
            case 15: {
                Object object = (Map)((imc)this.b).a;
                Object object5 = (Map)((imc)this.d).a;
                Object object6 = ((ime)this.a).a();
                Object object7 = (Map)this.c.b();
                jse.e(object, "providedParams");
                jse.e(object5, "asyncProvidedParams");
                jse.e(object6, "baseToSubpackage");
                jse.e(object7, "allPackages");
                Object object8 = new gzy();
                for (Map.Entry entry : object.entrySet()) {
                    object = (gfy)entry.getKey();
                    jnu jnu3 = (jnu)entry.getValue();
                    ((gzy)object8).d(fvc.x((Map)object6, (gfy)object), new frn(jnu3, 8));
                }
                for (Map.Entry entry : object5.entrySet()) {
                    object5 = (gfy)entry.getKey();
                    jnu jnu4 = (jnu)entry.getValue();
                    ((gzy)object8).d(fvc.x((Map)object6, (gfy)object5), new frn(jnu4, 9));
                }
                object8 = ((gzy)object8).b();
                if (object7.keySet().containsAll(((hac)object8).l())) {
                    return object8;
                }
                object7 = object7.keySet();
                object6 = ((hac)object8).l();
                object8 = new StringBuilder("Parameters provided for mendel package not in use. Known packages: ");
                ((StringBuilder)object8).append(object7);
                ((StringBuilder)object8).append(", params provided: ");
                ((StringBuilder)object8).append(object6);
                throw new IllegalStateException(((StringBuilder)object8).toString());
            }
            case 14: {
                gto gto2 = (gto)((imc)this.b).a;
                AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = (AmbientModeSupport$AmbientController)this.a.b();
                Map map = (Map)this.d.b();
                return new gpm(gto2, ambientModeSupport$AmbientController, this.c, map);
            }
            case 13: {
                gpm gpm2 = (gpm)this.a.b();
                gto gto3 = (gto)((imc)this.d).a;
                gto gto4 = (gto)((imc)this.c).a;
                return new gcw(((ily)this.b).a, gpm2, gto3, gto4);
            }
            case 12: {
                bmu bmu2 = (bmu)this.b.b();
                hpq hpq3 = (hpq)this.a.b();
                hpq hpq4 = (hpq)this.c.b();
                return new fbe(this.d, bmu2, hpq3, hpq4);
            }
            case 11: {
                jnu jnu3 = this.b;
                return new ezk(((ilt)this.d).a(), (frr)jnu3.b(), (dxi)this.c.b(), (hpq)this.a.b());
            }
            case 10: {
                return new ezy((ezl)this.a.b(), (ezk)this.d.b(), (dxi)this.c.b(), (hpq)this.b.b());
            }
            case 9: {
                jnu jnu4 = this.a;
                iku iku2 = ima.c(this.c);
                Executor executor = (Executor)jnu4.b();
                jnu4 = this.b;
                return new enc(iku2, executor, ((ilt)this.d).a(), ((esa)jnu4).a());
            }
            case 8: {
                jnu jnu5 = this.a;
                jnu jnu6 = this.c;
                return new eij(((ilt)this.b).a(), ((gdb)jnu6).a(), (eie)jnu5.b(), ((ehg)this.d).a());
            }
            case 7: {
                Object object = this.d;
                Object object11 = ((ilt)this.c).a();
                iku iku3 = ima.c((jnu)object);
                object = new fpn();
                ((fpn)object).d = object11;
                Objects.requireNonNull(iku3);
                ((fpn)object).a = new dty(iku3, 4);
                object11 = this.a;
                Objects.requireNonNull(object11);
                ((fpn)object).e = new drq(object, new dty(object11, 5), 2, null);
                object11 = this.b;
                Objects.requireNonNull(object11);
                ((fpn)object).c = new dty(object11, 5);
                return ((fpn)object).a();
            }
            case 6: {
                gto gto5 = (gto)((imc)this.a).a;
                Random random = (Random)this.d.b();
                dsg dsg2 = (dsg)this.c.b();
                dox dox2 = (dox)this.b.b();
                return new dss((Random)gto5.e(random), dsg2, dox2);
            }
            case 5: {
                jnu jnu7 = this.b;
                jnu jnu8 = this.d;
                return new fzp(((ilt)this.c).a(), ((dse)jnu8).a(), (String)jnu7.b(), this.a);
            }
            case 4: {
                dkd dkd2 = (dkd)this.b.b();
                Object object = (gto)((imc)this.d).a;
                object = dkd2.d && !((gto)object).g() ? (Executor)this.c.b() : (Executor)this.a.b();
                idi.m(object);
                return object;
            }
            case 3: {
                Object object = this.b;
                Context context = ((ilt)this.c).a();
                object = (bzo)object.b();
                Object object12 = (cqq)this.d.b();
                object12 = (gto)((imc)this.a).a;
                return new cyu(context, (bzo)object, new bzo(gtx.a), (gto)object12);
            }
            case 2: {
                jnu jnu9 = this.c;
                return new Soda(((ilt)this.d).a(), (hpq)jnu9.b(), (hpr)this.b.b(), (gto)((imc)this.a).a);
            }
            case 1: {
                Context context = (Context)this.d.b();
                Object object = this.a;
                Object object13 = this.c;
                bst bst2 = ((bsu)this.b).a();
                object13 = ((bsv)object13).a();
                object = (bxt)object.b();
                return new bsr(context, bst2, (AndroidComposer)object13);
            }
            case 0: 
        }
        return new btn((btj)this.a.b(), (btp)this.b.b(), (bxt)this.c.b(), (bxf)this.d.b());
    }
}

