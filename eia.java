/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.Callable;

public final class eia
extends jsc
implements jrk {
    private final int a;

    public eia(Object object, int n2) {
        this.a = n2;
        super(1, object, jsd.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public eia(Object object, int n2, byte[] byArray) {
        this.a = n2;
        super(1, object, aue.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V");
    }

    public eia(Object object, int n2, float[] fArray) {
        this.a = n2;
        super(1, object, gdj.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;");
    }

    public eia(Object object, int n2, short[] sArray) {
        this.a = n2;
        super(1, object, eqq.class, "handoverHotwordSource", "handoverHotwordSource$java_com_google_android_libraries_search_audio_microphone_source_registry_hotword_source_data_registry(I)V");
    }

    public eia(Object object, int n2, byte[][] byArray) {
        this.a = n2;
        super(1, object, gfi.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/DeviceConfigurationCommitter;");
    }

    public eia(Object object, int n2, char[][] cArray) {
        this.a = n2;
        super(1, object, gfv.class, "getFromFallbackCacheOrImmediate", "getFromFallbackCacheOrImmediate(Lcom/google/apps/tiktok/experiments/FlagSnapshot;)Lcom/google/common/util/concurrent/ListenableFuture;");
    }

    public eia(Object object, int n2, int[][] nArray) {
        this.a = n2;
        super(1, object, jwl.class, "invoke", "invoke(Ljava/lang/Throwable;)V");
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final /* synthetic */ Object a(Object var1_1) {
        switch (this.a) {
            default: {
                var1_1 = (Throwable)var1_1;
                ((jwl)this.c).a((Throwable)var1_1);
                return jon.a;
            }
            case 9: {
                var1_1 = (String)var1_1;
                jse.e(var1_1, "p0");
                return ((gfi)this.c).a((String)var1_1);
            }
            case 8: {
                var3_3 = (geq)var1_1;
                jse.e(var3_3, "p0");
                var1_1 = (gfv)this.c;
                if (jse.i(var3_3, fvc.O(geq.a.l()).v())) {
                    var1_1 = ((frr)var1_1.i.a()).a();
                    jse.b(var1_1);
                } else {
                    var1_1 = hhk.K(var3_3);
                }
                return var1_1;
            }
            case 7: {
                var1_1 = (String)var1_1;
                jse.e(var1_1, "p0");
                return ((gfi)this.c).a((String)var1_1);
            }
            case 6: {
                var1_1 = (Callable)var1_1;
                jse.e(var1_1, "p0");
                var3_4 = (gdj)this.c;
                var2_8 = gdj.b;
                return var3_4.a((Callable)var1_1);
            }
            case 5: {
                var3_5 = (Callable)var1_1;
                jse.e(var3_5, "p0");
                var1_1 = (gdj)this.c;
                var2_9 = gdj.b;
                return var1_1.a(var3_5);
            }
            case 4: {
                var1_1 = (Callable)var1_1;
                jse.e(var1_1, "p0");
                var3_6 = (gdj)this.c;
                var2_10 = gdj.b;
                return var3_6.a((Callable)var1_1);
            }
            case 3: {
                var2_11 = ((Number)var1_1).intValue();
                ((eqq)this.c).c(var2_11);
                return jon.a;
            }
            case 2: {
                var1_1 = (jqb)var1_1;
                ((jqz)this.c).a();
                return jon.a;
            }
            case 1: {
                var1_1 = (Set)var1_1;
                jse.e(var1_1, "p0");
                var4_12 = (aue)this.c;
                var3_7 = var4_12.e;
                var3_7.lock();
                var4_12 = jns.s(var4_12.d.values());
                var3_7 = var4_12.iterator();
                if (var3_7.hasNext()) ** GOTO lbl62
                return jon.a;
lbl62:
                // 1 sources

                var3_7 = (awg)var3_7.next();
                jse.e(var1_1, "invalidatedTablesIds");
                var1_1 = var3_7.b;
                throw null;
                finally {
                    var3_7.unlock();
                }
            }
            case 0: 
        }
        var1_1 = (jqb)var1_1;
        ((jqz)this.c).a();
        return jon.a;
    }
}

