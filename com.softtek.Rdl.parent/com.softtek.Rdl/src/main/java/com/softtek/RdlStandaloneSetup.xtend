/*
 * generated by Xtext 2.16.0
 */
package com.softtek


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RdlStandaloneSetup extends RdlStandaloneSetupGenerated {

	def static void doSetup() {
		new RdlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
