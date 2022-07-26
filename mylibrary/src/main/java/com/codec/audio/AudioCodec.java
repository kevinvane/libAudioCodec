package com.codec.audio;

public class AudioCodec {

    // Used to load the 'codec' library on application startup.
    static {
        System.loadLibrary("codec");
    }

    public static native String getVersion();

    /**
     * G711A解码为PCM
     * @param pcm_data output
     * @param g711a_data input
     * @param length pcm_data or g711a_data length , the same.
     */
    public static native void g711a_decode(short pcm_data[], byte[] g711a_data, int length);

    /**
     * G711A解码为PCM
     * @param pcm_data output
     * @param g711a_data input
     * @param pcm_data_length pcm_data_length == 2 * g711a_data_length
     * @param g711a_data_length input length
     */
    public static native void g711a_decode_v2(byte pcm_data[], byte[] g711a_data, int pcm_data_length, int g711a_data_length);

    /**
     *
     * @param g711a_data output
     * @param pcm_data input
     * @param length pcm_data or g711a_data length , the same.
     */
    public static native void g711a_encode(byte[] g711a_data, short pcm_data[], int length);


}