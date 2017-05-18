package com.jumore.trans.factory;

import com.jumore.trans.Translator;
import com.jumore.trans.exception.DupIdException;
import java.net.URISyntaxException;



final public class TranslatorFactory extends AbstractTranslatorFactory {

	public TranslatorFactory() throws ClassNotFoundException, InstantiationException, IllegalAccessException, DupIdException, URISyntaxException {
		super();
	}

	@Override
	public Translator get(String id) {
		return translatorMap.get(id);
	}

}
