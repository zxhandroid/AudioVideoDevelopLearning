//
// Created by zxh on 2020/4/24.
//
#include "com_zxh_audiovideolearning_jnidemo_JniTestEncoder.h"

JNIEXPORT jstring JNICALL Java_com_zxh_audiovideolearning_jnidemo_JniTestEncoder_encode
  (JNIEnv *env, jobject ) {

return (env) -> NewStringUTF("I am JniTest from C");
}