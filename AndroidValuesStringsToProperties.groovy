// 
// Groovy script for use with SaveActionGroovyScripts IntelliJ IDEA / Android Studio plugin
// (https://github.com/codebulb/SaveActionGroovyScripts)
// 
// Recommended onsaveGroovyScriptsConfig.properties config key:
// .*/values(-[a-zA-Z]+)?/strings\.xml
// 
// Description:
// Copies a values.../strings.xml file into a property file to simplify editing
// 

import ch.codebulb.saveactiongroovyscripts.util.*

projectBaseDir."res-simple"."$file.parent.name"."strings.properties" = 
    PropertiesFiles.write(XmlFiles.read(content, 'name'))

null