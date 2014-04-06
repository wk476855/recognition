package com.recognition.service;

import com.recognition.entity.Signature;

public interface SignatureService {

	public boolean sign(Signature sign, String path,  String phone);
	public boolean request(String phone);
}
