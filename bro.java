/*
 * Decompiled with CFR 0.152.
 */
public final class bro
implements aeq {
    public final brq a;
    private final po b;

    public bro(brq brq2, po po2) {
        this.a = brq2;
        this.b = po2;
    }

    @Override
    public final void a(int n2) {
        if (n2 == 1) {
            ((heg)((heg)brq.a.c()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder$PlayerListener", "onPlaybackStateChanged", 397, "ExoPlayerDecoder.java")).r("ExoPlayer state changed to IDLE");
            this.b.c(null);
            brq brq2 = this.a;
            bpv bpv2 = new bpv(this, 7);
            brq2.d.post(bpv2);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void b(aen var1_1) {
        var4_2 = (heg)((heg)((heg)brq.a.h()).i((Throwable)var1_1)).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder$PlayerListener", "onPlayerError", 407, "ExoPlayerDecoder.java");
        var2_3 = var1_1.a;
        block0 : switch (var2_3) {
            default: {
                switch (var2_3) {
                    default: {
                        switch (var2_3) {
                            default: {
                                switch (var2_3) {
                                    default: {
                                        switch (var2_3) {
                                            default: {
                                                switch (var2_3) {
                                                    default: {
                                                        var3_4 = "invalid error code";
                                                        break block0;
                                                    }
                                                    case 6006: {
                                                        var3_4 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break block0;
                                                    }
                                                    case 6005: {
                                                        var3_4 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break block0;
                                                    }
                                                    case 6004: {
                                                        var3_4 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break block0;
                                                    }
                                                    case 6003: {
                                                        var3_4 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break block0;
                                                    }
                                                    case 6002: {
                                                        var3_4 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break block0;
                                                    }
                                                    case 6001: {
                                                        var3_4 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break block0;
                                                    }
                                                    case 6000: 
                                                }
                                                var3_4 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                break block0;
                                            }
                                            case 5004: {
                                                var3_4 = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                break block0;
                                            }
                                            case 5003: {
                                                var3_4 = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                break block0;
                                            }
                                            case 5002: {
                                                var3_4 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                break block0;
                                            }
                                            case 5001: 
                                        }
                                        var3_4 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                        break block0;
                                    }
                                    case 4006: {
                                        var3_4 = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                        break block0;
                                    }
                                    case 4005: {
                                        var3_4 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                        break block0;
                                    }
                                    case 4004: {
                                        var3_4 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                        break block0;
                                    }
                                    case 4003: {
                                        var3_4 = "ERROR_CODE_DECODING_FAILED";
                                        break block0;
                                    }
                                    case 4002: {
                                        var3_4 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                        break block0;
                                    }
                                    case 4001: 
                                }
                                var3_4 = "ERROR_CODE_DECODER_INIT_FAILED";
                                break block0;
                            }
                            case 3004: {
                                var3_4 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                break block0;
                            }
                            case 3003: {
                                var3_4 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                break block0;
                            }
                            case 3002: {
                                var3_4 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                break block0;
                            }
                            case 3001: 
                        }
                        var3_4 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                        break block0;
                    }
                    case 2008: {
                        var3_4 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                        break block0;
                    }
                    case 2007: {
                        var3_4 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                        break block0;
                    }
                    case 2006: {
                        var3_4 = "ERROR_CODE_IO_NO_PERMISSION";
                        break block0;
                    }
                    case 2005: {
                        var3_4 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                        break block0;
                    }
                    case 2004: {
                        var3_4 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                        break block0;
                    }
                    case 2003: {
                        var3_4 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                        break block0;
                    }
                    case 2002: {
                        var3_4 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                        break block0;
                    }
                    case 2001: {
                        var3_4 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                        break block0;
                    }
                    case 2000: 
                }
                var3_4 = "ERROR_CODE_IO_UNSPECIFIED";
                break;
            }
            case 1004: {
                var3_4 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                break;
            }
            case 1003: {
                var3_4 = "ERROR_CODE_TIMEOUT";
                break;
            }
            case 1002: {
                var3_4 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                break;
            }
            case 1001: {
                var3_4 = "ERROR_CODE_REMOTE_ERROR";
                break;
            }
            case 1000: {
                var3_4 = "ERROR_CODE_UNSPECIFIED";
            }
        }
        var4_2.u("ExoPlayer encountered error: %s", var3_4);
        var3_4 = this.a;
        var2_3 = var1_1.a;
        if (var2_3 == 1001) ** GOTO lbl-1000
        if (var2_3 == 3003) ** GOTO lbl-1000
        switch (var2_3) {
            default: {
                var1_1 = iim.b;
                break;
            }
            case 2003: 
            case 2005: 
            case 2006: 
            case 2007: lbl-1000:
            // 2 sources

            {
                var1_1 = iim.e;
                break;
            }
            case 2001: 
            case 2002: 
            case 2004: lbl-1000:
            // 2 sources

            {
                var1_1 = iim.f;
            }
        }
        var3_4.b((iim)var1_1, "player_error");
    }

    @Override
    public final /* synthetic */ void c(aen aen2) {
    }

    @Override
    public final /* synthetic */ void d() {
    }

    @Override
    public final /* synthetic */ void e() {
    }

    @Override
    public final /* synthetic */ void f() {
    }

    @Override
    public final /* synthetic */ void g() {
    }

    @Override
    public final /* synthetic */ void h() {
    }

    @Override
    public final /* synthetic */ void i() {
    }

    @Override
    public final /* synthetic */ void j() {
    }

    @Override
    public final /* synthetic */ void k() {
    }

    @Override
    public final /* synthetic */ void l() {
    }

    @Override
    public final /* synthetic */ void m(int n2) {
    }

    @Override
    public final /* synthetic */ void n() {
    }

    @Override
    public final /* synthetic */ void o() {
    }

    @Override
    public final /* synthetic */ void p() {
    }
}

