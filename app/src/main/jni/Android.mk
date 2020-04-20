LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -llog
LOCAL_MODULE := libaudioencoder
LOCAL_SRC_FILES = ./Mp3Encoder.cpp
include $(BUILD_SHARED_LIBRARY)