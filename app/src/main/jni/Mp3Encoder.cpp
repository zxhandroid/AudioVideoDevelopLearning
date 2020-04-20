//
// Created by zxh on 2020/4/20.

#include "com_zxh_audiovideolearning_jnidemo_Mp3Encoder.h"

JNIEXPORT jstring JNICALL Java_com_zxh_audiovideolearning_jnidemo_Mp3Encoder_encode
  (JNIEnv *env, jobject instance){

  return (env) -> NewStringUTF("I am encoder from C");

}