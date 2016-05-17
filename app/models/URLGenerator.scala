package models

case class URLGenerator()
object URLGenerator
{
    var autogieldaLink : String = ""
    var otomotoLink : String = "http://otomoto.pl/osobowe/"
    var motogratkaLink : String = "http://moto.gratka.pl/szukaj/"
    
    def generateLink(manufacturer:String, model:String)
    {
        autogieldaLink = "http://www.autogielda.pl/sprzedam"
        if(!manufacturer.isEmpty)
        {
            autogieldaLink += "_" + manufacturer.toLowerCase()
            if(!model.isEmpty)
            {
                autogieldaLink += "_" + model.toLowerCase()
            }
        }
        autogieldaLink += ".html"
    }
    
    def generateLink(searchingFilter : SearchingFilter)
    {
        if(searchingFilter != null)
        {
            generateLink(searchingFilter.manufacturer, searchingFilter.model)
        }
        else
        {
            autogieldaLink += ".html"
        }
    }
}