#include <jni.h>
#include <stdio.h>

JNIEXPORT void JNICALL
Java_HelloWorld_print(JNIEnv *env, jobject obj)
{
    printf("Hello from JNI\n");
    return;
}

JNIEXPORT jint JNICALL
Java_HelloWorld_isItFive(JNIEnv *env, jobject obj)
{
   return 5;
}