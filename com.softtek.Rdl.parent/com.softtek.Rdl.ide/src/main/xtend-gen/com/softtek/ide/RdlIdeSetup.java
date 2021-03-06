/**
 * generated by Xtext 2.16.0
 */
package com.softtek.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.softtek.RdlRuntimeModule;
import com.softtek.RdlStandaloneSetup;
import com.softtek.ide.RdlIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RdlIdeSetup extends RdlStandaloneSetup {
  @Override
  public Injector createInjector() {
    RdlRuntimeModule _rdlRuntimeModule = new RdlRuntimeModule();
    RdlIdeModule _rdlIdeModule = new RdlIdeModule();
    return Guice.createInjector(Modules2.mixin(_rdlRuntimeModule, _rdlIdeModule));
  }
}
