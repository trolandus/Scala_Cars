
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchingForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class searchingForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Form[SearchingFilter],Lang,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**(searchingForm: Form[SearchingFilter], manu:List[String], db:Map[String, List[String]])(implicit lang: Lang, messages: Messages)**/
  def apply/*2.2*/(manu:String, searchingForm: Form[SearchingFilter])(implicit lang: Lang, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import database.CarsDB

Seq[Any](format.raw/*2.94*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Browser")/*6.17*/ {_display_(Seq[Any](format.raw/*6.19*/("""
    """),format.raw/*7.5*/("""<h2>Search for car</h2>
    
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.SearchingForm.search)/*9.55*/{_display_(Seq[Any](format.raw/*9.56*/("""
        """),format.raw/*10.9*/("""<fieldset>
            """),_display_(/*11.14*/helper/*11.20*/.select(searchingForm("manufacturer"), options(CarsDB.Manufacturers.keys.to[collection.immutable.List]), 'id -> "manuSelect")),format.raw/*11.145*/("""
            """),_display_(/*12.14*/helper/*12.20*/.select(searchingForm("model"), options(CarsDB.Manufacturers(manu)), 'id -> "modelSelect")),format.raw/*12.110*/("""
        """),format.raw/*13.9*/("""</fieldset>
        <p><input type="submit" class="btn primary"
            value='Search'>
        </p>
    """)))}),format.raw/*17.6*/("""
    
    """),format.raw/*19.5*/("""<p id="result" hidden>"""),_display_(/*19.28*/manu),format.raw/*19.32*/("""</p>
    
    <script type="text/javascript">
        jQuery.noConflict();
        (function($)"""),format.raw/*23.21*/("""{"""),format.raw/*23.22*/("""
            """),format.raw/*24.13*/("""//TO JEST ZŁE, WIEM, ALE CHUJ
            var base = "http://localhost:9000/showForm";
            $('#manuSelect').val(""""),_display_(/*26.36*/manu),format.raw/*26.40*/("""");
            $('#manuSelect').change(function() """),format.raw/*27.48*/("""{"""),format.raw/*27.49*/("""
                """),format.raw/*28.17*/("""$('#result').text($('#manuSelect').val());
                window.location.href = base + "/" + $('#result').text();
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""")
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""")(jQuery);
    </script>
""")))}))
      }
    }
  }

  def render(manu:String,searchingForm:Form[SearchingFilter],lang:Lang,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(manu,searchingForm)(lang,messages)

  def f:((String,Form[SearchingFilter]) => (Lang,Messages) => play.twirl.api.HtmlFormat.Appendable) = (manu,searchingForm) => (lang,messages) => apply(manu,searchingForm)(lang,messages)

  def ref: this.type = this

}


}

/**(searchingForm: Form[SearchingFilter], manu:List[String], db:Map[String, List[String]])(implicit lang: Lang, messages: Messages)**/
object searchingForm extends searchingForm_Scope0.searchingForm
              /*
                  -- GENERATED --
                  DATE: Tue May 17 13:01:48 CEST 2016
                  SOURCE: D:/Cars/app/views/searchingForm.scala.html
                  HASH: 720d4cb25f3cd35698a91497601b3fd4c29273fe
                  MATRIX: 709->136|934->228|961->270|988->272|1011->287|1050->289|1081->294|1140->328|1154->334|1205->377|1243->378|1279->387|1330->411|1345->417|1492->542|1533->556|1548->562|1660->652|1696->661|1836->771|1873->781|1923->804|1948->808|2071->903|2100->904|2141->917|2290->1039|2315->1043|2394->1094|2423->1095|2468->1112|2624->1240|2653->1241|2690->1251|2719->1252
                  LINES: 20->2|26->2|27->5|28->6|28->6|28->6|29->7|31->9|31->9|31->9|31->9|32->10|33->11|33->11|33->11|34->12|34->12|34->12|35->13|39->17|41->19|41->19|41->19|45->23|45->23|46->24|48->26|48->26|49->27|49->27|50->28|52->30|52->30|53->31|53->31
                  -- GENERATED --
              */
          