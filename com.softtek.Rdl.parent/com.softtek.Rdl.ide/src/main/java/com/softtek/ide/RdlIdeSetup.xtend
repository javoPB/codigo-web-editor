/*
 * generated by Xtext 2.16.0
 */
package com.softtek.ide

import com.google.inject.Guice
import com.softtek.RdlRuntimeModule
import com.softtek.RdlStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RdlIdeSetup extends RdlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RdlRuntimeModule, new RdlIdeModule))
	}
	
}
