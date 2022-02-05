# Mytoastlibrary 
[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17)

###### This is a library for create simple toasts!

Toast library  (learn to create android library)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.Murodhonov:Mytoastlibrary:0.2.0'
}
```

## Usage

It's simple to use for example

``` kotlin
MyToaster.toastShort(context,"This is a short time toast")
```

``` kotlin
MyToaster.toastLong(context,"This is a long time toast")
```
