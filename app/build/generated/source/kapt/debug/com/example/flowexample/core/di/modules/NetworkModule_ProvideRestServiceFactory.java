// Generated by Dagger (https://dagger.dev).
package com.example.flowexample.core.di.modules;

import android.content.Context;
import com.example.flowexample.core.App;
import com.example.flowexample.core.api.RestWebService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRestServiceFactory implements Factory<RestWebService> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  private final Provider<App> appProvider;

  public NetworkModule_ProvideRestServiceFactory(NetworkModule module,
      Provider<Context> contextProvider, Provider<App> appProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.appProvider = appProvider;
  }

  @Override
  public RestWebService get() {
    return provideRestService(module, contextProvider.get(), appProvider.get());
  }

  public static NetworkModule_ProvideRestServiceFactory create(NetworkModule module,
      Provider<Context> contextProvider, Provider<App> appProvider) {
    return new NetworkModule_ProvideRestServiceFactory(module, contextProvider, appProvider);
  }

  public static RestWebService provideRestService(NetworkModule instance, Context context,
      App app) {
    return Preconditions.checkNotNullFromProvides(instance.provideRestService(context, app));
  }
}
