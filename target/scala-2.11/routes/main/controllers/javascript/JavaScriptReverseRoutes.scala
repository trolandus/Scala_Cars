
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Cars/conf/routes
// @DATE:Tue May 17 11:53:36 CEST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseSearchingForm(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def loadForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchingForm.loadForm",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showForm"})
          }
        
        }
      """
    )
  
    // @LINE:10
    def showForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchingForm.showForm",
      """
        function(manu0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showForm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("manu", encodeURIComponent(manu0))})
        }
      """
    )
  
    // @LINE:12
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchingForm.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:14
    def showResults: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchingForm.showResults",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showResults"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
