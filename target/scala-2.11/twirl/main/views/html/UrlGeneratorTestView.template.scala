
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object UrlGeneratorTestView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class UrlGeneratorTestView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(linkOne: String, linkTwo: String, linkThree: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Generated Links")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<dl class="products">
        <p>Auto Giełda: <a href="""),_display_(/*5.34*/linkOne),format.raw/*5.41*/(""">"""),_display_(/*5.43*/linkOne),format.raw/*5.50*/("""</a></p>
        <p>Otomoto: </p>
        <p>Moto Gratka: </p>
    </dl>
""")))}))
      }
    }
  }

  def render(linkOne:String,linkTwo:String,linkThree:String): play.twirl.api.HtmlFormat.Appendable = apply(linkOne,linkTwo,linkThree)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (linkOne,linkTwo,linkThree) => apply(linkOne,linkTwo,linkThree)

  def ref: this.type = this

}


}

/**/
object UrlGeneratorTestView extends UrlGeneratorTestView_Scope0.UrlGeneratorTestView
              /*
                  -- GENERATED --
                  DATE: Sat May 14 16:45:38 CEST 2016
                  SOURCE: D:/Cars/app/views/UrlGeneratorTestView.scala.html
                  HASH: f60ff18fec3e3d743417e35078c8e19c5e5b3a0d
                  MATRIX: 571->1|719->54|747->57|778->80|816->81|847->86|928->141|955->148|983->150|1010->157
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|29->5
                  -- GENERATED --
              */
          