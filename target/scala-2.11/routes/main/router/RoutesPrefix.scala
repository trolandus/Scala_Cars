
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Cars/conf/routes
// @DATE:Tue May 17 11:53:36 CEST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
