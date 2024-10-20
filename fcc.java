/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.ModelDownloadListener
 */
import android.speech.ModelDownloadListener;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class fcc
implements Consumer {
    public final int a;
    private final int b;

    public /* synthetic */ fcc(int n2, int n3) {
        this.b = n3;
        this.a = n2;
    }

    public final void accept(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                ((fbz)object).d(this.a);
                return;
            }
            n2 = this.a;
            object = mk$$ExternalSyntheticApiModelOutline0.m(object);
            switch (n2 - 1) {
                default: {
                    n2 = 5;
                    break;
                }
                case 12: {
                    n2 = 12;
                    break;
                }
                case 11: {
                    n2 = 11;
                    break;
                }
                case 10: {
                    n2 = 10;
                    break;
                }
                case 9: {
                    n2 = 9;
                    break;
                }
                case 8: {
                    n2 = 8;
                    break;
                }
                case 7: {
                    n2 = 7;
                    break;
                }
                case 6: {
                    n2 = 6;
                    break;
                }
                case 4: {
                    n2 = 4;
                    break;
                }
                case 3: {
                    n2 = 3;
                    break;
                }
                case 2: {
                    n2 = 2;
                }
            }
            mk$$ExternalSyntheticApiModelOutline0.m((ModelDownloadListener)object, n2);
            return;
        }
        mk$$ExternalSyntheticApiModelOutline0.m$1(mk$$ExternalSyntheticApiModelOutline0.m(object), this.a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            return Consumer$_CC.$default$andThen(this, consumer);
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

