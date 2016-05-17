
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*14.106*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/jquery-1.4.2.min.js")),format.raw/*18.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/jquery.tools.js")),format.raw/*19.77*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="screenshot">
            <div class="navbar navbar-fixed-top">
                <div class="navbar-inner">
                    <div class="container">
                        <a class="brand" href=""""),_display_(/*26.49*/routes/*26.55*/.MainController.index()),format.raw/*26.78*/("""">
                            Cars
                        </a>
                    </div> 
                </div>
            </div>
            
            <div class="container">
                """),_display_(/*34.18*/content),format.raw/*34.25*/("""
            """),format.raw/*35.13*/("""</div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 17 08:18:15 CEST 2016
                  SOURCE: D:/Cars/app/views/main.scala.html
                  HASH: b4cfe2feec3981f471ad995823e5fc864d91508a
                  MATRIX: 784->260|909->290|937->292|1017->397|1053->406|1088->414|1114->419|1203->481|1218->487|1286->533|1369->589|1384->595|1447->636|1535->697|1550->703|1611->742|1663->767|1678->773|1740->814|1824->871|1839->877|1912->929|1996->986|2011->992|2080->1040|2383->1316|2398->1322|2442->1345|2670->1546|2698->1553|2739->1566
                  LINES: 25->7|30->7|32->9|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|49->26|49->26|49->26|57->34|57->34|58->35
                  -- GENERATED --
              */
          