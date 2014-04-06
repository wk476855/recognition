package com.recognition.jni;

public class Recognition {

	public native int trainGMM(String path);
	public native int testScore(String path);
}
