package controllers

import play.api.mvc.{Action, Controller}
import models.Car

class Cars extends Controller {
    def list = Action {implicit request =>
        
        val cars = Car.findAll
        
        Ok(views.html.list(cars))
    }
}