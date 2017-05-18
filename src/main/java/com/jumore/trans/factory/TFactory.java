package com.jumore.trans.factory;

import com.jumore.trans.Translator;

public interface TFactory {
	Translator get(String id);
}
