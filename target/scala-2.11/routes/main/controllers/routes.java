
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Cars/conf/routes
// @DATE:Tue May 17 11:53:36 CEST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSearchingForm SearchingForm = new controllers.ReverseSearchingForm(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMainController MainController = new controllers.ReverseMainController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSearchingForm SearchingForm = new controllers.javascript.ReverseSearchingForm(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMainController MainController = new controllers.javascript.ReverseMainController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
