package com.softtek.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.softtek.services.RdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATETIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'.'", "'enum'", "':'", "'entity'", "'def'", "'return'", "'constraints'", "'('", "','", "')'", "'field'", "'Text'", "'LongText'", "'Date'", "'default'", "'reference'", "'['", "'..'", "']'", "'opposite-of'", "'*'", "'Image'", "'File'", "'Email'", "'Decimal'", "'Integer'", "'Currency'", "'required'", "'true'", "'false'", "'unique'", "'max_length'", "'min_length'", "'glossary'", "'name'", "'description'", "'label'", "'help'", "'exposed_filter'", "'type'", "'Option'", "'Check'", "'Autocomplete'", "'SelectList'", "'sort_by'", "'start_year_from_now'", "'-'", "'+'", "'end_year_from_now'", "'widget'", "'size'", "'XS'", "'SM'", "'MD'", "'LG'", "'XL'", "'display_result'", "'Now'", "'search'", "'Simple'", "'Complex'", "'None'", "'add'", "'edit'", "'delete'", "'scaffold'", "'db_map'", "'table'", "'identity'", "'auto_id'", "'pk'", "'data'", "'domain'", "'business_rule'", "'code'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_DATETIME=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalRdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRdlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRdl.g"; }



     	private RdlGrammarAccess grammarAccess;

        public InternalRdlParser(TokenStream input, RdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRdl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRdl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRdl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRdl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_module_0_0= ruleModule ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:77:2: ( ( (lv_module_0_0= ruleModule ) ) )
            // InternalRdl.g:78:2: ( (lv_module_0_0= ruleModule ) )
            {
            // InternalRdl.g:78:2: ( (lv_module_0_0= ruleModule ) )
            // InternalRdl.g:79:3: (lv_module_0_0= ruleModule )
            {
            // InternalRdl.g:79:3: (lv_module_0_0= ruleModule )
            // InternalRdl.g:80:4: lv_module_0_0= ruleModule
            {

            				newCompositeNode(grammarAccess.getModelAccess().getModuleModuleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_module_0_0=ruleModule();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"module",
            					lv_module_0_0,
            					"com.softtek.Rdl.Module");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModule"
    // InternalRdl.g:100:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalRdl.g:100:47: (iv_ruleModule= ruleModule EOF )
            // InternalRdl.g:101:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalRdl.g:107:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:113:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalRdl.g:114:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalRdl.g:114:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalRdl.g:115:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalRdl.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalRdl.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalRdl.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalRdl.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdl.g:142:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRdl.g:143:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalRdl.g:143:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalRdl.g:144:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.softtek.Rdl.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRdl.g:169:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRdl.g:169:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRdl.g:170:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRdl.g:176:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRdl.g:182:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRdl.g:183:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRdl.g:183:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRdl.g:184:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRdl.g:191:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRdl.g:192:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalRdl.g:209:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalRdl.g:209:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalRdl.g:210:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalRdl.g:216:1: ruleAbstractElement returns [EObject current=null] : (this_Enum_0= ruleEnum | this_Entity_1= ruleEntity ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalRdl.g:222:2: ( (this_Enum_0= ruleEnum | this_Entity_1= ruleEntity ) )
            // InternalRdl.g:223:2: (this_Enum_0= ruleEnum | this_Entity_1= ruleEntity )
            {
            // InternalRdl.g:223:2: (this_Enum_0= ruleEnum | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRdl.g:224:3: this_Enum_0= ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getEnumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enum_0=ruleEnum();

                    state._fsp--;


                    			current = this_Enum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:233:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleEnum"
    // InternalRdl.g:245:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalRdl.g:245:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalRdl.g:246:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalRdl.g:252:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enum_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enum_literals_3_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:258:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enum_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' ) )
            // InternalRdl.g:259:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enum_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' )
            {
            // InternalRdl.g:259:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enum_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' )
            // InternalRdl.g:260:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enum_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalRdl.g:264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:265:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:266:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdl.g:286:3: ( (lv_enum_literals_3_0= ruleEnumLiteral ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRdl.g:287:4: (lv_enum_literals_3_0= ruleEnumLiteral )
            	    {
            	    // InternalRdl.g:287:4: (lv_enum_literals_3_0= ruleEnumLiteral )
            	    // InternalRdl.g:288:5: lv_enum_literals_3_0= ruleEnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getEnum_literalsEnumLiteralParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_enum_literals_3_0=ruleEnumLiteral();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumRule());
            	    					}
            	    					add(
            	    						current,
            	    						"enum_literals",
            	    						lv_enum_literals_3_0,
            	    						"com.softtek.Rdl.EnumLiteral");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalRdl.g:313:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalRdl.g:313:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalRdl.g:314:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalRdl.g:320:1: ruleEnumLiteral returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:326:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalRdl.g:327:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalRdl.g:327:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalRdl.g:328:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalRdl.g:328:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalRdl.g:329:4: (lv_key_0_0= RULE_ID )
            {
            // InternalRdl.g:329:4: (lv_key_0_0= RULE_ID )
            // InternalRdl.g:330:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEnumLiteralAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getColonKeyword_1());
            		
            // InternalRdl.g:350:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalRdl.g:351:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalRdl.g:351:4: (lv_value_2_0= RULE_STRING )
            // InternalRdl.g:352:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getEnumLiteralAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleEntity"
    // InternalRdl.g:372:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRdl.g:372:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRdl.g:373:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRdl.g:379:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleActions ) )? ( (lv_glossary_4_0= ruleGlossary ) )? ( (lv_db_map_5_0= ruleDBMapEntity ) )? ( (lv_entity_fields_6_0= ruleEntityField ) )+ ( (lv_entity_methods_7_0= ruleMethodDeclaration ) )* otherlv_8= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_actions_3_0 = null;

        EObject lv_glossary_4_0 = null;

        EObject lv_db_map_5_0 = null;

        EObject lv_entity_fields_6_0 = null;

        EObject lv_entity_methods_7_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:385:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleActions ) )? ( (lv_glossary_4_0= ruleGlossary ) )? ( (lv_db_map_5_0= ruleDBMapEntity ) )? ( (lv_entity_fields_6_0= ruleEntityField ) )+ ( (lv_entity_methods_7_0= ruleMethodDeclaration ) )* otherlv_8= '}' ) )
            // InternalRdl.g:386:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleActions ) )? ( (lv_glossary_4_0= ruleGlossary ) )? ( (lv_db_map_5_0= ruleDBMapEntity ) )? ( (lv_entity_fields_6_0= ruleEntityField ) )+ ( (lv_entity_methods_7_0= ruleMethodDeclaration ) )* otherlv_8= '}' )
            {
            // InternalRdl.g:386:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleActions ) )? ( (lv_glossary_4_0= ruleGlossary ) )? ( (lv_db_map_5_0= ruleDBMapEntity ) )? ( (lv_entity_fields_6_0= ruleEntityField ) )+ ( (lv_entity_methods_7_0= ruleMethodDeclaration ) )* otherlv_8= '}' )
            // InternalRdl.g:387:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleActions ) )? ( (lv_glossary_4_0= ruleGlossary ) )? ( (lv_db_map_5_0= ruleDBMapEntity ) )? ( (lv_entity_fields_6_0= ruleEntityField ) )+ ( (lv_entity_methods_7_0= ruleMethodDeclaration ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRdl.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:393:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdl.g:413:3: ( (lv_actions_3_0= ruleActions ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==80) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRdl.g:414:4: (lv_actions_3_0= ruleActions )
                    {
                    // InternalRdl.g:414:4: (lv_actions_3_0= ruleActions )
                    // InternalRdl.g:415:5: lv_actions_3_0= ruleActions
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getActionsActionsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_actions_3_0=ruleActions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"actions",
                    						lv_actions_3_0,
                    						"com.softtek.Rdl.Actions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRdl.g:432:3: ( (lv_glossary_4_0= ruleGlossary ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdl.g:433:4: (lv_glossary_4_0= ruleGlossary )
                    {
                    // InternalRdl.g:433:4: (lv_glossary_4_0= ruleGlossary )
                    // InternalRdl.g:434:5: lv_glossary_4_0= ruleGlossary
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getGlossaryGlossaryParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_glossary_4_0=ruleGlossary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"glossary",
                    						lv_glossary_4_0,
                    						"com.softtek.Rdl.Glossary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRdl.g:451:3: ( (lv_db_map_5_0= ruleDBMapEntity ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==81) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdl.g:452:4: (lv_db_map_5_0= ruleDBMapEntity )
                    {
                    // InternalRdl.g:452:4: (lv_db_map_5_0= ruleDBMapEntity )
                    // InternalRdl.g:453:5: lv_db_map_5_0= ruleDBMapEntity
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getDb_mapDBMapEntityParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_db_map_5_0=ruleDBMapEntity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"db_map",
                    						lv_db_map_5_0,
                    						"com.softtek.Rdl.DBMapEntity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRdl.g:470:3: ( (lv_entity_fields_6_0= ruleEntityField ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRdl.g:471:4: (lv_entity_fields_6_0= ruleEntityField )
            	    {
            	    // InternalRdl.g:471:4: (lv_entity_fields_6_0= ruleEntityField )
            	    // InternalRdl.g:472:5: lv_entity_fields_6_0= ruleEntityField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEntity_fieldsEntityFieldParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_entity_fields_6_0=ruleEntityField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity_fields",
            	    						lv_entity_fields_6_0,
            	    						"com.softtek.Rdl.EntityField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalRdl.g:489:3: ( (lv_entity_methods_7_0= ruleMethodDeclaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRdl.g:490:4: (lv_entity_methods_7_0= ruleMethodDeclaration )
            	    {
            	    // InternalRdl.g:490:4: (lv_entity_methods_7_0= ruleMethodDeclaration )
            	    // InternalRdl.g:491:5: lv_entity_methods_7_0= ruleMethodDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEntity_methodsMethodDeclarationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_entity_methods_7_0=ruleMethodDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity_methods",
            	    						lv_entity_methods_7_0,
            	    						"com.softtek.Rdl.MethodDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalRdl.g:516:1: entryRuleMethodDeclaration returns [EObject current=null] : iv_ruleMethodDeclaration= ruleMethodDeclaration EOF ;
    public final EObject entryRuleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDeclaration = null;


        try {
            // InternalRdl.g:516:58: (iv_ruleMethodDeclaration= ruleMethodDeclaration EOF )
            // InternalRdl.g:517:2: iv_ruleMethodDeclaration= ruleMethodDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDeclaration=ruleMethodDeclaration();

            state._fsp--;

             current =iv_ruleMethodDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalRdl.g:523:1: ruleMethodDeclaration returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_def_statements_3_0= ruleStatement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_def_statements_3_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:529:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_def_statements_3_0= ruleStatement ) )+ otherlv_4= '}' ) )
            // InternalRdl.g:530:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_def_statements_3_0= ruleStatement ) )+ otherlv_4= '}' )
            {
            // InternalRdl.g:530:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_def_statements_3_0= ruleStatement ) )+ otherlv_4= '}' )
            // InternalRdl.g:531:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_def_statements_3_0= ruleStatement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodDeclarationAccess().getDefKeyword_0());
            		
            // InternalRdl.g:535:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:536:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:536:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:537:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRdl.g:557:3: ( (lv_def_statements_3_0= ruleStatement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRdl.g:558:4: (lv_def_statements_3_0= ruleStatement )
            	    {
            	    // InternalRdl.g:558:4: (lv_def_statements_3_0= ruleStatement )
            	    // InternalRdl.g:559:5: lv_def_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getDef_statementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_def_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"def_statements",
            	    						lv_def_statements_3_0,
            	    						"com.softtek.Rdl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalRdl.g:584:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRdl.g:584:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRdl.g:585:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRdl.g:591:1: ruleStatement returns [EObject current=null] : this_StatementReturn_0= ruleStatementReturn ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_StatementReturn_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:597:2: (this_StatementReturn_0= ruleStatementReturn )
            // InternalRdl.g:598:2: this_StatementReturn_0= ruleStatementReturn
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getStatementReturnParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_StatementReturn_0=ruleStatementReturn();

            state._fsp--;


            		current = this_StatementReturn_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementReturn"
    // InternalRdl.g:609:1: entryRuleStatementReturn returns [EObject current=null] : iv_ruleStatementReturn= ruleStatementReturn EOF ;
    public final EObject entryRuleStatementReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementReturn = null;


        try {
            // InternalRdl.g:609:56: (iv_ruleStatementReturn= ruleStatementReturn EOF )
            // InternalRdl.g:610:2: iv_ruleStatementReturn= ruleStatementReturn EOF
            {
             newCompositeNode(grammarAccess.getStatementReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementReturn=ruleStatementReturn();

            state._fsp--;

             current =iv_ruleStatementReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementReturn"


    // $ANTLR start "ruleStatementReturn"
    // InternalRdl.g:616:1: ruleStatementReturn returns [EObject current=null] : (otherlv_0= 'return' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleStatementReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRdl.g:622:2: ( (otherlv_0= 'return' ( ( ruleQualifiedName ) ) ) )
            // InternalRdl.g:623:2: (otherlv_0= 'return' ( ( ruleQualifiedName ) ) )
            {
            // InternalRdl.g:623:2: (otherlv_0= 'return' ( ( ruleQualifiedName ) ) )
            // InternalRdl.g:624:3: otherlv_0= 'return' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementReturnAccess().getReturnKeyword_0());
            		
            // InternalRdl.g:628:3: ( ( ruleQualifiedName ) )
            // InternalRdl.g:629:4: ( ruleQualifiedName )
            {
            // InternalRdl.g:629:4: ( ruleQualifiedName )
            // InternalRdl.g:630:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementReturnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStatementReturnAccess().getEntityfieldEntityFieldCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementReturn"


    // $ANTLR start "entryRuleEntityField"
    // InternalRdl.g:648:1: entryRuleEntityField returns [EObject current=null] : iv_ruleEntityField= ruleEntityField EOF ;
    public final EObject entryRuleEntityField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityField = null;


        try {
            // InternalRdl.g:648:52: (iv_ruleEntityField= ruleEntityField EOF )
            // InternalRdl.g:649:2: iv_ruleEntityField= ruleEntityField EOF
            {
             newCompositeNode(grammarAccess.getEntityFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityField=ruleEntityField();

            state._fsp--;

             current =iv_ruleEntityField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityField"


    // $ANTLR start "ruleEntityField"
    // InternalRdl.g:655:1: ruleEntityField returns [EObject current=null] : (this_EntityReferenceField_0= ruleEntityReferenceField | this_EntityTextField_1= ruleEntityTextField | this_EntityLongTextField_2= ruleEntityLongTextField | this_EntityDateField_3= ruleEntityDateField | this_EntityImageField_4= ruleEntityImageField | this_EntityFileField_5= ruleEntityFileField | this_EntityEmailField_6= ruleEntityEmailField | this_EntityDecimalField_7= ruleEntityDecimalField | this_EntityIntegerField_8= ruleEntityIntegerField | this_EntityCurrencyField_9= ruleEntityCurrencyField ) ;
    public final EObject ruleEntityField() throws RecognitionException {
        EObject current = null;

        EObject this_EntityReferenceField_0 = null;

        EObject this_EntityTextField_1 = null;

        EObject this_EntityLongTextField_2 = null;

        EObject this_EntityDateField_3 = null;

        EObject this_EntityImageField_4 = null;

        EObject this_EntityFileField_5 = null;

        EObject this_EntityEmailField_6 = null;

        EObject this_EntityDecimalField_7 = null;

        EObject this_EntityIntegerField_8 = null;

        EObject this_EntityCurrencyField_9 = null;



        	enterRule();

        try {
            // InternalRdl.g:661:2: ( (this_EntityReferenceField_0= ruleEntityReferenceField | this_EntityTextField_1= ruleEntityTextField | this_EntityLongTextField_2= ruleEntityLongTextField | this_EntityDateField_3= ruleEntityDateField | this_EntityImageField_4= ruleEntityImageField | this_EntityFileField_5= ruleEntityFileField | this_EntityEmailField_6= ruleEntityEmailField | this_EntityDecimalField_7= ruleEntityDecimalField | this_EntityIntegerField_8= ruleEntityIntegerField | this_EntityCurrencyField_9= ruleEntityCurrencyField ) )
            // InternalRdl.g:662:2: (this_EntityReferenceField_0= ruleEntityReferenceField | this_EntityTextField_1= ruleEntityTextField | this_EntityLongTextField_2= ruleEntityLongTextField | this_EntityDateField_3= ruleEntityDateField | this_EntityImageField_4= ruleEntityImageField | this_EntityFileField_5= ruleEntityFileField | this_EntityEmailField_6= ruleEntityEmailField | this_EntityDecimalField_7= ruleEntityDecimalField | this_EntityIntegerField_8= ruleEntityIntegerField | this_EntityCurrencyField_9= ruleEntityCurrencyField )
            {
            // InternalRdl.g:662:2: (this_EntityReferenceField_0= ruleEntityReferenceField | this_EntityTextField_1= ruleEntityTextField | this_EntityLongTextField_2= ruleEntityLongTextField | this_EntityDateField_3= ruleEntityDateField | this_EntityImageField_4= ruleEntityImageField | this_EntityFileField_5= ruleEntityFileField | this_EntityEmailField_6= ruleEntityEmailField | this_EntityDecimalField_7= ruleEntityDecimalField | this_EntityIntegerField_8= ruleEntityIntegerField | this_EntityCurrencyField_9= ruleEntityCurrencyField )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalRdl.g:663:3: this_EntityReferenceField_0= ruleEntityReferenceField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityReferenceFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityReferenceField_0=ruleEntityReferenceField();

                    state._fsp--;


                    			current = this_EntityReferenceField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:672:3: this_EntityTextField_1= ruleEntityTextField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityTextFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityTextField_1=ruleEntityTextField();

                    state._fsp--;


                    			current = this_EntityTextField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:681:3: this_EntityLongTextField_2= ruleEntityLongTextField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityLongTextFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityLongTextField_2=ruleEntityLongTextField();

                    state._fsp--;


                    			current = this_EntityLongTextField_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:690:3: this_EntityDateField_3= ruleEntityDateField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityDateFieldParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityDateField_3=ruleEntityDateField();

                    state._fsp--;


                    			current = this_EntityDateField_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRdl.g:699:3: this_EntityImageField_4= ruleEntityImageField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityImageFieldParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityImageField_4=ruleEntityImageField();

                    state._fsp--;


                    			current = this_EntityImageField_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRdl.g:708:3: this_EntityFileField_5= ruleEntityFileField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityFileFieldParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityFileField_5=ruleEntityFileField();

                    state._fsp--;


                    			current = this_EntityFileField_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRdl.g:717:3: this_EntityEmailField_6= ruleEntityEmailField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityEmailFieldParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityEmailField_6=ruleEntityEmailField();

                    state._fsp--;


                    			current = this_EntityEmailField_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRdl.g:726:3: this_EntityDecimalField_7= ruleEntityDecimalField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityDecimalFieldParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityDecimalField_7=ruleEntityDecimalField();

                    state._fsp--;


                    			current = this_EntityDecimalField_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRdl.g:735:3: this_EntityIntegerField_8= ruleEntityIntegerField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityIntegerFieldParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityIntegerField_8=ruleEntityIntegerField();

                    state._fsp--;


                    			current = this_EntityIntegerField_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRdl.g:744:3: this_EntityCurrencyField_9= ruleEntityCurrencyField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityCurrencyFieldParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityCurrencyField_9=ruleEntityCurrencyField();

                    state._fsp--;


                    			current = this_EntityCurrencyField_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityField"


    // $ANTLR start "entryRuleEntityTextConstraintDef"
    // InternalRdl.g:756:1: entryRuleEntityTextConstraintDef returns [EObject current=null] : iv_ruleEntityTextConstraintDef= ruleEntityTextConstraintDef EOF ;
    public final EObject entryRuleEntityTextConstraintDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTextConstraintDef = null;


        try {
            // InternalRdl.g:756:64: (iv_ruleEntityTextConstraintDef= ruleEntityTextConstraintDef EOF )
            // InternalRdl.g:757:2: iv_ruleEntityTextConstraintDef= ruleEntityTextConstraintDef EOF
            {
             newCompositeNode(grammarAccess.getEntityTextConstraintDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTextConstraintDef=ruleEntityTextConstraintDef();

            state._fsp--;

             current =iv_ruleEntityTextConstraintDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTextConstraintDef"


    // $ANTLR start "ruleEntityTextConstraintDef"
    // InternalRdl.g:763:1: ruleEntityTextConstraintDef returns [EObject current=null] : (otherlv_0= 'constraints' otherlv_1= '(' ( (lv_constraints_2_0= ruleEntityTextConstraint ) ) (otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleEntityTextConstraintDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:769:2: ( (otherlv_0= 'constraints' otherlv_1= '(' ( (lv_constraints_2_0= ruleEntityTextConstraint ) ) (otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) ) )* otherlv_5= ')' ) )
            // InternalRdl.g:770:2: (otherlv_0= 'constraints' otherlv_1= '(' ( (lv_constraints_2_0= ruleEntityTextConstraint ) ) (otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) ) )* otherlv_5= ')' )
            {
            // InternalRdl.g:770:2: (otherlv_0= 'constraints' otherlv_1= '(' ( (lv_constraints_2_0= ruleEntityTextConstraint ) ) (otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) ) )* otherlv_5= ')' )
            // InternalRdl.g:771:3: otherlv_0= 'constraints' otherlv_1= '(' ( (lv_constraints_2_0= ruleEntityTextConstraint ) ) (otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityTextConstraintDefAccess().getConstraintsKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityTextConstraintDefAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:779:3: ( (lv_constraints_2_0= ruleEntityTextConstraint ) )
            // InternalRdl.g:780:4: (lv_constraints_2_0= ruleEntityTextConstraint )
            {
            // InternalRdl.g:780:4: (lv_constraints_2_0= ruleEntityTextConstraint )
            // InternalRdl.g:781:5: lv_constraints_2_0= ruleEntityTextConstraint
            {

            					newCompositeNode(grammarAccess.getEntityTextConstraintDefAccess().getConstraintsEntityTextConstraintParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_constraints_2_0=ruleEntityTextConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityTextConstraintDefRule());
            					}
            					add(
            						current,
            						"constraints",
            						lv_constraints_2_0,
            						"com.softtek.Rdl.EntityTextConstraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdl.g:798:3: (otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRdl.g:799:4: otherlv_3= ',' ( (lv_constraints_4_0= ruleEntityTextConstraint ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEntityTextConstraintDefAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRdl.g:803:4: ( (lv_constraints_4_0= ruleEntityTextConstraint ) )
            	    // InternalRdl.g:804:5: (lv_constraints_4_0= ruleEntityTextConstraint )
            	    {
            	    // InternalRdl.g:804:5: (lv_constraints_4_0= ruleEntityTextConstraint )
            	    // InternalRdl.g:805:6: lv_constraints_4_0= ruleEntityTextConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getEntityTextConstraintDefAccess().getConstraintsEntityTextConstraintParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_constraints_4_0=ruleEntityTextConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityTextConstraintDefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_4_0,
            	    							"com.softtek.Rdl.EntityTextConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityTextConstraintDefAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTextConstraintDef"


    // $ANTLR start "entryRuleEntityTextConstraint"
    // InternalRdl.g:831:1: entryRuleEntityTextConstraint returns [EObject current=null] : iv_ruleEntityTextConstraint= ruleEntityTextConstraint EOF ;
    public final EObject entryRuleEntityTextConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTextConstraint = null;


        try {
            // InternalRdl.g:831:61: (iv_ruleEntityTextConstraint= ruleEntityTextConstraint EOF )
            // InternalRdl.g:832:2: iv_ruleEntityTextConstraint= ruleEntityTextConstraint EOF
            {
             newCompositeNode(grammarAccess.getEntityTextConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTextConstraint=ruleEntityTextConstraint();

            state._fsp--;

             current =iv_ruleEntityTextConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTextConstraint"


    // $ANTLR start "ruleEntityTextConstraint"
    // InternalRdl.g:838:1: ruleEntityTextConstraint returns [EObject current=null] : (this_ConstraintRequired_0= ruleConstraintRequired | this_ConstraintUnique_1= ruleConstraintUnique | this_ConstraintMaxLength_2= ruleConstraintMaxLength | this_ConstraintMinLength_3= ruleConstraintMinLength ) ;
    public final EObject ruleEntityTextConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ConstraintRequired_0 = null;

        EObject this_ConstraintUnique_1 = null;

        EObject this_ConstraintMaxLength_2 = null;

        EObject this_ConstraintMinLength_3 = null;



        	enterRule();

        try {
            // InternalRdl.g:844:2: ( (this_ConstraintRequired_0= ruleConstraintRequired | this_ConstraintUnique_1= ruleConstraintUnique | this_ConstraintMaxLength_2= ruleConstraintMaxLength | this_ConstraintMinLength_3= ruleConstraintMinLength ) )
            // InternalRdl.g:845:2: (this_ConstraintRequired_0= ruleConstraintRequired | this_ConstraintUnique_1= ruleConstraintUnique | this_ConstraintMaxLength_2= ruleConstraintMaxLength | this_ConstraintMinLength_3= ruleConstraintMinLength )
            {
            // InternalRdl.g:845:2: (this_ConstraintRequired_0= ruleConstraintRequired | this_ConstraintUnique_1= ruleConstraintUnique | this_ConstraintMaxLength_2= ruleConstraintMaxLength | this_ConstraintMinLength_3= ruleConstraintMinLength )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 45:
                {
                alt13=2;
                }
                break;
            case 46:
                {
                alt13=3;
                }
                break;
            case 47:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRdl.g:846:3: this_ConstraintRequired_0= ruleConstraintRequired
                    {

                    			newCompositeNode(grammarAccess.getEntityTextConstraintAccess().getConstraintRequiredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintRequired_0=ruleConstraintRequired();

                    state._fsp--;


                    			current = this_ConstraintRequired_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:855:3: this_ConstraintUnique_1= ruleConstraintUnique
                    {

                    			newCompositeNode(grammarAccess.getEntityTextConstraintAccess().getConstraintUniqueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintUnique_1=ruleConstraintUnique();

                    state._fsp--;


                    			current = this_ConstraintUnique_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:864:3: this_ConstraintMaxLength_2= ruleConstraintMaxLength
                    {

                    			newCompositeNode(grammarAccess.getEntityTextConstraintAccess().getConstraintMaxLengthParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintMaxLength_2=ruleConstraintMaxLength();

                    state._fsp--;


                    			current = this_ConstraintMaxLength_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:873:3: this_ConstraintMinLength_3= ruleConstraintMinLength
                    {

                    			newCompositeNode(grammarAccess.getEntityTextConstraintAccess().getConstraintMinLengthParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintMinLength_3=ruleConstraintMinLength();

                    state._fsp--;


                    			current = this_ConstraintMinLength_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTextConstraint"


    // $ANTLR start "entryRuleEntityTextField"
    // InternalRdl.g:885:1: entryRuleEntityTextField returns [EObject current=null] : iv_ruleEntityTextField= ruleEntityTextField EOF ;
    public final EObject entryRuleEntityTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTextField = null;


        try {
            // InternalRdl.g:885:56: (iv_ruleEntityTextField= ruleEntityTextField EOF )
            // InternalRdl.g:886:2: iv_ruleEntityTextField= ruleEntityTextField EOF
            {
             newCompositeNode(grammarAccess.getEntityTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTextField=ruleEntityTextField();

            state._fsp--;

             current =iv_ruleEntityTextField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTextField"


    // $ANTLR start "ruleEntityTextField"
    // InternalRdl.g:892:1: ruleEntityTextField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Text' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:898:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Text' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:899:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Text' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:899:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Text' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:900:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Text' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityTextFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:904:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:905:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:905:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:906:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityTextFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityTextFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityTextFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityTextFieldAccess().getTextKeyword_3());
            		
            // InternalRdl.g:930:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdl.g:931:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityTextFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:935:4: ( (lv_attrs_5_0= ruleEntityTextFieldAttr ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21||LA14_0==48||LA14_0==64||LA14_0==81||LA14_0==86||LA14_0==88) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRdl.g:936:5: (lv_attrs_5_0= ruleEntityTextFieldAttr )
                    	    {
                    	    // InternalRdl.g:936:5: (lv_attrs_5_0= ruleEntityTextFieldAttr )
                    	    // InternalRdl.g:937:6: lv_attrs_5_0= ruleEntityTextFieldAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityTextFieldAccess().getAttrsEntityTextFieldAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityTextFieldAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityTextFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityTextFieldAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityTextFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTextField"


    // $ANTLR start "entryRuleEntityTextFieldAttr"
    // InternalRdl.g:963:1: entryRuleEntityTextFieldAttr returns [EObject current=null] : iv_ruleEntityTextFieldAttr= ruleEntityTextFieldAttr EOF ;
    public final EObject entryRuleEntityTextFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTextFieldAttr = null;


        try {
            // InternalRdl.g:963:60: (iv_ruleEntityTextFieldAttr= ruleEntityTextFieldAttr EOF )
            // InternalRdl.g:964:2: iv_ruleEntityTextFieldAttr= ruleEntityTextFieldAttr EOF
            {
             newCompositeNode(grammarAccess.getEntityTextFieldAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTextFieldAttr=ruleEntityTextFieldAttr();

            state._fsp--;

             current =iv_ruleEntityTextFieldAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTextFieldAttr"


    // $ANTLR start "ruleEntityTextFieldAttr"
    // InternalRdl.g:970:1: ruleEntityTextFieldAttr returns [EObject current=null] : ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetText ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) ;
    public final EObject ruleEntityTextFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject lv_glossary_0_0 = null;

        EObject lv_widget_1_0 = null;

        EObject lv_constraint_2_0 = null;

        EObject lv_db_map_3_0 = null;

        EObject lv_data_domain_4_0 = null;

        EObject lv_business_rule_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:976:2: ( ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetText ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) )
            // InternalRdl.g:977:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetText ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            {
            // InternalRdl.g:977:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetText ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt16=1;
                }
                break;
            case 64:
                {
                alt16=2;
                }
                break;
            case 21:
                {
                alt16=3;
                }
                break;
            case 81:
                {
                alt16=4;
                }
                break;
            case 86:
                {
                alt16=5;
                }
                break;
            case 88:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRdl.g:978:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    {
                    // InternalRdl.g:978:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    // InternalRdl.g:979:4: (lv_glossary_0_0= ruleGlossary )
                    {
                    // InternalRdl.g:979:4: (lv_glossary_0_0= ruleGlossary )
                    // InternalRdl.g:980:5: lv_glossary_0_0= ruleGlossary
                    {

                    					newCompositeNode(grammarAccess.getEntityTextFieldAttrAccess().getGlossaryGlossaryParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_glossary_0_0=ruleGlossary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"glossary",
                    						lv_glossary_0_0,
                    						"com.softtek.Rdl.Glossary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdl.g:998:3: ( (lv_widget_1_0= ruleWidgetText ) )
                    {
                    // InternalRdl.g:998:3: ( (lv_widget_1_0= ruleWidgetText ) )
                    // InternalRdl.g:999:4: (lv_widget_1_0= ruleWidgetText )
                    {
                    // InternalRdl.g:999:4: (lv_widget_1_0= ruleWidgetText )
                    // InternalRdl.g:1000:5: lv_widget_1_0= ruleWidgetText
                    {

                    					newCompositeNode(grammarAccess.getEntityTextFieldAttrAccess().getWidgetWidgetTextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_widget_1_0=ruleWidgetText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"widget",
                    						lv_widget_1_0,
                    						"com.softtek.Rdl.WidgetText");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRdl.g:1018:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    {
                    // InternalRdl.g:1018:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    // InternalRdl.g:1019:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    {
                    // InternalRdl.g:1019:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    // InternalRdl.g:1020:5: lv_constraint_2_0= ruleEntityTextConstraintDef
                    {

                    					newCompositeNode(grammarAccess.getEntityTextFieldAttrAccess().getConstraintEntityTextConstraintDefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleEntityTextConstraintDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_2_0,
                    						"com.softtek.Rdl.EntityTextConstraintDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRdl.g:1038:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    {
                    // InternalRdl.g:1038:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    // InternalRdl.g:1039:4: (lv_db_map_3_0= ruleDBMapField )
                    {
                    // InternalRdl.g:1039:4: (lv_db_map_3_0= ruleDBMapField )
                    // InternalRdl.g:1040:5: lv_db_map_3_0= ruleDBMapField
                    {

                    					newCompositeNode(grammarAccess.getEntityTextFieldAttrAccess().getDb_mapDBMapFieldParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_db_map_3_0=ruleDBMapField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"db_map",
                    						lv_db_map_3_0,
                    						"com.softtek.Rdl.DBMapField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRdl.g:1058:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    {
                    // InternalRdl.g:1058:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    // InternalRdl.g:1059:4: (lv_data_domain_4_0= ruleDataDomain )
                    {
                    // InternalRdl.g:1059:4: (lv_data_domain_4_0= ruleDataDomain )
                    // InternalRdl.g:1060:5: lv_data_domain_4_0= ruleDataDomain
                    {

                    					newCompositeNode(grammarAccess.getEntityTextFieldAttrAccess().getData_domainDataDomainParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_data_domain_4_0=ruleDataDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"data_domain",
                    						lv_data_domain_4_0,
                    						"com.softtek.Rdl.DataDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRdl.g:1078:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    {
                    // InternalRdl.g:1078:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    // InternalRdl.g:1079:4: (lv_business_rule_5_0= ruleBusinessRule )
                    {
                    // InternalRdl.g:1079:4: (lv_business_rule_5_0= ruleBusinessRule )
                    // InternalRdl.g:1080:5: lv_business_rule_5_0= ruleBusinessRule
                    {

                    					newCompositeNode(grammarAccess.getEntityTextFieldAttrAccess().getBusiness_ruleBusinessRuleParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_business_rule_5_0=ruleBusinessRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"business_rule",
                    						lv_business_rule_5_0,
                    						"com.softtek.Rdl.BusinessRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTextFieldAttr"


    // $ANTLR start "entryRuleEntityLongTextField"
    // InternalRdl.g:1101:1: entryRuleEntityLongTextField returns [EObject current=null] : iv_ruleEntityLongTextField= ruleEntityLongTextField EOF ;
    public final EObject entryRuleEntityLongTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityLongTextField = null;


        try {
            // InternalRdl.g:1101:60: (iv_ruleEntityLongTextField= ruleEntityLongTextField EOF )
            // InternalRdl.g:1102:2: iv_ruleEntityLongTextField= ruleEntityLongTextField EOF
            {
             newCompositeNode(grammarAccess.getEntityLongTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityLongTextField=ruleEntityLongTextField();

            state._fsp--;

             current =iv_ruleEntityLongTextField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityLongTextField"


    // $ANTLR start "ruleEntityLongTextField"
    // InternalRdl.g:1108:1: ruleEntityLongTextField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'LongText' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityLongTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1114:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'LongText' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:1115:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'LongText' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:1115:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'LongText' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:1116:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'LongText' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityLongTextFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:1120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:1121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:1121:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:1122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityLongTextFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityLongTextFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityLongTextFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityLongTextFieldAccess().getLongTextKeyword_3());
            		
            // InternalRdl.g:1146:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdl.g:1147:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityLongTextFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:1151:4: ( (lv_attrs_5_0= ruleEntityLongTextFieldAttr ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21||LA17_0==48||LA17_0==64||LA17_0==81||LA17_0==86||LA17_0==88) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRdl.g:1152:5: (lv_attrs_5_0= ruleEntityLongTextFieldAttr )
                    	    {
                    	    // InternalRdl.g:1152:5: (lv_attrs_5_0= ruleEntityLongTextFieldAttr )
                    	    // InternalRdl.g:1153:6: lv_attrs_5_0= ruleEntityLongTextFieldAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityLongTextFieldAccess().getAttrsEntityLongTextFieldAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityLongTextFieldAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityLongTextFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityLongTextFieldAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityLongTextFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityLongTextField"


    // $ANTLR start "entryRuleEntityLongTextFieldAttr"
    // InternalRdl.g:1179:1: entryRuleEntityLongTextFieldAttr returns [EObject current=null] : iv_ruleEntityLongTextFieldAttr= ruleEntityLongTextFieldAttr EOF ;
    public final EObject entryRuleEntityLongTextFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityLongTextFieldAttr = null;


        try {
            // InternalRdl.g:1179:64: (iv_ruleEntityLongTextFieldAttr= ruleEntityLongTextFieldAttr EOF )
            // InternalRdl.g:1180:2: iv_ruleEntityLongTextFieldAttr= ruleEntityLongTextFieldAttr EOF
            {
             newCompositeNode(grammarAccess.getEntityLongTextFieldAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityLongTextFieldAttr=ruleEntityLongTextFieldAttr();

            state._fsp--;

             current =iv_ruleEntityLongTextFieldAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityLongTextFieldAttr"


    // $ANTLR start "ruleEntityLongTextFieldAttr"
    // InternalRdl.g:1186:1: ruleEntityLongTextFieldAttr returns [EObject current=null] : ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) ;
    public final EObject ruleEntityLongTextFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject lv_glossary_0_0 = null;

        EObject lv_widget_1_0 = null;

        EObject lv_constraint_2_0 = null;

        EObject lv_db_map_3_0 = null;

        EObject lv_data_domain_4_0 = null;

        EObject lv_business_rule_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1192:2: ( ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) )
            // InternalRdl.g:1193:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            {
            // InternalRdl.g:1193:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt19=1;
                }
                break;
            case 64:
                {
                alt19=2;
                }
                break;
            case 21:
                {
                alt19=3;
                }
                break;
            case 81:
                {
                alt19=4;
                }
                break;
            case 86:
                {
                alt19=5;
                }
                break;
            case 88:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRdl.g:1194:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    {
                    // InternalRdl.g:1194:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    // InternalRdl.g:1195:4: (lv_glossary_0_0= ruleGlossary )
                    {
                    // InternalRdl.g:1195:4: (lv_glossary_0_0= ruleGlossary )
                    // InternalRdl.g:1196:5: lv_glossary_0_0= ruleGlossary
                    {

                    					newCompositeNode(grammarAccess.getEntityLongTextFieldAttrAccess().getGlossaryGlossaryParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_glossary_0_0=ruleGlossary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityLongTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"glossary",
                    						lv_glossary_0_0,
                    						"com.softtek.Rdl.Glossary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdl.g:1214:3: ( (lv_widget_1_0= ruleWidget ) )
                    {
                    // InternalRdl.g:1214:3: ( (lv_widget_1_0= ruleWidget ) )
                    // InternalRdl.g:1215:4: (lv_widget_1_0= ruleWidget )
                    {
                    // InternalRdl.g:1215:4: (lv_widget_1_0= ruleWidget )
                    // InternalRdl.g:1216:5: lv_widget_1_0= ruleWidget
                    {

                    					newCompositeNode(grammarAccess.getEntityLongTextFieldAttrAccess().getWidgetWidgetParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_widget_1_0=ruleWidget();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityLongTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"widget",
                    						lv_widget_1_0,
                    						"com.softtek.Rdl.Widget");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRdl.g:1234:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    {
                    // InternalRdl.g:1234:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    // InternalRdl.g:1235:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    {
                    // InternalRdl.g:1235:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    // InternalRdl.g:1236:5: lv_constraint_2_0= ruleEntityTextConstraintDef
                    {

                    					newCompositeNode(grammarAccess.getEntityLongTextFieldAttrAccess().getConstraintEntityTextConstraintDefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleEntityTextConstraintDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityLongTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_2_0,
                    						"com.softtek.Rdl.EntityTextConstraintDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRdl.g:1254:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    {
                    // InternalRdl.g:1254:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    // InternalRdl.g:1255:4: (lv_db_map_3_0= ruleDBMapField )
                    {
                    // InternalRdl.g:1255:4: (lv_db_map_3_0= ruleDBMapField )
                    // InternalRdl.g:1256:5: lv_db_map_3_0= ruleDBMapField
                    {

                    					newCompositeNode(grammarAccess.getEntityLongTextFieldAttrAccess().getDb_mapDBMapFieldParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_db_map_3_0=ruleDBMapField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityLongTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"db_map",
                    						lv_db_map_3_0,
                    						"com.softtek.Rdl.DBMapField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRdl.g:1274:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    {
                    // InternalRdl.g:1274:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    // InternalRdl.g:1275:4: (lv_data_domain_4_0= ruleDataDomain )
                    {
                    // InternalRdl.g:1275:4: (lv_data_domain_4_0= ruleDataDomain )
                    // InternalRdl.g:1276:5: lv_data_domain_4_0= ruleDataDomain
                    {

                    					newCompositeNode(grammarAccess.getEntityLongTextFieldAttrAccess().getData_domainDataDomainParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_data_domain_4_0=ruleDataDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityLongTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"data_domain",
                    						lv_data_domain_4_0,
                    						"com.softtek.Rdl.DataDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRdl.g:1294:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    {
                    // InternalRdl.g:1294:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    // InternalRdl.g:1295:4: (lv_business_rule_5_0= ruleBusinessRule )
                    {
                    // InternalRdl.g:1295:4: (lv_business_rule_5_0= ruleBusinessRule )
                    // InternalRdl.g:1296:5: lv_business_rule_5_0= ruleBusinessRule
                    {

                    					newCompositeNode(grammarAccess.getEntityLongTextFieldAttrAccess().getBusiness_ruleBusinessRuleParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_business_rule_5_0=ruleBusinessRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityLongTextFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"business_rule",
                    						lv_business_rule_5_0,
                    						"com.softtek.Rdl.BusinessRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityLongTextFieldAttr"


    // $ANTLR start "entryRuleEntityDateField"
    // InternalRdl.g:1317:1: entryRuleEntityDateField returns [EObject current=null] : iv_ruleEntityDateField= ruleEntityDateField EOF ;
    public final EObject entryRuleEntityDateField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDateField = null;


        try {
            // InternalRdl.g:1317:56: (iv_ruleEntityDateField= ruleEntityDateField EOF )
            // InternalRdl.g:1318:2: iv_ruleEntityDateField= ruleEntityDateField EOF
            {
             newCompositeNode(grammarAccess.getEntityDateFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDateField=ruleEntityDateField();

            state._fsp--;

             current =iv_ruleEntityDateField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDateField"


    // $ANTLR start "ruleEntityDateField"
    // InternalRdl.g:1324:1: ruleEntityDateField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Date' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityDateField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1330:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Date' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:1331:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Date' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:1331:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Date' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:1332:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Date' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityDateFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:1336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:1337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:1337:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:1338:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityDateFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityDateFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityDateFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityDateFieldAccess().getDateKeyword_3());
            		
            // InternalRdl.g:1362:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdl.g:1363:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityDateFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:1367:4: ( (lv_attrs_5_0= ruleEntityDateFieldAttr ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21||LA20_0==29||LA20_0==48||LA20_0==64||LA20_0==81||LA20_0==86||LA20_0==88) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRdl.g:1368:5: (lv_attrs_5_0= ruleEntityDateFieldAttr )
                    	    {
                    	    // InternalRdl.g:1368:5: (lv_attrs_5_0= ruleEntityDateFieldAttr )
                    	    // InternalRdl.g:1369:6: lv_attrs_5_0= ruleEntityDateFieldAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityDateFieldAccess().getAttrsEntityDateFieldAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_attrs_5_0=ruleEntityDateFieldAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityDateFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityDateFieldAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityDateFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDateField"


    // $ANTLR start "entryRuleEntityDateFieldAttr"
    // InternalRdl.g:1395:1: entryRuleEntityDateFieldAttr returns [EObject current=null] : iv_ruleEntityDateFieldAttr= ruleEntityDateFieldAttr EOF ;
    public final EObject entryRuleEntityDateFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDateFieldAttr = null;


        try {
            // InternalRdl.g:1395:60: (iv_ruleEntityDateFieldAttr= ruleEntityDateFieldAttr EOF )
            // InternalRdl.g:1396:2: iv_ruleEntityDateFieldAttr= ruleEntityDateFieldAttr EOF
            {
             newCompositeNode(grammarAccess.getEntityDateFieldAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDateFieldAttr=ruleEntityDateFieldAttr();

            state._fsp--;

             current =iv_ruleEntityDateFieldAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDateFieldAttr"


    // $ANTLR start "ruleEntityDateFieldAttr"
    // InternalRdl.g:1402:1: ruleEntityDateFieldAttr returns [EObject current=null] : ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) ) ) | ( (lv_glossary_3_0= ruleGlossary ) ) | ( (lv_widget_4_0= ruleWidgetDate ) ) | ( (lv_constraint_5_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_6_0= ruleDBMapField ) ) | ( (lv_data_domain_7_0= ruleDataDomain ) ) | ( (lv_business_rule_8_0= ruleBusinessRule ) ) ) ;
    public final EObject ruleEntityDateFieldAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_default_2_0 = null;

        EObject lv_glossary_3_0 = null;

        EObject lv_widget_4_0 = null;

        EObject lv_constraint_5_0 = null;

        EObject lv_db_map_6_0 = null;

        EObject lv_data_domain_7_0 = null;

        EObject lv_business_rule_8_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1408:2: ( ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) ) ) | ( (lv_glossary_3_0= ruleGlossary ) ) | ( (lv_widget_4_0= ruleWidgetDate ) ) | ( (lv_constraint_5_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_6_0= ruleDBMapField ) ) | ( (lv_data_domain_7_0= ruleDataDomain ) ) | ( (lv_business_rule_8_0= ruleBusinessRule ) ) ) )
            // InternalRdl.g:1409:2: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) ) ) | ( (lv_glossary_3_0= ruleGlossary ) ) | ( (lv_widget_4_0= ruleWidgetDate ) ) | ( (lv_constraint_5_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_6_0= ruleDBMapField ) ) | ( (lv_data_domain_7_0= ruleDataDomain ) ) | ( (lv_business_rule_8_0= ruleBusinessRule ) ) )
            {
            // InternalRdl.g:1409:2: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) ) ) | ( (lv_glossary_3_0= ruleGlossary ) ) | ( (lv_widget_4_0= ruleWidgetDate ) ) | ( (lv_constraint_5_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_6_0= ruleDBMapField ) ) | ( (lv_data_domain_7_0= ruleDataDomain ) ) | ( (lv_business_rule_8_0= ruleBusinessRule ) ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case 64:
                {
                alt22=3;
                }
                break;
            case 21:
                {
                alt22=4;
                }
                break;
            case 81:
                {
                alt22=5;
                }
                break;
            case 86:
                {
                alt22=6;
                }
                break;
            case 88:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRdl.g:1410:3: (otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) ) )
                    {
                    // InternalRdl.g:1410:3: (otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) ) )
                    // InternalRdl.g:1411:4: otherlv_0= 'default' otherlv_1= ':' ( (lv_default_2_0= ruleDATE ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityDateFieldAttrAccess().getDefaultKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityDateFieldAttrAccess().getColonKeyword_0_1());
                    			
                    // InternalRdl.g:1419:4: ( (lv_default_2_0= ruleDATE ) )
                    // InternalRdl.g:1420:5: (lv_default_2_0= ruleDATE )
                    {
                    // InternalRdl.g:1420:5: (lv_default_2_0= ruleDATE )
                    // InternalRdl.g:1421:6: lv_default_2_0= ruleDATE
                    {

                    						newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getDefaultDATEParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_2_0=ruleDATE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_2_0,
                    							"com.softtek.Rdl.DATE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdl.g:1440:3: ( (lv_glossary_3_0= ruleGlossary ) )
                    {
                    // InternalRdl.g:1440:3: ( (lv_glossary_3_0= ruleGlossary ) )
                    // InternalRdl.g:1441:4: (lv_glossary_3_0= ruleGlossary )
                    {
                    // InternalRdl.g:1441:4: (lv_glossary_3_0= ruleGlossary )
                    // InternalRdl.g:1442:5: lv_glossary_3_0= ruleGlossary
                    {

                    					newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getGlossaryGlossaryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_glossary_3_0=ruleGlossary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"glossary",
                    						lv_glossary_3_0,
                    						"com.softtek.Rdl.Glossary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRdl.g:1460:3: ( (lv_widget_4_0= ruleWidgetDate ) )
                    {
                    // InternalRdl.g:1460:3: ( (lv_widget_4_0= ruleWidgetDate ) )
                    // InternalRdl.g:1461:4: (lv_widget_4_0= ruleWidgetDate )
                    {
                    // InternalRdl.g:1461:4: (lv_widget_4_0= ruleWidgetDate )
                    // InternalRdl.g:1462:5: lv_widget_4_0= ruleWidgetDate
                    {

                    					newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getWidgetWidgetDateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_widget_4_0=ruleWidgetDate();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"widget",
                    						lv_widget_4_0,
                    						"com.softtek.Rdl.WidgetDate");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRdl.g:1480:3: ( (lv_constraint_5_0= ruleEntityTextConstraintDef ) )
                    {
                    // InternalRdl.g:1480:3: ( (lv_constraint_5_0= ruleEntityTextConstraintDef ) )
                    // InternalRdl.g:1481:4: (lv_constraint_5_0= ruleEntityTextConstraintDef )
                    {
                    // InternalRdl.g:1481:4: (lv_constraint_5_0= ruleEntityTextConstraintDef )
                    // InternalRdl.g:1482:5: lv_constraint_5_0= ruleEntityTextConstraintDef
                    {

                    					newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getConstraintEntityTextConstraintDefParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constraint_5_0=ruleEntityTextConstraintDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_5_0,
                    						"com.softtek.Rdl.EntityTextConstraintDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRdl.g:1500:3: ( (lv_db_map_6_0= ruleDBMapField ) )
                    {
                    // InternalRdl.g:1500:3: ( (lv_db_map_6_0= ruleDBMapField ) )
                    // InternalRdl.g:1501:4: (lv_db_map_6_0= ruleDBMapField )
                    {
                    // InternalRdl.g:1501:4: (lv_db_map_6_0= ruleDBMapField )
                    // InternalRdl.g:1502:5: lv_db_map_6_0= ruleDBMapField
                    {

                    					newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getDb_mapDBMapFieldParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_db_map_6_0=ruleDBMapField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"db_map",
                    						lv_db_map_6_0,
                    						"com.softtek.Rdl.DBMapField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRdl.g:1520:3: ( (lv_data_domain_7_0= ruleDataDomain ) )
                    {
                    // InternalRdl.g:1520:3: ( (lv_data_domain_7_0= ruleDataDomain ) )
                    // InternalRdl.g:1521:4: (lv_data_domain_7_0= ruleDataDomain )
                    {
                    // InternalRdl.g:1521:4: (lv_data_domain_7_0= ruleDataDomain )
                    // InternalRdl.g:1522:5: lv_data_domain_7_0= ruleDataDomain
                    {

                    					newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getData_domainDataDomainParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_data_domain_7_0=ruleDataDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"data_domain",
                    						lv_data_domain_7_0,
                    						"com.softtek.Rdl.DataDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalRdl.g:1540:3: ( (lv_business_rule_8_0= ruleBusinessRule ) )
                    {
                    // InternalRdl.g:1540:3: ( (lv_business_rule_8_0= ruleBusinessRule ) )
                    // InternalRdl.g:1541:4: (lv_business_rule_8_0= ruleBusinessRule )
                    {
                    // InternalRdl.g:1541:4: (lv_business_rule_8_0= ruleBusinessRule )
                    // InternalRdl.g:1542:5: lv_business_rule_8_0= ruleBusinessRule
                    {

                    					newCompositeNode(grammarAccess.getEntityDateFieldAttrAccess().getBusiness_ruleBusinessRuleParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_business_rule_8_0=ruleBusinessRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityDateFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"business_rule",
                    						lv_business_rule_8_0,
                    						"com.softtek.Rdl.BusinessRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDateFieldAttr"


    // $ANTLR start "entryRuleEntityReferenceField"
    // InternalRdl.g:1563:1: entryRuleEntityReferenceField returns [EObject current=null] : iv_ruleEntityReferenceField= ruleEntityReferenceField EOF ;
    public final EObject entryRuleEntityReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReferenceField = null;


        try {
            // InternalRdl.g:1563:61: (iv_ruleEntityReferenceField= ruleEntityReferenceField EOF )
            // InternalRdl.g:1564:2: iv_ruleEntityReferenceField= ruleEntityReferenceField EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityReferenceField=ruleEntityReferenceField();

            state._fsp--;

             current =iv_ruleEntityReferenceField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityReferenceField"


    // $ANTLR start "ruleEntityReferenceField"
    // InternalRdl.g:1570:1: ruleEntityReferenceField returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? (otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}' )? ) ;
    public final EObject ruleEntityReferenceField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_lowerBound_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        EObject lv_attrs_12_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1576:2: ( (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? (otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}' )? ) )
            // InternalRdl.g:1577:2: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? (otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}' )? )
            {
            // InternalRdl.g:1577:2: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? (otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}' )? )
            // InternalRdl.g:1578:3: otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? (otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityReferenceFieldAccess().getReferenceKeyword_0());
            		
            // InternalRdl.g:1582:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:1583:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:1583:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:1584:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityReferenceFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityReferenceFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityReferenceFieldAccess().getColonKeyword_2());
            		
            // InternalRdl.g:1604:3: ( ( ruleQualifiedName ) )
            // InternalRdl.g:1605:4: ( ruleQualifiedName )
            {
            // InternalRdl.g:1605:4: ( ruleQualifiedName )
            // InternalRdl.g:1606:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityReferenceFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityReferenceFieldAccess().getSuperTypeEnumEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityReferenceFieldAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRdl.g:1624:3: ( (lv_lowerBound_5_0= RULE_INT ) )
            // InternalRdl.g:1625:4: (lv_lowerBound_5_0= RULE_INT )
            {
            // InternalRdl.g:1625:4: (lv_lowerBound_5_0= RULE_INT )
            // InternalRdl.g:1626:5: lv_lowerBound_5_0= RULE_INT
            {
            lv_lowerBound_5_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_lowerBound_5_0, grammarAccess.getEntityReferenceFieldAccess().getLowerBoundINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityReferenceFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityReferenceFieldAccess().getFullStopFullStopKeyword_6());
            		
            // InternalRdl.g:1646:3: ( (lv_upperBound_7_0= ruleCardinalityUpperBound ) )
            // InternalRdl.g:1647:4: (lv_upperBound_7_0= ruleCardinalityUpperBound )
            {
            // InternalRdl.g:1647:4: (lv_upperBound_7_0= ruleCardinalityUpperBound )
            // InternalRdl.g:1648:5: lv_upperBound_7_0= ruleCardinalityUpperBound
            {

            					newCompositeNode(grammarAccess.getEntityReferenceFieldAccess().getUpperBoundCardinalityUpperBoundParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_31);
            lv_upperBound_7_0=ruleCardinalityUpperBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_7_0,
            						"com.softtek.Rdl.CardinalityUpperBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getEntityReferenceFieldAccess().getRightSquareBracketKeyword_8());
            		
            // InternalRdl.g:1669:3: (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdl.g:1670:4: otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityReferenceFieldAccess().getOppositeOfKeyword_9_0());
                    			
                    // InternalRdl.g:1674:4: ( ( ruleQualifiedName ) )
                    // InternalRdl.g:1675:5: ( ruleQualifiedName )
                    {
                    // InternalRdl.g:1675:5: ( ruleQualifiedName )
                    // InternalRdl.g:1676:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityReferenceFieldRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityReferenceFieldAccess().getOppositeEntityReferenceFieldCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdl.g:1691:3: (otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRdl.g:1692:4: otherlv_11= '{' ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+ otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityReferenceFieldAccess().getLeftCurlyBracketKeyword_10_0());
                    			
                    // InternalRdl.g:1696:4: ( (lv_attrs_12_0= ruleEntityReferenceFieldAttr ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==21||LA24_0==48||LA24_0==64||LA24_0==81||LA24_0==86||LA24_0==88) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRdl.g:1697:5: (lv_attrs_12_0= ruleEntityReferenceFieldAttr )
                    	    {
                    	    // InternalRdl.g:1697:5: (lv_attrs_12_0= ruleEntityReferenceFieldAttr )
                    	    // InternalRdl.g:1698:6: lv_attrs_12_0= ruleEntityReferenceFieldAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityReferenceFieldAccess().getAttrsEntityReferenceFieldAttrParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_12_0=ruleEntityReferenceFieldAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityReferenceFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_12_0,
                    	    							"com.softtek.Rdl.EntityReferenceFieldAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntityReferenceFieldAccess().getRightCurlyBracketKeyword_10_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityReferenceField"


    // $ANTLR start "entryRuleCardinalityUpperBound"
    // InternalRdl.g:1724:1: entryRuleCardinalityUpperBound returns [String current=null] : iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF ;
    public final String entryRuleCardinalityUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityUpperBound = null;


        try {
            // InternalRdl.g:1724:61: (iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF )
            // InternalRdl.g:1725:2: iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityUpperBound=ruleCardinalityUpperBound();

            state._fsp--;

             current =iv_ruleCardinalityUpperBound.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinalityUpperBound"


    // $ANTLR start "ruleCardinalityUpperBound"
    // InternalRdl.g:1731:1: ruleCardinalityUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRdl.g:1737:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalRdl.g:1738:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalRdl.g:1738:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==35) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalRdl.g:1739:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityUpperBoundAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:1747:3: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityUpperBoundAccess().getAsteriskKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinalityUpperBound"


    // $ANTLR start "entryRuleEntityReferenceFieldAttr"
    // InternalRdl.g:1756:1: entryRuleEntityReferenceFieldAttr returns [EObject current=null] : iv_ruleEntityReferenceFieldAttr= ruleEntityReferenceFieldAttr EOF ;
    public final EObject entryRuleEntityReferenceFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReferenceFieldAttr = null;


        try {
            // InternalRdl.g:1756:65: (iv_ruleEntityReferenceFieldAttr= ruleEntityReferenceFieldAttr EOF )
            // InternalRdl.g:1757:2: iv_ruleEntityReferenceFieldAttr= ruleEntityReferenceFieldAttr EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceFieldAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityReferenceFieldAttr=ruleEntityReferenceFieldAttr();

            state._fsp--;

             current =iv_ruleEntityReferenceFieldAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityReferenceFieldAttr"


    // $ANTLR start "ruleEntityReferenceFieldAttr"
    // InternalRdl.g:1763:1: ruleEntityReferenceFieldAttr returns [EObject current=null] : ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetEnum ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) ;
    public final EObject ruleEntityReferenceFieldAttr() throws RecognitionException {
        EObject current = null;

        EObject lv_glossary_0_0 = null;

        EObject lv_widget_1_0 = null;

        EObject lv_constraint_2_0 = null;

        EObject lv_db_map_3_0 = null;

        EObject lv_data_domain_4_0 = null;

        EObject lv_business_rule_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1769:2: ( ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetEnum ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) )
            // InternalRdl.g:1770:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetEnum ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            {
            // InternalRdl.g:1770:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidgetEnum ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt27=1;
                }
                break;
            case 64:
                {
                alt27=2;
                }
                break;
            case 21:
                {
                alt27=3;
                }
                break;
            case 81:
                {
                alt27=4;
                }
                break;
            case 86:
                {
                alt27=5;
                }
                break;
            case 88:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRdl.g:1771:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    {
                    // InternalRdl.g:1771:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    // InternalRdl.g:1772:4: (lv_glossary_0_0= ruleGlossary )
                    {
                    // InternalRdl.g:1772:4: (lv_glossary_0_0= ruleGlossary )
                    // InternalRdl.g:1773:5: lv_glossary_0_0= ruleGlossary
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAttrAccess().getGlossaryGlossaryParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_glossary_0_0=ruleGlossary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"glossary",
                    						lv_glossary_0_0,
                    						"com.softtek.Rdl.Glossary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdl.g:1791:3: ( (lv_widget_1_0= ruleWidgetEnum ) )
                    {
                    // InternalRdl.g:1791:3: ( (lv_widget_1_0= ruleWidgetEnum ) )
                    // InternalRdl.g:1792:4: (lv_widget_1_0= ruleWidgetEnum )
                    {
                    // InternalRdl.g:1792:4: (lv_widget_1_0= ruleWidgetEnum )
                    // InternalRdl.g:1793:5: lv_widget_1_0= ruleWidgetEnum
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAttrAccess().getWidgetWidgetEnumParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_widget_1_0=ruleWidgetEnum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"widget",
                    						lv_widget_1_0,
                    						"com.softtek.Rdl.WidgetEnum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRdl.g:1811:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    {
                    // InternalRdl.g:1811:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    // InternalRdl.g:1812:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    {
                    // InternalRdl.g:1812:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    // InternalRdl.g:1813:5: lv_constraint_2_0= ruleEntityTextConstraintDef
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAttrAccess().getConstraintEntityTextConstraintDefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleEntityTextConstraintDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_2_0,
                    						"com.softtek.Rdl.EntityTextConstraintDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRdl.g:1831:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    {
                    // InternalRdl.g:1831:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    // InternalRdl.g:1832:4: (lv_db_map_3_0= ruleDBMapField )
                    {
                    // InternalRdl.g:1832:4: (lv_db_map_3_0= ruleDBMapField )
                    // InternalRdl.g:1833:5: lv_db_map_3_0= ruleDBMapField
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAttrAccess().getDb_mapDBMapFieldParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_db_map_3_0=ruleDBMapField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"db_map",
                    						lv_db_map_3_0,
                    						"com.softtek.Rdl.DBMapField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRdl.g:1851:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    {
                    // InternalRdl.g:1851:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    // InternalRdl.g:1852:4: (lv_data_domain_4_0= ruleDataDomain )
                    {
                    // InternalRdl.g:1852:4: (lv_data_domain_4_0= ruleDataDomain )
                    // InternalRdl.g:1853:5: lv_data_domain_4_0= ruleDataDomain
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAttrAccess().getData_domainDataDomainParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_data_domain_4_0=ruleDataDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"data_domain",
                    						lv_data_domain_4_0,
                    						"com.softtek.Rdl.DataDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRdl.g:1871:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    {
                    // InternalRdl.g:1871:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    // InternalRdl.g:1872:4: (lv_business_rule_5_0= ruleBusinessRule )
                    {
                    // InternalRdl.g:1872:4: (lv_business_rule_5_0= ruleBusinessRule )
                    // InternalRdl.g:1873:5: lv_business_rule_5_0= ruleBusinessRule
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAttrAccess().getBusiness_ruleBusinessRuleParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_business_rule_5_0=ruleBusinessRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldAttrRule());
                    					}
                    					set(
                    						current,
                    						"business_rule",
                    						lv_business_rule_5_0,
                    						"com.softtek.Rdl.BusinessRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityReferenceFieldAttr"


    // $ANTLR start "entryRuleEntityImageField"
    // InternalRdl.g:1894:1: entryRuleEntityImageField returns [EObject current=null] : iv_ruleEntityImageField= ruleEntityImageField EOF ;
    public final EObject entryRuleEntityImageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityImageField = null;


        try {
            // InternalRdl.g:1894:57: (iv_ruleEntityImageField= ruleEntityImageField EOF )
            // InternalRdl.g:1895:2: iv_ruleEntityImageField= ruleEntityImageField EOF
            {
             newCompositeNode(grammarAccess.getEntityImageFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityImageField=ruleEntityImageField();

            state._fsp--;

             current =iv_ruleEntityImageField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityImageField"


    // $ANTLR start "ruleEntityImageField"
    // InternalRdl.g:1901:1: ruleEntityImageField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Image' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityImageField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1907:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Image' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:1908:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Image' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:1908:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Image' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:1909:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Image' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityImageFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:1913:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:1914:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:1914:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:1915:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityImageFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityImageFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityImageFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityImageFieldAccess().getImageKeyword_3());
            		
            // InternalRdl.g:1939:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRdl.g:1940:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityImageFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:1944:4: ( (lv_attrs_5_0= ruleEntityAttr ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==21||LA28_0==48||LA28_0==64||LA28_0==81||LA28_0==86||LA28_0==88) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRdl.g:1945:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    {
                    	    // InternalRdl.g:1945:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    // InternalRdl.g:1946:6: lv_attrs_5_0= ruleEntityAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityImageFieldAccess().getAttrsEntityAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityImageFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityImageFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityImageField"


    // $ANTLR start "entryRuleEntityFileField"
    // InternalRdl.g:1972:1: entryRuleEntityFileField returns [EObject current=null] : iv_ruleEntityFileField= ruleEntityFileField EOF ;
    public final EObject entryRuleEntityFileField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityFileField = null;


        try {
            // InternalRdl.g:1972:56: (iv_ruleEntityFileField= ruleEntityFileField EOF )
            // InternalRdl.g:1973:2: iv_ruleEntityFileField= ruleEntityFileField EOF
            {
             newCompositeNode(grammarAccess.getEntityFileFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityFileField=ruleEntityFileField();

            state._fsp--;

             current =iv_ruleEntityFileField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityFileField"


    // $ANTLR start "ruleEntityFileField"
    // InternalRdl.g:1979:1: ruleEntityFileField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'File' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityFileField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:1985:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'File' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:1986:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'File' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:1986:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'File' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:1987:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'File' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityFileFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:1991:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:1992:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:1992:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:1993:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityFileFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFileFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityFileFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityFileFieldAccess().getFileKeyword_3());
            		
            // InternalRdl.g:2017:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRdl.g:2018:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityFileFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:2022:4: ( (lv_attrs_5_0= ruleEntityAttr ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21||LA30_0==48||LA30_0==64||LA30_0==81||LA30_0==86||LA30_0==88) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRdl.g:2023:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    {
                    	    // InternalRdl.g:2023:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    // InternalRdl.g:2024:6: lv_attrs_5_0= ruleEntityAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityFileFieldAccess().getAttrsEntityAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityFileFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityFileFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityFileField"


    // $ANTLR start "entryRuleEntityEmailField"
    // InternalRdl.g:2050:1: entryRuleEntityEmailField returns [EObject current=null] : iv_ruleEntityEmailField= ruleEntityEmailField EOF ;
    public final EObject entryRuleEntityEmailField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityEmailField = null;


        try {
            // InternalRdl.g:2050:57: (iv_ruleEntityEmailField= ruleEntityEmailField EOF )
            // InternalRdl.g:2051:2: iv_ruleEntityEmailField= ruleEntityEmailField EOF
            {
             newCompositeNode(grammarAccess.getEntityEmailFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityEmailField=ruleEntityEmailField();

            state._fsp--;

             current =iv_ruleEntityEmailField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityEmailField"


    // $ANTLR start "ruleEntityEmailField"
    // InternalRdl.g:2057:1: ruleEntityEmailField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Email' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityEmailField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:2063:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Email' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:2064:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Email' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:2064:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Email' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:2065:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Email' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityEmailFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:2069:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:2070:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:2070:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:2071:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityEmailFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityEmailFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityEmailFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityEmailFieldAccess().getEmailKeyword_3());
            		
            // InternalRdl.g:2095:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRdl.g:2096:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityEmailFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:2100:4: ( (lv_attrs_5_0= ruleEntityAttr ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==21||LA32_0==48||LA32_0==64||LA32_0==81||LA32_0==86||LA32_0==88) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRdl.g:2101:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    {
                    	    // InternalRdl.g:2101:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    // InternalRdl.g:2102:6: lv_attrs_5_0= ruleEntityAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityEmailFieldAccess().getAttrsEntityAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityEmailFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityEmailFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityEmailField"


    // $ANTLR start "entryRuleEntityDecimalField"
    // InternalRdl.g:2128:1: entryRuleEntityDecimalField returns [EObject current=null] : iv_ruleEntityDecimalField= ruleEntityDecimalField EOF ;
    public final EObject entryRuleEntityDecimalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDecimalField = null;


        try {
            // InternalRdl.g:2128:59: (iv_ruleEntityDecimalField= ruleEntityDecimalField EOF )
            // InternalRdl.g:2129:2: iv_ruleEntityDecimalField= ruleEntityDecimalField EOF
            {
             newCompositeNode(grammarAccess.getEntityDecimalFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDecimalField=ruleEntityDecimalField();

            state._fsp--;

             current =iv_ruleEntityDecimalField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDecimalField"


    // $ANTLR start "ruleEntityDecimalField"
    // InternalRdl.g:2135:1: ruleEntityDecimalField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Decimal' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityDecimalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:2141:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Decimal' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:2142:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Decimal' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:2142:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Decimal' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:2143:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Decimal' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityDecimalFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:2147:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:2148:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:2148:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:2149:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityDecimalFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityDecimalFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityDecimalFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityDecimalFieldAccess().getDecimalKeyword_3());
            		
            // InternalRdl.g:2173:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==13) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRdl.g:2174:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityDecimalFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:2178:4: ( (lv_attrs_5_0= ruleEntityAttr ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21||LA34_0==48||LA34_0==64||LA34_0==81||LA34_0==86||LA34_0==88) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRdl.g:2179:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    {
                    	    // InternalRdl.g:2179:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    // InternalRdl.g:2180:6: lv_attrs_5_0= ruleEntityAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityDecimalFieldAccess().getAttrsEntityAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityDecimalFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityDecimalFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDecimalField"


    // $ANTLR start "entryRuleEntityIntegerField"
    // InternalRdl.g:2206:1: entryRuleEntityIntegerField returns [EObject current=null] : iv_ruleEntityIntegerField= ruleEntityIntegerField EOF ;
    public final EObject entryRuleEntityIntegerField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityIntegerField = null;


        try {
            // InternalRdl.g:2206:59: (iv_ruleEntityIntegerField= ruleEntityIntegerField EOF )
            // InternalRdl.g:2207:2: iv_ruleEntityIntegerField= ruleEntityIntegerField EOF
            {
             newCompositeNode(grammarAccess.getEntityIntegerFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityIntegerField=ruleEntityIntegerField();

            state._fsp--;

             current =iv_ruleEntityIntegerField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityIntegerField"


    // $ANTLR start "ruleEntityIntegerField"
    // InternalRdl.g:2213:1: ruleEntityIntegerField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Integer' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityIntegerField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:2219:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Integer' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:2220:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Integer' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:2220:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Integer' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:2221:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Integer' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityIntegerFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:2225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:2226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:2226:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:2227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityIntegerFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityIntegerFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityIntegerFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityIntegerFieldAccess().getIntegerKeyword_3());
            		
            // InternalRdl.g:2251:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRdl.g:2252:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityIntegerFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:2256:4: ( (lv_attrs_5_0= ruleEntityAttr ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21||LA36_0==48||LA36_0==64||LA36_0==81||LA36_0==86||LA36_0==88) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRdl.g:2257:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    {
                    	    // InternalRdl.g:2257:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    // InternalRdl.g:2258:6: lv_attrs_5_0= ruleEntityAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityIntegerFieldAccess().getAttrsEntityAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityIntegerFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityIntegerFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityIntegerField"


    // $ANTLR start "entryRuleEntityCurrencyField"
    // InternalRdl.g:2284:1: entryRuleEntityCurrencyField returns [EObject current=null] : iv_ruleEntityCurrencyField= ruleEntityCurrencyField EOF ;
    public final EObject entryRuleEntityCurrencyField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityCurrencyField = null;


        try {
            // InternalRdl.g:2284:60: (iv_ruleEntityCurrencyField= ruleEntityCurrencyField EOF )
            // InternalRdl.g:2285:2: iv_ruleEntityCurrencyField= ruleEntityCurrencyField EOF
            {
             newCompositeNode(grammarAccess.getEntityCurrencyFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityCurrencyField=ruleEntityCurrencyField();

            state._fsp--;

             current =iv_ruleEntityCurrencyField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityCurrencyField"


    // $ANTLR start "ruleEntityCurrencyField"
    // InternalRdl.g:2291:1: ruleEntityCurrencyField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Currency' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEntityCurrencyField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrs_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:2297:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Currency' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? ) )
            // InternalRdl.g:2298:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Currency' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            {
            // InternalRdl.g:2298:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Currency' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )? )
            // InternalRdl.g:2299:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Currency' (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityCurrencyFieldAccess().getFieldKeyword_0());
            		
            // InternalRdl.g:2303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdl.g:2304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRdl.g:2304:4: (lv_name_1_0= RULE_ID )
            // InternalRdl.g:2305:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityCurrencyFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityCurrencyFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityCurrencyFieldAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityCurrencyFieldAccess().getCurrencyKeyword_3());
            		
            // InternalRdl.g:2329:3: (otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRdl.g:2330:4: otherlv_4= '{' ( (lv_attrs_5_0= ruleEntityAttr ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityCurrencyFieldAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalRdl.g:2334:4: ( (lv_attrs_5_0= ruleEntityAttr ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21||LA38_0==48||LA38_0==64||LA38_0==81||LA38_0==86||LA38_0==88) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRdl.g:2335:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    {
                    	    // InternalRdl.g:2335:5: (lv_attrs_5_0= ruleEntityAttr )
                    	    // InternalRdl.g:2336:6: lv_attrs_5_0= ruleEntityAttr
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityCurrencyFieldAccess().getAttrsEntityAttrParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attrs_5_0=ruleEntityAttr();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityCurrencyFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attrs",
                    	    							lv_attrs_5_0,
                    	    							"com.softtek.Rdl.EntityAttr");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityCurrencyFieldAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityCurrencyField"


    // $ANTLR start "entryRuleEntityAttr"
    // InternalRdl.g:2362:1: entryRuleEntityAttr returns [EObject current=null] : iv_ruleEntityAttr= ruleEntityAttr EOF ;
    public final EObject entryRuleEntityAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAttr = null;


        try {
            // InternalRdl.g:2362:51: (iv_ruleEntityAttr= ruleEntityAttr EOF )
            // InternalRdl.g:2363:2: iv_ruleEntityAttr= ruleEntityAttr EOF
            {
             newCompositeNode(grammarAccess.getEntityAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityAttr=ruleEntityAttr();

            state._fsp--;

             current =iv_ruleEntityAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityAttr"


    // $ANTLR start "ruleEntityAttr"
    // InternalRdl.g:2369:1: ruleEntityAttr returns [EObject current=null] : ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) ;
    public final EObject ruleEntityAttr() throws RecognitionException {
        EObject current = null;

        EObject lv_glossary_0_0 = null;

        EObject lv_widget_1_0 = null;

        EObject lv_constraint_2_0 = null;

        EObject lv_db_map_3_0 = null;

        EObject lv_data_domain_4_0 = null;

        EObject lv_business_rule_5_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:2375:2: ( ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) ) )
            // InternalRdl.g:2376:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            {
            // InternalRdl.g:2376:2: ( ( (lv_glossary_0_0= ruleGlossary ) ) | ( (lv_widget_1_0= ruleWidget ) ) | ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) ) | ( (lv_db_map_3_0= ruleDBMapField ) ) | ( (lv_data_domain_4_0= ruleDataDomain ) ) | ( (lv_business_rule_5_0= ruleBusinessRule ) ) )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt40=1;
                }
                break;
            case 64:
                {
                alt40=2;
                }
                break;
            case 21:
                {
                alt40=3;
                }
                break;
            case 81:
                {
                alt40=4;
                }
                break;
            case 86:
                {
                alt40=5;
                }
                break;
            case 88:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalRdl.g:2377:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    {
                    // InternalRdl.g:2377:3: ( (lv_glossary_0_0= ruleGlossary ) )
                    // InternalRdl.g:2378:4: (lv_glossary_0_0= ruleGlossary )
                    {
                    // InternalRdl.g:2378:4: (lv_glossary_0_0= ruleGlossary )
                    // InternalRdl.g:2379:5: lv_glossary_0_0= ruleGlossary
                    {

                    					newCompositeNode(grammarAccess.getEntityAttrAccess().getGlossaryGlossaryParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_glossary_0_0=ruleGlossary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityAttrRule());
                    					}
                    					set(
                    						current,
                    						"glossary",
                    						lv_glossary_0_0,
                    						"com.softtek.Rdl.Glossary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdl.g:2397:3: ( (lv_widget_1_0= ruleWidget ) )
                    {
                    // InternalRdl.g:2397:3: ( (lv_widget_1_0= ruleWidget ) )
                    // InternalRdl.g:2398:4: (lv_widget_1_0= ruleWidget )
                    {
                    // InternalRdl.g:2398:4: (lv_widget_1_0= ruleWidget )
                    // InternalRdl.g:2399:5: lv_widget_1_0= ruleWidget
                    {

                    					newCompositeNode(grammarAccess.getEntityAttrAccess().getWidgetWidgetParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_widget_1_0=ruleWidget();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityAttrRule());
                    					}
                    					set(
                    						current,
                    						"widget",
                    						lv_widget_1_0,
                    						"com.softtek.Rdl.Widget");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRdl.g:2417:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    {
                    // InternalRdl.g:2417:3: ( (lv_constraint_2_0= ruleEntityTextConstraintDef ) )
                    // InternalRdl.g:2418:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    {
                    // InternalRdl.g:2418:4: (lv_constraint_2_0= ruleEntityTextConstraintDef )
                    // InternalRdl.g:2419:5: lv_constraint_2_0= ruleEntityTextConstraintDef
                    {

                    					newCompositeNode(grammarAccess.getEntityAttrAccess().getConstraintEntityTextConstraintDefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleEntityTextConstraintDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityAttrRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_2_0,
                    						"com.softtek.Rdl.EntityTextConstraintDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRdl.g:2437:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    {
                    // InternalRdl.g:2437:3: ( (lv_db_map_3_0= ruleDBMapField ) )
                    // InternalRdl.g:2438:4: (lv_db_map_3_0= ruleDBMapField )
                    {
                    // InternalRdl.g:2438:4: (lv_db_map_3_0= ruleDBMapField )
                    // InternalRdl.g:2439:5: lv_db_map_3_0= ruleDBMapField
                    {

                    					newCompositeNode(grammarAccess.getEntityAttrAccess().getDb_mapDBMapFieldParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_db_map_3_0=ruleDBMapField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityAttrRule());
                    					}
                    					set(
                    						current,
                    						"db_map",
                    						lv_db_map_3_0,
                    						"com.softtek.Rdl.DBMapField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRdl.g:2457:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    {
                    // InternalRdl.g:2457:3: ( (lv_data_domain_4_0= ruleDataDomain ) )
                    // InternalRdl.g:2458:4: (lv_data_domain_4_0= ruleDataDomain )
                    {
                    // InternalRdl.g:2458:4: (lv_data_domain_4_0= ruleDataDomain )
                    // InternalRdl.g:2459:5: lv_data_domain_4_0= ruleDataDomain
                    {

                    					newCompositeNode(grammarAccess.getEntityAttrAccess().getData_domainDataDomainParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_data_domain_4_0=ruleDataDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityAttrRule());
                    					}
                    					set(
                    						current,
                    						"data_domain",
                    						lv_data_domain_4_0,
                    						"com.softtek.Rdl.DataDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRdl.g:2477:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    {
                    // InternalRdl.g:2477:3: ( (lv_business_rule_5_0= ruleBusinessRule ) )
                    // InternalRdl.g:2478:4: (lv_business_rule_5_0= ruleBusinessRule )
                    {
                    // InternalRdl.g:2478:4: (lv_business_rule_5_0= ruleBusinessRule )
                    // InternalRdl.g:2479:5: lv_business_rule_5_0= ruleBusinessRule
                    {

                    					newCompositeNode(grammarAccess.getEntityAttrAccess().getBusiness_ruleBusinessRuleParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_business_rule_5_0=ruleBusinessRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityAttrRule());
                    					}
                    					set(
                    						current,
                    						"business_rule",
                    						lv_business_rule_5_0,
                    						"com.softtek.Rdl.BusinessRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityAttr"


    // $ANTLR start "entryRuleConstraintRequired"
    // InternalRdl.g:2500:1: entryRuleConstraintRequired returns [EObject current=null] : iv_ruleConstraintRequired= ruleConstraintRequired EOF ;
    public final EObject entryRuleConstraintRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintRequired = null;


        try {
            // InternalRdl.g:2500:59: (iv_ruleConstraintRequired= ruleConstraintRequired EOF )
            // InternalRdl.g:2501:2: iv_ruleConstraintRequired= ruleConstraintRequired EOF
            {
             newCompositeNode(grammarAccess.getConstraintRequiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintRequired=ruleConstraintRequired();

            state._fsp--;

             current =iv_ruleConstraintRequired; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintRequired"


    // $ANTLR start "ruleConstraintRequired"
    // InternalRdl.g:2507:1: ruleConstraintRequired returns [EObject current=null] : (otherlv_0= 'required' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleConstraintRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:2513:2: ( (otherlv_0= 'required' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:2514:2: (otherlv_0= 'required' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:2514:2: (otherlv_0= 'required' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalRdl.g:2515:3: otherlv_0= 'required' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintRequiredAccess().getRequiredKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintRequiredAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2523:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalRdl.g:2524:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalRdl.g:2524:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalRdl.g:2525:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalRdl.g:2525:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            else if ( (LA41_0==44) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalRdl.g:2526:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getConstraintRequiredAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRequiredRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:2537:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getConstraintRequiredAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRequiredRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintRequired"


    // $ANTLR start "entryRuleConstraintUnique"
    // InternalRdl.g:2554:1: entryRuleConstraintUnique returns [EObject current=null] : iv_ruleConstraintUnique= ruleConstraintUnique EOF ;
    public final EObject entryRuleConstraintUnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintUnique = null;


        try {
            // InternalRdl.g:2554:57: (iv_ruleConstraintUnique= ruleConstraintUnique EOF )
            // InternalRdl.g:2555:2: iv_ruleConstraintUnique= ruleConstraintUnique EOF
            {
             newCompositeNode(grammarAccess.getConstraintUniqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintUnique=ruleConstraintUnique();

            state._fsp--;

             current =iv_ruleConstraintUnique; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintUnique"


    // $ANTLR start "ruleConstraintUnique"
    // InternalRdl.g:2561:1: ruleConstraintUnique returns [EObject current=null] : (otherlv_0= 'unique' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleConstraintUnique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:2567:2: ( (otherlv_0= 'unique' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:2568:2: (otherlv_0= 'unique' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:2568:2: (otherlv_0= 'unique' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalRdl.g:2569:3: otherlv_0= 'unique' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintUniqueAccess().getUniqueKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintUniqueAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2577:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalRdl.g:2578:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalRdl.g:2578:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalRdl.g:2579:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalRdl.g:2579:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            else if ( (LA42_0==44) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRdl.g:2580:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getConstraintUniqueAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintUniqueRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:2591:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getConstraintUniqueAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintUniqueRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintUnique"


    // $ANTLR start "entryRuleConstraintMaxLength"
    // InternalRdl.g:2608:1: entryRuleConstraintMaxLength returns [EObject current=null] : iv_ruleConstraintMaxLength= ruleConstraintMaxLength EOF ;
    public final EObject entryRuleConstraintMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintMaxLength = null;


        try {
            // InternalRdl.g:2608:60: (iv_ruleConstraintMaxLength= ruleConstraintMaxLength EOF )
            // InternalRdl.g:2609:2: iv_ruleConstraintMaxLength= ruleConstraintMaxLength EOF
            {
             newCompositeNode(grammarAccess.getConstraintMaxLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintMaxLength=ruleConstraintMaxLength();

            state._fsp--;

             current =iv_ruleConstraintMaxLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintMaxLength"


    // $ANTLR start "ruleConstraintMaxLength"
    // InternalRdl.g:2615:1: ruleConstraintMaxLength returns [EObject current=null] : (otherlv_0= 'max_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleConstraintMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:2621:2: ( (otherlv_0= 'max_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalRdl.g:2622:2: (otherlv_0= 'max_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalRdl.g:2622:2: (otherlv_0= 'max_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalRdl.g:2623:3: otherlv_0= 'max_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintMaxLengthAccess().getMax_lengthKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintMaxLengthAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2631:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalRdl.g:2632:4: (lv_value_2_0= RULE_INT )
            {
            // InternalRdl.g:2632:4: (lv_value_2_0= RULE_INT )
            // InternalRdl.g:2633:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getConstraintMaxLengthAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintMaxLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintMaxLength"


    // $ANTLR start "entryRuleConstraintMinLength"
    // InternalRdl.g:2653:1: entryRuleConstraintMinLength returns [EObject current=null] : iv_ruleConstraintMinLength= ruleConstraintMinLength EOF ;
    public final EObject entryRuleConstraintMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintMinLength = null;


        try {
            // InternalRdl.g:2653:60: (iv_ruleConstraintMinLength= ruleConstraintMinLength EOF )
            // InternalRdl.g:2654:2: iv_ruleConstraintMinLength= ruleConstraintMinLength EOF
            {
             newCompositeNode(grammarAccess.getConstraintMinLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintMinLength=ruleConstraintMinLength();

            state._fsp--;

             current =iv_ruleConstraintMinLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintMinLength"


    // $ANTLR start "ruleConstraintMinLength"
    // InternalRdl.g:2660:1: ruleConstraintMinLength returns [EObject current=null] : (otherlv_0= 'min_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleConstraintMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:2666:2: ( (otherlv_0= 'min_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalRdl.g:2667:2: (otherlv_0= 'min_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalRdl.g:2667:2: (otherlv_0= 'min_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalRdl.g:2668:3: otherlv_0= 'min_length' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintMinLengthAccess().getMin_lengthKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintMinLengthAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2676:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalRdl.g:2677:4: (lv_value_2_0= RULE_INT )
            {
            // InternalRdl.g:2677:4: (lv_value_2_0= RULE_INT )
            // InternalRdl.g:2678:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getConstraintMinLengthAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintMinLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintMinLength"


    // $ANTLR start "entryRuleGlossary"
    // InternalRdl.g:2698:1: entryRuleGlossary returns [EObject current=null] : iv_ruleGlossary= ruleGlossary EOF ;
    public final EObject entryRuleGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossary = null;


        try {
            // InternalRdl.g:2698:49: (iv_ruleGlossary= ruleGlossary EOF )
            // InternalRdl.g:2699:2: iv_ruleGlossary= ruleGlossary EOF
            {
             newCompositeNode(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlossary=ruleGlossary();

            state._fsp--;

             current =iv_ruleGlossary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlossary"


    // $ANTLR start "ruleGlossary"
    // InternalRdl.g:2705:1: ruleGlossary returns [EObject current=null] : (otherlv_0= 'glossary' otherlv_1= '(' ( (lv_glossary_name_2_0= ruleGlossaryName ) ) otherlv_3= ',' ( (lv_glossary_description_4_0= ruleGlossaryDescription ) ) otherlv_5= ')' ) ;
    public final EObject ruleGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_glossary_name_2_0 = null;

        EObject lv_glossary_description_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:2711:2: ( (otherlv_0= 'glossary' otherlv_1= '(' ( (lv_glossary_name_2_0= ruleGlossaryName ) ) otherlv_3= ',' ( (lv_glossary_description_4_0= ruleGlossaryDescription ) ) otherlv_5= ')' ) )
            // InternalRdl.g:2712:2: (otherlv_0= 'glossary' otherlv_1= '(' ( (lv_glossary_name_2_0= ruleGlossaryName ) ) otherlv_3= ',' ( (lv_glossary_description_4_0= ruleGlossaryDescription ) ) otherlv_5= ')' )
            {
            // InternalRdl.g:2712:2: (otherlv_0= 'glossary' otherlv_1= '(' ( (lv_glossary_name_2_0= ruleGlossaryName ) ) otherlv_3= ',' ( (lv_glossary_description_4_0= ruleGlossaryDescription ) ) otherlv_5= ')' )
            // InternalRdl.g:2713:3: otherlv_0= 'glossary' otherlv_1= '(' ( (lv_glossary_name_2_0= ruleGlossaryName ) ) otherlv_3= ',' ( (lv_glossary_description_4_0= ruleGlossaryDescription ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getGlossaryAccess().getGlossaryKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getGlossaryAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:2721:3: ( (lv_glossary_name_2_0= ruleGlossaryName ) )
            // InternalRdl.g:2722:4: (lv_glossary_name_2_0= ruleGlossaryName )
            {
            // InternalRdl.g:2722:4: (lv_glossary_name_2_0= ruleGlossaryName )
            // InternalRdl.g:2723:5: lv_glossary_name_2_0= ruleGlossaryName
            {

            					newCompositeNode(grammarAccess.getGlossaryAccess().getGlossary_nameGlossaryNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_glossary_name_2_0=ruleGlossaryName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlossaryRule());
            					}
            					set(
            						current,
            						"glossary_name",
            						lv_glossary_name_2_0,
            						"com.softtek.Rdl.GlossaryName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getGlossaryAccess().getCommaKeyword_3());
            		
            // InternalRdl.g:2744:3: ( (lv_glossary_description_4_0= ruleGlossaryDescription ) )
            // InternalRdl.g:2745:4: (lv_glossary_description_4_0= ruleGlossaryDescription )
            {
            // InternalRdl.g:2745:4: (lv_glossary_description_4_0= ruleGlossaryDescription )
            // InternalRdl.g:2746:5: lv_glossary_description_4_0= ruleGlossaryDescription
            {

            					newCompositeNode(grammarAccess.getGlossaryAccess().getGlossary_descriptionGlossaryDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_43);
            lv_glossary_description_4_0=ruleGlossaryDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlossaryRule());
            					}
            					set(
            						current,
            						"glossary_description",
            						lv_glossary_description_4_0,
            						"com.softtek.Rdl.GlossaryDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGlossaryAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlossary"


    // $ANTLR start "entryRuleGlossaryName"
    // InternalRdl.g:2771:1: entryRuleGlossaryName returns [EObject current=null] : iv_ruleGlossaryName= ruleGlossaryName EOF ;
    public final EObject entryRuleGlossaryName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryName = null;


        try {
            // InternalRdl.g:2771:53: (iv_ruleGlossaryName= ruleGlossaryName EOF )
            // InternalRdl.g:2772:2: iv_ruleGlossaryName= ruleGlossaryName EOF
            {
             newCompositeNode(grammarAccess.getGlossaryNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlossaryName=ruleGlossaryName();

            state._fsp--;

             current =iv_ruleGlossaryName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlossaryName"


    // $ANTLR start "ruleGlossaryName"
    // InternalRdl.g:2778:1: ruleGlossaryName returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGlossaryName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:2784:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) )
            // InternalRdl.g:2785:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // InternalRdl.g:2785:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            // InternalRdl.g:2786:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGlossaryNameAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGlossaryNameAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2794:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalRdl.g:2795:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalRdl.g:2795:4: (lv_label_2_0= RULE_STRING )
            // InternalRdl.g:2796:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_label_2_0, grammarAccess.getGlossaryNameAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlossaryNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlossaryName"


    // $ANTLR start "entryRuleGlossaryDescription"
    // InternalRdl.g:2816:1: entryRuleGlossaryDescription returns [EObject current=null] : iv_ruleGlossaryDescription= ruleGlossaryDescription EOF ;
    public final EObject entryRuleGlossaryDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryDescription = null;


        try {
            // InternalRdl.g:2816:60: (iv_ruleGlossaryDescription= ruleGlossaryDescription EOF )
            // InternalRdl.g:2817:2: iv_ruleGlossaryDescription= ruleGlossaryDescription EOF
            {
             newCompositeNode(grammarAccess.getGlossaryDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlossaryDescription=ruleGlossaryDescription();

            state._fsp--;

             current =iv_ruleGlossaryDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlossaryDescription"


    // $ANTLR start "ruleGlossaryDescription"
    // InternalRdl.g:2823:1: ruleGlossaryDescription returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGlossaryDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:2829:2: ( (otherlv_0= 'description' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) )
            // InternalRdl.g:2830:2: (otherlv_0= 'description' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // InternalRdl.g:2830:2: (otherlv_0= 'description' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            // InternalRdl.g:2831:3: otherlv_0= 'description' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGlossaryDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGlossaryDescriptionAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2839:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalRdl.g:2840:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalRdl.g:2840:4: (lv_label_2_0= RULE_STRING )
            // InternalRdl.g:2841:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_label_2_0, grammarAccess.getGlossaryDescriptionAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlossaryDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlossaryDescription"


    // $ANTLR start "entryRuleWidgetLabel"
    // InternalRdl.g:2861:1: entryRuleWidgetLabel returns [EObject current=null] : iv_ruleWidgetLabel= ruleWidgetLabel EOF ;
    public final EObject entryRuleWidgetLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetLabel = null;


        try {
            // InternalRdl.g:2861:52: (iv_ruleWidgetLabel= ruleWidgetLabel EOF )
            // InternalRdl.g:2862:2: iv_ruleWidgetLabel= ruleWidgetLabel EOF
            {
             newCompositeNode(grammarAccess.getWidgetLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetLabel=ruleWidgetLabel();

            state._fsp--;

             current =iv_ruleWidgetLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetLabel"


    // $ANTLR start "ruleWidgetLabel"
    // InternalRdl.g:2868:1: ruleWidgetLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleWidgetLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:2874:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) )
            // InternalRdl.g:2875:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // InternalRdl.g:2875:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            // InternalRdl.g:2876:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetLabelAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2884:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalRdl.g:2885:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalRdl.g:2885:4: (lv_label_2_0= RULE_STRING )
            // InternalRdl.g:2886:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_label_2_0, grammarAccess.getWidgetLabelAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetLabel"


    // $ANTLR start "entryRuleWidgetHelp"
    // InternalRdl.g:2906:1: entryRuleWidgetHelp returns [EObject current=null] : iv_ruleWidgetHelp= ruleWidgetHelp EOF ;
    public final EObject entryRuleWidgetHelp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetHelp = null;


        try {
            // InternalRdl.g:2906:51: (iv_ruleWidgetHelp= ruleWidgetHelp EOF )
            // InternalRdl.g:2907:2: iv_ruleWidgetHelp= ruleWidgetHelp EOF
            {
             newCompositeNode(grammarAccess.getWidgetHelpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetHelp=ruleWidgetHelp();

            state._fsp--;

             current =iv_ruleWidgetHelp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetHelp"


    // $ANTLR start "ruleWidgetHelp"
    // InternalRdl.g:2913:1: ruleWidgetHelp returns [EObject current=null] : (otherlv_0= 'help' otherlv_1= ':' ( (lv_help_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleWidgetHelp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_help_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:2919:2: ( (otherlv_0= 'help' otherlv_1= ':' ( (lv_help_2_0= RULE_STRING ) ) ) )
            // InternalRdl.g:2920:2: (otherlv_0= 'help' otherlv_1= ':' ( (lv_help_2_0= RULE_STRING ) ) )
            {
            // InternalRdl.g:2920:2: (otherlv_0= 'help' otherlv_1= ':' ( (lv_help_2_0= RULE_STRING ) ) )
            // InternalRdl.g:2921:3: otherlv_0= 'help' otherlv_1= ':' ( (lv_help_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetHelpAccess().getHelpKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetHelpAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2929:3: ( (lv_help_2_0= RULE_STRING ) )
            // InternalRdl.g:2930:4: (lv_help_2_0= RULE_STRING )
            {
            // InternalRdl.g:2930:4: (lv_help_2_0= RULE_STRING )
            // InternalRdl.g:2931:5: lv_help_2_0= RULE_STRING
            {
            lv_help_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_help_2_0, grammarAccess.getWidgetHelpAccess().getHelpSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetHelpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"help",
            						lv_help_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetHelp"


    // $ANTLR start "entryRuleWidgetExposedFilter"
    // InternalRdl.g:2951:1: entryRuleWidgetExposedFilter returns [EObject current=null] : iv_ruleWidgetExposedFilter= ruleWidgetExposedFilter EOF ;
    public final EObject entryRuleWidgetExposedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetExposedFilter = null;


        try {
            // InternalRdl.g:2951:60: (iv_ruleWidgetExposedFilter= ruleWidgetExposedFilter EOF )
            // InternalRdl.g:2952:2: iv_ruleWidgetExposedFilter= ruleWidgetExposedFilter EOF
            {
             newCompositeNode(grammarAccess.getWidgetExposedFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetExposedFilter=ruleWidgetExposedFilter();

            state._fsp--;

             current =iv_ruleWidgetExposedFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetExposedFilter"


    // $ANTLR start "ruleWidgetExposedFilter"
    // InternalRdl.g:2958:1: ruleWidgetExposedFilter returns [EObject current=null] : (otherlv_0= 'exposed_filter' otherlv_1= ':' ( ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) ) ) ) ;
    public final EObject ruleWidgetExposedFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_exposed_filter_2_1=null;
        Token lv_exposed_filter_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:2964:2: ( (otherlv_0= 'exposed_filter' otherlv_1= ':' ( ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:2965:2: (otherlv_0= 'exposed_filter' otherlv_1= ':' ( ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:2965:2: (otherlv_0= 'exposed_filter' otherlv_1= ':' ( ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) ) ) )
            // InternalRdl.g:2966:3: otherlv_0= 'exposed_filter' otherlv_1= ':' ( ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetExposedFilterAccess().getExposed_filterKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetExposedFilterAccess().getColonKeyword_1());
            		
            // InternalRdl.g:2974:3: ( ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) ) )
            // InternalRdl.g:2975:4: ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) )
            {
            // InternalRdl.g:2975:4: ( (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' ) )
            // InternalRdl.g:2976:5: (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' )
            {
            // InternalRdl.g:2976:5: (lv_exposed_filter_2_1= 'true' | lv_exposed_filter_2_2= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            else if ( (LA43_0==44) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalRdl.g:2977:6: lv_exposed_filter_2_1= 'true'
                    {
                    lv_exposed_filter_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_exposed_filter_2_1, grammarAccess.getWidgetExposedFilterAccess().getExposed_filterTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetExposedFilterRule());
                    						}
                    						setWithLastConsumed(current, "exposed_filter", lv_exposed_filter_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:2988:6: lv_exposed_filter_2_2= 'false'
                    {
                    lv_exposed_filter_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_exposed_filter_2_2, grammarAccess.getWidgetExposedFilterAccess().getExposed_filterFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetExposedFilterRule());
                    						}
                    						setWithLastConsumed(current, "exposed_filter", lv_exposed_filter_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetExposedFilter"


    // $ANTLR start "entryRuleWidgetType"
    // InternalRdl.g:3005:1: entryRuleWidgetType returns [EObject current=null] : iv_ruleWidgetType= ruleWidgetType EOF ;
    public final EObject entryRuleWidgetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetType = null;


        try {
            // InternalRdl.g:3005:51: (iv_ruleWidgetType= ruleWidgetType EOF )
            // InternalRdl.g:3006:2: iv_ruleWidgetType= ruleWidgetType EOF
            {
             newCompositeNode(grammarAccess.getWidgetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetType=ruleWidgetType();

            state._fsp--;

             current =iv_ruleWidgetType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetType"


    // $ANTLR start "ruleWidgetType"
    // InternalRdl.g:3012:1: ruleWidgetType returns [EObject current=null] : (otherlv_0= 'type' otherlv_1= ':' ( ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) ) ) ) ;
    public final EObject ruleWidgetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;


        	enterRule();

        try {
            // InternalRdl.g:3018:2: ( (otherlv_0= 'type' otherlv_1= ':' ( ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) ) ) ) )
            // InternalRdl.g:3019:2: (otherlv_0= 'type' otherlv_1= ':' ( ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) ) ) )
            {
            // InternalRdl.g:3019:2: (otherlv_0= 'type' otherlv_1= ':' ( ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) ) ) )
            // InternalRdl.g:3020:3: otherlv_0= 'type' otherlv_1= ':' ( ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetTypeAccess().getColonKeyword_1());
            		
            // InternalRdl.g:3028:3: ( ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) ) )
            // InternalRdl.g:3029:4: ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) )
            {
            // InternalRdl.g:3029:4: ( (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' ) )
            // InternalRdl.g:3030:5: (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' )
            {
            // InternalRdl.g:3030:5: (lv_type_2_1= 'Option' | lv_type_2_2= 'Check' | lv_type_2_3= 'Autocomplete' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt44=1;
                }
                break;
            case 56:
                {
                alt44=2;
                }
                break;
            case 57:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalRdl.g:3031:6: lv_type_2_1= 'Option'
                    {
                    lv_type_2_1=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getWidgetTypeAccess().getTypeOptionKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:3042:6: lv_type_2_2= 'Check'
                    {
                    lv_type_2_2=(Token)match(input,56,FOLLOW_2); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getWidgetTypeAccess().getTypeCheckKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRdl.g:3053:6: lv_type_2_3= 'Autocomplete'
                    {
                    lv_type_2_3=(Token)match(input,57,FOLLOW_2); 

                    						newLeafNode(lv_type_2_3, grammarAccess.getWidgetTypeAccess().getTypeAutocompleteKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetType"


    // $ANTLR start "entryRuleWidgetTypeSelect"
    // InternalRdl.g:3070:1: entryRuleWidgetTypeSelect returns [EObject current=null] : iv_ruleWidgetTypeSelect= ruleWidgetTypeSelect EOF ;
    public final EObject entryRuleWidgetTypeSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetTypeSelect = null;


        try {
            // InternalRdl.g:3070:57: (iv_ruleWidgetTypeSelect= ruleWidgetTypeSelect EOF )
            // InternalRdl.g:3071:2: iv_ruleWidgetTypeSelect= ruleWidgetTypeSelect EOF
            {
             newCompositeNode(grammarAccess.getWidgetTypeSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetTypeSelect=ruleWidgetTypeSelect();

            state._fsp--;

             current =iv_ruleWidgetTypeSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetTypeSelect"


    // $ANTLR start "ruleWidgetTypeSelect"
    // InternalRdl.g:3077:1: ruleWidgetTypeSelect returns [EObject current=null] : (otherlv_0= 'type' otherlv_1= ':' ( (lv_type_2_0= 'SelectList' ) ) ) ;
    public final EObject ruleWidgetTypeSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:3083:2: ( (otherlv_0= 'type' otherlv_1= ':' ( (lv_type_2_0= 'SelectList' ) ) ) )
            // InternalRdl.g:3084:2: (otherlv_0= 'type' otherlv_1= ':' ( (lv_type_2_0= 'SelectList' ) ) )
            {
            // InternalRdl.g:3084:2: (otherlv_0= 'type' otherlv_1= ':' ( (lv_type_2_0= 'SelectList' ) ) )
            // InternalRdl.g:3085:3: otherlv_0= 'type' otherlv_1= ':' ( (lv_type_2_0= 'SelectList' ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetTypeSelectAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetTypeSelectAccess().getColonKeyword_1());
            		
            // InternalRdl.g:3093:3: ( (lv_type_2_0= 'SelectList' ) )
            // InternalRdl.g:3094:4: (lv_type_2_0= 'SelectList' )
            {
            // InternalRdl.g:3094:4: (lv_type_2_0= 'SelectList' )
            // InternalRdl.g:3095:5: lv_type_2_0= 'SelectList'
            {
            lv_type_2_0=(Token)match(input,58,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getWidgetTypeSelectAccess().getTypeSelectListKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetTypeSelectRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_2_0, "SelectList");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetTypeSelect"


    // $ANTLR start "entryRuleWidgetSortBy"
    // InternalRdl.g:3111:1: entryRuleWidgetSortBy returns [EObject current=null] : iv_ruleWidgetSortBy= ruleWidgetSortBy EOF ;
    public final EObject entryRuleWidgetSortBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetSortBy = null;


        try {
            // InternalRdl.g:3111:53: (iv_ruleWidgetSortBy= ruleWidgetSortBy EOF )
            // InternalRdl.g:3112:2: iv_ruleWidgetSortBy= ruleWidgetSortBy EOF
            {
             newCompositeNode(grammarAccess.getWidgetSortByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetSortBy=ruleWidgetSortBy();

            state._fsp--;

             current =iv_ruleWidgetSortBy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetSortBy"


    // $ANTLR start "ruleWidgetSortBy"
    // InternalRdl.g:3118:1: ruleWidgetSortBy returns [EObject current=null] : (otherlv_0= 'sort_by' otherlv_1= ':' ( (lv_sortby_2_0= RULE_ID ) ) ) ;
    public final EObject ruleWidgetSortBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortby_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:3124:2: ( (otherlv_0= 'sort_by' otherlv_1= ':' ( (lv_sortby_2_0= RULE_ID ) ) ) )
            // InternalRdl.g:3125:2: (otherlv_0= 'sort_by' otherlv_1= ':' ( (lv_sortby_2_0= RULE_ID ) ) )
            {
            // InternalRdl.g:3125:2: (otherlv_0= 'sort_by' otherlv_1= ':' ( (lv_sortby_2_0= RULE_ID ) ) )
            // InternalRdl.g:3126:3: otherlv_0= 'sort_by' otherlv_1= ':' ( (lv_sortby_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetSortByAccess().getSort_byKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetSortByAccess().getColonKeyword_1());
            		
            // InternalRdl.g:3134:3: ( (lv_sortby_2_0= RULE_ID ) )
            // InternalRdl.g:3135:4: (lv_sortby_2_0= RULE_ID )
            {
            // InternalRdl.g:3135:4: (lv_sortby_2_0= RULE_ID )
            // InternalRdl.g:3136:5: lv_sortby_2_0= RULE_ID
            {
            lv_sortby_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_sortby_2_0, grammarAccess.getWidgetSortByAccess().getSortbyIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetSortByRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sortby",
            						lv_sortby_2_0,
            						"com.softtek.Rdl.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetSortBy"


    // $ANTLR start "entryRuleWidgetStartYear"
    // InternalRdl.g:3156:1: entryRuleWidgetStartYear returns [EObject current=null] : iv_ruleWidgetStartYear= ruleWidgetStartYear EOF ;
    public final EObject entryRuleWidgetStartYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetStartYear = null;


        try {
            // InternalRdl.g:3156:56: (iv_ruleWidgetStartYear= ruleWidgetStartYear EOF )
            // InternalRdl.g:3157:2: iv_ruleWidgetStartYear= ruleWidgetStartYear EOF
            {
             newCompositeNode(grammarAccess.getWidgetStartYearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetStartYear=ruleWidgetStartYear();

            state._fsp--;

             current =iv_ruleWidgetStartYear; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetStartYear"


    // $ANTLR start "ruleWidgetStartYear"
    // InternalRdl.g:3163:1: ruleWidgetStartYear returns [EObject current=null] : ( () otherlv_1= 'start_year_from_now' otherlv_2= ':' ( (lv_start_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT ) ;
    public final EObject ruleWidgetStartYear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_start_3_0=null;
        Token otherlv_4=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalRdl.g:3169:2: ( ( () otherlv_1= 'start_year_from_now' otherlv_2= ':' ( (lv_start_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT ) )
            // InternalRdl.g:3170:2: ( () otherlv_1= 'start_year_from_now' otherlv_2= ':' ( (lv_start_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT )
            {
            // InternalRdl.g:3170:2: ( () otherlv_1= 'start_year_from_now' otherlv_2= ':' ( (lv_start_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT )
            // InternalRdl.g:3171:3: () otherlv_1= 'start_year_from_now' otherlv_2= ':' ( (lv_start_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT
            {
            // InternalRdl.g:3171:3: ()
            // InternalRdl.g:3172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetStartYearAccess().getWidgetStartYearAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetStartYearAccess().getStart_year_from_nowKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetStartYearAccess().getColonKeyword_2());
            		
            // InternalRdl.g:3186:3: ( (lv_start_3_0= '-' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==61) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRdl.g:3187:4: (lv_start_3_0= '-' )
                    {
                    // InternalRdl.g:3187:4: (lv_start_3_0= '-' )
                    // InternalRdl.g:3188:5: lv_start_3_0= '-'
                    {
                    lv_start_3_0=(Token)match(input,61,FOLLOW_47); 

                    					newLeafNode(lv_start_3_0, grammarAccess.getWidgetStartYearAccess().getStartHyphenMinusKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWidgetStartYearRule());
                    					}
                    					setWithLastConsumed(current, "start", lv_start_3_0, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRdl.g:3200:3: (otherlv_4= '+' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==62) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRdl.g:3201:4: otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getWidgetStartYearAccess().getPlusSignKeyword_4());
                    			

                    }
                    break;

            }

            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(this_INT_5, grammarAccess.getWidgetStartYearAccess().getINTTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetStartYear"


    // $ANTLR start "entryRuleWidgetEndYear"
    // InternalRdl.g:3214:1: entryRuleWidgetEndYear returns [EObject current=null] : iv_ruleWidgetEndYear= ruleWidgetEndYear EOF ;
    public final EObject entryRuleWidgetEndYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetEndYear = null;


        try {
            // InternalRdl.g:3214:54: (iv_ruleWidgetEndYear= ruleWidgetEndYear EOF )
            // InternalRdl.g:3215:2: iv_ruleWidgetEndYear= ruleWidgetEndYear EOF
            {
             newCompositeNode(grammarAccess.getWidgetEndYearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetEndYear=ruleWidgetEndYear();

            state._fsp--;

             current =iv_ruleWidgetEndYear; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetEndYear"


    // $ANTLR start "ruleWidgetEndYear"
    // InternalRdl.g:3221:1: ruleWidgetEndYear returns [EObject current=null] : ( () otherlv_1= 'end_year_from_now' otherlv_2= ':' ( (lv_end_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT ) ;
    public final EObject ruleWidgetEndYear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Token otherlv_4=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalRdl.g:3227:2: ( ( () otherlv_1= 'end_year_from_now' otherlv_2= ':' ( (lv_end_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT ) )
            // InternalRdl.g:3228:2: ( () otherlv_1= 'end_year_from_now' otherlv_2= ':' ( (lv_end_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT )
            {
            // InternalRdl.g:3228:2: ( () otherlv_1= 'end_year_from_now' otherlv_2= ':' ( (lv_end_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT )
            // InternalRdl.g:3229:3: () otherlv_1= 'end_year_from_now' otherlv_2= ':' ( (lv_end_3_0= '-' ) )? (otherlv_4= '+' )? this_INT_5= RULE_INT
            {
            // InternalRdl.g:3229:3: ()
            // InternalRdl.g:3230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetEndYearAccess().getWidgetEndYearAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetEndYearAccess().getEnd_year_from_nowKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetEndYearAccess().getColonKeyword_2());
            		
            // InternalRdl.g:3244:3: ( (lv_end_3_0= '-' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRdl.g:3245:4: (lv_end_3_0= '-' )
                    {
                    // InternalRdl.g:3245:4: (lv_end_3_0= '-' )
                    // InternalRdl.g:3246:5: lv_end_3_0= '-'
                    {
                    lv_end_3_0=(Token)match(input,61,FOLLOW_47); 

                    					newLeafNode(lv_end_3_0, grammarAccess.getWidgetEndYearAccess().getEndHyphenMinusKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWidgetEndYearRule());
                    					}
                    					setWithLastConsumed(current, "end", lv_end_3_0, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRdl.g:3258:3: (otherlv_4= '+' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==62) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRdl.g:3259:4: otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getWidgetEndYearAccess().getPlusSignKeyword_4());
                    			

                    }
                    break;

            }

            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(this_INT_5, grammarAccess.getWidgetEndYearAccess().getINTTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetEndYear"


    // $ANTLR start "entryRuleWidget"
    // InternalRdl.g:3272:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalRdl.g:3272:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalRdl.g:3273:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalRdl.g:3279:1: ruleWidget returns [EObject current=null] : ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token lv_widget_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_attrs_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:3285:2: ( ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) ) )* otherlv_5= ')' ) )
            // InternalRdl.g:3286:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) ) )* otherlv_5= ')' )
            {
            // InternalRdl.g:3286:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) ) )* otherlv_5= ')' )
            // InternalRdl.g:3287:3: ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) ) )* otherlv_5= ')'
            {
            // InternalRdl.g:3287:3: ( (lv_widget_0_0= 'widget' ) )
            // InternalRdl.g:3288:4: (lv_widget_0_0= 'widget' )
            {
            // InternalRdl.g:3288:4: (lv_widget_0_0= 'widget' )
            // InternalRdl.g:3289:5: lv_widget_0_0= 'widget'
            {
            lv_widget_0_0=(Token)match(input,64,FOLLOW_15); 

            					newLeafNode(lv_widget_0_0, grammarAccess.getWidgetAccess().getWidgetWidgetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetRule());
            					}
            					setWithLastConsumed(current, "widget", lv_widget_0_0, "widget");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:3305:3: ( (lv_attrs_2_0= ruleWidgetAttr ) )
            // InternalRdl.g:3306:4: (lv_attrs_2_0= ruleWidgetAttr )
            {
            // InternalRdl.g:3306:4: (lv_attrs_2_0= ruleWidgetAttr )
            // InternalRdl.g:3307:5: lv_attrs_2_0= ruleWidgetAttr
            {

            					newCompositeNode(grammarAccess.getWidgetAccess().getAttrsWidgetAttrParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_attrs_2_0=ruleWidgetAttr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetRule());
            					}
            					add(
            						current,
            						"attrs",
            						lv_attrs_2_0,
            						"com.softtek.Rdl.WidgetAttr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdl.g:3324:3: (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==23) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalRdl.g:3325:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttr ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_48); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWidgetAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRdl.g:3329:4: ( (lv_attrs_4_0= ruleWidgetAttr ) )
            	    // InternalRdl.g:3330:5: (lv_attrs_4_0= ruleWidgetAttr )
            	    {
            	    // InternalRdl.g:3330:5: (lv_attrs_4_0= ruleWidgetAttr )
            	    // InternalRdl.g:3331:6: lv_attrs_4_0= ruleWidgetAttr
            	    {

            	    						newCompositeNode(grammarAccess.getWidgetAccess().getAttrsWidgetAttrParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_attrs_4_0=ruleWidgetAttr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWidgetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrs",
            	    							lv_attrs_4_0,
            	    							"com.softtek.Rdl.WidgetAttr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleWidgetEnum"
    // InternalRdl.g:3357:1: entryRuleWidgetEnum returns [EObject current=null] : iv_ruleWidgetEnum= ruleWidgetEnum EOF ;
    public final EObject entryRuleWidgetEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetEnum = null;


        try {
            // InternalRdl.g:3357:51: (iv_ruleWidgetEnum= ruleWidgetEnum EOF )
            // InternalRdl.g:3358:2: iv_ruleWidgetEnum= ruleWidgetEnum EOF
            {
             newCompositeNode(grammarAccess.getWidgetEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetEnum=ruleWidgetEnum();

            state._fsp--;

             current =iv_ruleWidgetEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetEnum"


    // $ANTLR start "ruleWidgetEnum"
    // InternalRdl.g:3364:1: ruleWidgetEnum returns [EObject current=null] : ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrEnum ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleWidgetEnum() throws RecognitionException {
        EObject current = null;

        Token lv_widget_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_attrs_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:3370:2: ( ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrEnum ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) ) )* otherlv_5= ')' ) )
            // InternalRdl.g:3371:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrEnum ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) ) )* otherlv_5= ')' )
            {
            // InternalRdl.g:3371:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrEnum ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) ) )* otherlv_5= ')' )
            // InternalRdl.g:3372:3: ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrEnum ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) ) )* otherlv_5= ')'
            {
            // InternalRdl.g:3372:3: ( (lv_widget_0_0= 'widget' ) )
            // InternalRdl.g:3373:4: (lv_widget_0_0= 'widget' )
            {
            // InternalRdl.g:3373:4: (lv_widget_0_0= 'widget' )
            // InternalRdl.g:3374:5: lv_widget_0_0= 'widget'
            {
            lv_widget_0_0=(Token)match(input,64,FOLLOW_15); 

            					newLeafNode(lv_widget_0_0, grammarAccess.getWidgetEnumAccess().getWidgetWidgetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetEnumRule());
            					}
            					setWithLastConsumed(current, "widget", lv_widget_0_0, "widget");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetEnumAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:3390:3: ( (lv_attrs_2_0= ruleWidgetAttrEnum ) )
            // InternalRdl.g:3391:4: (lv_attrs_2_0= ruleWidgetAttrEnum )
            {
            // InternalRdl.g:3391:4: (lv_attrs_2_0= ruleWidgetAttrEnum )
            // InternalRdl.g:3392:5: lv_attrs_2_0= ruleWidgetAttrEnum
            {

            					newCompositeNode(grammarAccess.getWidgetEnumAccess().getAttrsWidgetAttrEnumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_attrs_2_0=ruleWidgetAttrEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetEnumRule());
            					}
            					add(
            						current,
            						"attrs",
            						lv_attrs_2_0,
            						"com.softtek.Rdl.WidgetAttrEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdl.g:3409:3: (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==23) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalRdl.g:3410:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrEnum ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_49); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWidgetEnumAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRdl.g:3414:4: ( (lv_attrs_4_0= ruleWidgetAttrEnum ) )
            	    // InternalRdl.g:3415:5: (lv_attrs_4_0= ruleWidgetAttrEnum )
            	    {
            	    // InternalRdl.g:3415:5: (lv_attrs_4_0= ruleWidgetAttrEnum )
            	    // InternalRdl.g:3416:6: lv_attrs_4_0= ruleWidgetAttrEnum
            	    {

            	    						newCompositeNode(grammarAccess.getWidgetEnumAccess().getAttrsWidgetAttrEnumParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_attrs_4_0=ruleWidgetAttrEnum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWidgetEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrs",
            	    							lv_attrs_4_0,
            	    							"com.softtek.Rdl.WidgetAttrEnum");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetEnumAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetEnum"


    // $ANTLR start "entryRuleWidgetDate"
    // InternalRdl.g:3442:1: entryRuleWidgetDate returns [EObject current=null] : iv_ruleWidgetDate= ruleWidgetDate EOF ;
    public final EObject entryRuleWidgetDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetDate = null;


        try {
            // InternalRdl.g:3442:51: (iv_ruleWidgetDate= ruleWidgetDate EOF )
            // InternalRdl.g:3443:2: iv_ruleWidgetDate= ruleWidgetDate EOF
            {
             newCompositeNode(grammarAccess.getWidgetDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetDate=ruleWidgetDate();

            state._fsp--;

             current =iv_ruleWidgetDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetDate"


    // $ANTLR start "ruleWidgetDate"
    // InternalRdl.g:3449:1: ruleWidgetDate returns [EObject current=null] : ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrDate ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleWidgetDate() throws RecognitionException {
        EObject current = null;

        Token lv_widget_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_attrs_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:3455:2: ( ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrDate ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) ) )* otherlv_5= ')' ) )
            // InternalRdl.g:3456:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrDate ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) ) )* otherlv_5= ')' )
            {
            // InternalRdl.g:3456:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrDate ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) ) )* otherlv_5= ')' )
            // InternalRdl.g:3457:3: ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrDate ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) ) )* otherlv_5= ')'
            {
            // InternalRdl.g:3457:3: ( (lv_widget_0_0= 'widget' ) )
            // InternalRdl.g:3458:4: (lv_widget_0_0= 'widget' )
            {
            // InternalRdl.g:3458:4: (lv_widget_0_0= 'widget' )
            // InternalRdl.g:3459:5: lv_widget_0_0= 'widget'
            {
            lv_widget_0_0=(Token)match(input,64,FOLLOW_15); 

            					newLeafNode(lv_widget_0_0, grammarAccess.getWidgetDateAccess().getWidgetWidgetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetDateRule());
            					}
            					setWithLastConsumed(current, "widget", lv_widget_0_0, "widget");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetDateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:3475:3: ( (lv_attrs_2_0= ruleWidgetAttrDate ) )
            // InternalRdl.g:3476:4: (lv_attrs_2_0= ruleWidgetAttrDate )
            {
            // InternalRdl.g:3476:4: (lv_attrs_2_0= ruleWidgetAttrDate )
            // InternalRdl.g:3477:5: lv_attrs_2_0= ruleWidgetAttrDate
            {

            					newCompositeNode(grammarAccess.getWidgetDateAccess().getAttrsWidgetAttrDateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_attrs_2_0=ruleWidgetAttrDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetDateRule());
            					}
            					add(
            						current,
            						"attrs",
            						lv_attrs_2_0,
            						"com.softtek.Rdl.WidgetAttrDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdl.g:3494:3: (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==23) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalRdl.g:3495:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrDate ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_50); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWidgetDateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRdl.g:3499:4: ( (lv_attrs_4_0= ruleWidgetAttrDate ) )
            	    // InternalRdl.g:3500:5: (lv_attrs_4_0= ruleWidgetAttrDate )
            	    {
            	    // InternalRdl.g:3500:5: (lv_attrs_4_0= ruleWidgetAttrDate )
            	    // InternalRdl.g:3501:6: lv_attrs_4_0= ruleWidgetAttrDate
            	    {

            	    						newCompositeNode(grammarAccess.getWidgetDateAccess().getAttrsWidgetAttrDateParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_attrs_4_0=ruleWidgetAttrDate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWidgetDateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrs",
            	    							lv_attrs_4_0,
            	    							"com.softtek.Rdl.WidgetAttrDate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetDateAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetDate"


    // $ANTLR start "entryRuleWidgetText"
    // InternalRdl.g:3527:1: entryRuleWidgetText returns [EObject current=null] : iv_ruleWidgetText= ruleWidgetText EOF ;
    public final EObject entryRuleWidgetText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetText = null;


        try {
            // InternalRdl.g:3527:51: (iv_ruleWidgetText= ruleWidgetText EOF )
            // InternalRdl.g:3528:2: iv_ruleWidgetText= ruleWidgetText EOF
            {
             newCompositeNode(grammarAccess.getWidgetTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetText=ruleWidgetText();

            state._fsp--;

             current =iv_ruleWidgetText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetText"


    // $ANTLR start "ruleWidgetText"
    // InternalRdl.g:3534:1: ruleWidgetText returns [EObject current=null] : ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrText ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleWidgetText() throws RecognitionException {
        EObject current = null;

        Token lv_widget_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_attrs_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:3540:2: ( ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrText ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) ) )* otherlv_5= ')' ) )
            // InternalRdl.g:3541:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrText ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) ) )* otherlv_5= ')' )
            {
            // InternalRdl.g:3541:2: ( ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrText ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) ) )* otherlv_5= ')' )
            // InternalRdl.g:3542:3: ( (lv_widget_0_0= 'widget' ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleWidgetAttrText ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) ) )* otherlv_5= ')'
            {
            // InternalRdl.g:3542:3: ( (lv_widget_0_0= 'widget' ) )
            // InternalRdl.g:3543:4: (lv_widget_0_0= 'widget' )
            {
            // InternalRdl.g:3543:4: (lv_widget_0_0= 'widget' )
            // InternalRdl.g:3544:5: lv_widget_0_0= 'widget'
            {
            lv_widget_0_0=(Token)match(input,64,FOLLOW_15); 

            					newLeafNode(lv_widget_0_0, grammarAccess.getWidgetTextAccess().getWidgetWidgetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetTextRule());
            					}
            					setWithLastConsumed(current, "widget", lv_widget_0_0, "widget");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetTextAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:3560:3: ( (lv_attrs_2_0= ruleWidgetAttrText ) )
            // InternalRdl.g:3561:4: (lv_attrs_2_0= ruleWidgetAttrText )
            {
            // InternalRdl.g:3561:4: (lv_attrs_2_0= ruleWidgetAttrText )
            // InternalRdl.g:3562:5: lv_attrs_2_0= ruleWidgetAttrText
            {

            					newCompositeNode(grammarAccess.getWidgetTextAccess().getAttrsWidgetAttrTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_attrs_2_0=ruleWidgetAttrText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetTextRule());
            					}
            					add(
            						current,
            						"attrs",
            						lv_attrs_2_0,
            						"com.softtek.Rdl.WidgetAttrText");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdl.g:3579:3: (otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==23) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalRdl.g:3580:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleWidgetAttrText ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_51); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWidgetTextAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRdl.g:3584:4: ( (lv_attrs_4_0= ruleWidgetAttrText ) )
            	    // InternalRdl.g:3585:5: (lv_attrs_4_0= ruleWidgetAttrText )
            	    {
            	    // InternalRdl.g:3585:5: (lv_attrs_4_0= ruleWidgetAttrText )
            	    // InternalRdl.g:3586:6: lv_attrs_4_0= ruleWidgetAttrText
            	    {

            	    						newCompositeNode(grammarAccess.getWidgetTextAccess().getAttrsWidgetAttrTextParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_attrs_4_0=ruleWidgetAttrText();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWidgetTextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrs",
            	    							lv_attrs_4_0,
            	    							"com.softtek.Rdl.WidgetAttrText");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWidgetTextAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetText"


    // $ANTLR start "entryRuleWidgetAttr"
    // InternalRdl.g:3612:1: entryRuleWidgetAttr returns [EObject current=null] : iv_ruleWidgetAttr= ruleWidgetAttr EOF ;
    public final EObject entryRuleWidgetAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetAttr = null;


        try {
            // InternalRdl.g:3612:51: (iv_ruleWidgetAttr= ruleWidgetAttr EOF )
            // InternalRdl.g:3613:2: iv_ruleWidgetAttr= ruleWidgetAttr EOF
            {
             newCompositeNode(grammarAccess.getWidgetAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetAttr=ruleWidgetAttr();

            state._fsp--;

             current =iv_ruleWidgetAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetAttr"


    // $ANTLR start "ruleWidgetAttr"
    // InternalRdl.g:3619:1: ruleWidgetAttr returns [EObject current=null] : (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetDisplayResult_3= ruleWidgetDisplayResult ) ;
    public final EObject ruleWidgetAttr() throws RecognitionException {
        EObject current = null;

        EObject this_WidgetLabel_0 = null;

        EObject this_WidgetHelp_1 = null;

        EObject this_WidgetExposedFilter_2 = null;

        EObject this_WidgetDisplayResult_3 = null;



        	enterRule();

        try {
            // InternalRdl.g:3625:2: ( (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetDisplayResult_3= ruleWidgetDisplayResult ) )
            // InternalRdl.g:3626:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetDisplayResult_3= ruleWidgetDisplayResult )
            {
            // InternalRdl.g:3626:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetDisplayResult_3= ruleWidgetDisplayResult )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt53=1;
                }
                break;
            case 52:
                {
                alt53=2;
                }
                break;
            case 53:
                {
                alt53=3;
                }
                break;
            case 71:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalRdl.g:3627:3: this_WidgetLabel_0= ruleWidgetLabel
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrAccess().getWidgetLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetLabel_0=ruleWidgetLabel();

                    state._fsp--;


                    			current = this_WidgetLabel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:3636:3: this_WidgetHelp_1= ruleWidgetHelp
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrAccess().getWidgetHelpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetHelp_1=ruleWidgetHelp();

                    state._fsp--;


                    			current = this_WidgetHelp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:3645:3: this_WidgetExposedFilter_2= ruleWidgetExposedFilter
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrAccess().getWidgetExposedFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetExposedFilter_2=ruleWidgetExposedFilter();

                    state._fsp--;


                    			current = this_WidgetExposedFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:3654:3: this_WidgetDisplayResult_3= ruleWidgetDisplayResult
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrAccess().getWidgetDisplayResultParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetDisplayResult_3=ruleWidgetDisplayResult();

                    state._fsp--;


                    			current = this_WidgetDisplayResult_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetAttr"


    // $ANTLR start "entryRuleWidgetAttrEnum"
    // InternalRdl.g:3666:1: entryRuleWidgetAttrEnum returns [EObject current=null] : iv_ruleWidgetAttrEnum= ruleWidgetAttrEnum EOF ;
    public final EObject entryRuleWidgetAttrEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetAttrEnum = null;


        try {
            // InternalRdl.g:3666:55: (iv_ruleWidgetAttrEnum= ruleWidgetAttrEnum EOF )
            // InternalRdl.g:3667:2: iv_ruleWidgetAttrEnum= ruleWidgetAttrEnum EOF
            {
             newCompositeNode(grammarAccess.getWidgetAttrEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetAttrEnum=ruleWidgetAttrEnum();

            state._fsp--;

             current =iv_ruleWidgetAttrEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetAttrEnum"


    // $ANTLR start "ruleWidgetAttrEnum"
    // InternalRdl.g:3673:1: ruleWidgetAttrEnum returns [EObject current=null] : (this_WidgetAttrEnumType_0= ruleWidgetAttrEnumType | this_WidgetAttrEnumTypeSelect_1= ruleWidgetAttrEnumTypeSelect | this_WidgetDisplayResult_2= ruleWidgetDisplayResult ) ;
    public final EObject ruleWidgetAttrEnum() throws RecognitionException {
        EObject current = null;

        EObject this_WidgetAttrEnumType_0 = null;

        EObject this_WidgetAttrEnumTypeSelect_1 = null;

        EObject this_WidgetDisplayResult_2 = null;



        	enterRule();

        try {
            // InternalRdl.g:3679:2: ( (this_WidgetAttrEnumType_0= ruleWidgetAttrEnumType | this_WidgetAttrEnumTypeSelect_1= ruleWidgetAttrEnumTypeSelect | this_WidgetDisplayResult_2= ruleWidgetDisplayResult ) )
            // InternalRdl.g:3680:2: (this_WidgetAttrEnumType_0= ruleWidgetAttrEnumType | this_WidgetAttrEnumTypeSelect_1= ruleWidgetAttrEnumTypeSelect | this_WidgetDisplayResult_2= ruleWidgetDisplayResult )
            {
            // InternalRdl.g:3680:2: (this_WidgetAttrEnumType_0= ruleWidgetAttrEnumType | this_WidgetAttrEnumTypeSelect_1= ruleWidgetAttrEnumTypeSelect | this_WidgetDisplayResult_2= ruleWidgetDisplayResult )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
            case 53:
                {
                alt54=1;
                }
                break;
            case 54:
                {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==17) ) {
                    int LA54_4 = input.LA(3);

                    if ( (LA54_4==58) ) {
                        alt54=2;
                    }
                    else if ( ((LA54_4>=55 && LA54_4<=57)) ) {
                        alt54=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalRdl.g:3681:3: this_WidgetAttrEnumType_0= ruleWidgetAttrEnumType
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumAccess().getWidgetAttrEnumTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetAttrEnumType_0=ruleWidgetAttrEnumType();

                    state._fsp--;


                    			current = this_WidgetAttrEnumType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:3690:3: this_WidgetAttrEnumTypeSelect_1= ruleWidgetAttrEnumTypeSelect
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumAccess().getWidgetAttrEnumTypeSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetAttrEnumTypeSelect_1=ruleWidgetAttrEnumTypeSelect();

                    state._fsp--;


                    			current = this_WidgetAttrEnumTypeSelect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:3699:3: this_WidgetDisplayResult_2= ruleWidgetDisplayResult
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumAccess().getWidgetDisplayResultParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetDisplayResult_2=ruleWidgetDisplayResult();

                    state._fsp--;


                    			current = this_WidgetDisplayResult_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetAttrEnum"


    // $ANTLR start "entryRuleWidgetAttrEnumType"
    // InternalRdl.g:3711:1: entryRuleWidgetAttrEnumType returns [EObject current=null] : iv_ruleWidgetAttrEnumType= ruleWidgetAttrEnumType EOF ;
    public final EObject entryRuleWidgetAttrEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetAttrEnumType = null;


        try {
            // InternalRdl.g:3711:59: (iv_ruleWidgetAttrEnumType= ruleWidgetAttrEnumType EOF )
            // InternalRdl.g:3712:2: iv_ruleWidgetAttrEnumType= ruleWidgetAttrEnumType EOF
            {
             newCompositeNode(grammarAccess.getWidgetAttrEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetAttrEnumType=ruleWidgetAttrEnumType();

            state._fsp--;

             current =iv_ruleWidgetAttrEnumType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetAttrEnumType"


    // $ANTLR start "ruleWidgetAttrEnumType"
    // InternalRdl.g:3718:1: ruleWidgetAttrEnumType returns [EObject current=null] : (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetType_3= ruleWidgetType ) ;
    public final EObject ruleWidgetAttrEnumType() throws RecognitionException {
        EObject current = null;

        EObject this_WidgetLabel_0 = null;

        EObject this_WidgetHelp_1 = null;

        EObject this_WidgetExposedFilter_2 = null;

        EObject this_WidgetType_3 = null;



        	enterRule();

        try {
            // InternalRdl.g:3724:2: ( (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetType_3= ruleWidgetType ) )
            // InternalRdl.g:3725:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetType_3= ruleWidgetType )
            {
            // InternalRdl.g:3725:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetType_3= ruleWidgetType )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt55=1;
                }
                break;
            case 52:
                {
                alt55=2;
                }
                break;
            case 53:
                {
                alt55=3;
                }
                break;
            case 54:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalRdl.g:3726:3: this_WidgetLabel_0= ruleWidgetLabel
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumTypeAccess().getWidgetLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetLabel_0=ruleWidgetLabel();

                    state._fsp--;


                    			current = this_WidgetLabel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:3735:3: this_WidgetHelp_1= ruleWidgetHelp
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumTypeAccess().getWidgetHelpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetHelp_1=ruleWidgetHelp();

                    state._fsp--;


                    			current = this_WidgetHelp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:3744:3: this_WidgetExposedFilter_2= ruleWidgetExposedFilter
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumTypeAccess().getWidgetExposedFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetExposedFilter_2=ruleWidgetExposedFilter();

                    state._fsp--;


                    			current = this_WidgetExposedFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:3753:3: this_WidgetType_3= ruleWidgetType
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrEnumTypeAccess().getWidgetTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetType_3=ruleWidgetType();

                    state._fsp--;


                    			current = this_WidgetType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetAttrEnumType"


    // $ANTLR start "entryRuleWidgetAttrEnumTypeSelect"
    // InternalRdl.g:3765:1: entryRuleWidgetAttrEnumTypeSelect returns [EObject current=null] : iv_ruleWidgetAttrEnumTypeSelect= ruleWidgetAttrEnumTypeSelect EOF ;
    public final EObject entryRuleWidgetAttrEnumTypeSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetAttrEnumTypeSelect = null;


        try {
            // InternalRdl.g:3765:65: (iv_ruleWidgetAttrEnumTypeSelect= ruleWidgetAttrEnumTypeSelect EOF )
            // InternalRdl.g:3766:2: iv_ruleWidgetAttrEnumTypeSelect= ruleWidgetAttrEnumTypeSelect EOF
            {
             newCompositeNode(grammarAccess.getWidgetAttrEnumTypeSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetAttrEnumTypeSelect=ruleWidgetAttrEnumTypeSelect();

            state._fsp--;

             current =iv_ruleWidgetAttrEnumTypeSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetAttrEnumTypeSelect"


    // $ANTLR start "ruleWidgetAttrEnumTypeSelect"
    // InternalRdl.g:3772:1: ruleWidgetAttrEnumTypeSelect returns [EObject current=null] : (this_WidgetTypeSelect_0= ruleWidgetTypeSelect (otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) ) )? ) ;
    public final EObject ruleWidgetAttrEnumTypeSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_WidgetTypeSelect_0 = null;

        EObject lv_sortby_2_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:3778:2: ( (this_WidgetTypeSelect_0= ruleWidgetTypeSelect (otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) ) )? ) )
            // InternalRdl.g:3779:2: (this_WidgetTypeSelect_0= ruleWidgetTypeSelect (otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) ) )? )
            {
            // InternalRdl.g:3779:2: (this_WidgetTypeSelect_0= ruleWidgetTypeSelect (otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) ) )? )
            // InternalRdl.g:3780:3: this_WidgetTypeSelect_0= ruleWidgetTypeSelect (otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) ) )?
            {

            			newCompositeNode(grammarAccess.getWidgetAttrEnumTypeSelectAccess().getWidgetTypeSelectParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_WidgetTypeSelect_0=ruleWidgetTypeSelect();

            state._fsp--;


            			current = this_WidgetTypeSelect_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRdl.g:3788:3: (otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==23) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==59) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalRdl.g:3789:4: otherlv_1= ',' ( (lv_sortby_2_0= ruleWidgetSortBy ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_53); 

                    				newLeafNode(otherlv_1, grammarAccess.getWidgetAttrEnumTypeSelectAccess().getCommaKeyword_1_0());
                    			
                    // InternalRdl.g:3793:4: ( (lv_sortby_2_0= ruleWidgetSortBy ) )
                    // InternalRdl.g:3794:5: (lv_sortby_2_0= ruleWidgetSortBy )
                    {
                    // InternalRdl.g:3794:5: (lv_sortby_2_0= ruleWidgetSortBy )
                    // InternalRdl.g:3795:6: lv_sortby_2_0= ruleWidgetSortBy
                    {

                    						newCompositeNode(grammarAccess.getWidgetAttrEnumTypeSelectAccess().getSortbyWidgetSortByParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sortby_2_0=ruleWidgetSortBy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetAttrEnumTypeSelectRule());
                    						}
                    						set(
                    							current,
                    							"sortby",
                    							lv_sortby_2_0,
                    							"com.softtek.Rdl.WidgetSortBy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetAttrEnumTypeSelect"


    // $ANTLR start "entryRuleWidgetAttrDate"
    // InternalRdl.g:3817:1: entryRuleWidgetAttrDate returns [EObject current=null] : iv_ruleWidgetAttrDate= ruleWidgetAttrDate EOF ;
    public final EObject entryRuleWidgetAttrDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetAttrDate = null;


        try {
            // InternalRdl.g:3817:55: (iv_ruleWidgetAttrDate= ruleWidgetAttrDate EOF )
            // InternalRdl.g:3818:2: iv_ruleWidgetAttrDate= ruleWidgetAttrDate EOF
            {
             newCompositeNode(grammarAccess.getWidgetAttrDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetAttrDate=ruleWidgetAttrDate();

            state._fsp--;

             current =iv_ruleWidgetAttrDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetAttrDate"


    // $ANTLR start "ruleWidgetAttrDate"
    // InternalRdl.g:3824:1: ruleWidgetAttrDate returns [EObject current=null] : (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetStartYear_3= ruleWidgetStartYear | this_WidgetEndYear_4= ruleWidgetEndYear | this_WidgetDisplayResult_5= ruleWidgetDisplayResult ) ;
    public final EObject ruleWidgetAttrDate() throws RecognitionException {
        EObject current = null;

        EObject this_WidgetLabel_0 = null;

        EObject this_WidgetHelp_1 = null;

        EObject this_WidgetExposedFilter_2 = null;

        EObject this_WidgetStartYear_3 = null;

        EObject this_WidgetEndYear_4 = null;

        EObject this_WidgetDisplayResult_5 = null;



        	enterRule();

        try {
            // InternalRdl.g:3830:2: ( (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetStartYear_3= ruleWidgetStartYear | this_WidgetEndYear_4= ruleWidgetEndYear | this_WidgetDisplayResult_5= ruleWidgetDisplayResult ) )
            // InternalRdl.g:3831:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetStartYear_3= ruleWidgetStartYear | this_WidgetEndYear_4= ruleWidgetEndYear | this_WidgetDisplayResult_5= ruleWidgetDisplayResult )
            {
            // InternalRdl.g:3831:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetStartYear_3= ruleWidgetStartYear | this_WidgetEndYear_4= ruleWidgetEndYear | this_WidgetDisplayResult_5= ruleWidgetDisplayResult )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt57=1;
                }
                break;
            case 52:
                {
                alt57=2;
                }
                break;
            case 53:
                {
                alt57=3;
                }
                break;
            case 60:
                {
                alt57=4;
                }
                break;
            case 63:
                {
                alt57=5;
                }
                break;
            case 71:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalRdl.g:3832:3: this_WidgetLabel_0= ruleWidgetLabel
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrDateAccess().getWidgetLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetLabel_0=ruleWidgetLabel();

                    state._fsp--;


                    			current = this_WidgetLabel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:3841:3: this_WidgetHelp_1= ruleWidgetHelp
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrDateAccess().getWidgetHelpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetHelp_1=ruleWidgetHelp();

                    state._fsp--;


                    			current = this_WidgetHelp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:3850:3: this_WidgetExposedFilter_2= ruleWidgetExposedFilter
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrDateAccess().getWidgetExposedFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetExposedFilter_2=ruleWidgetExposedFilter();

                    state._fsp--;


                    			current = this_WidgetExposedFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:3859:3: this_WidgetStartYear_3= ruleWidgetStartYear
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrDateAccess().getWidgetStartYearParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetStartYear_3=ruleWidgetStartYear();

                    state._fsp--;


                    			current = this_WidgetStartYear_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRdl.g:3868:3: this_WidgetEndYear_4= ruleWidgetEndYear
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrDateAccess().getWidgetEndYearParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetEndYear_4=ruleWidgetEndYear();

                    state._fsp--;


                    			current = this_WidgetEndYear_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRdl.g:3877:3: this_WidgetDisplayResult_5= ruleWidgetDisplayResult
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrDateAccess().getWidgetDisplayResultParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetDisplayResult_5=ruleWidgetDisplayResult();

                    state._fsp--;


                    			current = this_WidgetDisplayResult_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetAttrDate"


    // $ANTLR start "entryRuleWidgetAttrText"
    // InternalRdl.g:3889:1: entryRuleWidgetAttrText returns [EObject current=null] : iv_ruleWidgetAttrText= ruleWidgetAttrText EOF ;
    public final EObject entryRuleWidgetAttrText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetAttrText = null;


        try {
            // InternalRdl.g:3889:55: (iv_ruleWidgetAttrText= ruleWidgetAttrText EOF )
            // InternalRdl.g:3890:2: iv_ruleWidgetAttrText= ruleWidgetAttrText EOF
            {
             newCompositeNode(grammarAccess.getWidgetAttrTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetAttrText=ruleWidgetAttrText();

            state._fsp--;

             current =iv_ruleWidgetAttrText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetAttrText"


    // $ANTLR start "ruleWidgetAttrText"
    // InternalRdl.g:3896:1: ruleWidgetAttrText returns [EObject current=null] : (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetSize_3= ruleWidgetSize | this_WidgetDisplayResult_4= ruleWidgetDisplayResult ) ;
    public final EObject ruleWidgetAttrText() throws RecognitionException {
        EObject current = null;

        EObject this_WidgetLabel_0 = null;

        EObject this_WidgetHelp_1 = null;

        EObject this_WidgetExposedFilter_2 = null;

        EObject this_WidgetSize_3 = null;

        EObject this_WidgetDisplayResult_4 = null;



        	enterRule();

        try {
            // InternalRdl.g:3902:2: ( (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetSize_3= ruleWidgetSize | this_WidgetDisplayResult_4= ruleWidgetDisplayResult ) )
            // InternalRdl.g:3903:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetSize_3= ruleWidgetSize | this_WidgetDisplayResult_4= ruleWidgetDisplayResult )
            {
            // InternalRdl.g:3903:2: (this_WidgetLabel_0= ruleWidgetLabel | this_WidgetHelp_1= ruleWidgetHelp | this_WidgetExposedFilter_2= ruleWidgetExposedFilter | this_WidgetSize_3= ruleWidgetSize | this_WidgetDisplayResult_4= ruleWidgetDisplayResult )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt58=1;
                }
                break;
            case 52:
                {
                alt58=2;
                }
                break;
            case 53:
                {
                alt58=3;
                }
                break;
            case 65:
                {
                alt58=4;
                }
                break;
            case 71:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalRdl.g:3904:3: this_WidgetLabel_0= ruleWidgetLabel
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrTextAccess().getWidgetLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetLabel_0=ruleWidgetLabel();

                    state._fsp--;


                    			current = this_WidgetLabel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:3913:3: this_WidgetHelp_1= ruleWidgetHelp
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrTextAccess().getWidgetHelpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetHelp_1=ruleWidgetHelp();

                    state._fsp--;


                    			current = this_WidgetHelp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:3922:3: this_WidgetExposedFilter_2= ruleWidgetExposedFilter
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrTextAccess().getWidgetExposedFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetExposedFilter_2=ruleWidgetExposedFilter();

                    state._fsp--;


                    			current = this_WidgetExposedFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:3931:3: this_WidgetSize_3= ruleWidgetSize
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrTextAccess().getWidgetSizeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetSize_3=ruleWidgetSize();

                    state._fsp--;


                    			current = this_WidgetSize_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRdl.g:3940:3: this_WidgetDisplayResult_4= ruleWidgetDisplayResult
                    {

                    			newCompositeNode(grammarAccess.getWidgetAttrTextAccess().getWidgetDisplayResultParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetDisplayResult_4=ruleWidgetDisplayResult();

                    state._fsp--;


                    			current = this_WidgetDisplayResult_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetAttrText"


    // $ANTLR start "entryRuleWidgetSize"
    // InternalRdl.g:3952:1: entryRuleWidgetSize returns [EObject current=null] : iv_ruleWidgetSize= ruleWidgetSize EOF ;
    public final EObject entryRuleWidgetSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetSize = null;


        try {
            // InternalRdl.g:3952:51: (iv_ruleWidgetSize= ruleWidgetSize EOF )
            // InternalRdl.g:3953:2: iv_ruleWidgetSize= ruleWidgetSize EOF
            {
             newCompositeNode(grammarAccess.getWidgetSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetSize=ruleWidgetSize();

            state._fsp--;

             current =iv_ruleWidgetSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetSize"


    // $ANTLR start "ruleWidgetSize"
    // InternalRdl.g:3959:1: ruleWidgetSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= ':' ( (lv_type_2_0= ruleWidgetSizeType ) ) ) ;
    public final EObject ruleWidgetSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:3965:2: ( (otherlv_0= 'size' otherlv_1= ':' ( (lv_type_2_0= ruleWidgetSizeType ) ) ) )
            // InternalRdl.g:3966:2: (otherlv_0= 'size' otherlv_1= ':' ( (lv_type_2_0= ruleWidgetSizeType ) ) )
            {
            // InternalRdl.g:3966:2: (otherlv_0= 'size' otherlv_1= ':' ( (lv_type_2_0= ruleWidgetSizeType ) ) )
            // InternalRdl.g:3967:3: otherlv_0= 'size' otherlv_1= ':' ( (lv_type_2_0= ruleWidgetSizeType ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetSizeAccess().getColonKeyword_1());
            		
            // InternalRdl.g:3975:3: ( (lv_type_2_0= ruleWidgetSizeType ) )
            // InternalRdl.g:3976:4: (lv_type_2_0= ruleWidgetSizeType )
            {
            // InternalRdl.g:3976:4: (lv_type_2_0= ruleWidgetSizeType )
            // InternalRdl.g:3977:5: lv_type_2_0= ruleWidgetSizeType
            {

            					newCompositeNode(grammarAccess.getWidgetSizeAccess().getTypeWidgetSizeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleWidgetSizeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetSizeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"com.softtek.Rdl.WidgetSizeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetSize"


    // $ANTLR start "entryRuleWidgetSizeType"
    // InternalRdl.g:3998:1: entryRuleWidgetSizeType returns [String current=null] : iv_ruleWidgetSizeType= ruleWidgetSizeType EOF ;
    public final String entryRuleWidgetSizeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWidgetSizeType = null;


        try {
            // InternalRdl.g:3998:54: (iv_ruleWidgetSizeType= ruleWidgetSizeType EOF )
            // InternalRdl.g:3999:2: iv_ruleWidgetSizeType= ruleWidgetSizeType EOF
            {
             newCompositeNode(grammarAccess.getWidgetSizeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetSizeType=ruleWidgetSizeType();

            state._fsp--;

             current =iv_ruleWidgetSizeType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetSizeType"


    // $ANTLR start "ruleWidgetSizeType"
    // InternalRdl.g:4005:1: ruleWidgetSizeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'XS' | kw= 'SM' | kw= 'MD' | kw= 'LG' | kw= 'XL' ) ;
    public final AntlrDatatypeRuleToken ruleWidgetSizeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRdl.g:4011:2: ( (kw= 'XS' | kw= 'SM' | kw= 'MD' | kw= 'LG' | kw= 'XL' ) )
            // InternalRdl.g:4012:2: (kw= 'XS' | kw= 'SM' | kw= 'MD' | kw= 'LG' | kw= 'XL' )
            {
            // InternalRdl.g:4012:2: (kw= 'XS' | kw= 'SM' | kw= 'MD' | kw= 'LG' | kw= 'XL' )
            int alt59=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt59=1;
                }
                break;
            case 67:
                {
                alt59=2;
                }
                break;
            case 68:
                {
                alt59=3;
                }
                break;
            case 69:
                {
                alt59=4;
                }
                break;
            case 70:
                {
                alt59=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalRdl.g:4013:3: kw= 'XS'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWidgetSizeTypeAccess().getXSKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4019:3: kw= 'SM'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWidgetSizeTypeAccess().getSMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:4025:3: kw= 'MD'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWidgetSizeTypeAccess().getMDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:4031:3: kw= 'LG'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWidgetSizeTypeAccess().getLGKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRdl.g:4037:3: kw= 'XL'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWidgetSizeTypeAccess().getXLKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetSizeType"


    // $ANTLR start "entryRuleWidgetDisplayResult"
    // InternalRdl.g:4046:1: entryRuleWidgetDisplayResult returns [EObject current=null] : iv_ruleWidgetDisplayResult= ruleWidgetDisplayResult EOF ;
    public final EObject entryRuleWidgetDisplayResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetDisplayResult = null;


        try {
            // InternalRdl.g:4046:60: (iv_ruleWidgetDisplayResult= ruleWidgetDisplayResult EOF )
            // InternalRdl.g:4047:2: iv_ruleWidgetDisplayResult= ruleWidgetDisplayResult EOF
            {
             newCompositeNode(grammarAccess.getWidgetDisplayResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetDisplayResult=ruleWidgetDisplayResult();

            state._fsp--;

             current =iv_ruleWidgetDisplayResult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetDisplayResult"


    // $ANTLR start "ruleWidgetDisplayResult"
    // InternalRdl.g:4053:1: ruleWidgetDisplayResult returns [EObject current=null] : (otherlv_0= 'display_result' otherlv_1= ':' ( ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) ) ) ) ;
    public final EObject ruleWidgetDisplayResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_display_result_2_1=null;
        Token lv_display_result_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:4059:2: ( (otherlv_0= 'display_result' otherlv_1= ':' ( ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:4060:2: (otherlv_0= 'display_result' otherlv_1= ':' ( ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:4060:2: (otherlv_0= 'display_result' otherlv_1= ':' ( ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) ) ) )
            // InternalRdl.g:4061:3: otherlv_0= 'display_result' otherlv_1= ':' ( ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetDisplayResultAccess().getDisplay_resultKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetDisplayResultAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4069:3: ( ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) ) )
            // InternalRdl.g:4070:4: ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) )
            {
            // InternalRdl.g:4070:4: ( (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' ) )
            // InternalRdl.g:4071:5: (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' )
            {
            // InternalRdl.g:4071:5: (lv_display_result_2_1= 'true' | lv_display_result_2_2= 'false' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            else if ( (LA60_0==44) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalRdl.g:4072:6: lv_display_result_2_1= 'true'
                    {
                    lv_display_result_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_display_result_2_1, grammarAccess.getWidgetDisplayResultAccess().getDisplay_resultTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetDisplayResultRule());
                    						}
                    						setWithLastConsumed(current, "display_result", lv_display_result_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4083:6: lv_display_result_2_2= 'false'
                    {
                    lv_display_result_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_display_result_2_2, grammarAccess.getWidgetDisplayResultAccess().getDisplay_resultFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWidgetDisplayResultRule());
                    						}
                    						setWithLastConsumed(current, "display_result", lv_display_result_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetDisplayResult"


    // $ANTLR start "entryRuleDATE"
    // InternalRdl.g:4100:1: entryRuleDATE returns [EObject current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final EObject entryRuleDATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATE = null;


        try {
            // InternalRdl.g:4100:45: (iv_ruleDATE= ruleDATE EOF )
            // InternalRdl.g:4101:2: iv_ruleDATE= ruleDATE EOF
            {
             newCompositeNode(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDATE=ruleDATE();

            state._fsp--;

             current =iv_ruleDATE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalRdl.g:4107:1: ruleDATE returns [EObject current=null] : ( ( () ( (lv_date_1_0= RULE_DATETIME ) ) ) | ( (lv_now_2_0= 'Now' ) ) ) ;
    public final EObject ruleDATE() throws RecognitionException {
        EObject current = null;

        Token lv_date_1_0=null;
        Token lv_now_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:4113:2: ( ( ( () ( (lv_date_1_0= RULE_DATETIME ) ) ) | ( (lv_now_2_0= 'Now' ) ) ) )
            // InternalRdl.g:4114:2: ( ( () ( (lv_date_1_0= RULE_DATETIME ) ) ) | ( (lv_now_2_0= 'Now' ) ) )
            {
            // InternalRdl.g:4114:2: ( ( () ( (lv_date_1_0= RULE_DATETIME ) ) ) | ( (lv_now_2_0= 'Now' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_DATETIME) ) {
                alt61=1;
            }
            else if ( (LA61_0==72) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalRdl.g:4115:3: ( () ( (lv_date_1_0= RULE_DATETIME ) ) )
                    {
                    // InternalRdl.g:4115:3: ( () ( (lv_date_1_0= RULE_DATETIME ) ) )
                    // InternalRdl.g:4116:4: () ( (lv_date_1_0= RULE_DATETIME ) )
                    {
                    // InternalRdl.g:4116:4: ()
                    // InternalRdl.g:4117:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDATEAccess().getDATEAction_0_0(),
                    						current);
                    				

                    }

                    // InternalRdl.g:4123:4: ( (lv_date_1_0= RULE_DATETIME ) )
                    // InternalRdl.g:4124:5: (lv_date_1_0= RULE_DATETIME )
                    {
                    // InternalRdl.g:4124:5: (lv_date_1_0= RULE_DATETIME )
                    // InternalRdl.g:4125:6: lv_date_1_0= RULE_DATETIME
                    {
                    lv_date_1_0=(Token)match(input,RULE_DATETIME,FOLLOW_2); 

                    						newLeafNode(lv_date_1_0, grammarAccess.getDATEAccess().getDateDATETIMETerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDATERule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"date",
                    							lv_date_1_0,
                    							"com.softtek.Rdl.DATETIME");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdl.g:4143:3: ( (lv_now_2_0= 'Now' ) )
                    {
                    // InternalRdl.g:4143:3: ( (lv_now_2_0= 'Now' ) )
                    // InternalRdl.g:4144:4: (lv_now_2_0= 'Now' )
                    {
                    // InternalRdl.g:4144:4: (lv_now_2_0= 'Now' )
                    // InternalRdl.g:4145:5: lv_now_2_0= 'Now'
                    {
                    lv_now_2_0=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_now_2_0, grammarAccess.getDATEAccess().getNowNowKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDATERule());
                    					}
                    					setWithLastConsumed(current, "now", lv_now_2_0, "Now");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleActionSearch"
    // InternalRdl.g:4161:1: entryRuleActionSearch returns [EObject current=null] : iv_ruleActionSearch= ruleActionSearch EOF ;
    public final EObject entryRuleActionSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSearch = null;


        try {
            // InternalRdl.g:4161:53: (iv_ruleActionSearch= ruleActionSearch EOF )
            // InternalRdl.g:4162:2: iv_ruleActionSearch= ruleActionSearch EOF
            {
             newCompositeNode(grammarAccess.getActionSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionSearch=ruleActionSearch();

            state._fsp--;

             current =iv_ruleActionSearch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionSearch"


    // $ANTLR start "ruleActionSearch"
    // InternalRdl.g:4168:1: ruleActionSearch returns [EObject current=null] : (otherlv_0= 'search' otherlv_1= ':' ( ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) ) ) ) ;
    public final EObject ruleActionSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;


        	enterRule();

        try {
            // InternalRdl.g:4174:2: ( (otherlv_0= 'search' otherlv_1= ':' ( ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) ) ) ) )
            // InternalRdl.g:4175:2: (otherlv_0= 'search' otherlv_1= ':' ( ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) ) ) )
            {
            // InternalRdl.g:4175:2: (otherlv_0= 'search' otherlv_1= ':' ( ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) ) ) )
            // InternalRdl.g:4176:3: otherlv_0= 'search' otherlv_1= ':' ( ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionSearchAccess().getSearchKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getActionSearchAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4184:3: ( ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) ) )
            // InternalRdl.g:4185:4: ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) )
            {
            // InternalRdl.g:4185:4: ( (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' ) )
            // InternalRdl.g:4186:5: (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' )
            {
            // InternalRdl.g:4186:5: (lv_value_2_1= 'Simple' | lv_value_2_2= 'Complex' | lv_value_2_3= 'None' )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt62=1;
                }
                break;
            case 75:
                {
                alt62=2;
                }
                break;
            case 76:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalRdl.g:4187:6: lv_value_2_1= 'Simple'
                    {
                    lv_value_2_1=(Token)match(input,74,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getActionSearchAccess().getValueSimpleKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionSearchRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4198:6: lv_value_2_2= 'Complex'
                    {
                    lv_value_2_2=(Token)match(input,75,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getActionSearchAccess().getValueComplexKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionSearchRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRdl.g:4209:6: lv_value_2_3= 'None'
                    {
                    lv_value_2_3=(Token)match(input,76,FOLLOW_2); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getActionSearchAccess().getValueNoneKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionSearchRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionSearch"


    // $ANTLR start "entryRuleActionAdd"
    // InternalRdl.g:4226:1: entryRuleActionAdd returns [EObject current=null] : iv_ruleActionAdd= ruleActionAdd EOF ;
    public final EObject entryRuleActionAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAdd = null;


        try {
            // InternalRdl.g:4226:50: (iv_ruleActionAdd= ruleActionAdd EOF )
            // InternalRdl.g:4227:2: iv_ruleActionAdd= ruleActionAdd EOF
            {
             newCompositeNode(grammarAccess.getActionAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionAdd=ruleActionAdd();

            state._fsp--;

             current =iv_ruleActionAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionAdd"


    // $ANTLR start "ruleActionAdd"
    // InternalRdl.g:4233:1: ruleActionAdd returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleActionAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:4239:2: ( (otherlv_0= 'add' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:4240:2: (otherlv_0= 'add' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:4240:2: (otherlv_0= 'add' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalRdl.g:4241:3: otherlv_0= 'add' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAddAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAddAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4249:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalRdl.g:4250:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalRdl.g:4250:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalRdl.g:4251:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalRdl.g:4251:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                alt63=1;
            }
            else if ( (LA63_0==44) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalRdl.g:4252:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getActionAddAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionAddRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4263:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getActionAddAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionAddRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionAdd"


    // $ANTLR start "entryRuleActionEdit"
    // InternalRdl.g:4280:1: entryRuleActionEdit returns [EObject current=null] : iv_ruleActionEdit= ruleActionEdit EOF ;
    public final EObject entryRuleActionEdit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionEdit = null;


        try {
            // InternalRdl.g:4280:51: (iv_ruleActionEdit= ruleActionEdit EOF )
            // InternalRdl.g:4281:2: iv_ruleActionEdit= ruleActionEdit EOF
            {
             newCompositeNode(grammarAccess.getActionEditRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionEdit=ruleActionEdit();

            state._fsp--;

             current =iv_ruleActionEdit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionEdit"


    // $ANTLR start "ruleActionEdit"
    // InternalRdl.g:4287:1: ruleActionEdit returns [EObject current=null] : (otherlv_0= 'edit' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleActionEdit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:4293:2: ( (otherlv_0= 'edit' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:4294:2: (otherlv_0= 'edit' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:4294:2: (otherlv_0= 'edit' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalRdl.g:4295:3: otherlv_0= 'edit' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionEditAccess().getEditKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getActionEditAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4303:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalRdl.g:4304:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalRdl.g:4304:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalRdl.g:4305:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalRdl.g:4305:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==43) ) {
                alt64=1;
            }
            else if ( (LA64_0==44) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalRdl.g:4306:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getActionEditAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionEditRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4317:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getActionEditAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionEditRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionEdit"


    // $ANTLR start "entryRuleActionDelete"
    // InternalRdl.g:4334:1: entryRuleActionDelete returns [EObject current=null] : iv_ruleActionDelete= ruleActionDelete EOF ;
    public final EObject entryRuleActionDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDelete = null;


        try {
            // InternalRdl.g:4334:53: (iv_ruleActionDelete= ruleActionDelete EOF )
            // InternalRdl.g:4335:2: iv_ruleActionDelete= ruleActionDelete EOF
            {
             newCompositeNode(grammarAccess.getActionDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDelete=ruleActionDelete();

            state._fsp--;

             current =iv_ruleActionDelete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionDelete"


    // $ANTLR start "ruleActionDelete"
    // InternalRdl.g:4341:1: ruleActionDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleActionDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:4347:2: ( (otherlv_0= 'delete' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:4348:2: (otherlv_0= 'delete' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:4348:2: (otherlv_0= 'delete' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalRdl.g:4349:3: otherlv_0= 'delete' otherlv_1= ':' ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDeleteAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getActionDeleteAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4357:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalRdl.g:4358:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalRdl.g:4358:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalRdl.g:4359:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalRdl.g:4359:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            else if ( (LA65_0==44) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalRdl.g:4360:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getActionDeleteAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionDeleteRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4371:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getActionDeleteAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionDeleteRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionDelete"


    // $ANTLR start "entryRuleAction"
    // InternalRdl.g:4388:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRdl.g:4388:47: (iv_ruleAction= ruleAction EOF )
            // InternalRdl.g:4389:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRdl.g:4395:1: ruleAction returns [EObject current=null] : (this_ActionSearch_0= ruleActionSearch | this_ActionAdd_1= ruleActionAdd | this_ActionEdit_2= ruleActionEdit | this_ActionDelete_3= ruleActionDelete ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionSearch_0 = null;

        EObject this_ActionAdd_1 = null;

        EObject this_ActionEdit_2 = null;

        EObject this_ActionDelete_3 = null;



        	enterRule();

        try {
            // InternalRdl.g:4401:2: ( (this_ActionSearch_0= ruleActionSearch | this_ActionAdd_1= ruleActionAdd | this_ActionEdit_2= ruleActionEdit | this_ActionDelete_3= ruleActionDelete ) )
            // InternalRdl.g:4402:2: (this_ActionSearch_0= ruleActionSearch | this_ActionAdd_1= ruleActionAdd | this_ActionEdit_2= ruleActionEdit | this_ActionDelete_3= ruleActionDelete )
            {
            // InternalRdl.g:4402:2: (this_ActionSearch_0= ruleActionSearch | this_ActionAdd_1= ruleActionAdd | this_ActionEdit_2= ruleActionEdit | this_ActionDelete_3= ruleActionDelete )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt66=1;
                }
                break;
            case 77:
                {
                alt66=2;
                }
                break;
            case 78:
                {
                alt66=3;
                }
                break;
            case 79:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalRdl.g:4403:3: this_ActionSearch_0= ruleActionSearch
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionSearchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSearch_0=ruleActionSearch();

                    state._fsp--;


                    			current = this_ActionSearch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4412:3: this_ActionAdd_1= ruleActionAdd
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionAddParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionAdd_1=ruleActionAdd();

                    state._fsp--;


                    			current = this_ActionAdd_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdl.g:4421:3: this_ActionEdit_2= ruleActionEdit
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionEditParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionEdit_2=ruleActionEdit();

                    state._fsp--;


                    			current = this_ActionEdit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdl.g:4430:3: this_ActionDelete_3= ruleActionDelete
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionDeleteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionDelete_3=ruleActionDelete();

                    state._fsp--;


                    			current = this_ActionDelete_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActions"
    // InternalRdl.g:4442:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalRdl.g:4442:48: (iv_ruleActions= ruleActions EOF )
            // InternalRdl.g:4443:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalRdl.g:4449:1: ruleActions returns [EObject current=null] : (otherlv_0= 'scaffold' otherlv_1= '(' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_action_4_0= ruleAction ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_action_2_0 = null;

        EObject lv_action_4_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:4455:2: ( (otherlv_0= 'scaffold' otherlv_1= '(' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_action_4_0= ruleAction ) ) )* otherlv_5= ')' ) )
            // InternalRdl.g:4456:2: (otherlv_0= 'scaffold' otherlv_1= '(' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_action_4_0= ruleAction ) ) )* otherlv_5= ')' )
            {
            // InternalRdl.g:4456:2: (otherlv_0= 'scaffold' otherlv_1= '(' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_action_4_0= ruleAction ) ) )* otherlv_5= ')' )
            // InternalRdl.g:4457:3: otherlv_0= 'scaffold' otherlv_1= '(' ( (lv_action_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_action_4_0= ruleAction ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getActionsAccess().getScaffoldKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRdl.g:4465:3: ( (lv_action_2_0= ruleAction ) )
            // InternalRdl.g:4466:4: (lv_action_2_0= ruleAction )
            {
            // InternalRdl.g:4466:4: (lv_action_2_0= ruleAction )
            // InternalRdl.g:4467:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getActionsAccess().getActionActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_action_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionsRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_2_0,
            						"com.softtek.Rdl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRdl.g:4484:3: (otherlv_3= ',' ( (lv_action_4_0= ruleAction ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==23) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalRdl.g:4485:4: otherlv_3= ',' ( (lv_action_4_0= ruleAction ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_56); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionsAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRdl.g:4489:4: ( (lv_action_4_0= ruleAction ) )
            	    // InternalRdl.g:4490:5: (lv_action_4_0= ruleAction )
            	    {
            	    // InternalRdl.g:4490:5: (lv_action_4_0= ruleAction )
            	    // InternalRdl.g:4491:6: lv_action_4_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getActionsAccess().getActionActionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_action_4_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_4_0,
            	    							"com.softtek.Rdl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionsAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleDBMapEntity"
    // InternalRdl.g:4517:1: entryRuleDBMapEntity returns [EObject current=null] : iv_ruleDBMapEntity= ruleDBMapEntity EOF ;
    public final EObject entryRuleDBMapEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBMapEntity = null;


        try {
            // InternalRdl.g:4517:52: (iv_ruleDBMapEntity= ruleDBMapEntity EOF )
            // InternalRdl.g:4518:2: iv_ruleDBMapEntity= ruleDBMapEntity EOF
            {
             newCompositeNode(grammarAccess.getDBMapEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBMapEntity=ruleDBMapEntity();

            state._fsp--;

             current =iv_ruleDBMapEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBMapEntity"


    // $ANTLR start "ruleDBMapEntity"
    // InternalRdl.g:4524:1: ruleDBMapEntity returns [EObject current=null] : (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'table' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' ) ) ) ;
    public final EObject ruleDBMapEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_table_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_dbmap_attrs_7_0 = null;

        EObject lv_dbmap_attrs_9_0 = null;



        	enterRule();

        try {
            // InternalRdl.g:4530:2: ( (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'table' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' ) ) ) )
            // InternalRdl.g:4531:2: (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'table' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' ) ) )
            {
            // InternalRdl.g:4531:2: (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'table' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' ) ) )
            // InternalRdl.g:4532:3: otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'table' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDBMapEntityAccess().getDb_mapKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getDBMapEntityAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,82,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDBMapEntityAccess().getTableKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDBMapEntityAccess().getColonKeyword_3());
            		
            // InternalRdl.g:4548:3: ( (lv_table_4_0= RULE_STRING ) )
            // InternalRdl.g:4549:4: (lv_table_4_0= RULE_STRING )
            {
            // InternalRdl.g:4549:4: (lv_table_4_0= RULE_STRING )
            // InternalRdl.g:4550:5: lv_table_4_0= RULE_STRING
            {
            lv_table_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_table_4_0, grammarAccess.getDBMapEntityAccess().getTableSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDBMapEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRdl.g:4566:3: (otherlv_5= ')' | (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==24) ) {
                alt69=1;
            }
            else if ( (LA69_0==23) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalRdl.g:4567:4: otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDBMapEntityAccess().getRightParenthesisKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4572:4: (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' )
                    {
                    // InternalRdl.g:4572:4: (otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')' )
                    // InternalRdl.g:4573:5: otherlv_6= ',' ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) ) (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_58); 

                    					newLeafNode(otherlv_6, grammarAccess.getDBMapEntityAccess().getCommaKeyword_5_1_0());
                    				
                    // InternalRdl.g:4577:5: ( (lv_dbmap_attrs_7_0= ruleDBMapAttr ) )
                    // InternalRdl.g:4578:6: (lv_dbmap_attrs_7_0= ruleDBMapAttr )
                    {
                    // InternalRdl.g:4578:6: (lv_dbmap_attrs_7_0= ruleDBMapAttr )
                    // InternalRdl.g:4579:7: lv_dbmap_attrs_7_0= ruleDBMapAttr
                    {

                    							newCompositeNode(grammarAccess.getDBMapEntityAccess().getDbmap_attrsDBMapAttrParserRuleCall_5_1_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_dbmap_attrs_7_0=ruleDBMapAttr();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDBMapEntityRule());
                    							}
                    							add(
                    								current,
                    								"dbmap_attrs",
                    								lv_dbmap_attrs_7_0,
                    								"com.softtek.Rdl.DBMapAttr");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRdl.g:4596:5: (otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==23) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalRdl.g:4597:6: otherlv_8= ',' ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_58); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getDBMapEntityAccess().getCommaKeyword_5_1_2_0());
                    	    					
                    	    // InternalRdl.g:4601:6: ( (lv_dbmap_attrs_9_0= ruleDBMapAttr ) )
                    	    // InternalRdl.g:4602:7: (lv_dbmap_attrs_9_0= ruleDBMapAttr )
                    	    {
                    	    // InternalRdl.g:4602:7: (lv_dbmap_attrs_9_0= ruleDBMapAttr )
                    	    // InternalRdl.g:4603:8: lv_dbmap_attrs_9_0= ruleDBMapAttr
                    	    {

                    	    								newCompositeNode(grammarAccess.getDBMapEntityAccess().getDbmap_attrsDBMapAttrParserRuleCall_5_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_dbmap_attrs_9_0=ruleDBMapAttr();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDBMapEntityRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"dbmap_attrs",
                    	    									lv_dbmap_attrs_9_0,
                    	    									"com.softtek.Rdl.DBMapAttr");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getDBMapEntityAccess().getRightParenthesisKeyword_5_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBMapEntity"


    // $ANTLR start "entryRuleDBMapAttr"
    // InternalRdl.g:4631:1: entryRuleDBMapAttr returns [EObject current=null] : iv_ruleDBMapAttr= ruleDBMapAttr EOF ;
    public final EObject entryRuleDBMapAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBMapAttr = null;


        try {
            // InternalRdl.g:4631:50: (iv_ruleDBMapAttr= ruleDBMapAttr EOF )
            // InternalRdl.g:4632:2: iv_ruleDBMapAttr= ruleDBMapAttr EOF
            {
             newCompositeNode(grammarAccess.getDBMapAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBMapAttr=ruleDBMapAttr();

            state._fsp--;

             current =iv_ruleDBMapAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBMapAttr"


    // $ANTLR start "ruleDBMapAttr"
    // InternalRdl.g:4638:1: ruleDBMapAttr returns [EObject current=null] : (this_DBMapAttrIdentity_0= ruleDBMapAttrIdentity | this_DBMapAttrAutoId_1= ruleDBMapAttrAutoId ) ;
    public final EObject ruleDBMapAttr() throws RecognitionException {
        EObject current = null;

        EObject this_DBMapAttrIdentity_0 = null;

        EObject this_DBMapAttrAutoId_1 = null;



        	enterRule();

        try {
            // InternalRdl.g:4644:2: ( (this_DBMapAttrIdentity_0= ruleDBMapAttrIdentity | this_DBMapAttrAutoId_1= ruleDBMapAttrAutoId ) )
            // InternalRdl.g:4645:2: (this_DBMapAttrIdentity_0= ruleDBMapAttrIdentity | this_DBMapAttrAutoId_1= ruleDBMapAttrAutoId )
            {
            // InternalRdl.g:4645:2: (this_DBMapAttrIdentity_0= ruleDBMapAttrIdentity | this_DBMapAttrAutoId_1= ruleDBMapAttrAutoId )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==83) ) {
                alt70=1;
            }
            else if ( (LA70_0==84) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalRdl.g:4646:3: this_DBMapAttrIdentity_0= ruleDBMapAttrIdentity
                    {

                    			newCompositeNode(grammarAccess.getDBMapAttrAccess().getDBMapAttrIdentityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DBMapAttrIdentity_0=ruleDBMapAttrIdentity();

                    state._fsp--;


                    			current = this_DBMapAttrIdentity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4655:3: this_DBMapAttrAutoId_1= ruleDBMapAttrAutoId
                    {

                    			newCompositeNode(grammarAccess.getDBMapAttrAccess().getDBMapAttrAutoIdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DBMapAttrAutoId_1=ruleDBMapAttrAutoId();

                    state._fsp--;


                    			current = this_DBMapAttrAutoId_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBMapAttr"


    // $ANTLR start "entryRuleDBMapAttrIdentity"
    // InternalRdl.g:4667:1: entryRuleDBMapAttrIdentity returns [EObject current=null] : iv_ruleDBMapAttrIdentity= ruleDBMapAttrIdentity EOF ;
    public final EObject entryRuleDBMapAttrIdentity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBMapAttrIdentity = null;


        try {
            // InternalRdl.g:4667:58: (iv_ruleDBMapAttrIdentity= ruleDBMapAttrIdentity EOF )
            // InternalRdl.g:4668:2: iv_ruleDBMapAttrIdentity= ruleDBMapAttrIdentity EOF
            {
             newCompositeNode(grammarAccess.getDBMapAttrIdentityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBMapAttrIdentity=ruleDBMapAttrIdentity();

            state._fsp--;

             current =iv_ruleDBMapAttrIdentity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBMapAttrIdentity"


    // $ANTLR start "ruleDBMapAttrIdentity"
    // InternalRdl.g:4674:1: ruleDBMapAttrIdentity returns [EObject current=null] : (otherlv_0= 'identity' otherlv_1= ':' ( (lv_identity_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDBMapAttrIdentity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_identity_2_0=null;


        	enterRule();

        try {
            // InternalRdl.g:4680:2: ( (otherlv_0= 'identity' otherlv_1= ':' ( (lv_identity_2_0= RULE_STRING ) ) ) )
            // InternalRdl.g:4681:2: (otherlv_0= 'identity' otherlv_1= ':' ( (lv_identity_2_0= RULE_STRING ) ) )
            {
            // InternalRdl.g:4681:2: (otherlv_0= 'identity' otherlv_1= ':' ( (lv_identity_2_0= RULE_STRING ) ) )
            // InternalRdl.g:4682:3: otherlv_0= 'identity' otherlv_1= ':' ( (lv_identity_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDBMapAttrIdentityAccess().getIdentityKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDBMapAttrIdentityAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4690:3: ( (lv_identity_2_0= RULE_STRING ) )
            // InternalRdl.g:4691:4: (lv_identity_2_0= RULE_STRING )
            {
            // InternalRdl.g:4691:4: (lv_identity_2_0= RULE_STRING )
            // InternalRdl.g:4692:5: lv_identity_2_0= RULE_STRING
            {
            lv_identity_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_identity_2_0, grammarAccess.getDBMapAttrIdentityAccess().getIdentitySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDBMapAttrIdentityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identity",
            						lv_identity_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBMapAttrIdentity"


    // $ANTLR start "entryRuleDBMapAttrAutoId"
    // InternalRdl.g:4712:1: entryRuleDBMapAttrAutoId returns [EObject current=null] : iv_ruleDBMapAttrAutoId= ruleDBMapAttrAutoId EOF ;
    public final EObject entryRuleDBMapAttrAutoId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBMapAttrAutoId = null;


        try {
            // InternalRdl.g:4712:56: (iv_ruleDBMapAttrAutoId= ruleDBMapAttrAutoId EOF )
            // InternalRdl.g:4713:2: iv_ruleDBMapAttrAutoId= ruleDBMapAttrAutoId EOF
            {
             newCompositeNode(grammarAccess.getDBMapAttrAutoIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBMapAttrAutoId=ruleDBMapAttrAutoId();

            state._fsp--;

             current =iv_ruleDBMapAttrAutoId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBMapAttrAutoId"


    // $ANTLR start "ruleDBMapAttrAutoId"
    // InternalRdl.g:4719:1: ruleDBMapAttrAutoId returns [EObject current=null] : (otherlv_0= 'auto_id' otherlv_1= ':' ( ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) ) ) ) ;
    public final EObject ruleDBMapAttrAutoId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_autoid_2_1=null;
        Token lv_autoid_2_2=null;


        	enterRule();

        try {
            // InternalRdl.g:4725:2: ( (otherlv_0= 'auto_id' otherlv_1= ':' ( ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) ) ) ) )
            // InternalRdl.g:4726:2: (otherlv_0= 'auto_id' otherlv_1= ':' ( ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) ) ) )
            {
            // InternalRdl.g:4726:2: (otherlv_0= 'auto_id' otherlv_1= ':' ( ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) ) ) )
            // InternalRdl.g:4727:3: otherlv_0= 'auto_id' otherlv_1= ':' ( ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDBMapAttrAutoIdAccess().getAuto_idKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getDBMapAttrAutoIdAccess().getColonKeyword_1());
            		
            // InternalRdl.g:4735:3: ( ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) ) )
            // InternalRdl.g:4736:4: ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) )
            {
            // InternalRdl.g:4736:4: ( (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' ) )
            // InternalRdl.g:4737:5: (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' )
            {
            // InternalRdl.g:4737:5: (lv_autoid_2_1= 'true' | lv_autoid_2_2= 'false' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            else if ( (LA71_0==44) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalRdl.g:4738:6: lv_autoid_2_1= 'true'
                    {
                    lv_autoid_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_autoid_2_1, grammarAccess.getDBMapAttrAutoIdAccess().getAutoidTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBMapAttrAutoIdRule());
                    						}
                    						setWithLastConsumed(current, "autoid", lv_autoid_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4749:6: lv_autoid_2_2= 'false'
                    {
                    lv_autoid_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_autoid_2_2, grammarAccess.getDBMapAttrAutoIdAccess().getAutoidFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBMapAttrAutoIdRule());
                    						}
                    						setWithLastConsumed(current, "autoid", lv_autoid_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBMapAttrAutoId"


    // $ANTLR start "entryRuleDBMapField"
    // InternalRdl.g:4766:1: entryRuleDBMapField returns [EObject current=null] : iv_ruleDBMapField= ruleDBMapField EOF ;
    public final EObject entryRuleDBMapField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBMapField = null;


        try {
            // InternalRdl.g:4766:51: (iv_ruleDBMapField= ruleDBMapField EOF )
            // InternalRdl.g:4767:2: iv_ruleDBMapField= ruleDBMapField EOF
            {
             newCompositeNode(grammarAccess.getDBMapFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBMapField=ruleDBMapField();

            state._fsp--;

             current =iv_ruleDBMapField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBMapField"


    // $ANTLR start "ruleDBMapField"
    // InternalRdl.g:4773:1: ruleDBMapField returns [EObject current=null] : (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'field' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' ) ) ) ;
    public final EObject ruleDBMapField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_table_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_pk_9_1=null;
        Token lv_pk_9_2=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalRdl.g:4779:2: ( (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'field' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' ) ) ) )
            // InternalRdl.g:4780:2: (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'field' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' ) ) )
            {
            // InternalRdl.g:4780:2: (otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'field' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' ) ) )
            // InternalRdl.g:4781:3: otherlv_0= 'db_map' otherlv_1= '(' otherlv_2= 'field' otherlv_3= ':' ( (lv_table_4_0= RULE_STRING ) ) (otherlv_5= ')' | (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDBMapFieldAccess().getDb_mapKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getDBMapFieldAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDBMapFieldAccess().getFieldKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDBMapFieldAccess().getColonKeyword_3());
            		
            // InternalRdl.g:4797:3: ( (lv_table_4_0= RULE_STRING ) )
            // InternalRdl.g:4798:4: (lv_table_4_0= RULE_STRING )
            {
            // InternalRdl.g:4798:4: (lv_table_4_0= RULE_STRING )
            // InternalRdl.g:4799:5: lv_table_4_0= RULE_STRING
            {
            lv_table_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_table_4_0, grammarAccess.getDBMapFieldAccess().getTableSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDBMapFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRdl.g:4815:3: (otherlv_5= ')' | (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            else if ( (LA73_0==23) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalRdl.g:4816:4: otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDBMapFieldAccess().getRightParenthesisKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRdl.g:4821:4: (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' )
                    {
                    // InternalRdl.g:4821:4: (otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')' )
                    // InternalRdl.g:4822:5: otherlv_6= ',' otherlv_7= 'pk' otherlv_8= ':' ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_60); 

                    					newLeafNode(otherlv_6, grammarAccess.getDBMapFieldAccess().getCommaKeyword_5_1_0());
                    				
                    otherlv_7=(Token)match(input,85,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getDBMapFieldAccess().getPkKeyword_5_1_1());
                    				
                    otherlv_8=(Token)match(input,17,FOLLOW_39); 

                    					newLeafNode(otherlv_8, grammarAccess.getDBMapFieldAccess().getColonKeyword_5_1_2());
                    				
                    // InternalRdl.g:4834:5: ( ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) ) )
                    // InternalRdl.g:4835:6: ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) )
                    {
                    // InternalRdl.g:4835:6: ( (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' ) )
                    // InternalRdl.g:4836:7: (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' )
                    {
                    // InternalRdl.g:4836:7: (lv_pk_9_1= 'true' | lv_pk_9_2= 'false' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==43) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==44) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalRdl.g:4837:8: lv_pk_9_1= 'true'
                            {
                            lv_pk_9_1=(Token)match(input,43,FOLLOW_43); 

                            								newLeafNode(lv_pk_9_1, grammarAccess.getDBMapFieldAccess().getPkTrueKeyword_5_1_3_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDBMapFieldRule());
                            								}
                            								setWithLastConsumed(current, "pk", lv_pk_9_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalRdl.g:4848:8: lv_pk_9_2= 'false'
                            {
                            lv_pk_9_2=(Token)match(input,44,FOLLOW_43); 

                            								newLeafNode(lv_pk_9_2, grammarAccess.getDBMapFieldAccess().getPkFalseKeyword_5_1_3_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDBMapFieldRule());
                            								}
                            								setWithLastConsumed(current, "pk", lv_pk_9_2, null);
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getDBMapFieldAccess().getRightParenthesisKeyword_5_1_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBMapField"


    // $ANTLR start "entryRuleDataDomain"
    // InternalRdl.g:4871:1: entryRuleDataDomain returns [EObject current=null] : iv_ruleDataDomain= ruleDataDomain EOF ;
    public final EObject entryRuleDataDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDomain = null;


        try {
            // InternalRdl.g:4871:51: (iv_ruleDataDomain= ruleDataDomain EOF )
            // InternalRdl.g:4872:2: iv_ruleDataDomain= ruleDataDomain EOF
            {
             newCompositeNode(grammarAccess.getDataDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDomain=ruleDataDomain();

            state._fsp--;

             current =iv_ruleDataDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDomain"


    // $ANTLR start "ruleDataDomain"
    // InternalRdl.g:4878:1: ruleDataDomain returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '(' otherlv_2= 'domain' otherlv_3= ':' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleDataDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_domain_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRdl.g:4884:2: ( (otherlv_0= 'data' otherlv_1= '(' otherlv_2= 'domain' otherlv_3= ':' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalRdl.g:4885:2: (otherlv_0= 'data' otherlv_1= '(' otherlv_2= 'domain' otherlv_3= ':' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalRdl.g:4885:2: (otherlv_0= 'data' otherlv_1= '(' otherlv_2= 'domain' otherlv_3= ':' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalRdl.g:4886:3: otherlv_0= 'data' otherlv_1= '(' otherlv_2= 'domain' otherlv_3= ':' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDataDomainAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDomainAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDataDomainAccess().getDomainKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDataDomainAccess().getColonKeyword_3());
            		
            // InternalRdl.g:4902:3: ( (lv_domain_4_0= RULE_STRING ) )
            // InternalRdl.g:4903:4: (lv_domain_4_0= RULE_STRING )
            {
            // InternalRdl.g:4903:4: (lv_domain_4_0= RULE_STRING )
            // InternalRdl.g:4904:5: lv_domain_4_0= RULE_STRING
            {
            lv_domain_4_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_domain_4_0, grammarAccess.getDataDomainAccess().getDomainSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"domain",
            						lv_domain_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataDomainAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDomain"


    // $ANTLR start "entryRuleBusinessRule"
    // InternalRdl.g:4928:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalRdl.g:4928:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalRdl.g:4929:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // InternalRdl.g:4935:1: ruleBusinessRule returns [EObject current=null] : (otherlv_0= 'business_rule' otherlv_1= '(' otherlv_2= 'code' otherlv_3= ':' ( (lv_code_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_code_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRdl.g:4941:2: ( (otherlv_0= 'business_rule' otherlv_1= '(' otherlv_2= 'code' otherlv_3= ':' ( (lv_code_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // InternalRdl.g:4942:2: (otherlv_0= 'business_rule' otherlv_1= '(' otherlv_2= 'code' otherlv_3= ':' ( (lv_code_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // InternalRdl.g:4942:2: (otherlv_0= 'business_rule' otherlv_1= '(' otherlv_2= 'code' otherlv_3= ':' ( (lv_code_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // InternalRdl.g:4943:3: otherlv_0= 'business_rule' otherlv_1= '(' otherlv_2= 'code' otherlv_3= ':' ( (lv_code_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessRuleAccess().getBusiness_ruleKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessRuleAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,89,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBusinessRuleAccess().getCodeKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getColonKeyword_3());
            		
            // InternalRdl.g:4959:3: ( (lv_code_4_0= RULE_STRING ) )
            // InternalRdl.g:4960:4: (lv_code_4_0= RULE_STRING )
            {
            // InternalRdl.g:4960:4: (lv_code_4_0= RULE_STRING )
            // InternalRdl.g:4961:5: lv_code_4_0= RULE_STRING
            {
            lv_code_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_code_4_0, grammarAccess.getBusinessRuleAccess().getCodeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getBusinessRuleAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getBusinessRuleAccess().getDescriptionKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getBusinessRuleAccess().getColonKeyword_7());
            		
            // InternalRdl.g:4989:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalRdl.g:4990:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalRdl.g:4990:4: (lv_description_8_0= RULE_STRING )
            // InternalRdl.g:4991:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_description_8_0, grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBusinessRuleAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessRule"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\31\1\uffff\1\4\1\21\1\32\11\uffff";
    static final String dfa_3s = "\1\36\1\uffff\1\4\1\21\1\51\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\5\1\12\1\4\1\11\1\10\1\7\1\6";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\4\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5\1\6\1\11\7\uffff\1\7\1\15\1\14\1\13\1\12\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "662:2: (this_EntityReferenceField_0= ruleEntityReferenceField | this_EntityTextField_1= ruleEntityTextField | this_EntityLongTextField_2= ruleEntityLongTextField | this_EntityDateField_3= ruleEntityDateField | this_EntityImageField_4= ruleEntityImageField | this_EntityFileField_5= ruleEntityFileField | this_EntityEmailField_6= ruleEntityEmailField | this_EntityDecimalField_7= ruleEntityDecimalField | this_EntityIntegerField_8= ruleEntityIntegerField | this_EntityCurrencyField_9= ruleEntityCurrencyField )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000042000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000042084000L,0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000E40000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000200000L,0x0000000001420001L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000204000L,0x0000000001420001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000020200000L,0x0000000001420001L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000020204000L,0x0000000001420001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400002002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x6000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0038000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0078000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x9038000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0038000000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});

}