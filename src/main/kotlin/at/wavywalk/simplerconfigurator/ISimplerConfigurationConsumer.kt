package at.wavywalk.simplerconfigurator

interface ISimplerConfigurationConsumer {

    abstract fun consume(objectToConfigure: Any, pathToConfigurationFile: String,
                         vararg keyPathToConfigurationPropertiesInFile: String): Unit

}