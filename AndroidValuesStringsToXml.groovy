// 
// Groovy script for use with SaveActionGroovyScripts IntelliJ IDEA / Android Studio plugin
// (https://github.com/codebulb/SaveActionGroovyScripts)
// 
// Recommended onsaveGroovyScriptsConfig.properties config key:
// .*/values(-[a-zA-Z]+)?/strings\.properties
// 
// Description:
// Converts a values.../strings.properties file back into its xml equivalent (see AndroidValuesStringsToProperties.groovy)
//

import ch.codebulb.saveactiongroovyscripts.util.*

projectBaseDir.app.src.main."res"."$file.parent.name"."strings.xml" = 
    XmlFiles.write(PropertiesFiles.read(content), 'resources', 'string', 'name')

null