package at.wavywalk.simplerconfigurator

class SimplerConfigurationObjectWrapper(
    val pathToConfigurationFile: String,
    val keyPathToConfigurationPropertiesInFile: Array<out String>,
    val configurationObject: Any
) {

}