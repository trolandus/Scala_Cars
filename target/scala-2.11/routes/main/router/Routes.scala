
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Cars/conf/routes
// @DATE:Tue May 17 11:53:36 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  MainController_0: controllers.MainController,
  // @LINE:8
  SearchingForm_1: controllers.SearchingForm,
  // @LINE:17
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    MainController_0: controllers.MainController,
    // @LINE:8
    SearchingForm_1: controllers.SearchingForm,
    // @LINE:17
    Assets_2: controllers.Assets
  ) = this(errorHandler, MainController_0, SearchingForm_1, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MainController_0, SearchingForm_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MainController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showForm""", """controllers.SearchingForm.loadForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showForm/""", """controllers.SearchingForm.loadForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showForm/""" + "$" + """manu<[^/]+>""", """controllers.SearchingForm.showForm(manu:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchingForm.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showResults""", """controllers.SearchingForm.showResults"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_MainController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MainController_index0_invoker = createInvoker(
    MainController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SearchingForm_loadForm1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showForm")))
  )
  private[this] lazy val controllers_SearchingForm_loadForm1_invoker = createInvoker(
    SearchingForm_1.loadForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchingForm",
      "loadForm",
      Nil,
      "GET",
      """""",
      this.prefix + """showForm"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_SearchingForm_loadForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showForm/")))
  )
  private[this] lazy val controllers_SearchingForm_loadForm2_invoker = createInvoker(
    SearchingForm_1.loadForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchingForm",
      "loadForm",
      Nil,
      "GET",
      """""",
      this.prefix + """showForm/"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SearchingForm_showForm3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showForm/"), DynamicPart("manu", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SearchingForm_showForm3_invoker = createInvoker(
    SearchingForm_1.showForm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchingForm",
      "showForm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """showForm/""" + "$" + """manu<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_SearchingForm_search4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchingForm_search4_invoker = createInvoker(
    SearchingForm_1.search,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchingForm",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SearchingForm_showResults5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showResults")))
  )
  private[this] lazy val controllers_SearchingForm_showResults5_invoker = createInvoker(
    SearchingForm_1.showResults,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchingForm",
      "showResults",
      Nil,
      "GET",
      """""",
      this.prefix + """showResults"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_MainController_index0_route(params) =>
      call { 
        controllers_MainController_index0_invoker.call(MainController_0.index)
      }
  
    // @LINE:8
    case controllers_SearchingForm_loadForm1_route(params) =>
      call { 
        controllers_SearchingForm_loadForm1_invoker.call(SearchingForm_1.loadForm)
      }
  
    // @LINE:9
    case controllers_SearchingForm_loadForm2_route(params) =>
      call { 
        controllers_SearchingForm_loadForm2_invoker.call(SearchingForm_1.loadForm)
      }
  
    // @LINE:10
    case controllers_SearchingForm_showForm3_route(params) =>
      call(params.fromPath[String]("manu", None)) { (manu) =>
        controllers_SearchingForm_showForm3_invoker.call(SearchingForm_1.showForm(manu))
      }
  
    // @LINE:12
    case controllers_SearchingForm_search4_route(params) =>
      call { 
        controllers_SearchingForm_search4_invoker.call(SearchingForm_1.search)
      }
  
    // @LINE:14
    case controllers_SearchingForm_showResults5_route(params) =>
      call { 
        controllers_SearchingForm_showResults5_invoker.call(SearchingForm_1.showResults)
      }
  
    // @LINE:17
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
