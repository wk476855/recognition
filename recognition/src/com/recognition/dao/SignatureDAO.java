package com.recognition.dao;

import com.recognition.entity.Signature;

public interface SignatureDAO {

	public int addSignature(Signature sign);
	public void addSignature(Signature sign, int uid);
	public void updateSignature(Signature sign);
}
