package controllers

import play.api.i18n.Messages.Implicits._
import play.api.Play.current
import play.api.mvc.{Action, Controller}
import play.api.data.Form
import play.api.data.Forms.{mapping, text, number}

import models.SearchingFilter
import models.URLGenerator
import database.CarsDB

class SearchingForm extends Controller {
    private val searchingForm: Form[SearchingFilter] = Form (mapping(
        "manufacturer" -> text,
        "model" -> text
        )(SearchingFilter.apply)(SearchingFilter.unapply))
    
    def loadForm = Action {implicit request =>
        //Version without own database
        //Ok(views.html.searchingForm(searchingForm, List("Fiat", "Hyundai"))
        
        //Version with own database
        //Ok(views.html.searchingForm(searchingForm, CarsDB.Manufacturers.keys.to[collection.immutable.List], CarsDB.Manufacturers))
        Ok(views.html.searchingForm("", searchingForm))
    }
    
    def showForm(manu: String) = Action {implicit request =>
        //Version without own database
        //Ok(views.html.searchingForm(searchingForm, List("Fiat", "Hyundai"))
        
        //Version with own database
        //Ok(views.html.searchingForm(searchingForm, CarsDB.Manufacturers.keys.to[collection.immutable.List], CarsDB.Manufacturers))
        Ok(views.html.searchingForm(manu, searchingForm))
    }
    
    def search = Action {implicit request =>
        
        val searchingResults = searchingForm.bindFromRequest()
        
        searchingResults.fold(
            hasErrors = { form =>
                Redirect(routes.SearchingForm.loadForm())
            },
            
            success = { searchingFilter =>
                URLGenerator.generateLink(searchingFilter)
                Redirect(routes.SearchingForm.showResults)
            }
            )
        //URLGenerator.generateLink(searchingForm.apply("manufacturer").value, searchingForm.apply("model").value)
        //Ok("Search completed")
    }
    
    def showResults = Action {implicit request =>
        Ok(views.html.UrlGeneratorTestView(URLGenerator.autogieldaLink,
            URLGenerator.otomotoLink, URLGenerator.motogratkaLink))
    }
}
