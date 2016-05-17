
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Car],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cars: List[Car]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Cars")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<dl class="products">
        """),_display_(/*5.10*/for(car <- cars) yield /*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""
            """),format.raw/*6.13*/("""<dt>"""),_display_(/*6.18*/car/*6.21*/.manufacturer),format.raw/*6.34*/("""</dt>
            <dt>"""),_display_(/*7.18*/car/*7.21*/.model),format.raw/*7.27*/("""</dt>
            <dd>Cena: """),_display_(/*8.24*/car/*8.27*/.price),format.raw/*8.33*/(""" """),format.raw/*8.34*/("""PLN</dd>
            <dd>Rok produkcji: """),_display_(/*9.33*/car/*9.36*/.year),format.raw/*9.41*/("""</dd>
            <dd>Przebieg: """),_display_(/*10.28*/car/*10.31*/.mileage),format.raw/*10.39*/(""" """),format.raw/*10.40*/("""km</dd>
            <dd>Paliwo: """),_display_(/*11.26*/car/*11.29*/.fuel),format.raw/*11.34*/("""</dd>
        """)))}),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</dl>
""")))}))
      }
    }
  }

  def render(cars:List[Car]): play.twirl.api.HtmlFormat.Appendable = apply(cars)

  def f:((List[Car]) => play.twirl.api.HtmlFormat.Appendable) = (cars) => apply(cars)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed May 11 15:32:57 CEST 2016
                  SOURCE: D:/Cars/app/views/list.scala.html
                  HASH: 22dcc5fbacb17b0603e99e03b3ec415d22e51db6
                  MATRIX: 528->1|640->18|668->21|688->33|726->34|757->39|814->70|845->86|884->88|924->101|955->106|966->109|999->122|1048->145|1059->148|1085->154|1140->183|1151->186|1177->192|1205->193|1272->234|1283->237|1308->242|1368->275|1380->278|1409->286|1438->287|1498->320|1510->323|1536->328|1582->343|1614->348
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|34->10|35->11|35->11|35->11|36->12|37->13
                  -- GENERATED --
              */
          