/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.widget.TextView
 */
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;
import j$.util.Optional;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class bme
implements Consumer {
    public final Object a;
    private final int b;

    public /* synthetic */ bme(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void accept(Object object) {
        switch (this.b) {
            default: {
                ((bzo)object).O((String)this.a, 8);
                return;
            }
            case 19: {
                object = (bzo)object;
                Object object2 = this.a;
                object2 = dxv.aK.b("model_manager", (String)object2);
                ((bzo)object).a.a((dyk)object2);
                return;
            }
            case 18: {
                ((bzo)object).P(((fce)this.a).a, 4);
                return;
            }
            case 17: {
                ((bzo)object).O((String)this.a, 4);
                return;
            }
            case 16: {
                object = (bzo)object;
                Object object3 = this.a;
                object3 = dxv.aI.b("model_manager", (String)object3);
                ((bzo)object).a.a((dyk)object3);
                return;
            }
            case 15: {
                ((bzo)object).O((String)this.a, 7);
                return;
            }
            case 14: {
                ((fbz)object).a(((fby)this.a).h);
                return;
            }
            case 13: {
                object = (bzo)object;
                Object object4 = this.a;
                object4 = dxv.aM.b("model_manager", ((fby)object4).d);
                ((bzo)object).a.a((dyk)object4);
                return;
            }
            case 12: {
                object = (bzo)object;
                Object object5 = ((Optional)this.a).get();
                object5 = dxv.aF.b("model_manager", (String)object5);
                ((bzo)object).a.a((dyk)object5);
                return;
            }
            case 11: {
                object = (bzo)object;
                Object object6 = ((Optional)this.a).get();
                object6 = dxv.aD.b("model_manager", (String)object6);
                ((bzo)object).a.a((dyk)object6);
                return;
            }
            case 10: {
                object = (bzo)object;
                Object object7 = ((Optional)this.a).get();
                object7 = dxv.aC.b("model_manager", (String)object7);
                ((bzo)object).a.a((dyk)object7);
                return;
            }
            case 9: {
                hfn hfn2 = ezs.a;
                this.a.a(object);
                return;
            }
            case 8: {
                Object object8 = cao.a((Integer)object, ikq.f);
                object = ((cao)object8).b;
                if (object != ikq.f && object != ikq.g) {
                    String string = object.toString();
                    object = String.valueOf(ikq.f);
                    object8 = String.valueOf(ikq.g);
                    StringBuilder stringBuilder = new StringBuilder("The given event-level ProductIdOrigin value ");
                    stringBuilder.append(string);
                    stringBuilder.append(" is not one of the values expected for a value set at the event-level: ");
                    stringBuilder.append((String)object);
                    stringBuilder.append(" or ");
                    stringBuilder.append((String)object8);
                    Log.e((String)"AbstractLogEventBuilder", (String)stringBuilder.toString());
                    return;
                }
                ((cag)this.a).l = object8;
                return;
            }
            case 7: {
                object = (giu)object;
                ((cnb)this.a).b((giu)object);
                return;
            }
            case 6: {
                ((bzo)object).P((String)this.a, 2);
                return;
            }
            case 5: {
                ((bzo)object).O((String)this.a, 2);
                return;
            }
            case 4: {
                ((bzo)object).O((String)this.a, 6);
                return;
            }
            case 3: {
                object = (bso)object;
                this.a.add(object);
                return;
            }
            case 2: {
                object = (TextView)object;
                ((bne)this.a).d((TextView)object);
                return;
            }
            case 1: {
                object = (CharSequence)object;
                if (object != null) {
                    object.toString();
                }
                this.a.run();
                return;
            }
            case 0: 
        }
        object = (Drawable)object;
        this.a.run();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            default: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 19: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 18: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 17: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 16: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 15: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 14: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 11: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 0: 
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

