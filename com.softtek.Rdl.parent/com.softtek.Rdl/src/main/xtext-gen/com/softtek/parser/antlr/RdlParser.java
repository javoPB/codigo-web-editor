/*
 * generated by Xtext 2.16.0
 */
package com.softtek.parser.antlr;

import com.google.inject.Inject;
import com.softtek.parser.antlr.internal.InternalRdlParser;
import com.softtek.services.RdlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RdlParser extends AbstractAntlrParser {

	@Inject
	private RdlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRdlParser createParser(XtextTokenStream stream) {
		return new InternalRdlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public RdlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RdlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
