/**
 * generated by Xtext 2.16.0
 */
package com.softtek.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.softtek.RdlRuntimeModule;
import com.softtek.RdlStandaloneSetup;
import com.softtek.ide.RdlIdeModule;
import com.softtek.web.RdlWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class RdlWebSetup extends RdlStandaloneSetup {
  @Override
  public Injector createInjector() {
    RdlRuntimeModule _rdlRuntimeModule = new RdlRuntimeModule();
    RdlIdeModule _rdlIdeModule = new RdlIdeModule();
    RdlWebModule _rdlWebModule = new RdlWebModule("PathFileToClone");
    return Guice.createInjector(Modules2.mixin(_rdlRuntimeModule, _rdlIdeModule, _rdlWebModule));
  }
}
