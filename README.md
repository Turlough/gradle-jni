# gradle-jni
Hello world jni example for intellij. Use as stub for JNI projects using gradle build system.

## Introduction

[Jetbrains' instructions](https://www.jetbrains.com/help/idea/setting-up-jni-development-in-gradle-project.html) on this were suspiciously simple, and of course did not work out of the box.

I have created this sample with instructions and comments so I do not forget when I ever have to do this again.

## Instructions and comments

I have updated *model.components* in *build.gradle*. From terminal, you can now call `./gradlew helloSharedLibrary` without errors. Object and Shared Object files will be created in the *build* directory as follows:
* build/objs/hello/shared/helloC/46gd7i53yh3z9kv2bj1ure0t2/hello.o
* build/libs/hello/shared/libhello.so

(This may differ slightly on Windows)

Attempt to run *HelloWorld.java* (I have included a 'main' method, so you can run the class file directly by right-clicking on it and selecting *run*). This will fail at first with an UnsatisfiedLinkError, but it does generate a stub of a build configuration, 'HelloWorld'.

From the Build Configurations dropdown, select edit and add the the following VM option to the new 'HelloWorld' configuration: `-Djava.library.path="build/libs/hello/shared"`.

Apply the changes and dismiss the dialog. You can now run the example. You will see 'Hello from JNI' in the output. Success!

Note that if you edit the C code, you will have to invoke `./gradlew helloSharedLibrary` again in order to recompile the shared object. You don't want to rebuild your native libraries automatically every time you edit your java/kotlin code.

I have added a stub test class. Right click to run tests. It will fail at first too.
You will need to edit its build configuration likewise: `-Djava.library.path="build/libs/hello/shared"`

