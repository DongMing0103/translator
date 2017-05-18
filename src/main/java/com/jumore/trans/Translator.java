package com.jumore.trans;

import com.jumore.trans.LANG;

public interface Translator {
	public String trans(LANG from, LANG targ, String query) throws Exception;
}
